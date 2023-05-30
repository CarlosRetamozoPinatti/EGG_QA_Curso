Algoritmo Calcular_Area_Perimetro_Rectangulo
	
    // Declaración de variables
    Definir  base, altura, area, perimetro Como Real
    
    // Pedir al usuario que ingrese la base y la altura del rectángulo
    Escribir "Ingrese la base del rectángulo: "
    Leer base
    Escribir "Ingrese la altura del rectángulo: "
    Leer altura
    
    // Calcular el área y el perímetro del rectángulo
    area <- base * altura
    perimetro <- 2 * (base + altura)
    
    // Mostrar el área y el perímetro del rectángulo por pantalla
    Escribir "El área del rectángulo es: ", area
    Escribir "El perímetro del rectángulo es: ", perimetro

FinAlgoritmo
