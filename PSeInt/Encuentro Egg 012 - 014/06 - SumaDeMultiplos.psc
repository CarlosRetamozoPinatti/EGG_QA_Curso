Funcion sumaMultiplos <-Multiplos(num)
	Definir i, sumaMultiplos Como Entero
	sumaMultiplos = 0
	Para i = 1 Hasta num Con Paso 1 Hacer
		Si num MOD i = 0 Entonces
			sumaMultiplos = sumaMultiplos + i
			Escribir i " es multiplo de " num
		FinSi
	FinPara	
Fin Funcion

Algoritmo sumarMultiplos
	Definir num, resultado Como Entero
	Escribir "Ingrese un numero entero: "
	Leer num
	resultado = Multiplos(num)
	Escribir "La suma de todos los multiplos es " resultado
	
FinAlgoritmo
