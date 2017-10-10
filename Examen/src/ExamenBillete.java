import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;


public class ExamenBillete {

	private JFrame frmViajesDam;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	double total = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					ExamenBillete window = new ExamenBillete();
					window.frmViajesDam.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ExamenBillete() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmViajesDam = new JFrame();
		frmViajesDam.setTitle("VIAJES DAM");
		frmViajesDam.setBounds(100, 100, 719, 453);
		frmViajesDam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmViajesDam.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Caracter\u00EDsticas de su billete de viaje:");
		lblNewLabel.setBounds(27, 11, 202, 14);
		frmViajesDam.getContentPane().add(lblNewLabel);
		
		JLabel lblOrigen = new JLabel("Origen:*");
		lblOrigen.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOrigen.setBounds(10, 36, 104, 14);
		frmViajesDam.getContentPane().add(lblOrigen);
		
		JLabel lblDestino = new JLabel("Destino:*");
		lblDestino.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDestino.setBounds(10, 71, 104, 14);
		frmViajesDam.getContentPane().add(lblDestino);
		
		JLabel lblNDeBilletes = new JLabel("N\u00BA de billetes:");
		lblNDeBilletes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNDeBilletes.setBounds(10, 100, 104, 14);
		frmViajesDam.getContentPane().add(lblNDeBilletes);
		
		JLabel lblTipoDeViaje = new JLabel("Tipo de viaje:");
		lblTipoDeViaje.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipoDeViaje.setBounds(10, 125, 104, 14);
		frmViajesDam.getContentPane().add(lblTipoDeViaje);
		
		JLabel lblFormaDePago = new JLabel("Forma de pago:");
		lblFormaDePago.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFormaDePago.setBounds(10, 150, 104, 14);
		frmViajesDam.getContentPane().add(lblFormaDePago);
		
		JLabel lblDescuentos = new JLabel("Descuentos:");
		lblDescuentos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescuentos.setBounds(10, 187, 104, 14);
		frmViajesDam.getContentPane().add(lblDescuentos);
		
