Algoritmo Factorial
	Definir i Como Entero
	Definir num, fact Como Real
	fact = 1
	
	Escribir "Ingrese un numero para calcular su factorial: "
	leer num
	
	para i = 1 Hasta num Con Paso 1 Hacer
		fact = fact*i
		Escribir "!",i,": ", fact
		
	FinPara
	
	Escribir "El factorial de " num " es: " fact
	
FinAlgoritmo
