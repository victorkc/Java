import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CalculadoraGrid {

	private JFrame frmCalculadoraGrid;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraGrid window = new CalculadoraGrid();
					window.frmCalculadoraGrid.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculadoraGrid() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadoraGrid = new JFrame();
		frmCalculadoraGrid.setTitle("Calculadora Grid");
		frmCalculadoraGrid.setBounds(100, 100, 450, 300);
		frmCalculadoraGrid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadoraGrid.getContentPane().setLayout(new GridLayout(2, 4, 0, 0));
		
		JPanel panel = new JPanel();
		frmCalculadoraGrid.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblN = new JLabel("N1");
		lblN.setBounds(39, 60, 46, 14);
		panel.add(lblN);
		
		textField_2 = new JTextField();
		textField_2.setBounds(319, 8, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField = new JTextField();
		frmCalculadoraGrid.getContentPane().add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		frmCalculadoraGrid.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblN_1 = new JLabel("N2");
		lblN_1.setBounds(46, 60, 13, 14);
		panel_1.add(lblN_1);
		
		textField_1 = new JTextField();
		frmCalculadoraGrid.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		frmCalculadoraGrid.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(10, 61, 48, 14);
		panel_2.add(lblResultado);
		
		JButton button = new JButton("+");
		frmCalculadoraGrid.getContentPane().add(button);
		
		JButton button_1 = new JButton("-");
		frmCalculadoraGrid.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("*");
		frmCalculadoraGrid.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("/");
		frmCalculadoraGrid.getContentPane().add(button_3);
		
		textField_3 = new JTextField();
		frmCalculadoraGrid.getContentPane().add(textField_3);
		textField_3.setColumns(10);
	}
}
