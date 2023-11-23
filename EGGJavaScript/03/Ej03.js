// Función para convertir Celsius a Fahrenheit
/*
Esta función toma un valor en grados Celsius como argumento (celsius) 
y aplica la fórmula de conversión de Celsius a Fahrenheit: 
multiplica el valor en Celsius por 9/5 y luego 
le suma 32 para obtener el valor equivalente en Fahrenheit.
*/

function celsiusToFahrenheit(celsius) {
    return (celsius * 9/5) + 32;
  }
  
  // Función para convertir las temperaturas en Celsius a Fahrenheit usando .map()
  /*
  En este paso, se crea una función llamada convertTemperatures() 
  que toma un array de temperaturas en grados Celsius (celsiusTemperatures) 
  como argumento. Dentro de esta función, se utiliza el método .map() 
  para aplicar la función celsiusToFahrenheit() a cada elemento del array 
  celsiusTemperatures y almacenar los resultados en un nuevo array 
  llamado fahrenheitTemperatures. Finalmente, se devuelve este nuevo array 
  con las temperaturas convertidas.
  */

  function convertTemperatures(celsiusTemperatures) {
    const fahrenheitTemperatures = celsiusTemperatures.map(celsiusToFahrenheit);
    return fahrenheitTemperatures;
  }

  /*
  En este fragmento, se define un array initialCelsiusTemperatures 
  que contiene los valores iniciales en grados Celsius. 
  Luego, se llama a la función convertTemperatures() 
  pasando como argumento este array y se almacena el resultado 
  (array con temperaturas convertidas) en convertedTemperatures. 
  Finalmente, se imprimen ambos arrays en la consola: 
  el array original en Celsius y el array resultante de las temperaturas 
  convertidas en Fahrenheit.
  */
  
  // Valores iniciales en Celsius
  const initialCelsiusTemperatures = [0, 15, 30, 45, 60];
  
  // Llamada a la función de conversión y visualización de resultados
  const convertedTemperatures = convertTemperatures(initialCelsiusTemperatures);
  
  console.log("Temperaturas en Celsius:", initialCelsiusTemperatures);
  console.log("Temperaturas convertidas en Fahrenheit:", convertedTemperatures);
  