Algoritmo CalculoDescuento
	// Definir variables
Definir total_compra, porcentaje_descuento, descuento, total_a_pagar Como Real
	
	// Pedir al usuario que ingrese el valor de la compra
	Escribir "Ingrese el valor total de la compra:"
	Leer total_compra
	
	// Calcular el descuento y el total a pagar
	porcentaje_descuento <- 0.15
	descuento <- total_compra * porcentaje_descuento
	total_a_pagar <- total_compra - descuento
	
	// Mostrar el resultado al usuario
	Escribir "El valor del descuento es:", descuento
	Escribir "El total a pagar es:", total_a_pagar
FinAlgoritmo

