package factory;

public class MultipleFactorySender {
	public Sender mailSender() {
		return new MailSender();
	}
	public Sender smsSender() {
		return new SmsSender();
				
	}
}
