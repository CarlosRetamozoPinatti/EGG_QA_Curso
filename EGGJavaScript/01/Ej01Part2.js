function sumNumbers(arr) {
    let sum = 0; // LET me define una variable con alcance de BLOQUE, no funciona en BLOQUES SUPERIORES
    //La funcion recibe un array, lo recorre, y los elementos del tipo NUMERO se suman.
    for (let i = 0; i < arr.length; i++) {
      if (typeof arr[i] === 'number') {
        sum += arr[i];
      }
    }  
    console.log(sum);
    return sum;
  }
  
  sumNumbers([10, "hello", 5, true, 8]); // Output: 23
  