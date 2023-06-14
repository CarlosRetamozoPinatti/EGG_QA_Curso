package Service;

import Entity.Matematica;

public class MatematicaService {

    public Matematica crearOp(){
        Matematica op = new Matematica();

        op.setNum1(Math.random()*10);
        op.setNum2(Math.random()*10);

        return op;
    }
    //ACA EL ABS ESTA DE MAS, PERO LO DEJO PORQUE LO PIDE EL EJERCICIO.
    //ESTA DE MAS PORQUE TRAIGO ENTEROS ENTRE 1 Y 9. NO NEGATIVOS
    public double calcularRaiz(Matematica op){
        double num1 = Math.round(Math.abs(op.getNum1()));
        double num2 = Math.round(Math.abs(op.getNum2()));

        if (num1 > num2){
            System.out.println("El numero menor en valor absoluto es " + num2);
            System.out.println("El valor de la raiz cuadrada de " + num2 + " es: ");
            return Math.sqrt(num2);
        } else {
            System.out.println("El numero menor en valor absoluto es " + num1);
            System.out.println("El valor de la raiz cuadrada de " + num1 + " es: ");
            return Math.sqrt(num1);
        }
    }
    //ACA CREO QUE EL ROUND SE REPITE DE FORMA VERBOSA PARA QUE SE ENTIENDA SOLAMENTE.
    public double calcularPotencia(Matematica op){
        double num1 = Math.round(op.getNum1());
        double num2 = Math.round(op.getNum2());

        if (num1 > num2){
            System.out.println("La base sera " + num1 + " y el exponente sera " + num2);
            return Math.round(Math.pow(num1, num2));
        } else {
            System.out.println("La base sera " + num2 + " y el exponente sera " + num1);
            return Math.round(Math.pow(num2, num1));
        }
    }
    public double devolverMax(Matematica op){
        System.out.println("El mayor entre los numeros " + op.getNum1() + " y " + op.getNum2() + " es:");
        return Math.round(Math.max(op.getNum1(), op.getNum2()));
    }

}
