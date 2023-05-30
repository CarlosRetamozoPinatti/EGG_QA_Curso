Funcion CantImpares(num Por Referencia)
	Definir Condicion Como Logico
	
	Condicion = Falso
	
	Hacer
		Escribir num MOD 10
		Si num MOD 2 = 0
			Condicion = Falso
		SiNo
			Condicion = Verdadero
		FinSi
		num = trunc(num/10)
	Mientras Que num > 0
	
	Si Condicion = Verdadero
		Escribir "Todos los digitos son impares"
	SiNo
		Escribir "Hay digitos pares"
	FinSi
Fin Funcion

Algoritmo Impares
	Definir num Como Entero
	
	Escribir "Ingrese un numero"
	Leer num
	CantImpares(num)
	
FinAlgoritmo
