Algoritmo FraseConSigno
	
	Definir frase como Cadena
	Definir long como Entero
	
	Escribir "Ingrese una frase o palabra:"
	Leer frase
	
	long <- Longitud(frase)
	
	Si long = 4 entonces
		frase <- Concatenar(frase, "!")
	Sino
		frase <- Concatenar(frase, "?")
	FinSi
	
	Escribir "La frase final es: ", frase
	
FinAlgoritmo


