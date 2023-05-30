Funcion sumaTotal <- Separar(num Por Referencia)
	Definir sumaTotal Como Entero
	
	sumaTotal = 0
	Mientras num > 0 Hacer
		sumaTotal = sumaTotal + (num MOD 10)
		num = trunc(num/10)
	FinMientras
	
Fin Funcion

Algoritmo SumaDigitos
	Definir num, suma Como Entero
	
	Escribir "Ingrese un numero de dos o mas cifras"
	Leer num
	
	suma = Separar(num)
	
	Escribir "La suma es: " suma
	
FinAlgoritmo
