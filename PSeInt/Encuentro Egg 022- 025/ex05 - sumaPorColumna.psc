Funcion llenarMatriz(m, f, c)
	Definir  i, j Como Entero
	
	Para i = 0 Hasta f - 1
		para j = 0 Hasta c - 1
			m[i,j] = Azar(10)
		FinPara
	FinPara
FinFuncion

Funcion mostrarMatriz(m, f)
	Definir i Como Entero
	Para i = 0 Hasta f - 1
		Escribir Sin Saltar m[i,0], " + ", m[i,1], " = ", m[i,2]
		Escribir ""
	FinPara
FinFuncion

Funcion sumarFilas(m, f)
	Definir i Como Entero
	Para i = 0 Hasta f - 1
		m[i,2] = m[i,0] + m[i,1]
	FinPara
FinFuncion

Algoritmo sumaPorColumna
	Definir matrix, fila Como Entero
	Escribir "Indique la cantidad de filas: "
	Leer fila
	
	Dimension matrix[fila,3]
	
	Escribir "Esta parte del ejercicio ya es automatica.."
	Esperar 1 Segundos
	Escribir "Llenando matrices y operando.."
	Esperar 2 Segundos
	
	llenarMatriz(matrix, fila, 2)
	sumarFilas(matrix, fila)
	mostrarMatriz(matrix, fila)
	
FinAlgoritmo
