Algoritmo Fibo_13
	Definir var, contador, op Como Entero
	Escribir "Ingrese un entero para desplegar su sucesion de Fibonacci"
	leer var
	Escribir "1 - Utilizar algoritmo Recursivo"
	Escribir "2 - Utilizar algoritmo Iterativo"
	Escribir "Toque otra tecla para salir"
	leer op
	
	Segun op Hacer
		1:
			contador = 0
			Mientras contador <= var
				Escribir Sin Saltar Fibonacci_Recursivo(contador) ", "
				contador = contador +1
			FinMientras
		2:
			Fibonacci(var)
		De Otro Modo:
			Escribir "Salir!"
	Fin Segun
	
FinAlgoritmo

Funcion ret <- Fibonacci_Recursivo(n)
	Definir ret Como Entero
	si n = 1 o n = 0 Entonces
		ret = 1
	SiNo
		ret = Fibonacci_Recursivo(n-1) + Fibonacci_Recursivo(n-2)
	finsi
FinSubProceso

SubProceso Fibonacci( n )
	Definir var1, var2, i, res Como Entero
	var1 <- 0
	var2 <- 1
	
	para i = 1 Hasta n Hacer
		res = var1 + var2 
		Escribir Sin Saltar res ", "
		var2 = var1	
		var1 = res
	FinPara
	
FinSubProceso
