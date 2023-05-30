Funcion sueldo <- Jornal(horas, turno, feriado)
	Definir sueldo Como Real
	
	Si turno = "dia" y feriado = Falso Entonces
		sueldo = horas * 90
	SiNo
		Si turno = "dia" y feriado = Verdadero Entonces
			sueldo = horas * 90 * 1.1
		FinSi		
	FinSi
	
	Si turno = "noche" y feriado = Falso Entonces
		sueldo = horas * 135
	SiNo
		Si turno = "noche" y feriado = Verdadero Entonces
			sueldo = horas * 135 * 1.15
		FinSi
	FinSi	
Fin Funcion

Algoritmo JornadaLaboral
	Definir nombre, turno, aux Como Caracter
	Definir horas, sueldo Como Real
	Definir feriado Como Logico
	
	Escribir "Ingrese el nombre del trabajador: "
	Leer nombre
	
	Escribir "Ingrese el turno de trabajo (dia/noche): "
	Leer turno
	turno = Minusculas(turno)
	
	Escribir "Ingrese la cantidad de horas trabajadas: "
	Leer horas
	
	Escribir "El dia de trabajo era feriado? (s/n):"
	Leer aux
	aux = Minusculas(aux)
	Si aux = "s" Entonces
		feriado = Verdadero
	SiNo
		feriado = Falso
	FinSi
	
	sueldo = Jornal(horas, turno, feriado)
	
	Escribir "El trabajador " nombre " cobrara $" sueldo	
	
FinAlgoritmo
