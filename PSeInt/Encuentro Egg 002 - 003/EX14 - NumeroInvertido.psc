Algoritmo InvertirNumero
	
	Definir num, unidades, decenas, numeroInvertido Como Entero
	
	Escribir "Ingrese un n�mero de dos cifras:"
	Leer num
	
	// Invertir el n�mero
	numeroInvertido = (num MOD 10) * 10 + (num - (num MOD 10)) / 10
	
	Escribir "El n�mero invertido es:", numeroInvertido
FinAlgoritmo
