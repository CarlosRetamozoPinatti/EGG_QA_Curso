Proceso SumaNumeros
    Definir num, suma como Entero
    Definir respuesta como Caracter
    suma = 0
    respuesta = "s"
	
    Hacer
        Escribir "Introduzca un n�mero entero positivo:"
        Leer num
        suma = suma + num
        Escribir "�Desea introducir otro n�mero? (s/n)"
        Leer respuesta
    Mientras Que respuesta <> "n" Y respuesta <> "N" 
	
    Escribir "La suma de los n�meros introducidos es: ", suma
FinProceso
