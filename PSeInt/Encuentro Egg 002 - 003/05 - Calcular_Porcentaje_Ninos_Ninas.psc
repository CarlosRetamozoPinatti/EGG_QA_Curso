Algoritmo Calcular_Porcentaje_Ninos_Ninas
	
    // Declaraci�n de variables
    Definir  total_ninos, total_ninas Como Entero
    Definir  porcentaje_ninos, porcentaje_ninas Como Real
    
    // Pedir al usuario que ingrese la cantidad de ni�os y ni�as en el curso
    Escribir "Ingrese la cantidad total de ni�os en el curso: "
    Leer total_ninos
    Escribir "Ingrese la cantidad total de ni�as en el curso: "
    Leer total_ninas
    
    // Calcular el porcentaje de ni�os y ni�as
    porcentaje_ninos <- (total_ninos * 100) / (total_ninos + total_ninas)
    porcentaje_ninas <- (total_ninas * 100) / (total_ninos + total_ninas)
    
    // Mostrar los porcentajes de ni�os y ni�as por pantalla
    Escribir "El porcentaje de ni�os en el curso es: ", porcentaje_ninos, "%"
    Escribir "El porcentaje de ni�as en el curso es: ", porcentaje_ninas, "%"

FinAlgoritmo


