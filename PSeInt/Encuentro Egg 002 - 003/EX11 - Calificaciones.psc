Algoritmo CalculoCalificacion
	// Definir variables
Definir calificacion_parcial1, calificacion_parcial2, calificacion_parcial3, calificacion_examen_final, calificacion_trabajo_final, promedio_parciales, calificacion_final Como Real
	
	// Pedir al usuario que ingrese las calificaciones
	Escribir "Ingrese la calificaci�n de la primera parcial:"
	Leer calificacion_parcial1
	Escribir "Ingrese la calificaci�n de la segunda parcial:"
	Leer calificacion_parcial2
	Escribir "Ingrese la calificaci�n de la tercera parcial:"
	Leer calificacion_parcial3
	Escribir "Ingrese la calificaci�n del examen final:"
	Leer calificacion_examen_final
	Escribir "Ingrese la calificaci�n del trabajo final:"
	Leer calificacion_trabajo_final
	
	// Calcular la calificaci�n final
	promedio_parciales <- (calificacion_parcial1 + calificacion_parcial2 + calificacion_parcial3) / 3
	calificacion_final <- (promedio_parciales * 0.55) + (calificacion_examen_final * 0.3) + (calificacion_trabajo_final * 0.15)
	
	// Mostrar el resultado al usuario
	Escribir "La calificaci�n final es:", calificacion_final
FinAlgoritmo
