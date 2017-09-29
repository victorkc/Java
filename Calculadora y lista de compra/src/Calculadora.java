import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Calculadora {

	private JFrame frmCalculadoraFlow;
	private JTextField txtOp;
	private JTextField txtOp_1;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frmCalculadoraFlow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadoraFlow = new JFrame();
		frmCalculadoraFlow.setTitle("Calculadora FLOW");
		frmCalculadoraFlow.setBounds(100, 100, 459, 531);
		frmCalculadoraFlow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadoraFlow.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblN = new JLabel("N1");
		frmCalculadoraFlow.getContentPane().add(lblN);
		
		txtOp = new JTextField();
		txtOp.setText("OP1");
		frmCalculadoraFlow.getContentPane().add(txtOp);
		txtOp.setColumns(10);
		
		JLabel lblN_1 = new JLabel("N2");
		frmCalculadoraFlow.getContentPane().add(lblN_1);
		
		txtOp_1 = new JTextField();
		txtOp_1.setText("OP2");
		frmCalculadoraFlow.getContentPane().add(txtOp_1);
		txtOp_1.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total");
		frmCalculadoraFlow.getContentPane().add(lblTotal);
		
		txtResult = new JTextField();
		txtResult.setText("Result");
		frmCalculadoraFlow.getContentPane().add(txtResult);
		txtResult.setColumns(10);
		
		JButton button = new JButton("+");
		frmCalculadoraFlow.getContentPane().add(button);
		
		JButton button_1 = new JButton("-");
		frmCalculadoraFlow.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("*");
		frmCalculadoraFlow.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("/");
		frmCalculadoraFlow.getContentPane().add(button_3);
	}

}
