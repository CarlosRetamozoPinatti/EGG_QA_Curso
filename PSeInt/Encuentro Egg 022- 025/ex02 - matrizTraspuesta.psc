Funcion llenarMatriz(m, f, c)
	Definir  i, j Como Entero
	
	Para i = 0 Hasta f - 1
		para j = 0 Hasta c - 1
			m[i,j] = Azar(100)
		FinPara
	FinPara
FinFuncion

Funcion mostrarMatriz(m, f, c)
	Definir i,j Como Entero
	Para i = 0 Hasta f - 1
		Para j = 0 Hasta c - 1
			Escribir Sin Saltar " ", m[i,j]
		FinPara
		Escribir ""
	FinPara
FinFuncion

Funcion mostrarTraspuesta(m, f, c)
	Definir i, j Como Entero
	Para i = 0 Hasta c - 1
		Para j = 0 Hasta f - 1
			Escribir Sin Saltar " ", m[j,i]
		FinPara
		Escribir ""
	FinPara
FinFuncion


Algoritmo matrizTraspuesta
	Definir matrix, m, n Como Entero
	
	m = Aleatorio(1,5)
	n = Aleatorio(1,5)
	
	
	Escribir "La dimension de la matriz será: ", m, " x ", n
	Esperar 2 Segundos
	Dimension matrix[m,n]
	
	llenarMatriz(matrix, m, n)
	Escribir ""
	mostrarMatriz(matrix, m, n)
	Escribir ""
	mostrarTraspuesta(matrix, m, n)

FinAlgoritmo
