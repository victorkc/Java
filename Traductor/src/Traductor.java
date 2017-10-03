import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Traductor {

	private JFrame frmTraductor;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	URL web = null;
	InputStream contenido = null;
	String pagWeb = "";
	private JLabel lblPalabraBuscada;

	/**
	 * Create the application.
	 */
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTraductor = new JFrame();
		frmTraductor.setTitle("Traductor");
		frmTraductor.setBounds(100, 100, 450, 300);
		frmTraductor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTraductor.getContentPane().setLayout(null);
		
		JLabel lblEscribaLaPalabra = new JLabel("Escriba la palabra a traducir:");
		lblEscribaLaPalabra.setBounds(35, 73, 187, 14);
		frmTraductor.getContentPane().add(lblEscribaLaPalabra);
		
		textField = new JTextField();
		textField.setBounds(35, 98, 138, 20);
		frmTraductor.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPalabraTraducida = new JLabel("Palabra traducida:");
		lblPalabraTraducida.setBounds(35, 186, 129, 14);
		frmTraductor.getContentPane().add(lblPalabraTraducida);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(35, 211, 138, 20);
		frmTraductor.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("Traducir!!"); // Función del botón traducir al final.
		
		btnNewButton.setBounds(234, 27, 164, 102);
		frmTraductor.getContentPane().add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(35, 155, 138, 20);
		frmTraductor.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		lblPalabraBuscada = new JLabel("Palabra buscada:");
		lblPalabraBuscada.setBounds(35, 129, 138, 14);
		frmTraductor.getContentPane().add(lblPalabraBuscada);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ingl\u00E9s", "Franc\u00E9s"}));
		comboBox.setBounds(35, 27, 138, 22);
		frmTraductor.getContentPane().add(comboBox);
		
		JButton btnLogOut = new JButton("Log out");
		btnLogOut.setBounds(234, 142, 164, 98);
		frmTraductor.getContentPane().add(btnLogOut);
		
		btnNewButton.addMouseListener(new MouseAdapter() { // Función del botón traducir.
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String palabraTraducir = textField.getText(); // Guardar palabra a traducir.
				String palabra = comboBox.getSelectedItem().toString(); // Palabra del comboBox.
				textField_2.setText(palabraTraducir); // Se escribe en el campo como recordatorio para el usuario.
				textField.setText(""); // Queda en blanco para otra posible palabra.
				
				if(palabra.equals("Inglés")){
	
				
				try {
					web = new URL("http://www.wordreference.com/es/en/translation.asp?spen="+palabraTraducir);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					contenido = web.openStream();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				// Convertir InputStream en String
				pagWeb = getStringFromInputStream(contenido);
				String variable = "<td class='ToWrd' >";
				int aux = 0;
				
				pagWeb = pagWeb.substring(pagWeb.indexOf(variable)+variable.length());
				
				while(pagWeb.charAt(aux) != '<')
					aux++;
				pagWeb = pagWeb.substring(0, aux);
				
				textField_1.setText(pagWeb);
				
				//System.out.println(pagWeb);
					
			}//hasta aquí el if de que la caja sea en inglés.
				
				if(palabra.equals("Francés")){ //selección en francés.
					
					
					try {
						web = new URL("http://www.wordreference.com/esfr/"+palabraTraducir);
					} catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					try {
						contenido = web.openStream();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					// Convertir InputStream en String
					pagWeb = getStringFromInputStream(contenido);
					String variable = "<td class='ToWrd' >";
					int aux = 0;
					
					pagWeb = pagWeb.substring(pagWeb.indexOf(variable)+variable.length());
					
					while(pagWeb.charAt(aux) != '<')
						aux++;
					pagWeb = pagWeb.substring(0, aux);
					
					textField_1.setText(pagWeb);
					
						
				}//hasta aquí el if de que la caja sea en francés.
				
			}
		});
		
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l = new Login();
				frmTraductor.dispose();
			}
		});
		
	}
	
	// convert InputStream to String
			private static String getStringFromInputStream(InputStream is) { 

				BufferedReader br = null;
				StringBuilder sb = new StringBuilder();

				String line;
				try {

					br = new BufferedReader(new InputStreamReader(is));
					while ((line = br.readLine()) != null) {
						sb.append(line);
					}

				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					if (br != null) {
						try {
							br.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}

				return sb.toString();

			}
			
			public Traductor() {
				
				initialize();
				frmTraductor.setVisible(true);

			}
}
