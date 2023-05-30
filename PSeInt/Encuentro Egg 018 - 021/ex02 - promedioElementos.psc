Algoritmo promedioElementos
	Definir v, sum, n, i Como Entero
	
	sum = 0
	
	Escribir "Indique el tamaño del vector"
	Leer n
	
	Dimension v[n]
	
	Para i = 0 Hasta n - 1 Hacer
		Escribir Sin Saltar " vectpr[" i "]: "
		Leer v[i]
		
		sum = sum + v[i]
	FinPara
	
	Escribir "La media será: " sum/n
	
FinAlgoritmo
