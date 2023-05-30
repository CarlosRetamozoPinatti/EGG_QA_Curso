Algoritmo HoraLlegadaCiudadB
	
	Definir  horaSalida, minutoSalida, segundoSalida, tiempoViaje, horaLlegada, segundosSalida como Real
	Definir  minutosLlegada, segundosLlegada Como Entero
    // Ingresar los datos del ciclista
    Escribir "Ingrese la hora de salida en formato HH:"
    Leer horaSalida
    Escribir "Ingrese los minutos de salida en formato MM:"
    Leer minutoSalida
    Escribir "Ingrese los segundos de salida en formato SS:"
    Leer segundoSalida
    Escribir "Ingrese el tiempo de viaje en segundos:"
    Leer tiempoViaje
    
    // Convertir la hora de salida a segundos
    segundosSalida <- segundoSalida + (minutoSalida * 60) + (horaSalida * 3600)
    
    // Calcular la hora de llegada en segundos
    segundosLlegada <- segundosSalida + tiempoViaje
    
    // Convertir la hora de llegada a formato HH:MM:SS
    horaLlegada <- TRUNC(segundosLlegada / 3600)
    minutosLlegada <- (segundosLlegada MOD 3600) / 60
    segundosLlegada <- segundosLlegada MOD 60
    
    // Imprimir la hora de llegada en formato HH:MM:SS
    Si horaLlegada > 24 entonces
        horaLlegada <- horaLlegada MOD 24
    Fin Si
    Escribir "La hora de llegada a la ciudad B es ", horaLlegada, ":", minutosLlegada, ":", segundosLlegada
FinAlgoritmo
