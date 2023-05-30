Algoritmo Calculadora
    // Declaraci�n de variables
    Definir valor1, valor2, resultado Como Real
    Definir operacion Como Caracter
	
    // Solicitud de valores al usuario
    Escribir "Ingrese el primer valor: " 
    Leer valor1
    Escribir "Ingrese el segundo valor: "
    Leer valor2
    Escribir "Ingrese la operaci�n a realizar (S, R, M, D): "
	
    Leer operacion
	
		
    // C�lculo de la operaci�n seleccionada
    Segun operacion Hacer
			// Suma
			Caso "S" o "s":
            resultado <- valor1 + valor2
            Escribir "El resultado de la suma es: " resultado
			// Resta
			Caso "R"o "r":
            resultado <- valor1 - valor2
            Escribir "El resultado de la resta es: " resultado
			// Multiplicaci�n
			Caso "M", "m":
            resultado <- valor1 * valor2
            Escribir "El resultado de la multiplicaci�n es: " resultado
			// Divisi�n
			Caso "D", "d":
            Si valor2 = 0 Entonces
                Escribir "Error: no se puede dividir entre cero."
            Sino
                resultado <- valor1 / valor2
                Escribir "El resultado de la divisi�n es: " resultado
            FinSi
			// Opci�n inv�lida
			De Otro Modo
            Escribir("Error: operaci�n inv�lida.")
    FinSegun
	
FinAlgoritmo
