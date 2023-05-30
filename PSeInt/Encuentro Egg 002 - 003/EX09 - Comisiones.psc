Algoritmo CalculoComisiones
	// Definir variables
Definir sueldo_base, venta1, venta2, venta3, comision, total_comisiones, total_mes Como Real
	
	// Pedir al usuario que ingrese los valores correspondientes
	Escribir "Ingrese su sueldo base:"
	Leer sueldo_base
	Escribir "Ingrese el valor de la primera venta:"
	Leer venta1
	Escribir "Ingrese el valor de la segunda venta:"
	Leer venta2
	Escribir "Ingrese el valor de la tercera venta:"
	Leer venta3
	
	// Calcular la comisión por cada venta y el total de comisiones
	comision <- 0.1
	total_comisiones <- (venta1 + venta2 + venta3) * comision
	
	// Calcular el total a recibir en el mes
	total_mes <- sueldo_base + total_comisiones
	
	// Mostrar el resultado al usuario
	Escribir "El total de comisiones por las tres ventas es:", total_comisiones
	Escribir "El total a recibir en el mes es:", total_mes
FinAlgoritmo
