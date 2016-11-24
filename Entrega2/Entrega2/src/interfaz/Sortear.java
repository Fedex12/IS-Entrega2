/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package interfaz;

import clases.Respuesta;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import sistema.Sistema;

/**
 *
 * @author Juan Pablo
 */
public class Sortear extends javax.swing.JFrame {
    
    
    private static Sistema s;
    ArrayList<String> listaEmails;
    /**
     * Creates new form Sortear
     */
    public Sortear(Sistema sis) {
        initComponents();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.s = sis;
        cargarLista();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelEmails = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaGanadores = new javax.swing.JList<>();
        BotonSortear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelEmails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelEmails.setText("Emails enviados a los ganadores:");

        ListaGanadores.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListaGanadores);

        BotonSortear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BotonSortear.setText("NUEVO SORTEO");
        BotonSortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSortearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelEmails)
                        .addGap(0, 151, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonSortear, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(LabelEmails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonSortear, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSortearActionPerformed
        Respuesta res = s.sortear();
        cargarLista();
        JOptionPane.showMessageDialog(null,res.getRespuesta(),"Resultado del sorteo", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BotonSortearActionPerformed

    public void cargarLista(){
        ListaGanadores.removeAll();
        listaEmails = s.getEmailEnviados();
        if (listaEmails.size() > 0) {
            ListaGanadores.setVisible(true);
            LabelEmails.setText("Emails enviados a los ganadores:");
            DefaultListModel<String> model = new DefaultListModel<String>();
            for(String s : listaEmails){
                model.addElement(s);
            }
            ListaGanadores.setModel(model);
        } else {
            ListaGanadores.setVisible(false);
            LabelEmails.setText("Aún no se han realizado sorteos.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSortear;
    private javax.swing.JLabel LabelEmails;
    private javax.swing.JList<String> ListaGanadores;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
