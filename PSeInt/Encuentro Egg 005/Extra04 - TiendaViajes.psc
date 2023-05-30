Algoritmo AlquilerAutos
	
	Definir horas, litrosNafta, tiempoExtra, totalPagar como Real
	
	Escribir "Ingrese la cantidad de horas de alquiler: "
	Leer horas
	
	Si horas <= 2 Entonces
		totalPagar = 400
	Sino
		Escribir "Ingrese la cantidad de litros de nafta gastados: "
		Leer litrosNafta
		
		Escribir "Ingrese la cantidad de horas extras de alquiler: "
		Leer tiempoExtra
		
		totalPagar = (litrosNafta * 40) + (tiempoExtra * 60 * 5.20)
	FinSi
	
	Escribir "El total a pagar es: ", totalPagar
	
FinAlgoritmo
