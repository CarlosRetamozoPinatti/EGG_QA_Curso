Algoritmo CalcularMediaParesImpares
	
	Definir contadorPares, contadorImpares, sumaPares, sumaImpares, num, i Como Entero
	
	contadorPares = 0
	contadorImpares = 0
	sumaPares = 0
	sumaImpares = 0
	i = 1
	
	Hacer
		Escribir "Ingrese un n�mero:"
		Leer num
		
		Si num % 2 = 0 Entonces
			sumaPares = sumaPares + num
			contadorPares = contadorPares + 1
		Sino
			sumaImpares = sumaImpares + num
			contadorImpares = contadorImpares + 1
		FinSi
		
		i <- i + 1
	Mientras Que i <= 10 
		
	Escribir "La media de los n�meros pares es: ", sumaPares / contadorPares
	Escribir "La media de los n�meros impares es: ", sumaImpares / contadorImpares
	
FinAlgoritmo
