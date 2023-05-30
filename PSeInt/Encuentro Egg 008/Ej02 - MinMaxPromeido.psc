Proceso MaxMinPromedio
	Definir num, numMax, numMin, sumaNum, contador Como Entero

	sumaNum = 0
	contador = 0	
	numMax = 0
	numMin = 0
	
	Escribir "Ingrese un número entero (0 para salir): "
	Leer num

	
	Hacer		
		Si num > numMax y num <> 0 Entonces
				numMax = num
		SiNo 
			numMin = num
		FinSi		
				
		sumaNum = sumaNum + num
		contador = contador + 1
		Escribir "Ingrese un número entero (0 para salir): "
		Leer num
		
	Mientras Que num <> 0
	
	Escribir "El número máximo ingresado es: ", numMax
	Escribir "El número mínimo ingresado es: ", numMin
	Escribir "El promedio de los números ingresados es: ", sumaNum / contador
FinProceso

