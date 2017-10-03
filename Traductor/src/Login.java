import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frmLogin;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		frmLogin.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(64, 37, 82, 14);
		frmLogin.getContentPane().add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(64, 83, 82, 14);
		frmLogin.getContentPane().add(lblContrasea);
		
		textField = new JTextField();
		textField.setBounds(144, 34, 216, 20);
		frmLogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(144, 80, 216, 20);
		frmLogin.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnRegistrarse = new JButton("Registrarse");		
		btnRegistrarse.setBounds(54, 144, 150, 85);
		frmLogin.getContentPane().add(btnRegistrarse);
		
		JButton btnAcceder = new JButton("Acceder");
		btnAcceder.setBounds(229, 144, 150, 85);
		frmLogin.getContentPane().add(btnAcceder);
		
		btnRegistrarse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Registro a = new Registro();
				frmLogin.dispose();
			}
		});
		
		btnAcceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario = textField.getText();
				String contrasena = textField_1.getText();
				
				if(usuario.equals("") || contrasena.equals(""))
					JOptionPane.showMessageDialog(null, "Falta por rellernar algún campo");
				
				if(!usuario.equals("") && !contrasena.equals("")) {
					JOptionPane.showMessageDialog(null, "Ingress completed");
					Traductor t = new Traductor();
					frmLogin.dispose();
					
				}
				
			}
		});
		
		
	}

}
