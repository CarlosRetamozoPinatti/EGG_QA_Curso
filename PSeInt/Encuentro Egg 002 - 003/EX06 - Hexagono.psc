Algoritmo CalcularAreaPerimetroHexagono
	
	Definir lado, area, perimetro Como Real
	
    // Pedir al usuario que ingrese la medida de un lado del hex�gono
    Escribir "Ingrese la medida de un lado del hex�gono:"
    Leer lado
    
    // Calcular el �rea del hex�gono
    area <- (3 * Raiz(3) * lado * lado) / 2
    
    // Calcular el per�metro del hex�gono
    perimetro <- 6 * lado
    
    // Mostrar el resultado del �rea del hex�gono
    Escribir "El �rea del hex�gono es:", area
    
    // Mostrar el resultado del per�metro del hex�gono
    Escribir "El per�metro del hex�gono es:", perimetro
FinAlgoritmo
