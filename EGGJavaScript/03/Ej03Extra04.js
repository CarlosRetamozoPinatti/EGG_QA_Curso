/**
 * Task description: Write a method that returns an object composed of key-value pairs.
 * Expected Result: [['a', 1], ['b', 2]] => { a: 1, b: 2 }
 * Task Complexity: 2 of 5
 * @param {Array} array - a deep array of pairs
 * @returns {Array}
 */

/*
 La función fromPairs toma una matriz (array) de pares clave-valor 
 y crea un objeto donde las claves son el primer elemento de cada sub-array 
 y los valores son el segundo elemento de cada sub-array. 
 Esto se hace utilizando el método reduce().

 array.reduce((acc, value) => {...}, {}): El método reduce() itera sobre cada elemento 
 de la matriz (array) y construye un objeto acumulador (acc). 
 Se inicia con un objeto vacío {} como valor inicial para el acumulador.

La función de reducción recibe dos argumentos: acc (el acumulador) 
y value (el elemento actual de la matriz durante la iteración).

if (Array.isArray(value)) { acc[value[0]] = value[1]; }: Verifica 
si el elemento value es un array utilizando Array.isArray(). 
Si es un array, toma su primer elemento (value[0]) como clave 
y su segundo elemento (value[1]) como valor, y luego asigna estos valores 
al objeto acumulador acc.

Finalmente, reduce() devuelve el objeto resultante, que contiene las claves y valores según los pares clave-valor proporcionados en la matriz de entrada.
*/
const fromPairs = (array) => array.reduce((acc, value) => {
    if (Array.isArray(value)) {
      acc[value[0]] = value[1];
    }
    return acc;
  }, {});

const inputArray = [['a', 1], ['b', 2]];
const resultObject = fromPairs(inputArray);
console.log(resultObject); // Output: { a: 1, b: 2 }

  