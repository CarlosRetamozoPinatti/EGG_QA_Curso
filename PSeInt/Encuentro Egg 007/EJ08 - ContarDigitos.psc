Algoritmo ContarDigitos
	Definir num, digitos Como Entero
	Escribir "Ingrese un n�mero entero positivo:"
	Leer num
	digitos = 0
	Mientras num > 0 Hacer
		num = trunc(num/10)
		digitos <- digitos + 1
	Fin Mientras
	Escribir "El n�mero ingresado tiene ", digitos, " d�gitos"
FinAlgoritmo
