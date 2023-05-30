Algoritmo DiaLaboral
	Definir dia_semana como Caracter
	Escribir "Ingrese un día de la semana:"
	Leer dia_semana
	dia_semana <- Mayusculas(dia_semana) // Convertir la letra ingresada a mayúscula para simplificar el código
	
	Si dia_semana == "LUNES" o dia_semana == "MARTES" o dia_semana == "MIERCOLES" o dia_semana == "JUEVES" o dia_semana == "VIERNES" entonces
		Escribir "El día ingresado es laboral"
	SiNo
		Escribir "El día ingresado no es laboral"
	FinSi
FinAlgoritmo
