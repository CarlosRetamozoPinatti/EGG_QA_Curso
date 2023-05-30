Algoritmo conversion_unidades_medida
	
	// Definimos las variables
	Definir metros, centimetros, milimetros, pulgadas como Real
	Definir CONST_PULGADAS como Real
	CONST_PULGADAS = 39.37
	
	// Pedimos la cantidad de metros al usuario
	Escribir "Ingrese la cantidad de metros:"
	Leer metros
	
	// Calculamos las conversiones de metros a centímetros, milímetros y pulgadas
	centimetros <- metros * 100
	milimetros <- metros * 1000
	pulgadas <- metros * CONST_PULGADAS
	
	// Mostramos los resultados en pantalla
	Escribir metros, "metros son equivalentes a:"
	Escribir centimetros, "centimetros"
	Escribir milimetros, "milimetros"
	Escribir pulgadas, "pulgadas"
	
FinAlgoritmo

