Algoritmo NumerosDecimales
    Definir num1 Como Real
    Definir num2 Como Real
    
    Escribir "Ingrese el primer n�mero:"
    Leer num1
    
    Escribir "Ingrese un n�mero mayor que", num1, ":"
    Leer num2
    
    Mientras num2 > num1 Hacer
        num1 = num2
        Escribir "Ingrese otro n�mero mayor que", num1, ":"
        Leer num2
    Fin Mientras
    
    Escribir "El �ltimo n�mero ingresado no es mayor que", num1, ". El programa ha terminado."
    
FinAlgoritmo
