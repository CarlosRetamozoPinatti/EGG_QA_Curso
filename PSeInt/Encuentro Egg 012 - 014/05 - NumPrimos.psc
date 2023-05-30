Funcion primo <- esPrimo(num Por Referencia)
	Definir primo Como Logico
	Definir i, c Como Entero
	
	c = 0
	
	Para i = 1 Hasta num Con Paso 1 Hacer
		Si num MOD i = 0 Entonces
			c = c +1
		FinSi
	FinPara
	
	Si c = 2 Entonces
		primo = Verdadero
	SiNo
		primo = Falso
	FinSi	
Fin Funcion

Algoritmo NumeroPrimo
	Definir num Como Entero
	Escribir "Ingrese un numero entero: "
	Leer num
	
	Si esPrimo(num) Entonces
		Escribir "El numero es primo"
	SiNo
		Escribir "El numero no es primo"
	FinSi	
FinAlgoritmo
