SubProceso Temperaturas()
	Definir TempMin, TempMax, TempMed Como Real
	Escribir "Cual fue la temperatura minima del dia en grados Celsius?"
	Leer TempMin
	Escribir "Cual fue la temperatura maxima del dia en grados Celsius?"
	Leer TempMax
	TempMed = (TempMax+TempMin)/2
	Escribir "La temperatura media del dia es " TempMed " grados Celsius"
	
FinSubProceso

Algoritmo TemperaturaMedia
	Definir dias, i Como Entero
	Escribir "Que cantidad de dias quiere calcular la temperatura media?"
	Leer dias
	
	Para i = 1 Hasta dias Con Paso 1 Hacer
		Escribir "Dia " i
		Temperaturas()
		Escribir ""
	FinPara
	
FinAlgoritmo
