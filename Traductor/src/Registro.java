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
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import com.toedter.calendar.JCalendar;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

public class Registro {

	private JFrame frmRegistro;
	private JTextField txtUsuario;
	private JTextField txtContrasena;
	private JTextField txtemail;
	private JTextField txtNCompleto;
	private JLabel lblCamposObligatorios;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	JButton btnCompletarRegistro;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
		

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmRegistro = new JFrame();
		frmRegistro.setTitle("Registro");
		frmRegistro.setBounds(100, 100, 501, 508);
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
		
		txtemail = new JTextField();
		txtemail.setText("E-mail");
		txtemail.setColumns(10);
		txtemail.setBounds(42, 101, 217, 20);
		frmRegistro.getContentPane().add(txtemail);
		
		txtNCompleto = new JTextField();
		txtNCompleto.setText("Nombre completo");
		txtNCompleto.setColumns(10);
		txtNCompleto.setBounds(42, 132, 217, 20);
		frmRegistro.getContentPane().add(txtNCompleto);
		
		
		btnCompletarRegistro= new JButton("Completar registro");
		btnCompletarRegistro.setBounds(42, 408, 170, 40);
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
		
		JRadioButton rdbtnH = new JRadioButton("H");
		buttonGroup.add(rdbtnH);
		rdbtnH.setBounds(298, 82, 55, 25);
		frmRegistro.getContentPane().add(rdbtnH);
		
		JRadioButton rdbtnM = new JRadioButton("M");
		buttonGroup.add(rdbtnM);
		rdbtnM.setBounds(357, 82, 61, 25);
		frmRegistro.getContentPane().add(rdbtnM);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(42, 194, 402, 155);
		frmRegistro.getContentPane().add(calendar);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha de nacimiento:");
		lblFechaNacimiento.setBounds(42, 165, 217, 16);
		frmRegistro.getContentPane().add(lblFechaNacimiento);
		
		JCheckBox chckbxQuiereRecibirNoticias = new JCheckBox("Recibir ofertas?");
		chckbxQuiereRecibirNoticias.setSelected(true);
		chckbxQuiereRecibirNoticias.setToolTipText("");
		chckbxQuiereRecibirNoticias.setBounds(298, 109, 146, 46);
		frmRegistro.getContentPane().add(chckbxQuiereRecibirNoticias);
		
		JLabel lblHombreOMujer = new JLabel("Hombre o mujer?");
		lblHombreOMujer.setBounds(298, 57, 146, 16);
		frmRegistro.getContentPane().add(lblHombreOMujer);
		
		JLabel label = new JLabel("*");
		label.setBounds(265, 134, 46, 14);
		frmRegistro.getContentPane().add(label);
		
		
		
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
		
		txtemail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtemail.setText("");
			}
		});
		
		txtNCompleto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtNCompleto.setText("");
			}
		});
		
		btnCompletarRegistro.addActionListener(new ActionListener() { // Check de que los campos obligatorios son rellenados.
			public void actionPerformed(ActionEvent e) {
				String usuario = txtUsuario.getText();
				String contrasena = txtContrasena.getText();
				String email = txtemail.getText();
				String NCompleto = txtNCompleto.getText();
				
				if(usuario.equals("Usuario") || contrasena.equals("Contraseña") || email.equals("E-mail") || NCompleto.equals("Nombre completo"))
					JOptionPane.showMessageDialog(null, "Falta por rellernar algún campo");
				
				if(!usuario.equals("Usuario") && !contrasena.equals("Contraseña") && !email.equals("E-mail") && !NCompleto.equals("Nombre completo")) {
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
		frmRegistro.setVisible(true);	
	}
}
