Algoritmo Convertir_Dias_A_Horas_Minutos_Segundos
	
    // Declaración de variables
    Definir  dias, horas, min, seg Como Real
    
    // Pedir al usuario que ingrese la cantidad de días
    Escribir "Ingrese la cantidad de días: "
    Leer dias
    
    // Convertir los días en horas, minutos y segundos
    horas <- dias * 24
    min <- horas * 60
    seg <- min * 60
    
    // Mostrar los resultados por pantalla
    Escribir dias, " día(s) equivale(n) a:"
    Escribir horas, " horas"
    Escribir min, " minutos"
    Escribir seg, " segundos"
	
FinAlgoritmo

