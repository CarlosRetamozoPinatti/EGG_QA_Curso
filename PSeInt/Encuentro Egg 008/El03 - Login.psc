Proceso login
    Definir codigo, contrasena como Entero
	
    codigo = 0
    contrasena = 0
	
    Hacer
		
        Escribir "Ingrese su codigo de usuario: "
        Leer codigo
		
        Escribir "Ingrese su contrasena numerica: "
        Leer contrasena
		
		Si codigo <> 1024 O contrasena <> 4567 
			Escribir "Datos Incorrectos!"
		FinSi
		
	Mientras Que codigo <> 1024 o contrasena <> 4567 
	     	
    Escribir "Bienvenido al sistema!"
	
FinProceso
