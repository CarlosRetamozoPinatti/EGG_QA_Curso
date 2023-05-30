Algoritmo Calcular_Volumen_Cilindro
	
    // Declaración de variables
    Definir radio, altura, volumen Como Real
   
    
    // Pedir al usuario que ingrese el radio y la altura del cilindro
    Escribir "Ingrese el radio del cilindro: "
    Leer radio
    Escribir "Ingrese la altura del cilindro: "
    Leer altura
    
    // Calcular el volumen del cilindro
    volumen <- PI * radio ^ 2 * altura
    
    // Mostrar el volumen del cilindro por pantalla
    Escribir "El volumen del cilindro es: ", volumen
	
FinAlgoritmo
