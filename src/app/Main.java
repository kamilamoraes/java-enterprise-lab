package app;
import app.model.Funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

         Funcionario funcionario = new Funcionario("Kamila", "Moraes", 23, "Desenvolvedora", 5000.00);
         System.out.println(funcionario.getNome());
         System.out.println(funcionario.getSobrenome());
         System.out.println(funcionario.getIdade());
         System.out.println(funcionario.getCargo());
         System.out.println(funcionario.getSalario());

         Funcionario funcionarioVazio = new Funcionario();

         funcionarioVazio.setNome("Kamila");
         funcionarioVazio.setSobrenome("Moraes");
         funcionarioVazio.setIdade(23);
         funcionarioVazio.setCargo("Analista");
         funcionarioVazio.setSalario(5000.00);

         System.out.println(funcionarioVazio.getNome());
         System.out.println(funcionarioVazio.getSobrenome());
         System.out.println(funcionarioVazio.getIdade());
         System.out.println(funcionarioVazio.getCargo());
         System.out.println(funcionarioVazio.getSalario());


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
