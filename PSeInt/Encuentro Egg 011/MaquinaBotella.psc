Algoritmo MaquinaBotella
	
	//Primero defino todas las variables.
	
	Definir user, pass, opt como Cadena
	Definir login, acept como Logico
	Definir botellas, intentos, peso, saldo Como Real
	
	//Inicializo las primeras variables.
	
	login = Falso
	intentos = 0
	saldo = 0
	
	//Parte 1 - El login
	
	Mientras (login = Falso) y (intentos < 3) Hacer
		Escribir "Ingrese el nombre de usuario: "
		Leer user
		Si user = "Albus_D" Entonces
			Escribir "Ingrese su contraseña: "
			Leer pass
			Si pass = "caramelosDeLimon" Entonces
				login = Verdadero
			SiNo
				intentos = intentos + 1
				Escribir "Contraseña incorrecta, quedan " (3 - intentos) " intentos"
			FinSi
		FinSi
	FinMientras
	
	
	
	
	
	
FinAlgoritmo
