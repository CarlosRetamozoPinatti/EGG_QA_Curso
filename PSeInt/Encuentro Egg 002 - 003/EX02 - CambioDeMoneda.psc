Algoritmo CambioDeMonedas
	
    // Declaración de variables
    Definir pesos, dolares, euros Como Real
    tasaDeCambioDolar = 0.00028 // 1 dólar = 3,5714 pesos
    tasaDeCambioEuro = 0.00023  // 1 euro = 4,3478 pesos
    
    // Pedir al usuario que ingrese la cantidad de pesos
    Escribir "Ingrese la cantidad de pesos a cambiar: "
    Leer pesos
    
    // Calcular el cambio a dólares y euros
    dolares = pesos * tasaDeCambioDolar
    euros = pesos * tasaDeCambioEuro
    
    // Mostrar los resultados
    Escribir "La cantidad de ", pesos, " pesos equivale a ", dolares, " dólares y a ", euros, " euros."
    
FinAlgoritmo
