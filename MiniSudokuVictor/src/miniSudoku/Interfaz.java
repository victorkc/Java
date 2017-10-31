package miniSudoku;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Interfaz {

	private JFrame frame;
	private JTextField textField_0;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JRadioButton rdbtnNewRadioButton;
	
	int gridBase[][] = { { 2, 0, 0, 0}, //
						 { 0, 3, 0, 4}, //
						 { 3, 0, 0, 1}, //
						 { 4, 0, 3, 0} };
	
	int gridSolucion[][] = { { 2, 4, 1, 3}, //
							 { 1, 3, 2, 4}, //
							 { 3, 2, 4, 1}, //
							 { 4, 1, 3, 2} };
	
	String gridStringBase[][] = new String[4][4];
	String gridString[][] = new String[4][4];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		

		Sudoku prueba = new Sudoku();
		
		boolean solved = prueba.solve(new Cell(0, 0));
		if (!solved) {
			System.out.println("SUDOKU cannot be solved.");
			return;
		}
		
		System.out.println("SOLUTION\n");
		
		printGrid(prueba.getGrid());
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(2, 0, 0, 0));
		
		JButton btnReiniciar = new JButton("Reiniciar");
		panel.add(btnReiniciar);
		
		JButton btnSalir = new JButton("Salir");
		panel.add(btnSalir);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.EAST);
		panel_1.setLayout(new GridLayout(2, 0, 0, 0));
		
		JCheckBox chckbxSombreado = new JCheckBox("Sombreado");
		chckbxSombreado.setSelected(true);
		panel_1.add(chckbxSombreado);
		
		rdbtnNewRadioButton = new JRadioButton("Redimensionar");
		rdbtnNewRadioButton.setSelected(true);
		panel_1.add(rdbtnNewRadioButton);
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("Autom\u00E1tico");
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Comprobar sudoku");
		panel_2.add(btnNewButton_1);
		
		JPanel panel_4 = new JPanel();
		frame.getContentPane().add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(4, 4, 1, 1));
		
		textField_0 = new JTextField();
		textField_0.setHorizontalAlignment(SwingConstants.CENTER);
		textField_0.setText("2");
		textField_0.setEditable(false);
		panel_4.add(textField_0);
		textField_0.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setText("3");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setEditable(false);
		panel_4.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setText("4");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setEditable(false);
		panel_4.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setText("3");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setColumns(10);
		panel_4.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setText("1");
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		panel_4.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setText("4");
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		panel_4.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setColumns(10);
		panel_4.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setText("3");
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		panel_4.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setColumns(10);
		panel_4.add(textField_15);
		
		
		
		// Array of the textfields for use them.
		JTextField JTextField[][] = {{textField_0, textField_1, textField_2, textField_3},
								     {textField_4, textField_5, textField_6, textField_7},
								     {textField_8, textField_9, textField_10, textField_11},
								     {textField_12, textField_13, textField_14, textField_15}
								     };
	
		if(chckbxSombreado.isSelected())
			for(int fila=0; fila<4; fila++)
				for(int col=0; col<4; col++){
					if(!JTextField[fila][col].isEditable())
						JTextField[fila][col].setBackground(Color.LIGHT_GRAY);
				}
		
		// Events on the buttons.
		// Automático.
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				for(int fila=0; fila<4; fila++)
					for(int col=0; col<4; col++)
					{
						JTextField[fila][col].setText(String.valueOf(gridSolucion[fila][col]));
						JTextField[fila][col].setBackground(Color.LIGHT_GRAY);
					}
			}
		});
		// Reiniciar el juego.
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String check;
				
				for(int fila=0; fila<4; fila++)
					for(int col=0; col<4; col++)
					{
						if(JTextField[fila][col].isEditable())
							JTextField[fila][col].setBackground(Color.WHITE);
						JTextField[fila][col].setText(String.valueOf(gridBase[fila][col]));
						check = JTextField[fila][col].getText();
						
						if(check.equals("0"))
							JTextField[fila][col].setText("");
					}
			}
		});
		// Corrección del sudoku.
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int contador=0;
				
				for(int fila=0; fila<4; fila++)
					for(int col=0; col<4; col++){
						gridString[fila][col] = JTextField[fila][col].getText();
						gridStringBase[fila][col] = String.valueOf(gridSolucion[fila][col]);
					}
				
				for(int fila=0; fila<4; fila++)
					for(int col=0; col<4; col++){
						if(gridString[fila][col].equals(gridStringBase[fila][col]))
							contador++;
						
							//System.out.println(gridStringBase[fila][col]);
							//System.out.println(gridCheck[fila][col]);
					}
				if(contador<16)
					JOptionPane.showMessageDialog(null, "Alguna casilla está mal o está vacía, revísala");
				else
					JOptionPane.showMessageDialog(null, "Enhorabuena!!! Te has pasado el sudoku!!");
				
						
			}
		});		
		
		// Salir del sudoku.
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		
		// Sombreado
		chckbxSombreado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//if(!JTextField[fila][col].isEditable())
				if(!chckbxSombreado.isSelected())
					for(int fila=0; fila<4; fila++)
						for(int col=0; col<4; col++){
							//JTextField[fila][col].setEditable(true);
							if(!JTextField[fila][col].isEditable())
							JTextField[fila][col].setBackground(Color.WHITE);
						}
				else//if(chckbxSombreado.isSelected())
					for(int fila=0; fila<4; fila++)
						for(int col=0; col<4; col++){
							if(!JTextField[fila][col].isEditable())
								JTextField[fila][col].setBackground(Color.LIGHT_GRAY);
						}
			}
		});
		
		// Redimensionar sudoku.
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(rdbtnNewRadioButton.isSelected())
					frame.setResizable(true);
				else
					frame.setResizable(false);
					
			}
		});
	}
	
	
	
	static void printGrid(int grid[][]) {
		for (int row = 0; row < Sudoku.getN(); row++) {
			for (int col = 0; col < Sudoku.getN(); col++)
				
				
				
				System.out.print(grid[row][col]);
			System.out.println();
		}
	}

}
