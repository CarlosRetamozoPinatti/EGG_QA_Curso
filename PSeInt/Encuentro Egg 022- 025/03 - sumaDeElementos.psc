Funcion llenarMatrix(val, fila, col)
	Definir i, j Como Entero
	Para i = 0 Hasta fila - 1
		Para j = 0 Hasta col - 1
			val[i,j] = Azar(10)
		FinPara
	FinPara
FinFuncion

Funcion mostrarMatrix(val, fila, col)
	Definir i, j Como Entero
	Para i = 0 Hasta fila - 1
		Para j = 0 Hasta col - 1
			Escribir Sin Saltar " ", val[i,j]
		FinPara
		Escribir ""
	FinPara
FinFuncion

Funcion retorno = sumarMatrix(val, fila, col)
	Definir i, j, retorno Como Entero
	retorno = 0
	Para i = 0 Hasta fila - 1
		Para j = 0 Hasta col - 1
			retorno = retorno + val[i,j]
		FinPara
	FinPara
FinFuncion

Algoritmo sumaDeElementos
	Definir sum, val, i, j, fila, col Como Entero
	
	Escribir "Ingrese la cantidad de filas"
	Leer fila
	Escribir "Ingrese la cantidad de columnas"
	Leer col
	
	Dimension val[fila,col]
	
	llenarMatrix(val, fila, col)
	mostrarMatrix(val, fila, col)
	Escribir "La suma de los elementos será: ", sumarMatrix(val, fila, col)
	
FinAlgoritmo
