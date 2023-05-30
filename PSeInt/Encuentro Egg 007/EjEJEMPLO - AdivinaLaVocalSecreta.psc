Algoritmo AdivinaLaVocalSecreta
    Definir vocalSecreta Como Caracter
    Definir vocalAdivinada Como Caracter
    
    Escribir "Ingresa la vocal secreta: "
    Leer vocalSecreta
    
    Mientras vocalAdivinada <> vocalSecreta Hacer
        Escribir "Intenta adivinar la vocal secreta: "
        Leer vocalAdivinada
        
        Si vocalAdivinada <> vocalSecreta Entonces
            Escribir "Incorrecto. Sigue intentando."
        Fin Si
    Fin Mientras
    
    Escribir "¡Adivinaste la vocal secreta!"
    
FinAlgoritmo
