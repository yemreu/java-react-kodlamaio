package day_5.core;

public class EmailSender {
	
	public static void send(String sender,String receipent,String subject,String message) {
		System.out.println("E-mail gönderildi.\nGönderici: " + sender + "\nAlıcı: " + receipent + " \nKonu: " + subject + "\nMesaj : " + message);
	}
}
