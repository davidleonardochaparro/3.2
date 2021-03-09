
package Ejercicios;

public class Principal extends javax.swing.JFrame {

 Sustitucion sus1 = new Sustitucion ();

 
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        SalidaResultado = new javax.swing.JLabel();
        EntradaPalabra = new javax.swing.JTextField();
        BtnCorrer = new javax.swing.JButton();
        PalabraIntercambiada = new javax.swing.JLabel();
        TamArreglo = new javax.swing.JTextField();
        Btncorrer2 = new javax.swing.JButton();
        Arreglo = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Ejercicios");

        SalidaResultado.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        EntradaPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaPalabraActionPerformed(evt);
            }
        });

        BtnCorrer.setText("run");
        BtnCorrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCorrerActionPerformed(evt);
            }
        });

        PalabraIntercambiada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        TamArreglo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Btncorrer2.setText("run");
        Btncorrer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btncorrer2ActionPerformed(evt);
            }
        });

        Arreglo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(SalidaResultado))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jLabel1)))
                .addContainerGap(347, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TamArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Btncorrer2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Arreglo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PalabraIntercambiada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EntradaPalabra))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnCorrer)
                        .addGap(67, 67, 67))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnCorrer, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(EntradaPalabra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PalabraIntercambiada, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Arreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TamArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btncorrer2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                .addComponent(SalidaResultado))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntradaPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaPalabraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaPalabraActionPerformed

    private void BtnCorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCorrerActionPerformed
       
        String word=EntradaPalabra.getText();
        
        sus1.sust(word);
        
        PalabraIntercambiada.setText(sus1.palabra); 
    }//GEN-LAST:event_BtnCorrerActionPerformed

    private void Btncorrer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btncorrer2ActionPerformed
               
     
        
    }//GEN-LAST:event_Btncorrer2ActionPerformed

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Arreglo;
    private javax.swing.JButton BtnCorrer;
    private javax.swing.JButton Btncorrer2;
    private javax.swing.JTextField EntradaPalabra;
    private javax.swing.JLabel PalabraIntercambiada;
    private javax.swing.JLabel SalidaResultado;
    public static javax.swing.JTextField TamArreglo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
