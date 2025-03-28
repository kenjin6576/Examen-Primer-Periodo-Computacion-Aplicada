import java.util.Scanner;

import javafx.scene.shape.Line;

public class SegundaSerie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("Segunda Serie");

        do {

            System.out.println("[1] Calcular Promedio ");
            System.out.println( "[2] Saludar por tu nombre ");
            System.out.println("[3] Di: Hola Mundo");
            System.out.println("[4] Salir");
            System.out.print("[?] :");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:

                    System.out.print("Promedio : ");
                    int prom= scanner.nextInt();

        
                    System.out.println("[1] Numero 1: ");
                    int num1 = scanner.nextInt();
    
                    System.out.println("<---------------------------->");
                    System.out.println("[2] Numero 2: ");
                    int num2 = scanner.nextInt();
    
                    System.out.println("<---------------------------->");
                    System.out.println("[3] Numero 3: ");
                    int num3 = scanner.nextInt();
    
    
                    double Resultado= (num1+num2+num3)/3;
                    System.out.println("| [ Resultado ]: " + Resultado); 
                    
                    
                    break;

                case 2:
                 
                Scanner entradanombre= new Scanner(System.in);
                System.out.print("Nombre: ");
                String nombre = scanner.next();

    
                System.out.println("Hola " + nombre + " !");

                
                
                    break;

                case 3:

                System.out.println("¡Hola Mundo!");

                    break;

                case 4:
                System.out.println("Saliendo del programa, espere un segundo...");
                System.out.println("Que tenga un buen dia!");
                
                    break;
            
                default:
                    break;
            }

        } while (opcion!=4);

        


    }
    
}
