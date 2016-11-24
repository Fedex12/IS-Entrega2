/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package interfaz;

import javax.swing.JOptionPane;
import sistema.Sistema;

/**
 *
 * @author Juan Pablo
 */
public class Bienvenida extends javax.swing.JFrame {
    
    Sistema s;
    
    /**
     * Creates new form Bienvenida
     */
    public Bienvenida() {
        initComponents();
        s = new Sistema();
        //Se precargan datos
        populateData();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MIEvaluar = new javax.swing.JMenuItem();
        MINuevoCli = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MIDefinirSorteo = new javax.swing.JMenuItem();
        MISortear = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MISalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Evaluación de Restaurante");

        jMenu1.setText("Cliente");

        MIEvaluar.setText("Evaluar restaurante");
        MIEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIEvaluarActionPerformed(evt);
            }
        });
        jMenu1.add(MIEvaluar);

        MINuevoCli.setText("Nuevo cliente");
        MINuevoCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MINuevoCliActionPerformed(evt);
            }
        });
        jMenu1.add(MINuevoCli);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Administrador");

        MIDefinirSorteo.setText("Definir sorteo");
        MIDefinirSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIDefinirSorteoActionPerformed(evt);
            }
        });
        jMenu2.add(MIDefinirSorteo);

        MISortear.setText("Sortear");
        MISortear.setToolTipText("Sortear");
        MISortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MISortearActionPerformed(evt);
            }
        });
        jMenu2.add(MISortear);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Opciones");

        MISalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        MISalir.setText("Salir");
        MISalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MISalirActionPerformed(evt);
            }
        });
        jMenu3.add(MISalir);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel1)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MISalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MISalirActionPerformed
        //Mensaje a mostrar al querer salir del sistema
        String[] opciones = {"Si","No"};
        int eleccion = JOptionPane.showOptionDialog(null,
                "¿Estás seguro que deseas salir?", "Salir del sistema",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, opciones, "No");
        if(eleccion == 0 ){
            System.exit(0);
        }else{
            
        }
    }//GEN-LAST:event_MISalirActionPerformed

    private void MIEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIEvaluarActionPerformed
        new Principal(s).setVisible(true);
    }//GEN-LAST:event_MIEvaluarActionPerformed

    private void MINuevoCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MINuevoCliActionPerformed
        new NuevoCliente(s).setVisible(true);
    }//GEN-LAST:event_MINuevoCliActionPerformed

    private void MISortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MISortearActionPerformed
        new Sortear(s).setVisible(true);
    }//GEN-LAST:event_MISortearActionPerformed

    private void MIDefinirSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIDefinirSorteoActionPerformed
        new DefinirSorteo(s).setVisible(true);
    }//GEN-LAST:event_MIDefinirSorteoActionPerformed
    
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
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bienvenida().setVisible(true);
            }
        });
    }
    
    public void populateData(){
        //Precarga de datos
        s.agregarCliente("Juan Pablo Gonzalez", "91827364", "098605049", "jpgonzalez@gmail.com");
        s.agregarCliente("Federico Abreu", "12345678", "09626771", "fabreu@gmail.com");
        s.agregarCliente("Adrian Perez", "876544321", "094324758", "aperez@outlook.com");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MIDefinirSorteo;
    private javax.swing.JMenuItem MIEvaluar;
    private javax.swing.JMenuItem MINuevoCli;
    private javax.swing.JMenuItem MISalir;
    private javax.swing.JMenuItem MISortear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
