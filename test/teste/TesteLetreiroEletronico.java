package teste;

import com.formdev.flatlaf.IntelliJTheme;
import formularios.Login;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

public class TesteLetreiroEletronico extends javax.swing.JFrame {

    private final String mensagem = "Bem-vindo ao Letreiro Eletrônico, testando o efeito de painel e analizando se ficou satisfatório.!                                                                                                                ";
    private int currentIndex = 0;
    private final int scrollSpeed = 150; // Velocidade de rolagem em milissegundos
    private final Timer timer;

    public TesteLetreiroEletronico() {
        initComponents();
        setIcon();

        timer = new Timer(scrollSpeed, (ActionEvent e) -> {
            updateMessage();
        });
        timer.start();
    }

    private void updateMessage() {
        if (currentIndex >= mensagem.length()) {
            currentIndex = 0;
        }
        String displayText = mensagem.substring(currentIndex) + mensagem.substring(0, currentIndex);
        lblMensagem.setText(displayText);
        currentIndex++;

        // Altere a fonte e o tamanho conforme necessário
        lblMensagem.setFont(new Font("Arial", Font.PLAIN, 20));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMensagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Paiel Eletronico");
        setUndecorated(true);

        lblMensagem.setPreferredSize(new java.awt.Dimension(37, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            IntelliJTheme.setup(Login.class
                    .getResourceAsStream("/Visual_Studio_2019_Dark_Theme.theme.json"));
        } catch (Exception e) {
            System.err.println("Error setting up theme: " + e.getMessage());
        }
        java.awt.EventQueue.invokeLater(() -> {
            new TesteLetreiroEletronico().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblMensagem;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        Image iconImage = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/ico.png"));
        if (iconImage != null) {
            setIconImage(iconImage);
        } else {
            System.out.println("Imagem não encontrada.");
        }
    }
}
