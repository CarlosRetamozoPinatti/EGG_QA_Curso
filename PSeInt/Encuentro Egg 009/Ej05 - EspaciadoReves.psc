Algoritmo EspaciadoReves
	Definir i Como entero
	Definir frase Como cadena
	
	Escribir "Ingrese una frase"
	Leer frase 
	
	Para i = Longitud(frase) Hasta 0 Con Paso -1 Hacer
		escribir  Sin Saltar SubCadena(frase,i,i)," " 
		
	FinPara
FinAlgoritmo