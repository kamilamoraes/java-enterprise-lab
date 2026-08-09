package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
        System.out.println("==================================");
        System.out.println("       Java Enterprise Lab    ");
        System.out.println("==================================");
        System.out.println("1 - Funcionários");
        System.out.println("2 - Clientes");
        System.out.println("3 - Produtos");
        System.out.println("0 - Sair");
        System.out.println("==================================");
        System.out.print("Digite uma opção: "); 

        opcao = scanner.nextInt();


       switch (opcao) {
        case 1:
            System.out.println("=== Menu Funcionários ==="); 
            break;
       
        case 2:
            System.out.println("=== Menu Clientes ==="); 
            break;

        case 3:
            System.out.println("=== Menu Produtos ==="); 
            break;

        case 0:
            System.out.println("=== Encerrando o Sistema ==="); 
            break;

        default:
            System.out.println("Opção inválida!");

       }

    } while (opcao != 0);

        scanner.close();



    }
}
