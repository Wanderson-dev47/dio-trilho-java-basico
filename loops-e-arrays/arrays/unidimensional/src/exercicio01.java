import java.util.Scanner;

public class exercicio01 {
    //Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[5];

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite o " + (i + 1) + "º valor: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("\nValores informados: ");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

    }
}
