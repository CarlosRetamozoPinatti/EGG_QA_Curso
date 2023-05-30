Algoritmo NumeroCapicua
	Definir num, cifra1, cifra2, cifra3 como Real
	Escribir "Ingrese un número de tres cifras:"
	Leer num
	cifra1 <- TRUNC(num / 100) // Obtener la primera cifra
	cifra2 <- TRUNC(num / 10) % 10 // Obtener la segunda cifra
	cifra3 <- num % 10 // Obtener la tercera cifra
	
	Si cifra1 == cifra3 entonces
		Escribir "El número ingresado es capicúa"
	SiNo
		Escribir "El número ingresado no es capicúa"
	FinSi
FinAlgoritmo
