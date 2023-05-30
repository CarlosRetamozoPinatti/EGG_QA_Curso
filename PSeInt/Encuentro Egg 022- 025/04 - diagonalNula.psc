Funcion llenarMatrix(val, fila, col)
	Definir i, j Como Entero
	Para i = 0 Hasta fila - 1
		Para j = 0 Hasta col - 1
			val[i,j] = Azar(10)
		FinPara
		//Esto hace nula la diagonal principal
		val[i,i] = 0
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

Algoritmo diagonalNula
	Definir matrix, tam como Entero
	
	tam = Aleatorio(2,9)
	
	Escribir "La dimension de la matriz será [",tam , tam,"]"
	Dimension  matrix[tam,tam]
	
	llenarMatrix(matrix, tam, tam)
	mostrarMatrix(matrix, tam, tam)
	
FinAlgoritmo
