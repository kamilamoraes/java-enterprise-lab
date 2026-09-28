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

         Funcionario funcionario = new Funcionario("Kamila", "Moraes", 23, "Desenvolvedora", 5000.00);

         funcionarios.add(funcionario);
         System.out.println(funcionarios.size());

         funcionarios.add(funcionario);
         System.out.println(funcionarios.size());

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

         Cliente clienteVazio = new Cliente();

         clienteVazio.setId(1);
         clienteVazio.setNome("Maria");
         clienteVazio.setSobrenome("Ribeiro");
         clienteVazio.setEmail("mariaribr@gmail.com");
         clienteVazio.setTelefone("6298888-7777");

        System.out.println(clienteVazio.getId());
        System.out.println(clienteVazio.getNome());
        System.out.println(clienteVazio.getSobrenome());
        System.out.println(clienteVazio.getEmail());
        System.out.println(clienteVazio.getTelefone());

        Produto produtoVazio = new Produto();

        produtoVazio.setId(1);
        produtoVazio.setNome("Notebook");
        produtoVazio.setDescricao("Notebook para desenvolvimento");
        produtoVazio.setPreco(3500.00);
        produtoVazio.setQuantidade(10);

        System.out.println(produtoVazio.getId());
        System.out.println(produtoVazio.getNome());
        System.out.println(produtoVazio.getDescricao());
        System.out.println(produtoVazio.getPreco());
        System.out.println(produtoVazio.getQuantidade());


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
            funcionarios.add(novoFuncionario);
            System.out.println(funcionarios.size());

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
