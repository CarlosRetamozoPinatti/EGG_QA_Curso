Proceso PrimerUltimaLetra
    Definir frase Como Cadena
    Definir primeraLetra Como Cadena
    Definir ultimaLetra Como Cadena
	Definir finalFrase Como Entero
	Definir casiFinalFrase Como Entero
	
    Escribir "Ingrese una frase o palabra: "
    Leer frase
	
	frase = Mayusculas(frase)
	finalFrase = Longitud(frase)
	casiFinalFrase = finalFrase - 1
	Escribir finalFrase
	
    // Validar si la primera letra es 'A'
    primeraLetra = Subcadena(frase, 0, 0)
    Si primeraLetra = "A" Entonces
        Escribir "CORRECTO"
    SiNo
        Escribir "INCORRECTO"
    FinSi
	
	Escribir frase
	
    // Validar si la primera letra es igual a la última letra
    ultimaLetra = Subcadena(frase,casiFinalFrase,finalFrase)
	
	Escribir "Ultima Letra es: " ultimaLetra
	
    Si primeraLetra = ultimaLetra Entonces
        Escribir "CORRECTO"
    SiNo
        Escribir "INCORRECTO"
    FinSi
FinProceso




