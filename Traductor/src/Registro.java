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

public class Registro {

	private JFrame frmRegistro;
	private JTextField txtUsuario;
	private JTextField txtContrasena;
	private JTextField txtEmail;
	private JTextField txtTelfono;
	private JLabel lblCamposObligatorios;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	JButton btnCompletarRegistro;

	/**
	 * Launch the application.
	 */
		

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmRegistro = new JFrame();
		frmRegistro.setTitle("Registro");
		frmRegistro.setBounds(100, 100, 450, 300);
		frmRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistro.getContentPane().setLayout(null);
		
		txtUsuario = new JTextField();		
		txtUsuario.setText("Usuario");
		txtUsuario.setBounds(42, 39, 217, 20);
		frmRegistro.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtContrasena = new JTextField();
		txtContrasena.setText("Contrase\u00F1a");
		txtContrasena.setColumns(10);
		txtContrasena.setBounds(42, 70, 217, 20);
		frmRegistro.getContentPane().add(txtContrasena);
		
		txtEmail = new JTextField();
		txtEmail.setText("E-mail");
		txtEmail.setColumns(10);
		txtEmail.setBounds(42, 101, 217, 20);
		frmRegistro.getContentPane().add(txtEmail);
		
		txtTelfono = new JTextField();
		txtTelfono.setText("Nombre completo");
		txtTelfono.setColumns(10);
		txtTelfono.setBounds(42, 132, 217, 20);
		frmRegistro.getContentPane().add(txtTelfono);
		
		
		btnCompletarRegistro= new JButton("Completar registro");
		btnCompletarRegistro.setBounds(42, 175, 170, 40);
		frmRegistro.getContentPane().add(btnCompletarRegistro);
		
		lblCamposObligatorios = new JLabel("Campos obligatorios *");
		lblCamposObligatorios.setBounds(42, 14, 170, 14);
		frmRegistro.getContentPane().add(lblCamposObligatorios);
		
		label_1 = new JLabel("*");
		label_1.setBounds(265, 70, 46, 14);
		frmRegistro.getContentPane().add(label_1);
		
		label_2 = new JLabel("*");
		label_2.setBounds(265, 101, 46, 14);
		frmRegistro.getContentPane().add(label_2);
		
		label_3 = new JLabel("*");
		label_3.setBounds(265, 39, 46, 14);
		frmRegistro.getContentPane().add(label_3);
		
		
		
		//eventos
		txtUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtUsuario.setText("");
			}
		});
		
		
		txtContrasena.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtContrasena.setText("");
			}
		});
		
		txtEmail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEmail.setText("");
			}
		});
		
		txtTelfono.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtTelfono.setText("");
			}
		});
		
		btnCompletarRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario = txtUsuario.getText();
				String contrasena = txtContrasena.getText();
				String email = txtEmail.getText();
				if(usuario.equals("Usuario") || contrasena.equals("Contraseña") || email.equals("E-mail"))
					JOptionPane.showMessageDialog(null, "Falta por rellernar algún campo");
				if(!usuario.equals("Usuario") && !contrasena.equals("Contraseña") && !email.equals("E-mail")) {
					JOptionPane.showMessageDialog(null, "Registro completado");
					Login l = new Login();
					frmRegistro.dispose();
					
				}
				
			}
		});
		
		
		
		
	}
	

	

	/**
	 * Create the application.
	 */
	public Registro() {
		initialize();
		System.out.println("Prueba");
		frmRegistro.setVisible(true);
		
		
		
	}
	

}
