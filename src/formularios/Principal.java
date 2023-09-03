package formularios;

import classes.Letreiro;
import com.formdev.flatlaf.IntelliJTheme;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.DefaultComboBoxModel;
import classes.Clientes;
import classes.Relatorio;
import classes.Telefones;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    private Telefones telefones;
    private final Letreiro letreiro;
    private Clientes clientes;

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
        jLabel1 = new javax.swing.JLabel();
        jtfTelefone = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnAdicionar = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        jtfEntradaValores = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(".:Nfe Emissor de Notas Eletrônicas");
        setMinimumSize(new java.awt.Dimension(676, 382));
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setText("App Nfe Emissor");

        lblValorCompra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValorCompra.setText("Valor Compra.:");

        lblCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCliente.setText("Cliente.:");

        jcbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um cliente para emitir o relatório", "Giovani V. Chaves", "Adriane R. fermandes" }));

        jcbOperacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma operação para emitir o relatório", "A vista", "Parcelado" }));

        lblOperacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblOperacao.setText("Operação.:");

        btnGerarRelatorio.setText("Gerar Relatório");
        btnGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarRelatorioActionPerformed(evt);
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

        btnEnviarRelatorio.setText("Enviar Relatório");
        btnEnviarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarRelatorioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Telf.:");

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setText("Proximo");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Entre com um valor aqui");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator5)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                            .addComponent(jcbEmpresa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jtfValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblParcelas)
                                            .addComponent(lblOperacao))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jcbOperacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jcbParcelas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(btnGerarRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnEnviarRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(18, 18, 18)
                                .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addComponent(lblInfoDeveloper)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, Short.MAX_VALUE))))
                    .addComponent(lblSystemMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(242, 242, 242)
                                .addComponent(lblTitulo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfEntradaValores)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAdicionar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(241, 241, 241)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                            .addComponent(jtfValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOperacao)
                            .addComponent(jcbOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblParcelas)
                            .addComponent(jcbParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGerarRelatorio)
                            .addComponent(btnEnviarRelatorio))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnAnterior)
                    .addComponent(btnProximo)
                    .addComponent(btnEditar)
                    .addComponent(btnDeletar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfEntradaValores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInfoDeveloper)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSystemMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblFoto.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarRelatorioActionPerformed
        String empresaSelecionada = jcbEmpresa.getSelectedItem().toString();
        String clienteSelecionado = jcbCliente.getSelectedItem().toString();
        String operacaoSelecionada = jcbOperacao.getSelectedItem().toString();
        String parcelasSelecionadas = jcbParcelas.getSelectedItem().toString();
        double valorCompraDigitado = Double.parseDouble(jtfValorCompra.getText());
        String telefoneDigitado = jtfTelefone.getText();

        // Chame o método gerarRelatorio da classe Relatorio
        Relatorio relatorio = new Relatorio(empresaSelecionada, clienteSelecionado, operacaoSelecionada, parcelasSelecionadas, valorCompraDigitado, telefoneDigitado);
        String modeloRelatorio = relatorio.gerarRelatorio();

        // Exiba o modeloRelatorio em uma caixa de mensagem
        JOptionPane.showMessageDialog(this, modeloRelatorio, "Relatório", JOptionPane.INFORMATION_MESSAGE);

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnGerarRelatorioActionPerformed

    private void btnEnviarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarRelatorioActionPerformed
        String numeroDestino = jtfTelefone.getText(); // Obtém o número do campo de texto

        // Crie uma instância da classe Relatorio e chame o método gerarRelatorio()
        Relatorio relatorio = new Relatorio(
                jcbEmpresa.getSelectedItem().toString(),
                jcbCliente.getSelectedItem().toString(),
                jcbOperacao.getSelectedItem().toString(),
                jcbParcelas.getSelectedItem().toString(),
                Double.parseDouble(jtfValorCompra.getText()),
                jtfTelefone.getText()
        );

        String modeloRelatorio = relatorio.gerarRelatorio();

        // Chame o método para enviar a mensagem pelo WhatsApp
        enviarMensagemWhatsApp(numeroDestino, modeloRelatorio);

//        String numeroDestino = jtfTelefone.getText(); // Obtém o número do campo de texto
//        String modeloRelatorio = gerarRelatorio(); // Substitua com o método que gera o relatório
//
//        // Chame o método para enviar a mensagem pelo WhatsApp
//        enviarMensagemWhatsApp(numeroDestino, modeloRelatorio);
        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnEnviarRelatorioActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        String novoValor = jtfEntradaValores.getText();

        if (isNumeroCelular(novoValor)) {
            // É um número de celular, chame o método adicionarNumeroCelular da classe Telefones
            Telefones.adicionarNumeroCelular(novoValor);
        } else {
            // É um nome de cliente, adicione-o à lista de clientes e atualize o JComboBox
            if (!clientes.getListaClientes().contains(novoValor)) {
                clientes.adicionarCliente(novoValor);

                DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(clientes.getListaClientes().toArray(new String[0]));
                jcbCliente.setModel(model);
            }
        }

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnDeletarActionPerformed

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
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEnviarRelatorio;
    private javax.swing.JButton btnGerarRelatorio;
    private javax.swing.JButton btnProximo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JComboBox<String> jcbCliente;
    private javax.swing.JComboBox<String> jcbEmpresa;
    private javax.swing.JComboBox<String> jcbOperacao;
    private javax.swing.JComboBox<String> jcbParcelas;
    private javax.swing.JTextField jtfEntradaValores;
    private javax.swing.JTextField jtfTelefone;
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

    private boolean isNumeroCelular(String valor) {
        // Verifique se o valor parece ser um número de celular
        // Verifica se começa com "+" e se consiste apenas em dígitos

        if (valor.startsWith("+")) {
            // Remove o "+" para verificar se o restante são dígitos
            String digits = valor.substring(1);
            return digits.matches("\\d+"); // Verifica se são apenas dígitos
        }

        return false;
    }

    private void enviarMensagemWhatsApp(String numero, String mensagem) {
        try {
            String url = "https://api.whatsapp.com/send?phone=" + numero + "&text=" + URLEncoder.encode(mensagem, StandardCharsets.UTF_8);
            java.awt.Desktop.getDesktop().browse(URI.create(url));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao enviar mensagem no WhatsApp: " + ex.getMessage());
        }
    }
}
