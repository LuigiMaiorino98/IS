import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Inserisci primo Intero");
        int x=scanner.nextInt();

        System.out.println("Inserisci secondo Intero");
        int y=scanner.nextInt();

        Calcolatrice calcolatrice =new Calcolatrice(x,y);

        System.out.println("Somma: "+ calcolatrice.Somma());
        System.out.println("Sottrazione: "+ calcolatrice.Sottrazione());
        System.out.println("Divisione: "+ calcolatrice.Divisione());
        System.out.println("Moltiplicazione: "+ calcolatrice.Moltiplicazione());
        System.out.println("Resto: "+ calcolatrice.Resto());
    }
}