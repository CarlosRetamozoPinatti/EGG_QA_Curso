Algoritmo rellenarVector
	Definir arregloNum, i, num Como Entero
	
	Dimension arregloNum[5]
	
	Escribir "Numeros para llenar el arreglo"
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		
		Escribir "Ingrese un numero"
		Leer num	
		arregloNum[i] = num
	FinPara
	
	Escribir "Aca se deberia ver el arreglo"
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		Escribir "Arreglo[" i "]: ", arregloNum[i]
	FinPara
	
FinAlgoritmo
