import java.util.Scanner;
public class Entrada{
    public static void main(String[] args) {
        int idade;
        String nome;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua idade");
        idade = entrada.nextInt();
        entrada.next();
        System.out.println("Sua idade é de: " +idade);
        System.out.println("Digite seu nome completo: ");
        nome = entrada.nextLine();
        System.out.println(nome);
        entrada.close();


    }
}