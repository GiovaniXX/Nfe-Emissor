package classes;

public class Calculos {

    public static double calcularValorParcelas(double valorCompra, int parcelas) {
        if (parcelas <= 0) {
            throw new IllegalArgumentException("A quantidade de parcelas deve ser maior que zero.");
        }

        if (parcelas == 1) {
            // À vista, não há cálculo de parcelas
            return valorCompra;
        } else {
            // Calcula o valor de cada parcela
            return valorCompra / parcelas;
        }
    }
}
