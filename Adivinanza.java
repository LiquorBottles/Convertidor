/**
 * Adivinanza
 */
import java.util.*;
 public class Adivinanza {
    public static void main(String[] args) {
        System.out.println("Juego De Adivinanza");
        int numeroRandom,intento =6,numeroUsario;
        Scanner input = new Scanner(System.in);
        Random random  = new Random();
        numeroRandom = random.nextInt(100);
        do{
            System.out.println("Tienes " + intento +" intentos para adivinar el numero random...");
            while (!input.hasNextInt()) {
                System.out.println("Por favor, ingresa un número válido.");
                input.next(); // Descartar la entrada no válida
            }
            numeroUsario = input.nextInt();
            intento--;
            if(numeroUsario > numeroRandom){
                System.out.println("Numero Equivocado");
            }else if(numeroUsario < numeroRandom){
                System.out.println("Numero equivocado");
            }else{
                System.out.println("ERES TODO UN ADIVINO!!!!");
                break;
            }
            System.out.println(numeroRandom);
            
        }while(intento > 0 && numeroUsario != numeroRandom);
        
    }//PSVM
}//CLASS