Algoritmo LlegadaZoom
	Definir hora_ingreso, hora_conexion Como Real
	Definir mensaje Como Cadena
	
	Escribir "Ingrese la hora de su ingreso a la reunión de Zoom:"
	Leer hora_ingreso
	Escribir "Ingrese la hora en que se conectó a Zoom:"
	Leer hora_conexion
	
	Si hora_conexion <= hora_ingreso + 0.15 Entonces
		mensaje <- "Llegaste a tiempo, tienes presente."
	Sino
		mensaje <- "Hoy tendrás tardanza. Recuerda avisarle a tus coaches cuando llegarás tarde. Mañana te esperamos a tiempo, tu participación en el equipo es VITAL."
	Fin Si
	
	Escribir mensaje
FinAlgoritmo
