Algoritmo calcular_area_y_perimetro_circunferencia
	
	Definir numpi como Real
	numpi = 3.1415
	Definir radio, area, perimetro como Real
	
	Escribir "Ingrese el valor del radio de la circunferencia:"
	Leer radio
	
	// Calcular el �rea y el per�metro
	area <- numpi * radio * radio
	perimetro <- 2 * numpi * radio
	
	// Mostrar los resultados por pantalla
	Escribir "El �rea de la circunferencia es:", area
	Escribir "El per�metro de la circunferencia es:", perimetro
	
FinAlgoritmo