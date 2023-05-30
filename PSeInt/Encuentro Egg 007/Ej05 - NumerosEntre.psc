Algoritmo NumerosEntre
    Definir min Como Entero
    Definir max Como Entero
    Definir num Como Entero
    Definir cantidad Como Entero
	
	cantidad = 0
    
    Escribir "Ingrese el valor mínimo entero:"
    Leer min
    
    Escribir "Ingrese el valor máximo entero:"
    Leer max
    
    Escribir "Ingrese números entre", min, "y", max, "(ingrese un número fuera del rango para finalizar):"
    Leer num
    
    Mientras num >= min Y num <= max Hacer
        cantidad = cantidad + 1
        Escribir "Ingrese otro número entre", min, "y", max, "(ingrese un número fuera del rango para finalizar):"
        Leer num
    Fin Mientras
    
    Escribir "La cantidad de números ingresados dentro del intervalo es:", cantidad
    
FinAlgoritmo
