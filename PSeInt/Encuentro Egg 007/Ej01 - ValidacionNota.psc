Algoritmo Validacion_Nota
    Definir nota Como Real
	
	Escribir "Ingrese una nota entre 0 y 10: "
	Leer nota

    Mientras nota < 0 o nota > 10
        Escribir "La nota no es valida, ingresela de nuevo: "
        Leer nota
    FinMientras
	
    
    Escribir "La nota ingresada es válida."
    
FinAlgoritmo
