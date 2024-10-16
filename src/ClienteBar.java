public class ClienteBar {
    private char sexo;
    private int qtdCervejas;
    private int qtdRefrigerantes;
    private int qtdEspetinhos;

    public ClienteBar(char sexo, int qtdCervejas, int qtdRefrigerantes, int qtdEspetinhos) {
        this.sexo = sexo;
        this.qtdCervejas = qtdCervejas;
        this.qtdRefrigerantes = qtdRefrigerantes;
        this.qtdEspetinhos = qtdEspetinhos;
    }

    public double calcularConsumo() {
        return (qtdCervejas * 5) + (qtdRefrigerantes * 3) + (qtdEspetinhos * 7);
    }

    public double calcularIngresso() {
        return (sexo == 'M' || sexo == 'm') ? 10 : 8;
    }

    public double calcularCouvert() {
        return calcularConsumo() > 30 ? 0 : 4;
    }

    public double calcularValorTotal() {
        return calcularConsumo() + calcularCouvert() + calcularIngresso();
    }

    public void gerarRelatorio() {
        System.out.println("RELATÓRIO:");
        System.out.printf("Consumo = R$ %.2f%n", calcularConsumo());
        double couvert = calcularCouvert();
        if (couvert == 0) {
            System.out.println("Isento de Couvert");
        } else {
            System.out.printf("Couvert = R$ %.2f%n", couvert);
        }
        System.out.printf("Ingresso = R$ %.2f%n", calcularIngresso());
        System.out.printf("Valor a pagar = R$ %.2f%n", calcularValorTotal());
    }
}
