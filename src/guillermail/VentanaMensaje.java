/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guillermail;

import Test.test;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author guillermo
 */
public class VentanaMensaje extends javax.swing.JFrame {
    
    private Session sesion;
    private String from;
    private String to;
    private String asunto;
    private String mensaje;
    private String firma;
    private Properties props;
    
    
    
    public VentanaMensaje(VentanaIniciar v) {
        initComponents();
        props = v.getProps();
        sesion = v.getSesion();
        from = v.getUser();
        campoFrom.setText(from + "@correo.ugr.es");
        
    }
    
    public VentanaMensaje(VentanaIniciarPDI_PAS v) {
        initComponents();
        props = v.getProps();
        sesion = v.getSesion();
        from = v.getUser();
        campoFrom.setText(from + "@ugr.es");
        
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
        jLabel2 = new javax.swing.JLabel();
        campoFrom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoTo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoAsunto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoMensaje = new javax.swing.JTextArea();
        botonEnviar = new javax.swing.JButton();
        campoNotificacion = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoFirma = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("---GuillerMail---");

        jLabel2.setText("From: ");

        campoFrom.setEditable(false);

        jLabel3.setText("To: ");

        jLabel4.setText("Asunto: ");

        jLabel5.setText("Mensaje: ");

        campoMensaje.setColumns(20);
        campoMensaje.setRows(5);
        jScrollPane1.setViewportView(campoMensaje);

        botonEnviar.setText("Enviar");
        botonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarActionPerformed(evt);
            }
        });

        campoNotificacion.setText("          ");

        jLabel6.setText("Firma: ");

        campoFirma.setText("Enviado desde GuillerMail.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoFrom)
                                    .addComponent(campoTo)
                                    .addComponent(campoAsunto)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(95, 95, 95)
                                .addComponent(campoNotificacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                                .addComponent(botonEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoFirma))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(botonEnviar)
                    .addComponent(campoNotificacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoFirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarActionPerformed
        
        //Comprobamos que se ha rellenado todo lo obligatorio
        if(campoFrom.getText().equals("") || campoTo.getText().equals("") || campoMensaje.getText().equals("")) {
            campoNotificacion.setText("Rellene el campo de destinatario y mensaje");
        }
        else {

            //Recogemos datos
            to = campoTo.getText();
            asunto = campoAsunto.getText();
            mensaje = campoMensaje.getText();
            firma = campoFirma.getText();

            MimeMessage msg = new MimeMessage(sesion);

            try {
                msg.setFrom();

                msg.setRecipients(Message.RecipientType.TO, to);
                msg.setSubject(asunto);
                msg.setSentDate(new Date());
                msg.setText(mensaje + "\n" + firma + "\n");
                msg.setHeader("X-Mailer", "GuillerMail"); 

                System.out.println("Enviando mensaje...");

                campoNotificacion.setText("Enviando mensaje... ");

                Transport.send(msg);

                System.out.println("Enviado mensaje");
                campoNotificacion.setText("Mensaje enviado.");

            } catch (MessagingException ex) {
                Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
        
        
    }//GEN-LAST:event_botonEnviarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEnviar;
    private javax.swing.JTextField campoAsunto;
    private javax.swing.JTextField campoFirma;
    private javax.swing.JTextField campoFrom;
    private javax.swing.JTextArea campoMensaje;
    private javax.swing.JLabel campoNotificacion;
    private javax.swing.JTextField campoTo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
