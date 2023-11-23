/*
Aquí se pide un programa en JavaScript 
que analice un rango dado de números (del 1 al 20) 
e imprima un mensaje dependiendo de ciertas condiciones 
para cada número dentro de ese rango.

Se puede lograr esto usando un bucle for 
para iterar sobre los números del 1 al 20 y 
luego aplicar condiciones para verificar si cada número es par, 
impar o divisible por 5. 
*/

for (let i = 1; i <= 20; i++) {
    if (i % 2 === 0) {
      console.log(i + " is even.");
    } else {
      console.log(i + " is odd.");
    }  
    if (i % 5 === 0) {
      console.log(i + " is divisible by 5.");
    }
  }
  