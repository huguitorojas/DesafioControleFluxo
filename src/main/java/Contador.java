import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        System.out.println("Digite o primeiro numero");
        int num1= new Scanner(System.in).nextInt();
        System.out.println("Digite o segundo numero");
        int num2= new Scanner(System.in).nextInt();

        try {
            contar(num1, num2);
        }catch (ParametrosInvalidosException e){
            System.out.println("O primeiro numero deve ser menor que o segundo numero");
            main(null);
        }

    }
        static void contar(int num1, int num2) throws ParametrosInvalidosException{
        if(num1 > num2) {
            throw  new ParametrosInvalidosException();
        }else {
            int contador = num2-num1;
            for(int i=0; i<=contador; i++){
                System.out.println("imprimindo numero "+  i);
            }

        }

    }
}
