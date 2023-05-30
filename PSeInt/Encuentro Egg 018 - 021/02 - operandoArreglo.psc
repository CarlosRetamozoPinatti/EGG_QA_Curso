Algoritmo operacionesArreglo
	Definir arregloNum, sum, resta, mult Como Real
	Definir i, num Como Entero
	
	Dimension arregloNum[10]
	
	Escribir "Numeros para llenar el arreglo"
	Para i = 0 Hasta 9 Con Paso 1 Hacer		
		Escribir "Ingrese el numero de la posicion " i " del arreglo"
		Leer num	
		arregloNum[i] = num
	FinPara
	
	sum = arregloNum[0]
	resta = arregloNum[0]
	mult = arregloNum[0]
	
	Escribir "Operando.."
	Esperar 3 Segundos
	
	Para i = 1 Hasta 9 Con Paso 1 Hacer
		sum = sum + arregloNum[i]
		resta = resta - arregloNum[i]
		mult = mult * arregloNum[i]
	FinPara
	
	Escribir "Los resultados son: "
	Escribir "Suma: " sum
	Escribir "Resta: " resta
	Escribir "multiplicacion: " mult
	
FinAlgoritmo
