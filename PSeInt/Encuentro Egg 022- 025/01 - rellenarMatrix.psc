Algoritmo rellenarMatrix
	Definir matrix, i, j, num Como Entero
	
	Dimension matrix[3,3]
	
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			Escribir "Ingrese 1 numero en la fila ", i+1," columna " j+1
			Leer num
			matrix[i,j] = num
		FinPara
		Escribir ""
	FinPara
	
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			Escribir matrix(i,j), " " Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo
