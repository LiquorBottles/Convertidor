public class Piramide {
    public static void main(String[] args) {
        System.out.println("Piramide");
        int altura = 6;
        for(int i = 0; i<altura; i++){
            System.out.println("");
            for(int k = 0; k<altura - i-1;k++){
                System.out.print(" ");
            }
            for(int j = 0; j<2*i-1;j++){
                System.out.print("*");
            }
            
        }

    }//Psvm
}//Class
