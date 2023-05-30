Funcion llenarMatriz(matrix, fila, col)
	Definir i, j Como Entero
	Para i = 0 Hasta fila - 1
		Para j = 0 Hasta col - 1
			matrix[i,j] = Azar(10)
		FinPara
	FinPara
FinFuncion

Funcion mostrarMatriz(matrix, fila, col)
	Definir i, j Como Entero
	Para i = 0 Hasta fila - 1
		Para j = 0 Hasta col - 1
			Escribir Sin Saltar matrix[i,j], " "
		FinPara
		Escribir ""
	FinPara
FinFuncion

Algoritmo matrizAleatoria
	Definir matrix, m, n Como Entero
	
	Escribir "Se va a dimensionar de manera aleatoria la matriz.."
	m = Aleatorio(1,5)
	n = Aleatorio(1,5)
	Esperar 2 Segundos
	
	Dimension matrix[m,n]
	
	llenarMatriz(matrix, m, n)
	mostrarMatriz(matrix, m, n)
	
FinAlgoritmo
