import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {

	public static void send(String to, String msg) {
		final String username = "it.kariera.qa@gmail.com";
		final String password = "newhope4you";
		final String sub = "Регистрация";
		final String mess = "Здравейте!\r\n" + 
				"Получавате това автоматично генерирано съобщение, защото имате регистрация в "+
				"системата за Електронно Обучение (https://it-kariera.mon.bg/e-learning/) като участник в " +
				"дистанционното обучение по Приложно програмиране.\r\n";
		final String footnote = "С поздрав, \r\n" + 
				"              Екипът на IT-Kariera";
		
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			message.setSubject(sub);
			message.setText(mess+msg+footnote);

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}