import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<CidadeClima> cidadeClimas = new ArrayList<>();
        while (true) {
            exibirMenu();

            int opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {

                case 1:
                    for (int i = 0; i < 3; i++) {
                        System.out.println("\n=== CADASTRO DE CLIMA ===");
                        System.out.println("Informe os dados da cidade:");
                        System.out.println("Cidade:");
                        String nome = input.nextLine();

                        System.out.println("Temperatura:");
                        int temperatura = input.nextInt();

                        input.nextLine();
                        System.out.println("Condiçâo Climática:");
                        String condiçaoClimatica = input.nextLine();

                        cidadeClimas.add(new CidadeClima(nome, temperatura, condiçaoClimatica));
                    }
                    break;
                case 2:
                    System.out.println("\n=== CLIMAS CADASTRADOS ===");

                    if (cidadeClimas.isEmpty()) {
                        System.out.println("Nenhuma cidade cadastrada.");
                    } else {
                        for (CidadeClima cidadeClima : cidadeClimas) {
                            cidadeClima.exibir();
                        }
                    }

                    input.nextLine();
                    break;

                case 3:
                    System.out.println("\n=== BUSCAR CIDADE ===");
                    System.out.print("Digite o nome da cidade: ");

                    String cidadeBuscada = input.nextLine();

                    boolean encontrada = false;

                    for (CidadeClima cidadeClima : cidadeClimas) {

                        if (cidadeClima.getCidade().equalsIgnoreCase(cidadeBuscada)) {

                            System.out.println("\n Cidade encontrada!");
                            cidadeClima.exibir();

                            encontrada = true;
                            break;
                        }
                    }
                    if (!encontrada) {
                        System.out.println("Cidade  não encontrada.");
                    }

                    break;

                case 4:
                    System.out.println("\n=== ATUALIZAR CLIMA ===");
                    System.out.print("Digite o nome da cidade que deseja atualizar: ");

                    cidadeBuscada = input.nextLine();
                    boolean temNoSistema = false;
                    for (CidadeClima cidadeClima : cidadeClimas) {
                        if (cidadeClima.getCidade().equalsIgnoreCase(cidadeBuscada)) {
                            System.out.println("Nova temperatura:");
                            int novaTemperatura = input.nextInt();
                            input.nextLine();

                            System.out.println("Nova condição:");
                            String novaCondiçao = input.nextLine();


                            cidadeClima.setCondicao(novaCondiçao);
                            cidadeClima.setTemperatura(novaTemperatura);
                            System.out.println("Clima atualizado com sucesso!");
                            cidadeClima.exibir();
                            temNoSistema = true;
                            break;
                        }


                    }
                    if (!temNoSistema) {
                        System.out.println("Cidade não encontrada");
                    }

                    break;
                case 5:
                    System.out.println("\n=== REMOVER CIDADE ===");
                    System.out.print("Digite o nome da cidade que deseja remover: ");

                    cidadeBuscada = input.nextLine();
                    boolean removida = false;
                    for (int i = 0; i < cidadeClimas.size(); i++) {
                        if(cidadeClimas.get(i).getCidade().equalsIgnoreCase(cidadeBuscada)){
                            cidadeClimas.remove(i);

                            removida = true;
                            System.out.println("Cidade removida com sucesso!");

                            break;
                        }
                    }

                    if (!removida){
                        System.out.println("Cidade não encontrada.");
                    }

            }

        }
    }


    static void exibirMenu() {
        System.out.println("\n===== SISTEMA DE CLIMA =====");
        System.out.println("1 - Cadastrar clima");
        System.out.println("2 - Listar cidades");
        System.out.println("3 - Buscar cidade");
        System.out.println("4 - Atualizar clima");
        System.out.println("5 - Remover cidade");
        System.out.println("6 - Sair");
        System.out.print("Escolha uma opção: ");
    }
}