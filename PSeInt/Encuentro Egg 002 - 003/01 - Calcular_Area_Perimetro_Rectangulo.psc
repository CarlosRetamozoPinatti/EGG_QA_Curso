Algoritmo Calcular_Area_Perimetro_Rectangulo
	
    // Declaraci�n de variables
    Definir  base, altura, area, perimetro Como Real
    
    // Pedir al usuario que ingrese la base y la altura del rect�ngulo
    Escribir "Ingrese la base del rect�ngulo: "
    Leer base
    Escribir "Ingrese la altura del rect�ngulo: "
    Leer altura
    
    // Calcular el �rea y el per�metro del rect�ngulo
    area <- base * altura
    perimetro <- 2 * (base + altura)
    
    // Mostrar el �rea y el per�metro del rect�ngulo por pantalla
    Escribir "El �rea del rect�ngulo es: ", area
    Escribir "El per�metro del rect�ngulo es: ", perimetro

FinAlgoritmo
