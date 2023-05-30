Algoritmo buscarEnMatrix
	Definir num, matrix, i, j Como Entero
	Definir encontrado Como Logico
	
	Dimension matrix[5,5]
	encontrado = Falso
	
	Escribir "Ingrese al numero a buscar: "
	Leer num
	
	//Primero armo y muestro la matriz
	Para i = 0 Hasta 4 Hacer
		Para j = 0 Hasta 4 Hacer
			matrix[i,j] = Azar(10)
			Si matrix[i,j] == num
				encontrado = Verdadero
				Escribir "El numero se encontró en matrix[", i+1, ",", j+1, "]"
			FinSi
		FinPara
	FinPara
	
	Escribir ""
	
	Para i = 0 Hasta 4 Hacer
		Para j = 0 Hasta 4 Hacer
			Escribir matrix[i,j], " " Sin Saltar
		FinPara
		Escribir ""
	FinPara
	
	Si encontrado = Falso Entonces
		Escribir "El numero no esta en la matriz"
	FinSi
	
FinAlgoritmo
