import java.util.Scanner;

public class Exerc01 {

    public static void main(String[] args) {

        String texto;
        int nasc;
        int anoatual;

        Scanner ler = new Scanner(System.in);

        System.out.print("Entre com o seu nome: ");
        texto = ler.nextLine();

        System.out.print("Entre com o ano que nasceu: ");
        nasc = ler.nextInt();
        //ler.nextLine();

        System.out.print("Entre com o ano atual: ");
        anoatual = ler.nextInt();
        //ler.nextLine();

        texto += ", possui " + (anoatual-nasc)+".";
        System.out.println(texto);

        ler.close();
    }

}
