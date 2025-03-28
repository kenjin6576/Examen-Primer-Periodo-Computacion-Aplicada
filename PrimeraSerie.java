import java.util.Scanner;

public class PrimeraSerie {
    public static void main(String[] args) {
        
        System.out.println("Serie uno");
        System.out.println("<----------------------------------->");

        System.out.println("La suma de un numero y su triple ");
        Scanner entrada1= new Scanner(System.in);
       System.out.print("Numero: ");
       double numero1= entrada1.nextDouble();

       double resultado= numero1+numero1*3;

       System.out.println("El resultado es " + resultado);

       System.out.println("<------------------------------->");

       System.out.println("El doble de un numero menos cinco ");
        Scanner entrada2= new Scanner(System.in);
       System.out.print("Numero: ");
       double numero2= entrada1.nextDouble();

       double resultado2= numero2*numero2-5;

       System.out.println("El resultado es " + resultado2);

       
       System.out.println("<------------------------------------>");
       
       
       System.out.println("La suma de un numero, el doble y su triple ");
        Scanner entrada3= new Scanner(System.in);
       System.out.print("Numero: ");
       double numero3= entrada1.nextDouble();

       double resultado3= numero3+numero3*3+numero3*numero3;

       System.out.println("El resultado es " + resultado3);


    }
}
