package register;
import java.awt.Container;

import javax.swing.*;

public class regstn extends JFrame{

	JLabel nameLabel,mailidLabel,passwordLabel,rePasswordLabel,mobileNoLabel;
	JTextField nameField,mailidField,mobilenofield;
	JPasswordField passwordfield,repasswordfield;
	JButton registerButton;
	Container container;
	
	public regstn() {
		nameLabel=new JLabel("name");
		nameField=new JTextField();
		mailidLabel=new JLabel("mailid");
		mailidField=new JTextField();
		mobileNoLabel=new JLabel("mobile");
		mobilenofield=new JTextField();
		passwordLabel=new  JLabel("pwd");
		passwordfield=new JPasswordField(); 
		rePasswordLabel=new  JLabel("repwd");
		repasswordfield=new JPasswordField(); 
		
		registerButton=new JButton("Register");
		container=getContentPane();
		container.setLayout(null);
		setBounds();
		addComponents();
		
		}
	public void setBounds()
	{
		nameLabel.setBounds(50,60,600,30);
		nameField.setBounds(130,60,200,30);
		mailidLabel.setBounds(50,120,100,30);
		mailidField.setBounds(130, 120, 200, 30);
		mobileNoLabel.setBounds(50, 180, 100, 30);
	    mobilenofield.setBounds(130, 180, 200, 30);
	    passwordLabel.setBounds(50, 240, 100, 30);
        passwordfield.setBounds(130, 240, 200, 30);
        rePasswordLabel.setBounds(50, 300, 100, 30);
        repasswordfield.setBounds(130, 300, 200, 30);
        registerButton.setBounds(100, 420, 200, 30);
		
	}
	 public void addComponents() 
	 {
		 container.add(nameLabel);
	      container.add(nameField);
	      container.add(mailidLabel);
	        container.add(mailidField);
	        container.add(mobileNoLabel);
	        container.add(mobilenofield);
	        container.add(passwordLabel);
	        container.add(passwordfield);
	        container.add(rePasswordLabel);
	        container.add(repasswordfield);
	        container.add(registerButton);
	 }

	

	public static void main(String[] args) {

		regstn frame = new regstn();
		 frame.setTitle("Student Register Form");
	        frame.setVisible(true);
	        frame.setBounds(500, 100, 500, 700);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setResizable(true);
	 

	}

}
