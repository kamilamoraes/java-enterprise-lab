package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("       Java Enterprise Lab    ");
        System.out.println("==================================");
        System.out.println("1 - Funcionários");
        System.out.println("2 - Clientes");
        System.out.println("3 - Produtos");
        System.out.println("0 - Sair");
        System.out.println("==================================");
        System.out.print("Digite uma opção: "); 

        int opcao = scanner.nextInt();


        if (opcao == 1) {
            System.out.println("=== Menu Funcionários ===");
        } else if (opcao == 2) {
            System.out.println("=== Menu Clientes ===");
        } else if (opcao == 3) {
            System.out.println("=== Menu Produtos ===");
        } else if (opcao == 0) {
            System.out.println("=== Encerrando o Sistema ===");
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();



    }
}
