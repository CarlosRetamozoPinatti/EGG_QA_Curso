Algoritmo cadenasYLongitudes
	Definir letraV Como Caracter
	Definir largoV, n, i Como Entero
	
	Escribir "Definir el tamaño del vector/arreglo: "
	Leer n
	
	Dimension letraV[n], largoV[n]
	
	Para i = 0 Hasta n - 1 Hacer		
		Escribir "Ingrese un nombre: "
		Leer letraV[i]
		
		largoV[i] = Longitud(letraV[i])
	FinPara
	
	Para i = 0 Hasta n - 1 Hacer
		Escribir letraV[i] " tiene " largoV[i] " caracteres."
	FinPara
	
FinAlgoritmo
