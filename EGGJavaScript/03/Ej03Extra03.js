/**
 * Task description: Write a method that clears array from all unnecessary elements, like false, undefined, empty strings, zero, null
 * Expected Result: [0, 1, false, 2, undefined, '', 3, null] => [1, 2, 3]
 * Task Complexity: 1 of 5
 * @param {Array} array - An array of any elements
 * @returns {Array}
 */

/*
 El método compact se encarga de eliminar los elementos falsy 
 (como false, undefined, strings vacíos '', null, 0, entre otros) 
 de un array dado. Este método utiliza el método filter() 
 de los arrays para realizar esta operación.

array.filter((el) => el): El método filter() recorre cada elemento del array 
y ejecuta la función proporcionada como argumento ((el) => el). 
Esta función de callback se evalúa para cada elemento el del array.
La función (el) => el dentro de filter() verifica si el es un valor truthy (JAJAJ). 
En JavaScript, un valor se considera truthy si no es falsy (JAJAJAJAJJA).
Por lo tanto, cuando se llama a array.filter((el) => el), el método filter() 
devuelve un nuevo array que contiene solo los elementos para los cuales 
la función de callback retorna true, es decir, los elementos que no son falsy.
*/
const compact = (array) => array.filter((el) => el);

const originalArray = [0, 1, false, 2, undefined, '', 3, null];
const compactedArray = compact(originalArray);
console.log(compactedArray); // Output: [1, 2, 3]
