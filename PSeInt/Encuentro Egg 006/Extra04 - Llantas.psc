Algoritmo PrecioLlantas
	Definir cantidadLlantas, precioLlanta, montoTotal Como Entero
    Escribir "Ingrese la cantidad de llantas a comprar: "
    Leer cantidadLlantas
    
    Si cantidadLlantas < 5 entonces
        precioLlanta = 3000
		Sino Si cantidadLlantas >= 5 Y cantidadLlantas <= 10 entonces
				precioLlanta = 2500
				
    Sino
        precioLlanta = 2000
		Finsi
    FinSi
    
    montoTotal = cantidadLlantas * precioLlanta
    
    Escribir "El precio por llanta es: $", precioLlanta
    Escribir "El monto total a pagar es: $", montoTotal
	
FinAlgoritmo
