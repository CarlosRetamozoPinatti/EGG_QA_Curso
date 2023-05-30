Algoritmo consumo_combustible
	
	// Definimos las variables
	Definir litros_cargados Como Real
	Definir km_recorridos Como Real
	Definir combustible_consumido Como Real
	
	// Pedimos al usuario que ingrese la cantidad de litros de combustible cargados y los kilómetros recorridos
	Escribir "Ingrese la cantidad de litros de combustible cargados:"
	Leer litros_cargados
	
	Escribir "Ingrese la cantidad de kilómetros recorridos:"
	Leer km_recorridos
	
	// Calculamos el consumo de combustible (km/lt)
	combustible_consumido <- km_recorridos / litros_cargados
	
	// Mostramos el resultado del consumo de combustible en pantalla
	Escribir "El consumo de combustible es:", combustible_consumido, "km/lt"
	
FinAlgoritmo


