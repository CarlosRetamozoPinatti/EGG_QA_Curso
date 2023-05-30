Algoritmo CalcularAreaPerimetroHexagono
	
	Definir lado, area, perimetro Como Real
	
    // Pedir al usuario que ingrese la medida de un lado del hexágono
    Escribir "Ingrese la medida de un lado del hexágono:"
    Leer lado
    
    // Calcular el área del hexágono
    area <- (3 * Raiz(3) * lado * lado) / 2
    
    // Calcular el perímetro del hexágono
    perimetro <- 6 * lado
    
    // Mostrar el resultado del área del hexágono
    Escribir "El área del hexágono es:", area
    
    // Mostrar el resultado del perímetro del hexágono
    Escribir "El perímetro del hexágono es:", perimetro
FinAlgoritmo
