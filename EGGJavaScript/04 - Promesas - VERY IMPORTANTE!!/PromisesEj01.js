/*
¿Qué es una Promise en JavaScript?
Una Promise es un objeto que representa un valor que puede estar disponible ahora, 
en el futuro o nunca. Se utiliza para realizar operaciones asincrónicas 
y manejar el resultado exitoso o fallido de una operación asíncrona.

Una Promise puede estar en uno de estos tres estados:

Pending: Estado inicial, la operación asincrónica aún no se ha completado.
Fulfilled (Resuelta): La operación asincrónica se ha completado satisfactoriamente.
Rejected (Rechazada): La operación asincrónica ha fallado.
Una Promise tiene un comportamiento estructurado que consiste en 
dos partes principales: la ejecución y la captura del resultado. 
Para manejar los resultados, se utilizan métodos .then() y .catch().
*/

//--> 1
function fetchData(url) {
    return new Promise((resolve, reject) => {
      // Simula un retraso de 2 segundos
      setTimeout(() => {
        // Resuelve o rechaza la promesa al azar
        if (Math.random() >= 0.5) {
          resolve({ datos: 'Datos de prueba' });
        } else {
          reject({ error: 'Error de prueba' });
        }
      }, 2000);
    });
  }
  //--> 2
  fetchData('https://swapi.dev/')
  //--> 3
  .then((response) => {
    console.log('Los datos se han obtenido correctamente:', response.datos);
  })
  .catch((error) => {
    console.error('Error al obtener los datos:', error.error);
  });

  /*

  1 - Definicion de la funcion fetchData.

  La función fetchData toma una URL como parámetro y devuelve un objeto Promise. 
  Dentro del constructor de Promise, se definen dos funciones de devolución de llamada: resolve y reject. 
  Estas funciones se utilizan para manejar la finalización exitosa o el fracaso de la operación asíncrona, 
  respectivamente.
  La función setTimeout se utiliza para simular un retraso de 2 segundos, 
  que representa el tiempo que tarda en obtenerse los datos del servidor. 
  Después del retraso, la Promise se resuelve con un objeto de datos de prueba 
  o se rechaza con un objeto de error de prueba, dependiendo de una condición aleatoria.

  2 - Llamado a la funcion fetchData.

  La función fetchData se llama con la URL https://swapi.dev/, 
  que representa el punto final de la API desde el que obtener datos.

  3 - Manejo de casos RESUELTO Y RECHAZADO

  El método then se utiliza para manejar la resolución exitosa de la Promise. 
  El parámetro response contiene los datos que se obtuvieron del servidor.
  El método catch se utiliza para manejar el rechazo de la Promise. 
  El parámetro error contiene el objeto de error que indica el motivo del fracaso.

  Mas Info
  
La función fetchData utiliza el método setTimeout para simular un retraso de 2 segundos. 
Esto representa el tiempo que tarda en obtenerse los datos del servidor.

La función fetchData utiliza un operador condicional para resolver o rechazar la Promise al azar. 
Si el valor aleatorio es mayor o igual que 0,5, la Promise se resuelve con un objeto de datos de prueba. 
En caso contrario, la Promise se rechaza con un objeto de error de prueba.

La función then se utiliza para manejar la resolución exitosa de la Promise. 

La función console.log() se utiliza para imprimir los datos que se obtuvieron del servidor.

La función catch se utiliza para manejar el rechazo de la Promise. 

La función console.error() se utiliza para imprimir el error que indica el motivo del fracaso
  */