import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Circle circulo = new Circle(2.0, "Green");
        System.out.println(circulo.getArea());
        System.out.println(circulo.getRadius());

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDeseja criar um jogo? (1 - Sim, 2 - Não)");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao == 1){
            System.out.print("Digite o nome do jogo: ");
            String titulo = scanner.nextLine();
            System.out.print("Digite a classificação etária do jogo (L, +10, +12, +16, +18): ");
            String classificacao = scanner.nextLine();
            System.out.print("Digite o preço do jogo: ");
            String preco = scanner.nextLine();

            Jogo jogo_atual = new Jogo(titulo, classificacao, Double.parseDouble(preco));

            while (true){
                System.out.println("\nEscolha uma das opções:\n1 - Aumentar preço\n2 - Descontar preço\n3 - Atualizar classificação etária\n4 - Mostrar detalhes\n5 - Adicionar novo jogo\n6 - Sair");
                String escolha = scanner.nextLine();
                double porcentagem;
                String texto;

                switch (escolha){
                    case "1":
                        System.out.print("\nEscolha uma porcentagem (0.0 - 100.0):");
                        porcentagem = Double.parseDouble(scanner.nextLine());
                        jogo_atual.aumentarPreco(porcentagem);
                        break;

                    case "2":
                        System.out.print("\nEscolha uma porcentagem (0.0 - 100.0):");
                        porcentagem = Double.parseDouble(scanner.nextLine());
                        jogo_atual.aplicarDesconto(porcentagem);
                        break;

                    case "3":
                        System.out.print("\nEscolha um novo título:");
                        texto = scanner.nextLine();
                        jogo_atual.setTitulo(texto);
                        break;

                    case "4":
                        System.out.print(jogo_atual.toString());
                        break;

                    case "5":
                        System.out.print("Digite o nome do jogo: ");
                        titulo = scanner.nextLine();
                        System.out.print("Digite a classificação etária do jogo (L, +10, +12, +16, +18): ");
                        classificacao = scanner.nextLine();
                        System.out.print("Digite o preço do jogo: ");
                        preco = scanner.nextLine();
                        jogo_atual = new Jogo(titulo, classificacao, Double.parseDouble(preco));
                        break;

                    default:
                        System.exit(0);
                        break;
                }
            }
        }
    }
}