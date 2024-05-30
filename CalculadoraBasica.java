import java.util.*;
public class CalculadoraBasica {

    public static void main(String[] args) {
        int a,b;
        int menu =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Calculadora Basica");
        
        do{
            System.out.println("Menu\n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n5. Cerrar Programa");
            try{
            menu = input.nextInt();
            switch(menu){
                case 1:
                System.out.println("Suma");
                System.out.println("Ingresa los valors a sumar:\n");
                a = input.nextInt();
                b = input.nextInt();
                System.out.println("Resultado: " + (a+b));
                break;
                case 2:
                System.out.println("Resta");
                System.out.println("Ingresa los valores a restar");
                a = input.nextInt();
                b = input.nextInt();
                System.out.println("Resultado: " + (a-b));
                break;
                case 3:
                System.out.println("Multiplicacion");
                System.out.println("Ingresa los valores a multiplicar");
                a = input.nextInt();
                b = input.nextInt();
                System.out.println("Resultado: " + a*b);
                break;
                case 4:
                System.out.println("Division");
                System.out.println("Ingresa los valores a Dividir");
                a = input.nextInt();
                b = input.nextInt();
                System.out.println("Resultado: " + a/b);
                break;
                case 5:
                System.out.println("Cerrando Programa...");
                menu = 5;
                break;
                default:
                System.out.println("Ingrese una opcion valida");
                break;
                }
            }catch(Exception e){
                System.out.println("Ingresa una opcion VALIDA!!!!");
                input.next();
            }
                
        }while(menu != 5);
        input.close();
    }
}