Algoritmo CalcularSalario
	
    // Declaración de variables
    Definir  salarioBruto, salarioNeto Como Real
    
    // Pedir al usuario que ingrese el salario bruto
    Escribir "Ingrese el salario bruto del empleado: "
    Leer salarioBruto
    
    // Calcular el salario neto después del descuento
    salarioNeto = salarioBruto - (salarioBruto * 0.2)
    
    // Mostrar el salario neto por pantalla
    Escribir "El salario neto del empleado es: ", salarioNeto
    
FinAlgoritmo

