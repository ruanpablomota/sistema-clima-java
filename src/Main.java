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
                    for (CidadeClima cidadeClima : cidadeClimas) {
                        cidadeClima.exibir();
                    }
                    if (cidadeClimas.size() == 0){
                        System.out.println("Nenhuma cidade cadastrada.");
                    }
                    input.nextLine();
                    break;
                case 3:


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