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
                System.out.println("3 - Buscar funcionário por ID");
                System.out.println("4 - Atualizar funcionário");
                System.out.println("5 - Remover funcionário");
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

                 case 3:
                    System.out.println("=== Buscar Funcionário ===");
                    System.out.println("Digite o ID do funcionário: ");

                    int idBusca = scanner.nextInt();

                    boolean encontrado = false;

                    for (Funcionario funcionario : funcionarios) {
                        if (funcionario.getId() == idBusca) {
                            encontrado = true;
                            
                        System.out.println("Funcionário encontrado!");
                        System.out.println("ID: " + funcionario.getId());
                        System.out.println("Nome: " + funcionario.getNome());
                        System.out.println("Sobrenome: " + funcionario.getSobrenome());
                        System.out.println("Idade: " + funcionario.getIdade());
                        System.out.println("Cargo: " + funcionario.getCargo());
                        System.out.println("Salário: " + funcionario.getSalario());

                        }

                    }

                    if (encontrado == false) {
                            System.out.println("Funcionário não encontrado!");
                        }

                    break;

                 case 4:
                    System.out.println("=== Atualizar Funcionário ===");
                    System.out.println("Digite o ID do funcionário: ");
                    int idAtualizar = scanner.nextInt();

                    boolean funcionarioEncontrado = false;

                    for (Funcionario funcionario : funcionarios) {
                        if (funcionario.getId() == idAtualizar) {
                            funcionarioEncontrado = true;

                            System.out.println("Funcionário encontrado!");

                            System.out.println("Digite o novo nome: ");
                            scanner.nextLine();
                            String novoNome = scanner.nextLine();

                            funcionario.setNome(novoNome);

                            System.out.println("Digite o novo sobrenome: ");
                            String novoSobrenome = scanner.nextLine();

                            funcionario.setSobrenome(novoSobrenome);

                            System.out.println("Digite a nova idade: ");
                            int novaIdade = scanner.nextInt();

                            funcionario.setIdade(novaIdade);

                            scanner.nextLine();

                            System.out.println("Digite o novo cargo: ");
                            String novoCargo = scanner.nextLine();

                            funcionario.setCargo(novoCargo);

                            System.out.println("Digite o novo salário: ");
                            double novoSalario = scanner.nextDouble();

                            funcionario.setSalario(novoSalario);

                            System.out.println("Funcionário atualizado com sucesso!");
                        }
                    }

                    if (funcionarioEncontrado == false) {
                        System.out.println("Funcionário não encontrado!");
                    }

                    break;

                 case 5:
                    
                    System.out.println("Remover funcionário");
                    System.out.println("Digite o ID do funcionário que deseja remover: ");

                    int idRemover = scanner.nextInt();

                    boolean removido = false;

                    for (int i = 0; i < funcionarios.size(); i++) {
                        if (funcionarios.get(i).getId() == idRemover) {
                            funcionarios.remove(i);
                            removido = true;
                            break;
                            
                        }
   
                    }

                     if (removido) {
                        System.out.println("Funcionário removido com sucesso!");
                     } else {
                        System.out.println("Funcionário não encontrado!");
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
