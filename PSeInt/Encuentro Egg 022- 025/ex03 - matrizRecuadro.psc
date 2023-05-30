Funcion llenarMatriz(m, f, c)
	Definir i, j Como Entero
	
	Para i = 0 Hasta f - 1
		Para j = 0 Hasta c - 1
			Si i == 0 o i == f - 1 o j == 0 o j == c - 1 Entonces
				m[i,j] = 1
			SiNo
				m[i,j] = 0
			FinSi
		FinPara
	FinPara
FinFuncion

Funcion mostrarMatriz(m, f, c)
	Definir i, j Como Entero
	
	Para i = 0 Hasta f - 1
		Para j = 0 Hasta  c - 1
			Escribir Sin Saltar m[i,j]
		FinPara
		Escribir ""
	FinPara
FinFuncion

Algoritmo matrizRecuadro
	Definir matrix, i, j Como Entero
	
	Dimension matrix[5,15]
	Escribir "Este es un ejercicio automatico.."
	Esperar 2 Segundos
	llenarMatriz(matrix, 5, 15)
	Escribir ""
	mostrarMatriz(matrix, 5, 15)
	
FinAlgoritmo
