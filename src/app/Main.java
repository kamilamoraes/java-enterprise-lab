package app;
import app.model.Funcionario;
import app.model.Cliente;
import app.model.Produto;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        int proximoId = 1;


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
        scanner.nextLine();


       switch (opcao) {
        case 1:
            System.out.println("=== Menu Funcionários ==="); 

            int opcaoFuncionario;

            do {

                System.out.println("1 - Cadastrar funcionário");
                System.out.println("2 - Listar funcionários");
                System.out.println("0 - Voltar");
                System.out.print("Digite uma opção: ");

                opcaoFuncionario = scanner.nextInt();
                scanner.nextLine();

            switch (opcaoFuncionario) {
                case 1:
                    System.out.println("Nome: ");
            String nome = scanner.nextLine();

            System.out.println("Sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.println("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Cargo: ");
            String cargo = scanner.nextLine();

            System.out.println("Salário: ");
            double salario = scanner.nextDouble();


            Funcionario novoFuncionario = new Funcionario(nome, sobrenome, idade, cargo, salario);

            novoFuncionario.setId(proximoId);
            proximoId++;

            funcionarios.add(novoFuncionario);

            System.out.println("Funcionario cadastrado com sucesso!");
            System.out.println("ID: " + novoFuncionario.getId());

           
                break;

                 case 2:
                     System.out.println("Listando funcionários...");

                    for (Funcionario funcionario : funcionarios) {

                    System.out.println("ID: " + funcionario.getId());
                    System.out.println("Nome: " + funcionario.getNome());
                    System.out.println("Sobrenome: " + funcionario.getSobrenome());
                    System.out.println("Idade: " + funcionario.getIdade());
                    System.out.println("Cargo: " + funcionario.getCargo());
                    System.out.println("Salário: " + funcionario.getSalario());

                     }
                    break;

                 case 0:
                     System.out.println("Voltando ao menu principal...");
                    break;

                default:
                    System.out.println("Opção inválida!");
        }

            } while (opcaoFuncionario != 0);


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
