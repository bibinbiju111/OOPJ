package gui;
import java.awt.Frame;
import java.awt.Label;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionEvent;
public class SignUpForm extends Frame implements ActionListener
{
	TextField mail = new TextField(30);
	TextField name = new TextField(30);
	TextField pass = new TextField(30);
	TextField number = new TextField(30);
	Button button;
	public SignUpForm()
	{
		setTitle("SIGNUP");
		setSize(400,400);
		setVisible(true);
		setLayout(new FlowLayout());
		Label F1 = new Label("E-mail   ");
		Label F2 = new Label("\nUsername ");
		Label F3 = new Label("\nPassword ");
		Label F4 = new Label("\nPhone");
		
		F1.setAlignment(Label.LEFT);
		F2.setAlignment(Label.LEFT);
		F3.setAlignment(Label.LEFT);
		F4.setAlignment(Label.LEFT);
		
	    pass.setEchoChar('*');
	    button = new Button("SUBMIT FORM");
	    button.addActionListener(this);

		add(F1);
		add(mail);
		add(F2);
		add(name);
		add(F3);
		add(pass);
		add(F4);
		add(number);
		add(button);
		mail.setText("Type Email");
		name.setText("Type username");
		pass.setText("Password");
		number.setText("Phone");	
	}
	public void actionPerformed(ActionEvent ae) 
	{
		System.out.println("E-mail is - "+mail.getText());
		System.out.println("Username is  - "+name.getText());
		System.out.println("Password is - "+pass.getText());
		System.out.println("Phone is - "+number.getText());
	}
	
    public static void main(String[] args) 
    {
    	 new SignUpForm();
    }
}