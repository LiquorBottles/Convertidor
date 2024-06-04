import java.util.*;
public class Convertidor {
    public static void main(String[] args) {
        //Convertidor De Unidades
        Scanner input = new Scanner(System.in);
        int km;
        int cm;
        int Y;
        int menu = 0;
        do{
        System.out.println("Convertidor de unidades de distancia");
        System.out.println("Menu\n1. Centimentros - Pulgadas\n2. Yardas - metros\n3. Km - Millas\n4. Cerrar programa\n Ingrese una Opcion");
        
        while (!input.hasNextInt()) {
            System.out.println("Por favor, ingrese un opcion valida válido.");
            input.next(); // Descartar la entrada no válida
        }

        menu =input.nextInt();
        switch(menu){
            case 1:
            System.out.println("Cm - Pulgadas");
            System.out.println("Ingrese los cm");
            cm = input.nextInt();
            System.out.println(cm/2.3 + "\n");
            break;
            case 2:
            System.out.println("Yardas - metros");
            System.out.println("Ingrese las yardas");
            Y = input.nextInt();
            System.out.println(Y/1.094 + "\n");
            break;
            case 3: 
            System.out.println("KM - Millas");
            System.out.println("Ingrese los KM");
            km =  input.nextInt();
            System.out.println(km/ 1.609 + "\n");
            break;
            case 4:
            System.out.println("Cerrando Program...");
            break;
            default:
            System.out.println("Ingresa una opcion valida");
            break;
        }
        }while(menu != 4);
        input.close();
    }
}
