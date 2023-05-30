Algoritmo PromedioSecuencia
    Definir num, suma, contador, promedio Como Real
    
    suma = 0
    contador = 0
    Escribir "Ingrese una secuencia de números (terminada en -1):"
    Leer num
    Mientras num <> -1 Hacer
        suma = suma + num
        contador = contador + 1
        Leer num
    Fin Mientras
    
    Si contador > 0 Entonces
        promedio = suma / contador
        Escribir "El promedio de la secuencia de números ingresada es:", promedio
    Sino
        Escribir "No se ingresaron números."
    Fin Si
    
FinAlgoritmo
