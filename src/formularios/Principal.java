package formularios;

import classes.Letreiro;
import com.formdev.flatlaf.IntelliJTheme;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

public class Principal extends javax.swing.JFrame {

    private final Letreiro letreiro;

    public Principal() {
        initComponents();
        setIcon();

        letreiro = new Letreiro(lblSystemMessage);
        letreiro.setFontColor(new Color(254, 255, 255));
        letreiro.iniciarLetreiro();
        letreiro.setTamanhoFonte(24);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblValorCompra = new javax.swing.JLabel();
        jtfValorCompra = new javax.swing.JTextField();
        lblCliente = new javax.swing.JLabel();
        jcbCliente = new javax.swing.JComboBox<>();
        jcbOperacao = new javax.swing.JComboBox<>();
        lblOperacao = new javax.swing.JLabel();
        btnGerarRelatorio = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        lblInfoDeveloper = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lblSystemMessage = new javax.swing.JLabel();
        jcbParcelas = new javax.swing.JComboBox<>();
        lblParcelas = new javax.swing.JLabel();
        lblEmpresa = new javax.swing.JLabel();
        jcbEmpresa = new javax.swing.JComboBox<>();
        lblFoto = new javax.swing.JLabel();
        btnEnviarRelatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(".:Nfe Emissor de Notas Eletrônicas");
        setMaximumSize(new java.awt.Dimension(676, 382));
        setMinimumSize(new java.awt.Dimension(676, 382));
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setText("App Nfe Emissor");

        lblValorCompra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValorCompra.setText("Valor Compra.:");

        lblCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCliente.setText("Cliente.:");

        jcbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um cliente para emitir o relatório", "Giovani V. Chaves", "Adriane R. fermandes" }));

        jcbOperacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma operação para concluir o relatório", "A vista", "Parcelado" }));

        lblOperacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblOperacao.setText("Operação.:");

        btnGerarRelatorio.setText("Gerar Relatório");
        btnGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarRelatoriooActionPerformed(evt);
            }
        });

        lblInfoDeveloper.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblInfoDeveloper.setText("Info Developer");

        lblSystemMessage.setPreferredSize(new java.awt.Dimension(37, 30));

        jcbParcelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a quantidade de parecelas", "1x", "2x", "3x", "4x" }));

        lblParcelas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblParcelas.setText("Parcelas.:");

        lblEmpresa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmpresa.setText("Empresa.:");

        jcbEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma empresa para emitir o relatório", "Avon", "Boticário", "Eudora", "Golran", "Natura" }));

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Giovani2.jpg"))); // NOI18N
        lblFoto.setMaximumSize(new java.awt.Dimension(200, 200));
        lblFoto.setMinimumSize(new java.awt.Dimension(200, 200));
        lblFoto.setPreferredSize(new java.awt.Dimension(200, 200));

        btnEnviarRelatorio.setText("Enviar Relatório");
        btnEnviarRelatorio.setMaximumSize(new java.awt.Dimension(112, 23));
        btnEnviarRelatorio.setMinimumSize(new java.awt.Dimension(112, 23));
        btnEnviarRelatorio.setPreferredSize(new java.awt.Dimension(112, 23));
        btnEnviarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(lblTitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblCliente)
                                            .addComponent(lblValorCompra)
                                            .addComponent(lblEmpresa))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jcbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jtfValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jcbEmpresa, 0, 310, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblParcelas)
                                            .addComponent(lblOperacao))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jcbOperacao, 0, 311, Short.MAX_VALUE)
                                            .addComponent(jcbParcelas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(btnGerarRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnEnviarRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(18, 18, 18)
                                .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator4)
                            .addComponent(lblSystemMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(lblInfoDeveloper)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmpresa)
                            .addComponent(jcbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCliente)
                            .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValorCompra)
                            .addComponent(jtfValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOperacao)
                            .addComponent(jcbOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblParcelas)
                            .addComponent(jcbParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGerarRelatorio)
                            .addComponent(btnEnviarRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInfoDeveloper)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSystemMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        lblFoto.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerarRelatoriooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarRelatoriooActionPerformed
        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnGerarRelatoriooActionPerformed

    private void btnEnviarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarRelatorioActionPerformed
        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnEnviarRelatorioActionPerformed

    public static void main(String args[]) {
        try {
            IntelliJTheme.setup(Login.class
                    .getResourceAsStream("/Visual_Studio_2019_Dark_Theme.theme.json"));
        } catch (Exception e) {
            System.err.println("Error setting up theme: " + e.getMessage());
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarRelatorio;
    private javax.swing.JButton btnGerarRelatorio;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JComboBox<String> jcbCliente;
    private javax.swing.JComboBox<String> jcbEmpresa;
    private javax.swing.JComboBox<String> jcbOperacao;
    private javax.swing.JComboBox<String> jcbParcelas;
    private javax.swing.JTextField jtfValorCompra;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblInfoDeveloper;
    private javax.swing.JLabel lblOperacao;
    private javax.swing.JLabel lblParcelas;
    private javax.swing.JLabel lblSystemMessage;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblValorCompra;
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
