/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Metodos.Render;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import mundo.Plato;
import mundo.accesoDB;
import mundo.tipoPlato;

/**
 *
 * @author Andom
 */
public class Menu extends javax.swing.JFrame {

    private JButton boton_descripcion= new JButton("Información");
    private static int columna, row;
    private accesoDB db= new accesoDB();
    
    public Menu() {
        initComponents();
        ImageIcon icono_salir= new ImageIcon("salir.png");
        retroceder.setIcon(new ImageIcon(icono_salir.getImage().getScaledInstance(55, 35, Image.SCALE_SMOOTH)));
        db.conectar();
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        retroceder = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        costoTexto = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        tiempoTexto = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        descripcionTexto = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        nombreTexto = new javax.swing.JTextArea();
        crearBoton = new javax.swing.JButton();
        actualizarBoton = new javax.swing.JButton();
        eliminarBoton = new javax.swing.JButton();
        consultaBoton = new javax.swing.JButton();
        tipoPlatoLista = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(225, 160, 92));
        jPanel1.setForeground(new java.awt.Color(225, 160, 92));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("CRUD");

        retroceder.setBackground(new java.awt.Color(225, 160, 92));
        retroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrocederActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setText("Devolverse a principal");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Descripción:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Costo:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Tiempo de preparación:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Tipo Plato:");

        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        costoTexto.setColumns(20);
        costoTexto.setRows(5);
        jScrollPane3.setViewportView(costoTexto);

        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tiempoTexto.setColumns(20);
        tiempoTexto.setRows(5);
        jScrollPane4.setViewportView(tiempoTexto);

        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        descripcionTexto.setColumns(20);
        descripcionTexto.setRows(5);
        jScrollPane5.setViewportView(descripcionTexto);

        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        nombreTexto.setColumns(20);
        nombreTexto.setRows(5);
        jScrollPane6.setViewportView(nombreTexto);

        crearBoton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        crearBoton.setText("Crear");
        crearBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearBotonActionPerformed(evt);
            }
        });

        actualizarBoton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        actualizarBoton.setText("Actualizar");
        actualizarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarBotonActionPerformed(evt);
            }
        });

        eliminarBoton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eliminarBoton.setText("Eliminar");
        eliminarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBotonActionPerformed(evt);
            }
        });

        consultaBoton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        consultaBoton.setText("Consultar");
        consultaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaBotonActionPerformed(evt);
            }
        });

        tipoPlatoLista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "entrada", "bebida", "plato_fuerte" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tipoPlatoLista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(112, 112, 112)
                            .addComponent(crearBoton)
                            .addGap(38, 38, 38)
                            .addComponent(consultaBoton)
                            .addGap(32, 32, 32)
                            .addComponent(actualizarBoton)
                            .addGap(32, 32, 32)
                            .addComponent(eliminarBoton))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(286, 286, 286)
                            .addComponent(jLabel1)
                            .addGap(66, 66, 66)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(retroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(retroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel6)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tipoPlatoLista, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearBoton)
                    .addComponent(eliminarBoton)
                    .addComponent(consultaBoton)
                    .addComponent(actualizarBoton))
                .addGap(57, 57, 57))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void retrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrocederActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_retrocederActionPerformed

    private void crearBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearBotonActionPerformed
        // TODO add your handling code here:
        String nombre = nombreTexto.getText();
        String descripcion = descripcionTexto.getText();
        double costo = Double.parseDouble(costoTexto.getText());
        int tiempoPreparacion = Integer.parseInt(tiempoTexto.getText());
        String tipo = (String) tipoPlatoLista.getSelectedItem();
        tipoPlato tipoPlato1 = null;
        if (tipo.equals(tipoPlato.bebida)) {
            tipoPlato1 = tipoPlato.bebida;
        }else if(tipo.equals(tipoPlato.entrada)){
            tipoPlato1 = tipoPlato.entrada;
        }else{
            tipoPlato1 = tipoPlato.plato_fuerte;
        }
        Plato plato = new Plato(nombre, descripcion, costo, tiempoPreparacion, tipoPlato1, 100);
        db.insertar(plato);
    }//GEN-LAST:event_crearBotonActionPerformed

    private void consultaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaBotonActionPerformed
        // TODO add your handling code here:
        db.consultar();
    }//GEN-LAST:event_consultaBotonActionPerformed

    private void actualizarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarBotonActionPerformed
        // TODO add your handling code here:
        String nombre = nombreTexto.getText();
        String descripcion = descripcionTexto.getText();
        double costo = Double.parseDouble(costoTexto.getText());
        int tiempoPreparacion = Integer.parseInt(tiempoTexto.getText());
        String tipo = (String) tipoPlatoLista.getSelectedItem();
        tipoPlato tipoPlato1 = null;
        if (tipo.equals(tipoPlato.bebida)) {
            tipoPlato1 = tipoPlato.bebida;
        }else if(tipo.equals(tipoPlato.entrada)){
            tipoPlato1 = tipoPlato.entrada;
        }else{
            tipoPlato1 = tipoPlato.plato_fuerte;
        }
        Plato plato = new Plato(nombre, descripcion, costo, tiempoPreparacion, tipoPlato1, 100);
        db.modificar(plato);
    }//GEN-LAST:event_actualizarBotonActionPerformed

    private void eliminarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBotonActionPerformed
        // TODO add your handling code here:
        String nombre = nombreTexto.getText();
        String descripcion = descripcionTexto.getText();
        double costo = Double.parseDouble(costoTexto.getText());
        int tiempoPreparacion = Integer.parseInt(tiempoTexto.getText());
        String tipo = (String) tipoPlatoLista.getSelectedItem();
        tipoPlato tipoPlato1 = null;
        if (tipo.equals(tipoPlato.bebida)) {
            tipoPlato1 = tipoPlato.bebida;
        }else if(tipo.equals(tipoPlato.entrada)){
            tipoPlato1 = tipoPlato.entrada;
        }else{
            tipoPlato1 = tipoPlato.plato_fuerte;
        }
        Plato plato = new Plato(nombre, descripcion, costo, tiempoPreparacion, tipoPlato1, 100);
        db.eliminar(plato);
    }//GEN-LAST:event_eliminarBotonActionPerformed
 
    
    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarBoton;
    private javax.swing.JButton consultaBoton;
    private javax.swing.JTextArea costoTexto;
    private javax.swing.JButton crearBoton;
    private javax.swing.JTextArea descripcionTexto;
    private javax.swing.JButton eliminarBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea nombreTexto;
    private javax.swing.JButton retroceder;
    private javax.swing.JTextArea tiempoTexto;
    private javax.swing.JComboBox<String> tipoPlatoLista;
    // End of variables declaration//GEN-END:variables
}