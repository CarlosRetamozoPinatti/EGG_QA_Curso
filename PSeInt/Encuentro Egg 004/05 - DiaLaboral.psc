Algoritmo DiaLaboral
	Definir dia_semana como Caracter
	Escribir "Ingrese un d�a de la semana:"
	Leer dia_semana
	dia_semana <- Mayusculas(dia_semana) // Convertir la letra ingresada a may�scula para simplificar el c�digo
	
	Si dia_semana == "LUNES" o dia_semana == "MARTES" o dia_semana == "MIERCOLES" o dia_semana == "JUEVES" o dia_semana == "VIERNES" entonces
		Escribir "El d�a ingresado es laboral"
	SiNo
		Escribir "El d�a ingresado no es laboral"
	FinSi
FinAlgoritmo