		JLabel lblMtodosDePago = new JLabel("M\u00E9todos de Pago:");
		lblMtodosDePago.setBounds(316, 11, 138, 14);
		frmViajesDam.getContentPane().add(lblMtodosDePago);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"MADRID", "BARCELONA"}));
		comboBox.setBounds(124, 36, 162, 20);
		frmViajesDam.getContentPane().add(comboBox);
		comboBox.setSelectedIndex(-1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"BILBAO", "ZARAGOZA"}));
		comboBox_1.setBounds(124, 67, 162, 20);
		frmViajesDam.getContentPane().add(comboBox_1);
		comboBox_1.setSelectedIndex(-1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		comboBox_2.setBounds(124, 97, 55, 20);
		frmViajesDam.getContentPane().add(comboBox_2);
		
		JRadioButton rdbtnIdavta = new JRadioButton("Ida/Vta");
		rdbtnIdavta.setSelected(true);
		buttonGroup.add(rdbtnIdavta);
		rdbtnIdavta.setBounds(120, 121, 77, 23);
		frmViajesDam.getContentPane().add(rdbtnIdavta);
		
		JRadioButton rdbtnSloIda = new JRadioButton("S\u00F3lo ida");
		buttonGroup.add(rdbtnSloIda);
		rdbtnSloIda.setBounds(199, 121, 70, 23);
		frmViajesDam.getContentPane().add(rdbtnSloIda);
		
		JRadioButton rdbtnTarjeta = new JRadioButton("Tarjeta");
		rdbtnTarjeta.setSelected(true);
		buttonGroup_1.add(rdbtnTarjeta);
		rdbtnTarjeta.setBounds(120, 146, 70, 23);
		frmViajesDam.getContentPane().add(rdbtnTarjeta);
		
		JRadioButton rdbtnIban = new JRadioButton("IBAN(+5%)");
		buttonGroup_1.add(rdbtnIban);
		rdbtnIban.setBounds(199, 146, 83, 23);
		frmViajesDam.getContentPane().add(rdbtnIban);
		
		JCheckBox chckbxFamiliaNumerosa = new JCheckBox("Familia numerosa (-10%)");
		chckbxFamiliaNumerosa.setBounds(120, 184, 162, 23);
		frmViajesDam.getContentPane().add(chckbxFamiliaNumerosa);
		
		JCheckBox chckbxCarnJoven = new JCheckBox("Carn\u00E9 joven (-8%)"); 
		chckbxCarnJoven.setBounds(120, 210, 145, 23);
		frmViajesDam.getContentPane().add(chckbxCarnJoven);
		
		JCheckBox chckbxDesempleado = new JCheckBox("Desempleado (-6%)");
		chckbxDesempleado.setBounds(120, 236, 145, 23);
		frmViajesDam.getContentPane().add(chckbxDesempleado);
		
		JLabel lblTotalAPagar = new JLabel("Total a PAGAR:");
		lblTotalAPagar.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalAPagar.setBounds(27, 319, 87, 14);
		frmViajesDam.getContentPane().add(lblTotalAPagar);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(124, 316, 86, 20);
		frmViajesDam.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lbluros = new JLabel("\u20ACuros");
		lbluros.setBounds(223, 319, 46, 14);
		frmViajesDam.getContentPane().add(lbluros);
		
		JButton btnNewButton = new JButton("Proceder al pago");
		btnNewButton.setBounds(27, 347, 152, 23);
		frmViajesDam.getContentPane().add(btnNewButton);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(199, 347, 89, 23);
		frmViajesDam.getContentPane().add(btnSalir);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(316, 36, 366, 137);
		frmViajesDam.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblDatosTarjeta = new JLabel("Datos Tarjeta:");
		lblDatosTarjeta.setBounds(10, 14, 108, 14);
		panel.add(lblDatosTarjeta);
		
		JLabel lblTitular = new JLabel("Titular:*");
		lblTitular.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTitular.setBounds(20, 39, 56, 14);
		panel.add(lblTitular);
		
		JLabel lblNTarjeta = new JLabel("N\u00BA Tarjeta:*");
		lblNTarjeta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNTarjeta.setBounds(10, 64, 66, 14);
		panel.add(lblNTarjeta);
		
		JLabel lblCvv = new JLabel("CVV:*");
		lblCvv.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCvv.setBounds(10, 89, 66, 14);
		panel.add(lblCvv);
		
		textField_1 = new JTextField();
		textField_1.setBounds(104, 36, 252, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(104, 61, 194, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDigit = new JLabel("16 DIGIT");
		lblDigit.setBounds(306, 64, 60, 14);
		panel.add(lblDigit);
		
		JLabel lblDigit_1 = new JLabel("3 DIGIT       Tipo:");
		lblDigit_1.setBounds(168, 89, 108, 14);
		panel.add(lblDigit_1);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"VISA", "MASTERCARD"}));
		comboBox_3.setBounds(268, 88, 88, 20);
		panel.add(comboBox_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(102, 86, 56, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(316, 187, 366, 90);
		frmViajesDam.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		panel_1.setVisible(false); /* Visible el panel 2 */
		
		JLabel lblDatosCuentaIban = new JLabel("Datos cuenta IBAN:");
		lblDatosCuentaIban.setBounds(10, 11, 142, 14);
		panel_1.add(lblDatosCuentaIban);
		
		JLabel lblIbanEs = new JLabel("IBAN - ES:*");
		lblIbanEs.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIbanEs.setBounds(0, 36, 72, 14);
		panel_1.add(lblIbanEs);
		
		JLabel lblBanco = new JLabel("Banco:*");
		lblBanco.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBanco.setBounds(0, 61, 72, 14);
		panel_1.add(lblBanco);
		
		textField_4 = new JTextField();
		textField_4.setBounds(82, 33, 209, 17);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(82, 58, 274, 17);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblDigit_2 = new JLabel("22 DIGIT");
		lblDigit_2.setBounds(301, 36, 46, 14);
		panel_1.add(lblDigit_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(316, 288, 366, 90);
		frmViajesDam.getContentPane().add(textArea);
		
		rdbtnTarjeta.addMouseListener(new MouseAdapter() { // PAGO CON TARJETA OCULTAR PANEL 2
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_1.setVisible(false);
				panel.setVisible(true);
			}
		});
		
		rdbtnIban.addMouseListener(new MouseAdapter() { // PAGO CON IBAN OCULTAR PANEL 1
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_1.setVisible(true);
				panel.setVisible(false);
			}
		});
		
		/*frmViajesDam.getContentPane().addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				calculo(comboBox, comboBox_1, comboBox_2, rdbtnIdavta, chckbxFamiliaNumerosa, chckbxCarnJoven, chckbxDesempleado, rdbtnIban); // Fórmula
			}
		});*/
				// SALIR
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String salir="¿Desea salir?", si="si", no="no";
				//JOptionPane.showOptionDialog(frmViajesDam.dispose(), salir, "Salir", 1, 1);
				JOptionPane.showMessageDialog(null, "Se cierra el programa");
				frmViajesDam.dispose();
				//JOptionPane.showOptionDialog(null, null, "Salir", YES_NO_OPTION, messageType, icon, options, initialValue)
			}
		});	
		// PROCEDER COMPRA
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedIndex() == -1 || comboBox_1.getSelectedIndex() == -1)
					JOptionPane.showMessageDialog(null, "Falta por elegir el viaje de origen o destino");
				else
					if(!rdbtnIban.isSelected())
						if(textField_1.getText().equals(""))
							JOptionPane.showMessageDialog(null, "Tiene que introducir el nombre del titular");
						else
							if(textField_2.getText().length() < 16 || textField_2.getText().length() > 16)
								JOptionPane.showMessageDialog(null, "Error en el número de dígitos escritos de la tarjeta");
							else
								if(textField_3.getText().length() < 3 || textField_3.getText().length() > 3)
									JOptionPane.showMessageDialog(null, "Error en el número de dígitos escritos del CVV");
								else
								{
									textArea.append("RESUMEN DE SU COMPRA \n" + "Origen: " + comboBox.getSelectedItem() +
									 "\nDestino: "+ comboBox_1.getSelectedItem()+
									 "\nNúmero de billetes: "+ comboBox_2.getSelectedItem()+
									 "\nTotal pagado: "+ total+"€");
									comboBox.setSelectedIndex(-1);
									comboBox_1.setSelectedIndex(-1);
									comboBox_2.setSelectedIndex(1);
									chckbxFamiliaNumerosa.setSelected(false);
									chckbxCarnJoven.setSelected(false);
									chckbxDesempleado.setSelected(false);
									textField_1.setText("");
									textField_2.setText("");
									textField_3.setText("");
									
								
								}
					else
						if(textField_4.getText().length() < 22 || textField_4.getText().length() > 22)
							JOptionPane.showMessageDialog(null, "Error en el número de dígitos escritos de IBAN");
						else
							if(textField_5.getText().equals(""))
								JOptionPane.showMessageDialog(null, "Tiene que introducir el nombre del banco");
							else
							{
								
								textArea.append("RESUMEN DE SU COMPRA \n" + "Origen: " + comboBox.getSelectedItem() +
								 "\nDestino: "+ comboBox_1.getSelectedItem()+
								 "\nNúmero de billetes: "+ comboBox_2.getSelectedItem()+
								 "\nTotal pagado: "+ total+"€");
								comboBox.setSelectedIndex(-1);
								comboBox_1.setSelectedIndex(-1);
								comboBox_2.setSelectedIndex(0);
								chckbxFamiliaNumerosa.setSelected(false);
								chckbxCarnJoven.setSelected(false);
								chckbxDesempleado.setSelected(false);
								textField_4.setText("");
								textField_5.setText("");
							
							}
								
				
				
			}
		});
		// AÑADIR FUNCION CALCULO A TODOS LOS BOTONES
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculo(comboBox, comboBox_1, comboBox_2, rdbtnIdavta, chckbxFamiliaNumerosa, chckbxCarnJoven, chckbxDesempleado, rdbtnIban);
			}
		});
		
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculo(comboBox, comboBox_1, comboBox_2, rdbtnIdavta, chckbxFamiliaNumerosa, chckbxCarnJoven, chckbxDesempleado, rdbtnIban);
			}
		});
		
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculo(comboBox, comboBox_1, comboBox_2, rdbtnIdavta, chckbxFamiliaNumerosa, chckbxCarnJoven, chckbxDesempleado, rdbtnIban);
			}
		});
		
		rdbtnIdavta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calculo(comboBox, comboBox_1, comboBox_2, rdbtnIdavta, chckbxFamiliaNumerosa, chckbxCarnJoven, chckbxDesempleado, rdbtnIban);
			}
		});
		
		chckbxFamiliaNumerosa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calculo(comboBox, comboBox_1, comboBox_2, rdbtnIdavta, chckbxFamiliaNumerosa, chckbxCarnJoven, chckbxDesempleado, rdbtnIban);
			}
		});
		
		chckbxCarnJoven.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calculo(comboBox, comboBox_1, comboBox_2, rdbtnIdavta, chckbxFamiliaNumerosa, chckbxCarnJoven, chckbxDesempleado, rdbtnIban);
			}
		});
		
		rdbtnIban.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calculo(comboBox, comboBox_1, comboBox_2, rdbtnIdavta, chckbxFamiliaNumerosa, chckbxCarnJoven, chckbxDesempleado, rdbtnIban);
			}
		});
		
		rdbtnTarjeta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calculo(comboBox, comboBox_1, comboBox_2, rdbtnIdavta, chckbxFamiliaNumerosa, chckbxCarnJoven, chckbxDesempleado, rdbtnIban);
			}
		});
		
		rdbtnSloIda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calculo(comboBox, comboBox_1, comboBox_2, rdbtnIdavta, chckbxFamiliaNumerosa, chckbxCarnJoven, chckbxDesempleado, rdbtnIban);
			}
		});
		chckbxDesempleado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calculo(comboBox, comboBox_1, comboBox_2, rdbtnIdavta, chckbxFamiliaNumerosa, chckbxCarnJoven, chckbxDesempleado, rdbtnIban);
			}
		});
		
		
		// FINAL DE AÑADIR CALCULO A LOS BOTONES

		
	}
	
	// MATEMÁTICA PARA EFECTUAR TODAS LAS OPERACIONES	
				public void calculo(JComboBox comboBox, JComboBox comboBox_1, JComboBox comboBox_2, JRadioButton rdbtnIdavta, 
						JCheckBox chckbxFamiliaNumerosa, JCheckBox chckbxCarnJoven,JCheckBox chckbxDesempleado, JRadioButton rdbtnIban){
					int origen, destino, billetes=0, iban;
					
					
					origen = comboBox.getSelectedIndex();
					destino = comboBox_1.getSelectedIndex();
					billetes += comboBox_2.getSelectedIndex()+1;
					
					
					if(origen == -1 || destino == -1)
						;
					else
					{
					
					if(origen == 0 && destino == 0)
						if(!rdbtnIdavta.isSelected())
							total = 30;
						else
							total = 50;

					if(origen < destino)
						if(!rdbtnIdavta.isSelected())
							total = 15;
						else
							total = 25;
					
					if(origen == 1 && destino == 1)
						if(!rdbtnIdavta.isSelected())
							total = 12;
						else
							total = 20;
					
					if(origen > destino)
						if(!rdbtnIdavta.isSelected())
							total = 20;
						else
							total = 35;
					total = total*billetes;
					
					if(rdbtnIban.isSelected())
						total = total+(total*5/100);
					if(chckbxFamiliaNumerosa.isSelected())
						total = total-(total*10/100);
					if(chckbxDesempleado.isSelected())
						total = total-(total*6/100);
					if(chckbxCarnJoven.isSelected())
						total = total-(total*8/100);
					textField.setText(String.valueOf(total));	
					}
				}
}
