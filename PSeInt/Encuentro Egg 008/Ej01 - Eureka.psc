Algoritmo Eureka
	Definir claveCorrecta, claveIngresada como Cadena
	Definir intentos Como Entero
	
	intentos = 0
	claveCorrecta = "Eureka"
	HACER
		Escribir "Ingrese la clave:"
		Leer claveIngresada
		
		Si claveIngresada = claveCorrecta Entonces
			Escribir "Clave correcta. Ha ingresado al sistema."		
		Sino
			intentos = intentos + 1
			Si intentos = 3 Entonces
				Escribir "Ha agotado sus 3 intentos. Acceso denegado."
				
			Sino
				Escribir "Clave incorrecta. Intente de nuevo."
			Fin Si
		Fin Si
		
	Mientras  QUE intentos < 3

    
FinAlgoritmo
