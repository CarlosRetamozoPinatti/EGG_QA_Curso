package Service;

import Entity.Celular;

import java.util.Scanner;

public class CelularService {
    Scanner leer = new Scanner(System.in);

    public Celular crearCelular(){
        Celular cel = new Celular();

        System.out.println("Ingrese la MARCA del celular: ");
        cel.setMarca(leer.nextLine());
        System.out.println("Ingrese el MODELO del celular: ");
        cel.setModelo(leer.nextLine());
        System.out.println("Ingrese la MEMORIA RAM del celular: ");
        cel.setMemoriaRam(leer.nextInt());
        System.out.println("Ingrese el ALMACENAMIENTO del celular: ");
        cel.setAlmacenamiento(leer.nextInt());
        System.out.println("Ingrese el PRECIO del celular: ");
        cel.setPrecio(leer.nextBigDecimal());
        System.out.println("Ingrese los digitos del CODIGO del celular: ");
        cel.setCodigo(setearCodigo());
        return cel;
    }

    public StringBuilder setearCodigo() {
        StringBuilder codcel = new StringBuilder();
        int[] codigo = new int[7];
        for (int i = 0; i < codigo.length; i++) {
            System.out.println("Ingrese el digito " + (i + 1));
            codigo[i] = leer.nextInt();
            codcel.append(codigo[i]);
        }
        return codcel;
    }
}
