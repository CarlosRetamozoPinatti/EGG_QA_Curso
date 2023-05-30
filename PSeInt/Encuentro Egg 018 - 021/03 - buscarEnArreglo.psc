Algoritmo encontrarEnArreglo
	Definir arregloNum, num, i, j, n Como Entero
	Definir acaEsta Como Logico
	
	acaEsta = Falso
	
	Escribir "De cuantos numeros sera el arreglo?: "
	leer n
	Dimension arregloNum[n]
	
	Para i = 0 Hasta n - 1 Con Paso 1 Hacer
		Escribir "Ingrese los numeros al arreglo: "
		Leer j
		arregloNum[i] = j		
	FinPara
	
	Escribir "Que numero debería buscar?: "
	Leer num
	
	Para i = 0 Hasta n - 1 Con Paso 1 Hacer
		Si arregloNum[i] == num
			acaEsta = Verdadero
			Escribir num " esta en la posicion " i " del arreglo"
		FinSi
	FinPara
	
	Si acaEsta = Falso Entonces
		Escribir "El numero " num " no se encuentra en el arreglo."		
	FinSi	
	
FinAlgoritmo
