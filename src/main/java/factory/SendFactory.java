package factory;

public class SendFactory {
	public Sender proceed(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		}
		if ("sms".equals(type)) {
			return new SmsSender();
		}
		System.out.println("type不存在");
		return null;
	}
}
