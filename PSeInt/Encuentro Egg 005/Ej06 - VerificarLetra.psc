Algoritmo ValidacionPrimeraLetra
	
	Definir frase como Cadena
	Definir primeraLetra como Cadena
	
	Escribir "Ingrese una frase o palabra:"
	Leer frase
	frase = Mayusculas(frase)
	
	primeraLetra = Subcadena(frase,0,0)
	
	Escribir primeraLetra
	
	Si primeraLetra = "A" entonces
		Escribir "CORRECTO"
	Sino
		Escribir "INCORRECTO"
	FinSi
	
FinAlgoritmo



