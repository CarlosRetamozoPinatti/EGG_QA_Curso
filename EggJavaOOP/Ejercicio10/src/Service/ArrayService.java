package Service;

import Entity.Array;

import java.util.Arrays;

public class ArrayService {
    public void cargarArray() {
        Array array = new Array();
        double A[] = new double[50];

        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * 50);
        }
        array.setVector1(A);
        //SETEO LOS VALORES DEL SEGUNDO ARRAY EN BASE AL PRIMERO
        array.setVector2(Arrays.copyOf(array.getVector1(), 20));
        Arrays.fill(array.getVector2(), 10, 20, 0.5);
        //MUESTRO LOS VALORES
        System.out.println(array.toString());
        //LOS ORDENO E IMPRIMO USANDO FUNCIONES PROPIAS DE JAVA
        Arrays.sort(array.getVector1());
        System.out.println("El vector 1 ordenado es: ");
        System.out.println(Arrays.toString(array.getVector1()));;
        Arrays.sort(array.getVector2());
        System.out.println("El vector 2 ordenado es: ");
        System.out.println(Arrays.toString(array.getVector2()));
    }
}
