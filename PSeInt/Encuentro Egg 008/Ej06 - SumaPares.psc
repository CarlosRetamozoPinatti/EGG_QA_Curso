Algoritmo SumaNumerosPares
    Definir N, i, suma como Entero
    
    Escribir "Ingrese un n�mero entero positivo:"
    Leer N
	
	N = N * 2
    i = 1
    suma = 0
    
    Hacer 
        si i % 2 = 0 entonces
            suma = suma + i
        FinSi
        i <- i + 1
    Mientras Que i <= N
    
    Escribir "La suma de los n�meros pares es: "  suma
    
FinAlgoritmo

