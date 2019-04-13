package _07classInsideInterface;

public interface EmailService {
	public void sendEmail(EmailDetails e);

	class EmailDetails {
		private String subject;
		private String toList;
		private String ccList;
	}
}
