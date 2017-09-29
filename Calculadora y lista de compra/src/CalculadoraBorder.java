import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;

public class CalculadoraBorder {

	private JFrame frmCalculadoraBroder;
	private JTextField textField;
	private JPanel panel_1;
	private JLabel lblN_1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPanel panel_2;
	private JPanel panel_4;
	private JButton button;
	private JButton button_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraBorder window = new CalculadoraBorder();
					window.frmCalculadoraBroder.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculadoraBorder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadoraBroder = new JFrame();
		frmCalculadoraBroder.setTitle("Calculadora Broder");
		frmCalculadoraBroder.setBounds(100, 100, 592, 486);
		frmCalculadoraBroder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadoraBroder.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frmCalculadoraBroder.getContentPane().add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(2, 0, 0, 0));
		
		button = new JButton("+");
		panel.add(button);
		
		button_1 = new JButton("-");
		panel.add(button_1);
		
		panel_1 = new JPanel();
		frmCalculadoraBroder.getContentPane().add(panel_1, BorderLayout.NORTH);
		
		JLabel lblN = new JLabel("N1");
		panel_1.add(lblN);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(10);
		
		lblN_1 = new JLabel("N2");
		panel_1.add(lblN_1);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		panel_2 = new JPanel();
		frmCalculadoraBroder.getContentPane().add(panel_2, BorderLayout.EAST);
		panel_2.setLayout(new GridLayout(2, 0, 0, 0));
		
		JButton button_2 = new JButton("*");
		panel_2.add(button_2);
		
		JButton button_3 = new JButton("/");
		panel_2.add(button_3);
		
		panel_4 = new JPanel();
		frmCalculadoraBroder.getContentPane().add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(1, 0, 0, 0));
		
		textField_2 = new JTextField();
		panel_4.add(textField_2);
		textField_2.setColumns(10);
	}
}
