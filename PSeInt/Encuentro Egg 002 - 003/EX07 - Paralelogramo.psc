Algoritmo AreaPerimetroParalelogramo
	// Definir variables
Definir base, altura, area, perimetro Como Real
	
	// Pedir al usuario que ingrese los valores de la base y la altura del paralelogramo
	Escribir "Ingrese la base del paralelogramo:"
	Leer base
	Escribir "Ingrese la altura del paralelogramo:"
	Leer altura
	
	// Calcular el �rea y el per�metro del paralelogramo
	area <- base * altura
	perimetro <- 2 * (base + altura)
	
	// Mostrar el resultado al usuario
	Escribir "El �rea del paralelogramo es:", area
	Escribir "El per�metro del paralelogramo es:", perimetro
FinAlgoritmo

