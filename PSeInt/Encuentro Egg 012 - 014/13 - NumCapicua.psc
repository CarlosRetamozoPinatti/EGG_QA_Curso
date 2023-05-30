Funcion esCapicua <- capic(num Por Referencia)
	Definir a, b Como Entero
	
	a = num
	b = 0
	
	Mientras num > 0 Hacer
		b = (b * 10) + (num MOD 10)
		num = trunc(num/10)
	FinMientras
	
	Si a = b Entonces
		Escribir "es capicua!"
	SiNo
		Escribir "no es capicua!"
	FinSi

Fin Funcion

Algoritmo NumCapicua
	Definir num Como Entero
	Definir resultado como Cadena
	Escribir "ingrese un num"
	Leer num
	
	resultado = capic(num)
	
FinAlgoritmo
