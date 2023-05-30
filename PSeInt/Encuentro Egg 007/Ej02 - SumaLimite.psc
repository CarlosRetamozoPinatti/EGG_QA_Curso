Algoritmo SumaLimite
    Definir limite, numero, suma Como Real
    
    Escribir "Ingrese un valor límite positivo: "
    Leer limite
    
    suma = 0
    Mientras suma < limite Hacer
        Escribir "Ingrese un número: "
        Leer numero
        suma <- suma + numero
    Fin Mientras
    
    Escribir "La suma de los números introducidos es: ", suma
    
FinAlgoritmo
