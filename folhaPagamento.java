import java.util.ArrayList;
import java.util.Scanner;

class Funcionario {
    String nome;
    String matricula;
    double salario;
    double adicional;

    public Funcionario(String nome, String matricula, double salario, double adicional) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
        this.adicional = adicional;
    }
}

public class folhaPagamento {

    static ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double salariob = 2000.00;
        int opcao;
        double pagamento;
        double adicional;

        do {

            System.out.println("\nDigite o número da opção desejada");
            System.out.println("1 - Cadastrar Funcionário Padrão");
            System.out.println("2 - Cadastrar Funcionário Comissionado");
            System.out.println("3 - Cadastrar Funcionário Produção");
            System.out.println("4 - Gerar Folha de Pagamento");
            System.out.println("0 - Sair");

            opcao = ler.nextInt();
            ler.nextLine();

            switch (opcao) {

                case 0:
                    System.out.println("Encerrando programa...");
                    break;

                case 1:

                    System.out.println("Digite o nome do funcionario");
                    String nomeP = ler.nextLine();

                    System.out.println("Digite a matricula do funcionário");
                    String matriculaP = ler.nextLine();

                    adicional = 0;

                    Funcionario f1 = new Funcionario(nomeP, matriculaP, salariob, adicional);
                    funcionarios.add(f1);

                    System.out.println("Funcionário cadastrado!");
                    break;

                case 2:

                    System.out.println("Digite o nome do funcionario");
                    String nomeC = ler.nextLine();

                    System.out.println("Digite a matricula do funcionário");
                    String matriculaC = ler.nextLine();

                    System.out.println("Informe o valor das vendas");
                    double valorVendas = ler.nextDouble();

                    while (valorVendas < 0) {
                        System.out.println("Valor inválido");
                        valorVendas = ler.nextDouble();
                    }

                    System.out.println("Digite o percentual da comissão");
                    double valorPorcentagem = ler.nextDouble();

                    while (valorPorcentagem < 0 || valorPorcentagem > 100) {
                        System.out.println("Valor inválido");
                        valorPorcentagem = ler.nextDouble();
                    }

                    double porcentagem = valorPorcentagem / 100;
                    adicional = valorVendas * porcentagem;
                    pagamento = salariob + adicional;

                    Funcionario f2 = new Funcionario(nomeC, matriculaC, pagamento, adicional);
                    funcionarios.add(f2);

                    System.out.println("Funcionário cadastrado!");
                    break;

                case 3:

                    System.out.println("Digite o nome do funcionario");
                    String nomeProducao = ler.nextLine();

                    System.out.println("Digite a matricula do funcionário");
                    String matriculaProducao = ler.nextLine();

                    System.out.println("Digite a quantidade de peças");
                    int qtdePecas = ler.nextInt();

                    while (qtdePecas < 0) {
                        System.out.println("Valor inválido");
                        qtdePecas = ler.nextInt();
                    }

                    System.out.println("Digite o valor de cada peça");
                    double valorPecas = ler.nextDouble();

                    while (valorPecas < 0) {
                        System.out.println("Valor inválido");
                        valorPecas = ler.nextDouble();
                    }
                    adicional = qtdePecas * valorPecas;
                    pagamento = salariob + adicional;

                    Funcionario f3 = new Funcionario(nomeProducao, matriculaProducao, pagamento, adicional);
                    funcionarios.add(f3);

                    System.out.println("Funcionário cadastrado!");
                    break;

                case 4:
                    folha();
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }

        } while (opcao != 0);

        ler.close();
    }

    public static void folha() {

        System.out.println("\nFOLHA DE PAGAMENTO");

        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }

        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.nome);
            System.out.println("Matricula: " + f.matricula);
            System.out.println("Salario: " + f.salario);
            System.out.println("Valores Adicionais: " + f.adicional);
            System.out.println("----------------------");
        }
    }
}