Proceso ParImpar
    Definir num, resto Como Entero
    
    Escribir "Ingrese un número entero:"
    Leer num
    
    Si num = 0 Entonces
        Escribir "El número no es par ni impar."
    Sino
        resto = num mod 2
        Si resto = 0 Entonces
            Escribir "El número es par."
        Sino
            Escribir "El número es impar."
        FinSi
    FinSi
    
FinProceso

