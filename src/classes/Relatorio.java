package classes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Relatorio {

    private String empresaSelecionada;
    private String clienteSelecionado;
    private String operacaoSelecionada;
    private String parcelasSelecionadas;
    private double valorCompraDigitado;
    private String telefoneDigitado;

    public Relatorio(String empresaSelecionada, String clienteSelecionado, String operacaoSelecionada, String parcelasSelecionadas, double valorCompraDigitado, String telefoneDigitado) {
        this.empresaSelecionada = empresaSelecionada;
        this.clienteSelecionado = clienteSelecionado;
        this.operacaoSelecionada = operacaoSelecionada;
        this.parcelasSelecionadas = parcelasSelecionadas;
        this.valorCompraDigitado = valorCompraDigitado;
        this.telefoneDigitado = telefoneDigitado;
    }

    public String gerarRelatorio() {
        // Montar o modelo do relatório com os valores coletados
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dataHoraAtual = dateFormat.format(new Date());

        StringBuilder relatorio = new StringBuilder();
        relatorio.append("Relatório de Transação\n");
        relatorio.append("Data/Hora: ").append(dataHoraAtual).append("\n");
        relatorio.append("Empresa: ").append(empresaSelecionada).append("\n");
        relatorio.append("Cliente: ").append(clienteSelecionado).append("\n");
        relatorio.append("Operação: ").append(operacaoSelecionada).append("\n");
        //relatorio.append("Parcelas: ").append(parcelasSelecionadas).append("\n");
        if (parcelasSelecionadas.equalsIgnoreCase("à vista")) {
            relatorio.append("Parcelamento: À vista\n");
            relatorio.append("Valor da Compra: R$ ").append(valorCompraDigitado).append("\n");
        } else {
            relatorio.append("Parcelamento: ").append(parcelasSelecionadas).append("\n");
            double valorParcela = valorCompraDigitado / Integer.parseInt(parcelasSelecionadas);

            for (int i = 1; i <= Integer.parseInt(parcelasSelecionadas); i++) {
                relatorio.append(i).append("° Pagamento ").append(dataParcela(i)).append("\n");
                relatorio.append("R$ ").append(String.format("%.2f", valorParcela)).append("\n");
            }
        }
        //relatorio.append("Valor da Compra: R$ ").append(valorCompraDigitado).append("\n");
        relatorio.append("Telefone de Contato: ").append(telefoneDigitado).append("\n");

        return relatorio.toString();
    }

    private String dataParcela(int numeroParcela) {
        // Aqui você pode implementar a lógica para calcular as datas das parcelas.
        // Por exemplo, somar um mês para cada parcela a partir da data atual.
        // Neste exemplo, estou retornando uma data fixa.
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, numeroParcela - 1); // Somar um mês para cada parcela
        return dateFormat.format(calendar.getTime());
    }
}
