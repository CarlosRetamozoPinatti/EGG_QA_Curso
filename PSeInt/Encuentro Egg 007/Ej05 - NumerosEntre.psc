Algoritmo NumerosEntre
    Definir min Como Entero
    Definir max Como Entero
    Definir num Como Entero
    Definir cantidad Como Entero
	
	cantidad = 0
    
    Escribir "Ingrese el valor m�nimo entero:"
    Leer min
    
    Escribir "Ingrese el valor m�ximo entero:"
    Leer max
    
    Escribir "Ingrese n�meros entre", min, "y", max, "(ingrese un n�mero fuera del rango para finalizar):"
    Leer num
    
    Mientras num >= min Y num <= max Hacer
        cantidad = cantidad + 1
        Escribir "Ingrese otro n�mero entre", min, "y", max, "(ingrese un n�mero fuera del rango para finalizar):"
        Leer num
    Fin Mientras
    
    Escribir "La cantidad de n�meros ingresados dentro del intervalo es:", cantidad
    
FinAlgoritmo
