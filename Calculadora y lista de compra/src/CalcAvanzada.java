import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;

public class CalcAvanzada {

	private JFrame frmListaDeLa;
	private JTextField txtCliente;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	double total3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcAvanzada window = new CalcAvanzada();
					window.frmListaDeLa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalcAvanzada() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmListaDeLa = new JFrame();
		
		frmListaDeLa.setResizable(false);
		frmListaDeLa.setTitle("Lista de la compra");
		frmListaDeLa.setIconImage(Toolkit.getDefaultToolkit().getImage(CalcAvanzada.class.getResource("/com/sun/java/swing/plaf/windows/icons/image-delayed.png")));
		frmListaDeLa.setBounds(100, 100, 646, 279);
		frmListaDeLa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmListaDeLa.getContentPane().setLayout(null);
		
		JLabel lblIdentificacinDeUsuario = new JLabel("Identificaci\u00F3n de usuario:");
		lblIdentificacinDeUsuario.setBounds(10, 11, 173, 14);
		frmListaDeLa.getContentPane().add(lblIdentificacinDeUsuario);
		
		txtCliente = new JTextField();
		txtCliente.setEditable(false);
		txtCliente.setText("Cliente");
		txtCliente.setBounds(167, 8, 147, 20);
		frmListaDeLa.getContentPane().add(txtCliente);
		txtCliente.setColumns(10);
		
		JLabel lblTotalAPagar = new JLabel("Total a pagar (\u20AC):");
		lblTotalAPagar.setBounds(358, 8, 98, 14);
		frmListaDeLa.getContentPane().add(lblTotalAPagar);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setText("0.0");
		textField.setBounds(459, 5, 86, 20);
		frmListaDeLa.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblProducto = new JLabel("Producto:");
		lblProducto.setBounds(10, 48, 65, 14);
		frmListaDeLa.getContentPane().add(lblProducto);
		
		textField_1 = new JTextField();
		
		textField_1.setBounds(78, 45, 113, 20);
		frmListaDeLa.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCantidadYPreciounidad = new JLabel("Cantidad y precio/unidad:");
		lblCantidadYPreciounidad.setBounds(201, 48, 161, 14);
		frmListaDeLa.getContentPane().add(lblCantidadYPreciounidad);
		
		textField_2 = new JTextField();
		textField_2.setBounds(459, 45, 86, 20);
		frmListaDeLa.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 85, 384, 134);
		frmListaDeLa.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JButton btnAadirProductoCreado = new JButton("A\u00F1adir producto creado");
		
		btnAadirProductoCreado.setBounds(424, 105, 184, 23);
		frmListaDeLa.getContentPane().add(btnAadirProductoCreado);
		
		JButton btnFinalizarCompra = new JButton("Finalizar compra");
		
		btnFinalizarCompra.setBounds(424, 170, 184, 23);
		frmListaDeLa.getContentPane().add(btnFinalizarCompra);
		
		JComboBox comboBox = new JComboBox();
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(358, 45, 46, 20);
		frmListaDeLa.getContentPane().add(comboBox);
		
		//edición de eventos de botones
		btnFinalizarCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String total4 = String.valueOf(total3);
				JOptionPane.showMessageDialog(null, "Gracias por su compra, debe pagar " + total4 + " €"); 
			}
		});
		
		//evento cuando se inicia la ventana.
		frmListaDeLa.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				comboBox.setSelectedItem(null);
			}
		});
		
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				//if(textField_1.getText().length()>=6)
					//textField_1.getText().Str;
			}
		});
		
		/*comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(comboBox.getSelectedItem() != null) {
					String seleccionado = comboBox.getSelectedItem().toString();
					textField_2.setText(seleccionado);
				}
			}
		});
		*/
		
		btnAadirProductoCreado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				String producto = textField_1.getText();//"PATATAS"
				String textoPrecio = textField_2.getText();//"0.5"
				String seleccionado = comboBox.getSelectedItem().toString();//"2"
				
				int cantidad = Integer.parseInt(seleccionado);//2
				double precio = Double.parseDouble(textoPrecio);//0.5
				double total = cantidad*precio;//1
				String total2 = String.valueOf(total); //"1"
				
				total3 += total;									//0+1=1
				String total4 = String.valueOf(total3);			//"1"
				textField.setText(total4);														// ["1"]
				//textArea.setText(producto + " (" + seleccionado + ") --> " + total2 ); //Versión sin append.
				textArea.append(producto + " (" + seleccionado + ") --> " + total2 + "\n" );	//PATATAS (2) --> 1
				
				textField_1.setText("");
				textField_2.setText("");
				
				
			}
		});
		
	}
}
