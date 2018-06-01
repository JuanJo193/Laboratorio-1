package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
        float b,c,t;
        int a;
       Scanner scan = new Scanner(System.in);
       System.out.println("\n1.Suma\n2.Resta\n3.Multiplicación\n4.División\nEscoja una opción para calcular:");
       a=scan.nextInt();
       switch(a){
               case 1: 
               System.out.println("Ingrese un número:");
                  b=scan.nextFloat();
                  System.out.println("Ingrese otro número:");
                  c=scan.nextFloat();
                  t=b+c;
                  System.out.println("El resultado de la suma de los dos números es: "+t);
                  break;
               case 2:
                   System.out.println("Ingrese un número:");
                  b=scan.nextFloat();
                  System.out.println("Ingrese otro número:");
                  c=scan.nextFloat();
                  t=b-c;
                  System.out.println("El resultado de la resta de los dos números es: "+t);
                  break;
               case 3:
                   System.out.println("Ingrese un número:");
                  b=scan.nextFloat();
                  System.out.println("Ingrese otro número:");
                  c=scan.nextFloat();
                  t=b*c;
                  System.out.println("El resultado de la multiplicación de los dos números es: "+t);
                  break;
               case 4:
                   System.out.println("Ingrese un número:");
                  b=scan.nextFloat();
                  System.out.println("Ingrese otro número:");
                  c=scan.nextFloat();
                  t=b/c;
                  System.out.println("El resultado de la división de los dos números es: "+t);
                  break;
               default: System.out.println("La opción que escogió es incorrecta, lea bien >:(");
    }           
    }
}
