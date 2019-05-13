package exercises;

import java.util.Random;

import javax.swing.JOptionPane;

public class EmailSender {

	void go() {
		/*
		 * Use the methods below to send an email and print a warning if the email did
		 * not send correctly.
		 */
		String email = JOptionPane.showInputDialog("Enter new email address:");
		setEmailAddress(email);
		
		String text = JOptionPane.showInputDialog("Enter your text:");
		
		if (send(text) && correctAdress(email))
			JOptionPane.showMessageDialog(null, "Email sent");
		else
			JOptionPane.showMessageDialog(null, "The email did not send correctly");

	}



	boolean correctAdress(String email) {
		if (!(this.emailAddress.contains("@") && this.emailAddress.contains("."))) {
			System.err.println("Error, not valid email address.");
			return false;
		}
		return true;
	}
		

	/* Returns true if email was sent successfully, false if it failed to send. */
	boolean send(String greeting) {
		if (this.emailAddress.isEmpty()) {
			System.err.println("You did not provide a recipient for the email!");
			return false;
		}
		return new Random().nextBoolean();
	}

	private String emailAddress = "";

	void setEmailAddress(String email) {
		this.emailAddress = email;
	}

	public static void main(String[] args) {
		new EmailSender().go();
	}
}
