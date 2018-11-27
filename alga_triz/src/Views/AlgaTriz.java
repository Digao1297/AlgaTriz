/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Classes.Operacoes;
import java.awt.GridLayout;
import javax.swing.JTextField;

/**
 *
 * @author rodri
 */
public class AlgaTriz extends javax.swing.JFrame {

    private JTextField jt1[][];
    private JTextField jt2[][];
    private JTextField jtR[][];
    
    private Operacoes op;
    private int tamanho = 10;
    private int matrizA[][], matrizB[][];

    public AlgaTriz() {
        initComponents();

        jPmatrizA.setLayout(new GridLayout(tamanho, tamanho));
        jPmatrizB.setLayout(new GridLayout(tamanho, tamanho));
        jPMresultado.setLayout(new GridLayout(tamanho, tamanho));
        
        jt1 = new JTextField[tamanho][tamanho];
        jt2 = new JTextField[tamanho][tamanho];
        jtR= new JTextField[tamanho][tamanho];
        
        GerarMatriz1();
        GerarMatriz2();
        GerarMatrizR();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPmain = new javax.swing.JPanel();
        jPmatrizA = new javax.swing.JPanel();
        jPmatrizB = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jBtnSomar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPMresultado = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AlgaTriz");

        jPmain.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPmatrizA.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color1"));
        jPmatrizA.setPreferredSize(new java.awt.Dimension(330, 248));

        javax.swing.GroupLayout jPmatrizALayout = new javax.swing.GroupLayout(jPmatrizA);
        jPmatrizA.setLayout(jPmatrizALayout);
        jPmatrizALayout.setHorizontalGroup(
            jPmatrizALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPmatrizALayout.setVerticalGroup(
            jPmatrizALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPmatrizB.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color1"));
        jPmatrizB.setPreferredSize(new java.awt.Dimension(330, 248));

        javax.swing.GroupLayout jPmatrizBLayout = new javax.swing.GroupLayout(jPmatrizB);
        jPmatrizB.setLayout(jPmatrizBLayout);
        jPmatrizBLayout.setHorizontalGroup(
            jPmatrizBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPmatrizBLayout.setVerticalGroup(
            jPmatrizBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 342, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPmainLayout = new javax.swing.GroupLayout(jPmain);
        jPmain.setLayout(jPmainLayout);
        jPmainLayout.setHorizontalGroup(
            jPmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPmainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPmatrizA, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPmatrizB, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPmainLayout.setVerticalGroup(
            jPmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPmainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPmatrizB, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                    .addComponent(jPmatrizA, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBtnSomar.setText("Somar");
        jBtnSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSomarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnSomar)
                .addContainerGap(285, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jBtnSomar)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPMresultado.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color1"));
        jPMresultado.setPreferredSize(new java.awt.Dimension(330, 248));

        javax.swing.GroupLayout jPMresultadoLayout = new javax.swing.GroupLayout(jPMresultado);
        jPMresultado.setLayout(jPMresultadoLayout);
        jPMresultadoLayout.setHorizontalGroup(
            jPMresultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 355, Short.MAX_VALUE)
        );
        jPMresultadoLayout.setVerticalGroup(
            jPMresultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(jPMresultado, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPMresultado, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPmain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSomarActionPerformed
        GetField();
        op=new Operacoes();
        
        
        SetField(op.Somar(matrizA, matrizB));
    }//GEN-LAST:event_jBtnSomarActionPerformed

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
            java.util.logging.Logger.getLogger(AlgaTriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlgaTriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlgaTriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlgaTriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlgaTriz().setVisible(true);
            }
        });
    }

    private void GetField(){
        int linA=0,colA=0,linB=0,colB=0;
        
        for (int i = 0; i < tamanho; i++) {
            if (!jt1[i][0].getText().trim().equals("")) {
                linA++;
                
            } if (!jt2[i][0].getText().trim().equals("")) {
                linB++;
                
            }
        }
        for (int i = 0; i < tamanho; i++) {
            if (!jt1[0][i].getText().trim().equals("")) {
                colA++;
                
            }
            if (!jt2[0][i].getText().trim().equals("")) {
                colB++;
                
            }
        }
        
        matrizA=new int[linA][colA];
        matrizB=new int[linB][colB];
        
        for (int i = 0; i < linA; i++) {
            for (int j = 0; j < colA; j++) {
                matrizA[i][j]=Integer.parseInt(jt1[i][j].getText());
            }
        }
        for (int i = 0; i < linB; i++) {
            for (int j = 0; j < colB; j++) {
                matrizB[i][j]=Integer.parseInt(jt2[i][j].getText());
            }
        }
          
    }
    
    
    private void SetField(int[][] r){
        int linha=0,coluna=0;
        
        if (r.length>0) {
            linha=r.length;
        }if (r[0].length>0) {
            coluna=r[0].length;
            
        }
        
        for (int i = 0; i <linha ; i++) {
            for (int j = 0; j < coluna; j++) {
                jtR[i][j].setText(Integer.toString(r[i][j]));
            }
        }
        
    }
    public void GerarMatriz1() {

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {

                jt1[i][j] = new JTextField();

                jPmatrizA.add(jt1[i][j]);
            }

        }

    }

    public void GerarMatriz2() {

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {

                jt2[i][j] = new JTextField();

                jPmatrizB.add(jt2[i][j]);
            }

        }

    }
public void GerarMatrizR() {

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {

                jtR[i][j] = new JTextField();

                jPMresultado.add(jtR[i][j]);
            }

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnSomar;
    private javax.swing.JPanel jPMresultado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPmain;
    private javax.swing.JPanel jPmatrizA;
    private javax.swing.JPanel jPmatrizB;
    // End of variables declaration//GEN-END:variables
}
