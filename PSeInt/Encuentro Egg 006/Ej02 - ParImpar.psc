Proceso ParImpar
    Definir num, resto Como Entero
    
    Escribir "Ingrese un n�mero entero:"
    Leer num
    
    Si num = 0 Entonces
        Escribir "El n�mero no es par ni impar."
    Sino
        resto = num mod 2
        Si resto = 0 Entonces
            Escribir "El n�mero es par."
        Sino
            Escribir "El n�mero es impar."
        FinSi
    FinSi
    
FinProceso

