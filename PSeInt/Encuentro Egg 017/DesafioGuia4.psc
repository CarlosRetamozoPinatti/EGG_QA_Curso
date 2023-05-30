//-------------------------------------------------------------
//Funciones para calcular Superficie y Volumen
//El usuario no puede acceder directamente a ellos
Funcion retornoSup = calcularSup(largo, alto)
	Definir retornoSup Como Real
	retornoSup = largo * alto	
Fin Funcion

Funcion retornoVol = calcularVol(largo, ancho, espesor)
	Definir retornoVol Como Real
	retornoVol = largo * ancho * espesor
Fin Funcion
//-------------------------------------------------------------
//Función para el calculo del muro de ladrillo
Funcion calcularMuro()
	Definir espesorMuro, largoMuro, altoMuro, supMuro Como Real
	Escribir "Ingrese el espesor del muro (20cm o 30cm solamente):"
	Leer espesorMuro
	Escribir "Ingrese la Longitud del muro: "
	Leer largoMuro
	Escribir "Ingrese la altura del muro: "
	Leer altoMuro
	
	supMuro = calcularSup(largoMuro, altoMuro)
	
	Escribir "Se necesita: "
	Segun espesorMuro
		20:
			Escribir "Cemento: ", supMuro * 10.9, " kg."
			Escribir "Arena: ", supMuro * 0.09, " m3."
			Escribir "Ladrillos: " supMuro * 90
		30:
			Escribir "Cemento: ", supMuro * 15.2," kg."
			Escribir "Arena: ", supMuro * 0.115, " m3."
			Escribir "Ladrillos: " supMuro * 120
		De Otro Modo:
			Escribir "Espesor Incorrecto"
	FinSegun
	
	Esperar Tecla
	Limpiar Pantalla
	
FinFuncion
//-------------------------------------------------------------
//Función para calcular la cantidad de materiales para una viga
Funcion calcularViga()
	Definir largo Como Real
	Escribir "Indicar el largo requerido de la viga: "
	Leer largo
	Escribir "Se necesitará: "
	Escribir largo * 9 "kg de Cemento."
	Escribir largo * 0.02 "m3 de Arena."
	Escribir largo * 0.02 "m2 de Piedra."
	Escribir largo * 4 "m de Hierro del 8."
	Escribir largo * 3 "m de Hierro del 4."
	
	Esperar Tecla
	Limpiar Pantalla
FinFuncion
//-------------------------------------------------------------
//Funciòn para calcular la cantidad de materiales para una columna
Funcion calcularColumna()
	Definir largo Como Real
	Escribir "Ingrese el largo requerido de la columna: "
	Leer largo
	Escribir "Se necesitará: "
	Escribir largo * 7.5 "kg de Cemento."
	Escribir largo * 0.016 "m3 de Arena."
	Escribir largo * 0.016 "m2 de Piedra."
	Escribir largo * 6 "m de Hierro del 10."
	Escribir largo * 3 "m de Hierro del 4."
	
	Esperar Tecla
	Limpiar Pantalla
FinFuncion
//-------------------------------------------------------------
//Función para calcular la cantidad de materiales para el Contrapiso
Funcion calcularContrapiso()
	Definir vol, espesor, largo, ancho Como Real
	Escribir "Ingrese el largo deseado del contrapiso: "
	Leer largo
	Escribir "Ingrese el ancho deseado del contrapiso: "
	Leer ancho
	Escribir "Ingrese el espesor deseado del contrapiso: "
	Leer espesor
	
	vol = calcularVol(largo, ancho, espesor)
	
	Escribir "Se necesitarán: "
	Escribir vol * 105 "kg de Cemento."
	Escribir vol * 0.45 "m3 de Arena."
	Escribir vol * 0.9 "m3 de Piedra."
	
	Esperar Tecla
	Limpiar Pantalla
	
FinFuncion
//-------------------------------------------------------------
//Función para calcular los materiales para el techo
Funcion calcularTecho()
	Definir largo, ancho, espesor, vol Como Real
	Escribir "Ingrese el largo deseado del techo: "
	Leer largo
	Escribir "Ingrese el ancho deseado del techo: "
	Leer ancho
	Escribir "Ingrese el espesor deseado del techo: "
	Leer espesor
	
	vol = calcularVol(largo, ancho, espesor)
	
	Escribir "Se necesitará: "
	Escribir vol * 33 "kg de Cemento."
	Escribir vol * 0.072 "m3 de Arena."
	Escribir vol * 0.072 "m2 de Piedra."
	Escribir vol * 7 "m de Hierro del 8."
	Escribir vol * 4 "m de Hierro del 6."
	
	Esperar Tecla
	Limpiar Pantalla
	
FinFuncion
//-------------------------------------------------------------
//Función para calcular la superficie total del piso
Funcion calcularPiso()
	Definir largo, ancho, sup como Real
	Escribir "Ingrese el largo deseado para el piso: "
	Leer largo
	Escribir "Ingrese el ancho deseado para el piso: "
	Leer ancho
	
	sup = calcularSup(largo, ancho) * 1.1
	
	Escribir "Se necesitarán " sup "m2 en paños para el piso."
	
	Esperar Tecla
	Limpiar Pantalla
	
FinFuncion
//-------------------------------------------------------------
//Función para calcular la cantidad de pintura necesaria para un muro
Funcion calcularPintura()
	Definir sup, litros, largo, alto como Real
	Escribir "Ingrese el ancho del muro a pintar: "
	Leer largo
	Escribir "Ingrese el alto del muro a pintar: "
	Leer alto
	
	sup = calcularSup(largo, alto)
	litros = sup / 6
	
	Escribir "Para un muro de " sup "m2 se necesitarán " litros "lts de pintura."
	
	Esperar Tecla
	Limpiar Pantalla
	
FinFuncion
//-------------------------------------------------------------
//Función para calcular la iluminación necesaria para una habitación
Funcion calcularIlum()
	Definir largo, alto, sup, ilu Como Real
	Escribir "Ingrese el largo de la habitación: "
	Leer largo
	Escribir "ingrese el alto de la habitación: "
	Leer alto
	
	sup = calcularSup(largo, alto)
	ilu = sup * 0.2
	
	Escribir "La iluminación necesaria para una habitación de " sup "m2 es de " ilu
	
FinFuncion
//-------------------------------------------------------------
//Función que sirve como Menu. Para elegir otras funciones
Funcion menu()
	Definir i Como Entero
	i = 0
	Hacer
		Imprimir " Menu de opciones "
		Imprimir "1. Calcular muro de ladrillo"
		Imprimir "2. Calcular viga de hormigon"
		Imprimir "3. Calcular columnas de homigon"
		Imprimir "4. Calcular contrapisos"
		Imprimir "5. Calcular techos"
		Imprimir "6. Calcular pisos"
		Imprimir "7. Calcular pintura"
		Imprimir "8. Calcular iluminacion"
		Imprimir "9. Salir"
		Leer i
		
		segun i
			1:
				calcularMuro()
			2:
				calcularViga()
			3:
				calcularColumna()
			4:
				calcularContrapiso()
			5:
				calcularTecho()
			6:
				calcularPiso()
			7:
				calcularPintura()
			8:
				calcularIlum()
			9:
				Imprimir "Tantas funciones me vas a mandar a hacer, lpm, chau"
			De Otro Modo:
				Escribir "No es la opcion correcta"
		FinSegun
	Mientras Que i <> 9
	
FinFuncion
//-------------------------------------------------------------
Algoritmo DesafioManitas
	
	menu()
	
FinAlgoritmo
