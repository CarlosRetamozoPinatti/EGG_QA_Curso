Algoritmo Calculadora
    // Declaración de variables
    Definir valor1, valor2, resultado Como Real
    Definir operacion Como Caracter
	
    // Solicitud de valores al usuario
    Escribir "Ingrese el primer valor: " 
    Leer valor1
    Escribir "Ingrese el segundo valor: "
    Leer valor2
    Escribir "Ingrese la operación a realizar (S, R, M, D): "
	
    Leer operacion
	
		
    // Cálculo de la operación seleccionada
    Segun operacion Hacer
			// Suma
			Caso "S" o "s":
            resultado <- valor1 + valor2
            Escribir "El resultado de la suma es: " resultado
			// Resta
			Caso "R"o "r":
            resultado <- valor1 - valor2
            Escribir "El resultado de la resta es: " resultado
			// Multiplicación
			Caso "M", "m":
            resultado <- valor1 * valor2
            Escribir "El resultado de la multiplicación es: " resultado
			// División
			Caso "D", "d":
            Si valor2 = 0 Entonces
                Escribir "Error: no se puede dividir entre cero."
            Sino
                resultado <- valor1 / valor2
                Escribir "El resultado de la división es: " resultado
            FinSi
			// Opción inválida
			De Otro Modo
            Escribir("Error: operación inválida.")
    FinSegun
	
FinAlgoritmo
