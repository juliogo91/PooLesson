/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visao;
import Modelo.Prllpdo;
import java.text.DecimalFormat;
/**
 *
 * @author Usuario
 */
public class TelaPrlpd extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrlpd
     */
    public TelaPrlpd() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1Cima = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2Nome = new javax.swing.JLabel();
        jPanel1Baixo = new javax.swing.JPanel();
        jLabel2Altura = new javax.swing.JLabel();
        jLabel3Largura = new javax.swing.JLabel();
        jLabel4Comprimento = new javax.swing.JLabel();
        jTextField1Txtaltura = new javax.swing.JTextField();
        jTextField2TxtLargura = new javax.swing.JTextField();
        jTextField3TxtComprimento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1Executar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1Cima.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2Nome.setFont(new java.awt.Font("Myanmar Text", 1, 36)); // NOI18N
        jLabel2Nome.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2Nome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/geometric.png"))); // NOI18N
        jLabel2Nome.setText("PARALELEPIPEDO");

        javax.swing.GroupLayout jPanel1CimaLayout = new javax.swing.GroupLayout(jPanel1Cima);
        jPanel1Cima.setLayout(jPanel1CimaLayout);
        jPanel1CimaLayout.setHorizontalGroup(
            jPanel1CimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1CimaLayout.createSequentialGroup()
                .addGroup(jPanel1CimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1CimaLayout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1CimaLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel2Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1CimaLayout.setVerticalGroup(
            jPanel1CimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1CimaLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2Nome)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jPanel1Baixo.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2Altura.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2Altura.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel2Altura.setText("ALTURA");

        jLabel3Largura.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel3Largura.setText("LARGURA");

        jLabel4Comprimento.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel4Comprimento.setText("COMPRIMENTO");

        jTextField1Txtaltura.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N

        jTextField2TxtLargura.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N

        jTextField3TxtComprimento.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1Executar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/maths.png"))); // NOI18N
        jButton1Executar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ExecutarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1BaixoLayout = new javax.swing.GroupLayout(jPanel1Baixo);
        jPanel1Baixo.setLayout(jPanel1BaixoLayout);
        jPanel1BaixoLayout.setHorizontalGroup(
            jPanel1BaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1BaixoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1BaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1BaixoLayout.createSequentialGroup()
                        .addComponent(jLabel4Comprimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3TxtComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1BaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1BaixoLayout.createSequentialGroup()
                            .addComponent(jLabel3Largura)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField2TxtLargura))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1BaixoLayout.createSequentialGroup()
                            .addComponent(jLabel2Altura)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField1Txtaltura, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
                .addComponent(jButton1Executar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addGroup(jPanel1BaixoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1BaixoLayout.setVerticalGroup(
            jPanel1BaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1BaixoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1BaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2Altura)
                    .addComponent(jTextField1Txtaltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1BaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1BaixoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1BaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3Largura)
                            .addComponent(jTextField2TxtLargura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1BaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4Comprimento)
                            .addComponent(jTextField3TxtComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1BaixoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1Executar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1Cima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1Baixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1Cima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1Baixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ExecutarActionPerformed
        // TODO add your handling code here:
        Prllpdo prd = new Prllpdo();
        DecimalFormat df = new DecimalFormat("#.00");//ARREDONDAMENTO DE CASAS
        
        prd.setAltura(Float.parseFloat(jTextField1Txtaltura.getText()));
        prd.setLargura(Float.parseFloat(jTextField2TxtLargura.getText()));
        prd.setComprimento(Float.parseFloat(jTextField3TxtComprimento.getText()));
        String saida = "DADOS DIGITADOS: \n";
        saida += "ALTURA: " + df.format(prd.getAltura()) + "\n";
        saida += "LARGURA: " + df.format(prd.getLargura())  + "\n";
        saida += "COMPRIMENTO: " + df.format(prd.getComprimento()) + "\n";
        saida += "CÁLCULO DO VOLUME: " + df.format(prd.calcVolume()) + "\n";
        saida += "CÁLCULO DA ÁREA: " + df.format(prd.calcArea()) + "\n";
        jTextArea1.setText(saida);
        jTextField1Txtaltura.setText(" ");
        jTextField2TxtLargura.setText(" ");
        jTextField3TxtComprimento.setText(" ");
        
    }//GEN-LAST:event_jButton1ExecutarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrlpd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrlpd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrlpd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrlpd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrlpd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Executar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2Altura;
    private javax.swing.JLabel jLabel2Nome;
    private javax.swing.JLabel jLabel3Largura;
    private javax.swing.JLabel jLabel4Comprimento;
    private javax.swing.JPanel jPanel1Baixo;
    private javax.swing.JPanel jPanel1Cima;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1Txtaltura;
    private javax.swing.JTextField jTextField2TxtLargura;
    private javax.swing.JTextField jTextField3TxtComprimento;
    // End of variables declaration//GEN-END:variables
}