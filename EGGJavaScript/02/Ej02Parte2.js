/*
Ahora, se pide crear un programa para determinar 
si un número dado es un número primo. 
Un número primo es aquel que es divisible solo por sí mismo y por 1.

Puedes abordar esto usando un bucle para verificar 
si el número es divisible por algún número aparte de 1 y él mismo.
*/

function isPrime(number) {
    if (number <= 1) {
      return false;
    }
  
    for (let i = 2; i < number; i++) {
      if (number % i === 0) {
        return false;
      }
    }
  
    return true;
  }  
  // Ejemplo de uso
  const numToCheck = 13; // Cambia este número para probar diferentes valores
  if (isPrime(numToCheck)) {
    console.log(numToCheck + " es numero primo.");
  } else {
    console.log(numToCheck + " no es numero primo.");
  }
  