package classes;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Letreiro {

    private final JLabel label;
    private final String mensagem;

    private int currentPosition;
    private int scrollSpeed = 250;
    private int fontSize = 12;
    private Color fontColor = new Color(255, 255, 255);

    public Letreiro(JLabel label) {
        this.mensagem = "                                                                                                 Este App tem a finalidade de gerar um relatório com os dados da venda e posteriormente enviar via WhatsApp para o cliente. Totalmente desenvolvido em Java. Programador e desenvolvedor: Giovani V. Chaves. No presente momento estudante de Engenharia de Software (Bacharelado) pela Uniasselvi com previsão de formatura em 2027. Contendo na minha grade currícular um grande número de (Boot Camps) finalizados pela DIO - Digital Innovation One e (1) curso completo de Desenvolvedor de Sistemas e Web Designer pela instituição Prepara Cursos profissionalizantes.! GvC Desenvolvimentos© - Todos os direitos reservados.";
        this.label = label;
        currentPosition = mensagem.length();
    }

    public void iniciarLetreiro() {
        label.setForeground(fontColor);
        label.setText("");

        Timer timer = new Timer(scrollSpeed, (ActionEvent e) -> {
            if (currentPosition >= mensagem.length()) {
                currentPosition = 0;
            }

            int endIndex = currentPosition + label.getWidth();
            if (endIndex > mensagem.length()) {
                endIndex = mensagem.length();
            }

            String partialMessage = mensagem.substring(currentPosition, endIndex);
            label.setText(partialMessage);

            currentPosition++;
        });
        timer.setInitialDelay(0);
        timer.start();
    }

    public void setTamanhoFonte(int size) {
        fontSize = size;
        atualizarFonte();
    }

    private void atualizarFonte() {
        Font font = label.getFont();
        Font novaFonte = new Font(font.getName(), font.getStyle(), fontSize);
        label.setFont(novaFonte);
    }

    public void setFontColor(Color color) {
        fontColor = color;
    }

    public void setScrollSpeed(int speed) {
        scrollSpeed = speed;
    }
}
