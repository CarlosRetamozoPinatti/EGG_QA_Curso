Algoritmo TiendaDescuento
	
	Definir mes como Cadena
	Definir compra, montoTotal como Real
	
	Escribir "Ingrese el mes de la compra (septiembre, octubre o noviembre): "
	Leer mes
	
	Escribir "Ingrese el importe de la compra: "
	Leer compra
	
	montoTotal = compra
	
	Si mes = "septiembre" o mes = "octubre" o mes = "noviembre" Entonces
		montoTotal = compra * 0.9
		
	SiNo
		
		Escribir  "No hay descuento, el monto total es: " montoTotal
		
	FinSi
	
	Escribir "El monto total a cobrar es: ", montoTotal
	
FinAlgoritmo





