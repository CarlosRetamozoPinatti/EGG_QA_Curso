Algoritmo Calcular_Porcentaje_Ninos_Ninas
	
    // Declaración de variables
    Definir  total_ninos, total_ninas Como Entero
    Definir  porcentaje_ninos, porcentaje_ninas Como Real
    
    // Pedir al usuario que ingrese la cantidad de niños y niñas en el curso
    Escribir "Ingrese la cantidad total de niños en el curso: "
    Leer total_ninos
    Escribir "Ingrese la cantidad total de niñas en el curso: "
    Leer total_ninas
    
    // Calcular el porcentaje de niños y niñas
    porcentaje_ninos <- (total_ninos * 100) / (total_ninos + total_ninas)
    porcentaje_ninas <- (total_ninas * 100) / (total_ninos + total_ninas)
    
    // Mostrar los porcentajes de niños y niñas por pantalla
    Escribir "El porcentaje de niños en el curso es: ", porcentaje_ninos, "%"
    Escribir "El porcentaje de niñas en el curso es: ", porcentaje_ninas, "%"

FinAlgoritmo


