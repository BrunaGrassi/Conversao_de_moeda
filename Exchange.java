public class Exchange {
    private final double cotacaoDolar = 5.5;
    private final double iof = 0.0586;
    private final double taxaOperacaoEmPercentual = 1;

    public double comprarDolar(double valorReal) {

        double valorDolar = valorReal / cotacaoDolar;
        double valorDolarComTaxa = valorDolar * (1 - (taxaOperacaoEmPercentual / 100));
        double valorDolarComIOF = valorDolarComTaxa * (1 + iof);

        return valorDolarComIOF;
    }

    public static void main(String[] args) {
        Exchange exchange = new Exchange();
        double valorReal = 1000;
        double valorDolar = exchange.comprarDolar(valorReal);
        System.out.println("Valor em dólar: " + valorDolar);
    }
}