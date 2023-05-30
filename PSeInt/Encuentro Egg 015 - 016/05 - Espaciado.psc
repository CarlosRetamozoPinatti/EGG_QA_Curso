SubProceso Espaciar(frase)
	Definir i Como Entero
	
	Para i = 0 Hasta Longitud(frase) 
		Si Subcadena(frase, i, i) <> " "
			Escribir Sin Saltar Subcadena(frase, i, i), " "
		FinSi
	FinPara
	Escribir ""
FinSubProceso

Algoritmo Espaciado
	
	Definir frase Como Caracter
	
	Escribir "Ingrese una palabra o frase"
	Leer frase
	Espaciar(frase)
	
FinAlgoritmo
