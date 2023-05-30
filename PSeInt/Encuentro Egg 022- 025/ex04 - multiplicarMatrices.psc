Funcion llenarMatriz(m, f, c, min, max)
	Definir  i, j Como Entero
	
	Para i = 0 Hasta f - 1
		para j = 0 Hasta c - 1
			m[i,j] = Aleatorio(min, max)
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

Algoritmo multiplicarMatrices
	Definir m1, m2, mprod, i, j, k Como Entero
	
	Dimension m1[3,3], m2[3,3], mprod[3,3]
	
	llenarMatriz(m1, 3, 3, 0, 5)
	llenarMatriz(m2, 3, 3, 0, 5)
	llenarMatriz(mprod, 3, 3, 0, 0)
	Escribir "Este es un ejercicio automatico.."
	Esperar 1 Segundos
	Escribir "La matriz 1 sera: "
	mostrarMatriz(m1, 3, 3)
	Esperar 1 Segundos
	Escribir "La matriz 2 sera: "
	mostrarMatriz(m2, 3, 3)
	
	Para i = 0 Hasta 2
		Para j = 0 Hasta 2
			Para k = 0 Hasta 2
				mprod[i,j] = mprod[i,j] + m1[i,k] * m2[k,j]
			FinPara
		FinPara
	FinPara
	Escribir ""
	
	Escribir "La matriz producto sera: "
	Esperar 1 Segundos
	mostrarMatriz(mprod, 3, 3)

	
FinAlgoritmo
