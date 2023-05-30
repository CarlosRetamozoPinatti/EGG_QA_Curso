Algoritmo ConvertirSegundos
	
    // Declaración de variables
    Definir  totalSegundos, horas, min, seg Como Real
    
    // Pedir al usuario que ingrese el número total de segundos
    Escribir "Ingrese el número total de segundos: "
    Leer totalSegundos
    
    // Calcular las horas, minutos y segundos
    horas = totalSegundos / 3600
    min = (totalSegundos MOD 3600) / 60
    seg = totalSegundos MOD 60
    
    // Mostrar el resultado por pantalla
    Escribir "Horas: ", horas, " Minutos: ", min, " Segundos: ", seg
    
FinAlgoritmo


