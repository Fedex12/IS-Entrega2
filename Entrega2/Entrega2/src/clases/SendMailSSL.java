package clases;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class SendMailSSL {/*
	public static void send(Participante participante) {
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(props,
			new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("restaurantes.no.reply","restaurantes1");
				}
			});

		try {

                        Message message = new MimeMessage(session);
                        message.setFrom(new InternetAddress("from@no-spam.com"));
                        message.setRecipients(Message.RecipientType.TO,
                                        InternetAddress.parse(participante.getCliente().getEmail()));
                        message.setSubject("Ha ganado un premio");
                            message.setText("Felicitaciones," +
                                            "\n\n Felicitaciones, usted ha ganado un premio en uno de nuestros restaurantes\n\n"
                                    + "Gracias pór participar!");

                        Transport.send(message);
			System.out.println("Done");

		} catch (MessagingException e) {
                    System.out.println("");
                        
		}
	}*/
}
