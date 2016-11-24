/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package interfaz;

import clases.Cliente;
import clases.Evaluacion;
import clases.Participante;
import clases.Respuesta;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import sistema.Sistema;
import com.alee.laf.WebLookAndFeel;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;

/**
 *
 * @author Juan Pablo
 */
public class Principal extends javax.swing.JFrame {
    
    /**
     * Creates new form Principal
     */
    
    private static Evaluacion evaluacion;
    private static int estrellas = 0;
    private static Sistema s;
    
    public Principal(Sistema sis) {
        initComponents();
        this.s = sis;
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        evaluacion = new Evaluacion();
        
        
        //Inicialización del Combobox de clientes con uno vacío al principio
        ComboBoxClientes.setModel(new DefaultComboBoxModel(s.getClientes().toArray()));
        ComboBoxClientes.insertItemAt("------",0);
        RadioButton3.setSelected(true);
        ComboBoxClientes.setSelectedIndex(0);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        LabelTitulo = new javax.swing.JLabel();
        ComboBoxClientes = new javax.swing.JComboBox<>();
        LabelCliente = new javax.swing.JLabel();
        LabelComentario = new javax.swing.JLabel();
        LabelMalo = new javax.swing.JLabel();
        LabelExcelente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaComentario = new javax.swing.JTextArea();
        RadioButton1 = new javax.swing.JRadioButton();
        RadioButton2 = new javax.swing.JRadioButton();
        RadioButton3 = new javax.swing.JRadioButton();
        RadioButton4 = new javax.swing.JRadioButton();
        RadioButton5 = new javax.swing.JRadioButton();
        LabelPuntuacion = new javax.swing.JLabel();
        BotonEnviar = new javax.swing.JButton();
        BotonNuevoCli = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        LabelTitulo.setText("Formulario para evaluar la atención obtenida en el restaurante");
        jPanel1.add(LabelTitulo);
        LabelTitulo.setBounds(120, 60, 359, 16);

        ComboBoxClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(ComboBoxClientes);
        ComboBoxClientes.setBounds(160, 110, 64, 22);

        LabelCliente.setText("Cliente:");
        jPanel1.add(LabelCliente);
        LabelCliente.setBounds(80, 120, 44, 16);

        LabelComentario.setText("Comentario:");
        jPanel1.add(LabelComentario);
        LabelComentario.setBounds(60, 200, 71, 16);

        LabelMalo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelMalo.setText("Malo");
        jPanel1.add(LabelMalo);
        LabelMalo.setBounds(160, 150, 40, 22);

        LabelExcelente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelExcelente.setText("Excelente");
        jPanel1.add(LabelExcelente);
        LabelExcelente.setBounds(420, 150, 90, 22);

        TextAreaComentario.setColumns(20);
        TextAreaComentario.setRows(5);
        TextAreaComentario.setToolTipText("Comentario...");
        jScrollPane1.setViewportView(TextAreaComentario);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 230, 640, 173);

        buttonGroup1.add(RadioButton1);
        RadioButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RadioButton1.setText("1");
        jPanel1.add(RadioButton1);
        RadioButton1.setBounds(200, 150, 40, 25);

        buttonGroup1.add(RadioButton2);
        RadioButton2.setText("2");
        jPanel1.add(RadioButton2);
        RadioButton2.setBounds(250, 150, 35, 25);

        buttonGroup1.add(RadioButton3);
        RadioButton3.setText("3");
        jPanel1.add(RadioButton3);
        RadioButton3.setBounds(290, 150, 35, 25);

        buttonGroup1.add(RadioButton4);
        RadioButton4.setText("4");
        jPanel1.add(RadioButton4);
        RadioButton4.setBounds(330, 150, 35, 25);

        buttonGroup1.add(RadioButton5);
        RadioButton5.setText("5");
        jPanel1.add(RadioButton5);
        RadioButton5.setBounds(370, 150, 35, 25);

        LabelPuntuacion.setText("Puntuación:");
        jPanel1.add(LabelPuntuacion);
        LabelPuntuacion.setBounds(60, 150, 67, 16);

        BotonEnviar.setText("ENVIAR");
        BotonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEnviarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonEnviar);
        BotonEnviar.setBounds(230, 430, 290, 60);

        BotonNuevoCli.setText("+");
        BotonNuevoCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNuevoCliActionPerformed(evt);
            }
        });
        jPanel1.add(BotonNuevoCli);
        BotonNuevoCli.setBounds(250, 110, 40, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEnviarActionPerformed
        //Se envía una evaluación con/sin cliente dependiendo del seleccionado
        Respuesta r = null;
        estrellas = Integer.parseInt(getSelectedButtonText(buttonGroup1));
        if (ComboBoxClientes.getSelectedIndex() == 0){
            r = s.agregarEvaluacionAnonima(estrellas, TextAreaComentario.getText());
        } else {
            r = s.agregarEvaluacionIdentificada((Cliente) ComboBoxClientes.getSelectedItem(),
                    estrellas, TextAreaComentario.getText());
        }
        JOptionPane.showMessageDialog(null, r.getRespuesta(),
                "Evaluacion enviada con éxito!",
                JOptionPane.INFORMATION_MESSAGE);
        TextAreaComentario.setText("");
        ComboBoxClientes.setSelectedIndex(0);
        RadioButton3.setSelected(true);
    }//GEN-LAST:event_BotonEnviarActionPerformed

    private void BotonNuevoCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNuevoCliActionPerformed
        new NuevoCliente(s).setVisible(true);
    }//GEN-LAST:event_BotonNuevoCliActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal(s).setVisible(true);
               
            }
        });
    }
    
    
    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return button.getText();
            }
        }
        
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEnviar;
    private javax.swing.JButton BotonNuevoCli;
    private javax.swing.JComboBox<String> ComboBoxClientes;
    private javax.swing.JLabel LabelCliente;
    private javax.swing.JLabel LabelComentario;
    private javax.swing.JLabel LabelExcelente;
    private javax.swing.JLabel LabelMalo;
    private javax.swing.JLabel LabelPuntuacion;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JRadioButton RadioButton1;
    private javax.swing.JRadioButton RadioButton2;
    private javax.swing.JRadioButton RadioButton3;
    private javax.swing.JRadioButton RadioButton4;
    private javax.swing.JRadioButton RadioButton5;
    private javax.swing.JTextArea TextAreaComentario;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
