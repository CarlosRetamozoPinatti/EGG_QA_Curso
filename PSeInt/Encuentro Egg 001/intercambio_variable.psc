Algoritmo intercambio_variables
	
	// Definimos las variables
	Definir num1, num2, aux como Entero
	
	// Pedimos al usuario que ingrese los valores de num1 y num2
	Escribir "Ingrese el valor de num1:"
	Leer num1
	
	Escribir "Ingrese el valor de num2:"
	Leer num2
	
	// Intercambiamos los valores de num1 y num2
	aux <- num1
	num1 <- num2
	num2 <- aux
	
	// Mostramos los valores intercambiados en pantalla
	Escribir "Los valores intercambiados son:"
	Escribir "num1 =", num1
	Escribir "num2 =", num2
	
FinAlgoritmo



