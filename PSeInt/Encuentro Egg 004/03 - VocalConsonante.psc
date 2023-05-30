Algoritmo VocalConsonante
	Definir letra como Caracter
	Escribir "Ingrese una letra:"
	Leer letra
	letra <- Mayusculas(letra) // Convertir letra ingresada a mayúscula para simplificar el código
	
	Si letra == "A" o letra == "E" o letra == "I" o letra == "O" o letra == "U" entonces
		Escribir "La letra ingresada es una vocal"
	SiNo
		Escribir "La letra ingresada es una consonante"
	FinSi
FinAlgoritmo
