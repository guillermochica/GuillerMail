/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author guillermo
 */
public class test {
    
    public static void main(String[] args) {
        
        
        String mailHost = "correo.ugr.es";
        String user = "guillermochica@correo.ugr.es";
        String pass = "xxxxxx";
        
        Properties props = new Properties();
        props.put("mail.smtp.host", mailHost);
        props.put("mail.smtp.port", "587");
        props.put("mail.from", user);
        props.put("mail.smtp.starttls.enable", "true");
        //props.setProperty("mail.smtp.ssl.trust", "correo.ugr.es");
        props.put("mail.smtp.auth", "true");
        props.put("mail.debug", "true");
        
        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user.split("@")[0], pass);
            }
            
        });
        
        MimeMessage msg = new MimeMessage(session);
        try {
            msg.setFrom();
            
            msg.setRecipients(Message.RecipientType.TO,
                          "1bgchica@gmail.com");
            msg.setSubject("JavaMail hello world example");
            msg.setSentDate(new Date());
            msg.setText("Funcionaaaaaaaaaa!!\n");
            Transport.send(msg);
            
            System.out.println("Enviado mensaje");
            
            
        } catch (MessagingException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
