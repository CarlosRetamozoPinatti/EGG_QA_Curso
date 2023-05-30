SubProceso  DividirRestando(Dividendo Por Referencia, Divisor Por Referencia)
	Definir Cociente, Resto Como Entero
	
	Cociente = 0
	Mientras Dividendo >= Divisor Hacer
		Dividendo = Dividendo - Divisor
		Cociente = Cociente + 1
	FinMientras
	Resto = Dividendo
	
	Escribir "El cociente es " Cociente
	Escribir "El resto es " Resto
	
FinSubProceso

Algoritmo DivisionPorResta
	Definir Dividendo, Divisor Como Entero
	Escribir "Cual es el Dividendo?"
	Leer Dividendo
	Escribir "Cual es el Divisor?"
	Leer Divisor
	
	DividirRestando(Dividendo, Divisor)
	
FinAlgoritmo
