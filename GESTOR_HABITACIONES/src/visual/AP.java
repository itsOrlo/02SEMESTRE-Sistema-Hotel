/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import clases.LecturaYEscritura;
import clases.basica;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author odmon
 */
public class AP extends javax.swing.JPanel {

    /**
     * Creates new form AP
     */
    basica b;
    public AP(basica b) {
        initComponents();
        this.b = b;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txt_registro = new javax.swing.JTextArea();
        lbl_exportado = new javax.swing.JLabel();
        btn_export = new javax.swing.JButton();
        btn_mostrar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        txt_registro.setColumns(20);
        txt_registro.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_registro.setRows(5);
        jScrollPane1.setViewportView(txt_registro);

        lbl_exportado.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbl_exportado.setForeground(new java.awt.Color(255, 102, 102));
        lbl_exportado.setText("Sin exportar...");

        btn_export.setBackground(new java.awt.Color(51, 204, 0));
        btn_export.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_export.setForeground(new java.awt.Color(255, 255, 255));
        btn_export.setText("Guardar");
        btn_export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exportActionPerformed(evt);
            }
        });

        btn_mostrar.setBackground(new java.awt.Color(102, 153, 255));
        btn_mostrar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_mostrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_mostrar.setText("Mostrar");
        btn_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarActionPerformed(evt);
            }
        });

        btn_borrar.setBackground(new java.awt.Color(255, 102, 102));
        btn_borrar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_borrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_borrar.setText("Borrar");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(btn_mostrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_exportado)
                            .addComponent(btn_export)
                            .addComponent(btn_borrar))))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btn_mostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_borrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_export)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_exportado))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exportActionPerformed
        
        try {
            String contenido = txt_registro.getText();
            String ruta = "C:\\Users\\odmon\\Desktop\\registro_final.txt";
            LecturaYEscritura le = new LecturaYEscritura(ruta, contenido); //Con los datos del arraylist

            le.escribir();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos, reviselos porfavor");
        }
        
        try{
            
            lbl_exportado.setForeground(Color.GREEN);
            lbl_exportado.setText("¡Exportado!");

        } catch (Exception e){

            JOptionPane.showMessageDialog(null, "Error al conectar con el AP :c");

        }
    }//GEN-LAST:event_btn_exportActionPerformed

    private void btn_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarActionPerformed
        // TODO add your handling code here:
        try {

            String ruta = "C:\\Users\\odmon\\Desktop\\registro_final.txt";
            LecturaYEscritura le = new LecturaYEscritura(ruta);

            txt_registro.setText(le.leer());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos, reviselos porfavor");
        }
    }//GEN-LAST:event_btn_mostrarActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        // TODO add your handling code here:
        String contenido = txt_registro.getText();
        String ruta = "C:\\Users\\odmon\\Desktop\\registro_final.txt";
        LecturaYEscritura le = new LecturaYEscritura(ruta, contenido);
        
        try {
            le.borrar();
        } catch (IOException ex) {
            Logger.getLogger(AP.class.getName()).log(Level.SEVERE, null, ex);
        }
        txt_registro.setText("");
    }//GEN-LAST:event_btn_borrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_export;
    private javax.swing.JButton btn_mostrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_exportado;
    private javax.swing.JTextArea txt_registro;
    // End of variables declaration//GEN-END:variables
}
