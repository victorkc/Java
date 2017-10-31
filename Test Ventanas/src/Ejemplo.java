import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import com.toedter.calendar.JCalendar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JProgressBar;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTextArea;

public class Ejemplo {

	private JFrame frmDominosPizza;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtUsuario;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo window = new Ejemplo();
					window.frmDominosPizza.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejemplo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDominosPizza = new JFrame();
		frmDominosPizza.setResizable(false);
		frmDominosPizza.setTitle("Domino's Pizza");
		frmDominosPizza.setBounds(100, 100, 614, 646);
		frmDominosPizza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 3, 299, 50);
		
		JMenu mnElige = new JMenu("Elige men\u00FA");
		menuBar.add(mnElige);
		
		JMenuItem mntmPizza = new JMenuItem("Pizza hawaiana");
		mnElige.add(mntmPizza);
		
		JMenuItem mntmHamburguesa = new JMenuItem("Pizza barbacoa");
		mnElige.add(mntmHamburguesa);
		
		JMenuItem mntmBocadillo = new JMenuItem("Pizza tejana");
		mnElige.add(mntmBocadillo);
		
		JMenuItem mntmBatido = new JMenuItem("Pizza cuatro quesos");
		mnElige.add(mntmBatido);
		
		JLabel label = new JLabel("");
		label.setBounds(605, 3, 299, 50);
		
		JLabel lblNewLabel = new JLabel("Tipo de base:");
		lblNewLabel.setBounds(0, 59, 299, 50);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(305, 59, 299, 50);
		
		JRadioButton botonOneTrue = new JRadioButton("Fina");
		botonOneTrue.setBounds(0, 109, 299, 50);
		buttonGroup.add(botonOneTrue);
		botonOneTrue.setToolTipText("");
		botonOneTrue.setSelected(true);
		
		JRadioButton botonTwoFalse = new JRadioButton("Cl\u00E1sica");
		botonTwoFalse.setBounds(299, 109, 299, 50);
		buttonGroup.add(botonTwoFalse);
		botonTwoFalse.setToolTipText("");
		
		JLabel lblIngredientesExtra = new JLabel("Ingredientes extra:");
		lblIngredientesExtra.setBounds(0, 159, 299, 50);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(299, 159, 299, 50);
		
		JCheckBox chckbxPepinillo = new JCheckBox("Pepinillo");
		chckbxPepinillo.setBounds(0, 209, 299, 50);
		
		JCheckBox chckbxQueso = new JCheckBox("Queso");
		chckbxQueso.setBounds(299, 209, 299, 50);
		
		JCheckBox chckbxCebolla = new JCheckBox("Cebolla");
		chckbxCebolla.setBounds(0, 259, 299, 50);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Tomate");
		chckbxNewCheckBox.setBounds(299, 259, 299, 50);
		
		JTextPane txtpnEscribeTuUsuario = new JTextPane();
		txtpnEscribeTuUsuario.setBounds(0, 309, 299, 50);
		txtpnEscribeTuUsuario.setText("Escriba el nombre del destinatario");
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(605, 309, 299, 50);
		
		JLabel lblElijaSuCiudad = new JLabel("Elija su ciudad:");
		lblElijaSuCiudad.setBounds(0, 359, 299, 50);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(605, 359, 299, 50);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(0, 409, 299, 50);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Madrid", "Ciudad Real", "Murcia", "Galicia"}));
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(605, 409, 299, 50);
		
		JLabel lblEscribaSuCalle = new JLabel("Escriba su calle:");
		lblEscribaSuCalle.setBounds(0, 471, 299, 50);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(605, 471, 299, 50);
		
		JTextPane txtpnEscribaLaCalle = new JTextPane();
		txtpnEscribaLaCalle.setBounds(0, 521, 299, 50);
		txtpnEscribaLaCalle.setText("Escriba la calle del destinatario");
		
		JLabel label_7 = new JLabel("");
		label_7.setBounds(299, 521, 299, 50);
		
		JButton btnRealizarPedido = new JButton("Realizar pedido");
		btnRealizarPedido.setBounds(0, 571, 299, 50);
		
		JLabel label_8 = new JLabel("");
		label_8.setBounds(299, 571, 299, 50);
		
		JPanel panel = new JPanel();
		panel.setBounds(305, 3, 296, 50);
		panel.setLayout(null);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(10, 19, 86, 20);
		txtUsuario.setText("Usuario");
		panel.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(165, 19, 121, 20);
		panel.add(passwordField);
		
		JLabel lblPassw = new JLabel("Passw:");
		lblPassw.setBounds(109, 22, 46, 14);
		panel.add(lblPassw);
		frmDominosPizza.getContentPane().setLayout(null);
		frmDominosPizza.getContentPane().add(botonOneTrue);
		frmDominosPizza.getContentPane().add(botonTwoFalse);
		frmDominosPizza.getContentPane().add(lblIngredientesExtra);
		frmDominosPizza.getContentPane().add(label_2);
		frmDominosPizza.getContentPane().add(chckbxPepinillo);
		frmDominosPizza.getContentPane().add(chckbxQueso);
		frmDominosPizza.getContentPane().add(chckbxCebolla);
		frmDominosPizza.getContentPane().add(chckbxNewCheckBox);
		frmDominosPizza.getContentPane().add(txtpnEscribaLaCalle);
		frmDominosPizza.getContentPane().add(label_7);
		frmDominosPizza.getContentPane().add(btnRealizarPedido);
		frmDominosPizza.getContentPane().add(label_8);
		frmDominosPizza.getContentPane().add(lblNewLabel);
		frmDominosPizza.getContentPane().add(menuBar);
		frmDominosPizza.getContentPane().add(panel);
		frmDominosPizza.getContentPane().add(label);
		frmDominosPizza.getContentPane().add(label_1);
		frmDominosPizza.getContentPane().add(txtpnEscribeTuUsuario);
		frmDominosPizza.getContentPane().add(lblElijaSuCiudad);
		frmDominosPizza.getContentPane().add(comboBox);
		frmDominosPizza.getContentPane().add(lblEscribaSuCalle);
		frmDominosPizza.getContentPane().add(label_3);
		frmDominosPizza.getContentPane().add(label_4);
		frmDominosPizza.getContentPane().add(label_5);
		frmDominosPizza.getContentPane().add(label_6);
		
		JList list = new JList();
		list.setBounds(373, 358, 122, 101);
		frmDominosPizza.getContentPane().add(list);
		

	}
}
