Algoritmo Digitos
	
	Definir n, x Como Entero
	Escribir "Introduzca un numero entero: "
	Leer n
	
	x = 0
	Mientras n <> 0 Hacer
		n = trunc(n/10)
		x = x +1
	FinMientras
	
	Escribir "El numero ingresado tiene " x " digitos."
	
FinAlgoritmo
