Algoritmo Convertir_Dias_A_Horas_Minutos_Segundos
	
    // Declaraci�n de variables
    Definir  dias, horas, min, seg Como Real
    
    // Pedir al usuario que ingrese la cantidad de d�as
    Escribir "Ingrese la cantidad de d�as: "
    Leer dias
    
    // Convertir los d�as en horas, minutos y segundos
    horas <- dias * 24
    min <- horas * 60
    seg <- min * 60
    
    // Mostrar los resultados por pantalla
    Escribir dias, " d�a(s) equivale(n) a:"
    Escribir horas, " horas"
    Escribir min, " minutos"
    Escribir seg, " segundos"
	
FinAlgoritmo

