Algoritmo vectorPorMatriz
	Definir matrix, vector, producto, i, j, k Como Entero
	
	Dimension matrix[3,3], vector[3], producto[3]
	
	Escribir "Este ejercicio es automatico.."
	Esperar 1 Segundos
	Escribir "Llenando los campos.."
	Esperar 1 Segundos
	
	Para i = 0 Hasta 2
		Para j = 0 Hasta 2
			matrix[i,j] = Azar(5)
		FinPara
		vector[i] = Azar(5)
	FinPara
	
	Para i = 0 Hasta 2
		producto[i] = 0
		Para  j = 0 Hasta 2
			producto[i] = producto[i] + matrix[i,j] * vector[j]
		FinPara
	FinPara
	
	Escribir "Mostrando resultados.."
	Esperar 1 Segundos
	Escribir "La matriz a multiplicar es.."
	Para i = 0 Hasta 2
		Para j = 0 Hasta 2
			Escribir Sin Saltar matrix[i,j]," "
		FinPara
		Escribir ""
	FinPara
	Escribir ""
	
	Escribir "El vector a multiplicar es.."
	Para i = 0 Hasta 2
		Escribir Sin Saltar vector[i], " "
	FinPara
	Escribir ""
	
	Escribir "El vector resultado es.."
	Para i = 0 Hasta 2
		Escribir producto[i], " "
	FinPara
	
FinAlgoritmo
