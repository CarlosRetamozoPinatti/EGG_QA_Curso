Proceso MaxMinPromedio
	Definir num, numMax, numMin, sumaNum, contador Como Entero

	sumaNum = 0
	contador = 0	
	numMax = 0
	numMin = 0
	
	Escribir "Ingrese un n�mero entero (0 para salir): "
	Leer num

	
	Hacer		
		Si num > numMax y num <> 0 Entonces
				numMax = num
		SiNo 
			numMin = num
		FinSi		
				
		sumaNum = sumaNum + num
		contador = contador + 1
		Escribir "Ingrese un n�mero entero (0 para salir): "
		Leer num
		
	Mientras Que num <> 0
	
	Escribir "El n�mero m�ximo ingresado es: ", numMax
	Escribir "El n�mero m�nimo ingresado es: ", numMin
	Escribir "El promedio de los n�meros ingresados es: ", sumaNum / contador
FinProceso

