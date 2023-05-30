Funcion dibujar(num)
	Definir i, j Como Entero
	
	Para i = 1 Hasta num
		Para j = 1 Hasta i Hacer
			Escribir j Sin Saltar
		FinPara
		Escribir ""
	FinPara
	
Fin Funcion

Algoritmo piramideNum
	Definir num como entero
	
	Escribir "Ingrese un numerito"
	Leer num
	
	dibujar(num)
	
FinAlgoritmo
