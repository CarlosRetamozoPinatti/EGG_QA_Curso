
Funcion enter = Login(user, pw)
	definir intentos Como Entero
	definir e Como Logico
	intentos = 0
	e = Falso
	mientras intentos < 3 Hacer
		si user = "usuario1" y pw = "asdasd" Entonces
			e = Verdadero
			escribir "ingreso exitoso"
			intentos = 3
		sino
			intentos = intentos + 1
			si intentos = 3 Entonces
				escribir "datos incorrectos 3 veces, no tiene mas intentos"
			
			SiNo
				Escribir "datos incorrectos, le quedan " 3 - intentos " intentos"
				escribir "intenta de nuevo, ingrese usuario"
				leer user
				escribir "contraseña: "
				leer pw
			FinSi
		FinSi
	FinMientras
FinFuncion


Algoritmo sin_titulo
	definir user, pw Como Caracter
	escribir "ingresar usuario: "
	leer user
	escribir "ingrese contraseña: "
	leer pw
	escribir Login(user, pw)


FinAlgoritmo
