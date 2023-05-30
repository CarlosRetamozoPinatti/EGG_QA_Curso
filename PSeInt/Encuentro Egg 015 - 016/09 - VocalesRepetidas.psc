SubProceso remover(frase Por Referencia)
	Definir car, vocal, vocales Como Caracter
	Definir i, j Como Entero
	Definir encontrado Como Logico
	
	vocales = "aeiou"
	encontrado = Falso
	
	Para i = 0 Hasta Longitud(vocales) - 1
		vocal = Subcadena(vocales, i, i)
		
		Para  j = 0 Hasta Longitud(frase) - 1
			car = Subcadena(frase, j, j)
			
			Si encontrado y vocal == Minusculas(car)
				frase = Concatenar(Subcadena(frase, 0, j-1), Subcadena(frase, j+1, Longitud(frase)-1))
				j = j - 1
			FinSi
			encontrado = encontrado o vocal == Minusculas(car)
		FinPara
		encontrado = Falso
	FinPara
	
	Escribir frase	
FinSubProceso

Algoritmo SinVocales
	Definir frase Como Caracter
	
	Escribir "Ingrese una frase o palabra: "
	Leer frase
	remover(frase)
	
FinAlgoritmo
