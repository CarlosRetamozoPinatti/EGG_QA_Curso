Algoritmo validarFecha
	// Definir e inicializar variables
	Definir mes Como Caracter	
	Definir dia,mesN,anio Como Entero
	
	// Entrada de datos y validar
	Escribir 'Ingrese día: '	
	Repetir
		
		Leer dia		
		Si (dia<1) O (dia>31) Entonces			
			Escribir 'número incorrecto, válido entre 1 y 31'			
		FinSi
		
	Mientras Que (dia<1) O (dia>31)	
	Escribir 'Ingrese mes: '
	
	Repetir		
		Leer mesN		
		Si (mesN<1) O (mesN>12) Entonces			
			Escribir 'número incorrecto, válido entre 1 y 12'			
		FinSi
		
	Mientras Que (mesN<1) O (mesN>12)	
	Escribir 'Ingrese año: '
	
	Repetir		
		Leer anio		
		Si (anio<1) O (anio>9999) Entonces			
			Escribir 'número incorrecto, intente de nuevo'			
		FinSi
		
	Hasta Que (anio<9999) O (anio>0)
	
	// Convertir mes de números a letras
	Segun mesN  Hacer		
		1:			
			mes <- 'enero'
			
		2:			
			mes <- 'febrero'
			
		3:			
			mes <- 'marzo'
			
		4:			
			mes <- 'abril'
			
		5:			
			mes <- 'mayo'
			
		6:
			
			mes <- 'junio'
			
		7:
			
			mes <- 'julio'
			
		8:			
			mes <- 'agosto'
			
		9:			
			mes <- 'septiembre'
			
		10:			
			mes <- 'octubre'
			
		11:			
			mes <- 'noviembre'
			
		12:			
			mes <- 'diciembre'
			
	FinSegun
	
	// Imprimir fecha
	Escribir 'La fecha es: ',dia,' de ',mes,' ',anio

FinAlgoritmo