Algoritmo InvertirNumero
	
	Definir num, unidades, decenas, numeroInvertido Como Entero
	
	Escribir "Ingrese un número de dos cifras:"
	Leer num
	
	// Invertir el número
	numeroInvertido = (num MOD 10) * 10 + (num - (num MOD 10)) / 10
	
	Escribir "El número invertido es:", numeroInvertido
FinAlgoritmo
