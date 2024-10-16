import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcao;

        do {
            // Entrada de dados
            System.out.print("Sexo (M ou F): ");
            char sexo = sc.next().charAt(0);

            System.out.print("Quantidade de cervejas: ");
            int qtdCervejas = sc.nextInt();

            System.out.print("Quantidade de refrigerantes: ");
            int qtdRefrigerantes = sc.nextInt();

            System.out.print("Quantidade de espetinhos: ");
            int qtdEspetinhos = sc.nextInt();

            // Criação do objeto ClienteBar
            ClienteBar cliente = new ClienteBar(sexo, qtdCervejas, qtdRefrigerantes, qtdEspetinhos);

            // Geração do relatório
            cliente.gerarRelatorio();

            // Pergunta se o usuário quer reiniciar
            System.out.print("Deseja realizar outra operação? (S/N): ");
            opcao = sc.next().charAt(0);

        } while (opcao == 'S' || opcao == 's');

        System.out.println("Programa encerrado.");
        sc.close();
    }
}
