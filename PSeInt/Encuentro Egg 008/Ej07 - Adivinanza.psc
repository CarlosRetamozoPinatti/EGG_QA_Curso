Proceso AdivinaNumero
	Definir n, x Como Entero
	n = Aleatorio(1, 10) 
	Escribir "Adivina el n�mero que estoy pensando (entre 1 y 10)"
	Leer x
	Hacer
		Si x < n Entonces
			Escribir "El n�mero que estoy pensando es mayor que ", x
			SiNo
				Escribir "El n�mero que estoy pensando es menor que ", x
		FinSi		
		Escribir "Ingresa otro n�mero:"
		Leer x
	Mientras Que n <> x 
	Escribir "Adivinaste!"
	
FinProceso


