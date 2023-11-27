/**
 * Task description: Write a method that reverts input array
 * Expected Result: [1, 2, 3] => [3, 2, 1]
 * Task Complexity: 1 of 5
 * @param {Array} array - Array of any elements
 * @returns {Array}
 * 
 * Este método reverse utiliza un enfoque mediante un bucle for 
 * para invertir el orden de los elementos del array. 
 * Funciona de la siguiente manera:
const reversed = [];: Se inicializa un nuevo array 
llamado reversed donde se almacenarán los elementos en orden inverso.
for (let i = array.length - 1; i >= 0; i -= 1) { ... }: 
Este bucle for recorre el array original desde el último elemento 
hasta el primero (índice array.length - 1 hasta 0). 
En cada iteración, se accede al elemento en la posición i del array original 
y se agrega al nuevo array reversed usando reversed.push(array[i]).
return reversed;: Finalmente, devuelve el nuevo array reversed 
con los elementos en orden inverso del array original.
 * 
 */
const reverse = (array) => {
    const reversed = [];
  
    for (let i = array.length - 1; i >= 0; i -= 1) {
      reversed.push(array[i]);
    }
  
    return reversed;
  };
  
  /**
   * Task description: Write a method that reverts input array
   * Expected Result: [1, 2, 3] => [3, 2, 1]
   * Task Complexity: 1 of 5
   * @param {Array} array - Array of any elements
   * @returns {Array}
   */
  const reverse2 = (array) => array.map((el, id, givenArr) => givenArr[givenArr.length - id - 1]);


//Llamados de ejecucion para cada funcion reverse
const reversedArray = reverse([1, 2, 3]);
console.log(reversedArray); // Output: [3, 2, 1]

const reversedArray2 = reverse2([4, 5, 6]);
console.log(reversedArray2); // Output: [6, 5, 4]
