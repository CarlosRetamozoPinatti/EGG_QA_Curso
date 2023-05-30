Algoritmo ConvertirFahrenheitACelsius
	// Definir variables
Definir fahrenheit, celsius Como Real
	
	// Pedir al usuario que ingrese el valor en grados Fahrenheit
	Escribir "Ingrese el valor en grados Fahrenheit:"
	Leer fahrenheit
	
	// Calcular el valor equivalente en grados Celsius
	celsius <- (fahrenheit - 32) * 5/9
	
	// Mostrar el resultado al usuario
	Escribir "El valor equivalente en grados Celsius es:", celsius
FinAlgoritmo
