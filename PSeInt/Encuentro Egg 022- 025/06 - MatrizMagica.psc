Funcion validarMatriz(matrix, tam)
	Definir diag1, diag2, i, j, sumfila, sumcol Como Entero
	Definir validar Como Logico
	
	validar = Verdadero
	
	diag1 = 0
	diag2 = 0
//Aca se suman las diagonales, diag1 es la ppal, diag2 la secundaria.
	Para i = 0 Hasta tam - 1
		diag1 = diag1 + matrix[i,i]
		diag2 = diag2 + matrix[i, (tam-1) - i]
	FinPara
//Esto valida la suma Magica de las diagonales	
	validar = (diag1 == diag2)
//Aca se suman las filas y columnas.
	i = 0
	Mientras validar y (i < tam) Hacer
		sumfila = 0
		sumcol = 0
		Para j = 0 Hasta tam - 1
			sumfila = sumfila + matrix[i,j]
			sumcol = sumcol + matrix[j,i]
		FinPara
		//Aca de nuevo verificamos si los valores de las sumas de columnas y filas son iguales a las diagonales.
		validar = (sumfila == sumcol y sumfila == diag1)
		i = i + 1
	FinMientras
	Si validar = Verdadero Entonces
		Escribir "Es una matriz magica, y la suma es: ", diag1
	SiNo
		Escribir "No es una matriz magica"
	FinSi	
FinFuncion

Funcion mostrarAvance(matrix, fila, col, ult)
	Definir i, j Como Entero
	Limpiar Pantalla
	Para i = 0 Hasta fila
		Si i == fila
			col = ult
		FinSi
		Para j = 0 Hasta col
			Escribir Sin Saltar matrix[i,j], " "
		FinPara
		Escribir ""
	FinPara
FinFuncion

Algoritmo MatrizMagica
	Definir matrixMag, orden, i, j, k Como Entero
	
	Escribir "Escribir el orden de la matriz/arreglo (Mayor a 10 NO TE ASEGURO QUE LLEGUE A FUNCIONAR)"
	Leer orden
	
	Dimension matrixMag[orden, orden]
	
	k = 0
	Para  i = 0 Hasta orden - 1
		Para j = 0 Hasta orden - 1
			Repetir
				Escribir "Ingrese un numero"
				Leer matrixMag[i,j]
			Mientras Que (matrixMag[i,j] < 1 o matrixMag[i,j] > 9)
			mostrarAvance(matrixMag, i, k, j)
			si k < orden - 1
				k = k + 1
			FinSi
		FinPara
	FinPara
	
	validarMatriz(matrixMag, orden)
	
FinAlgoritmo
