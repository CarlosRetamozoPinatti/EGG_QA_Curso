Algoritmo Calificaciones
    Definir nombre Como Cadena
    Definir practica, problemas, teoria, promedio Como Real
    Escribir "Ingrese el nombre del alumno (o vacío para terminar):"
    Leer nombre
    Mientras nombre <> "" Hacer
        Escribir "Ingrese la nota de práctica (entre 0 y 10):"
        Leer practica
        Si practica < 0 O practica > 10 Entonces
            Escribir "Error: la nota debe estar entre 0 y 10."
        Sino
            Escribir "Ingrese la nota de problemas (entre 0 y 10):"
            Leer problemas
            Si problemas < 0 O problemas > 10 Entonces
                Escribir "Error: la nota debe estar entre 0 y 10."
            Sino
                Escribir "Ingrese la nota de teoría (entre 0 y 10):"
                Leer teoria
                Si teoria < 0 O teoria > 10 Entonces
                    Escribir "Error: la nota debe estar entre 0 y 10."
                Sino
                    promedio = (practica * 0.1) + (problemas * 0.5) + (teoria * 0.4)
                    Escribir "El promedio de", nombre, "es:", promedio
                FinSi
            FinSi
        FinSi
        Escribir "Ingrese el nombre del siguiente alumno (o vacío para terminar):"
        Leer nombre
    FinMientras
FinAlgoritmo
