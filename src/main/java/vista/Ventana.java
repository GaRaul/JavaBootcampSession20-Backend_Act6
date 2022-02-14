package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField tfAltura;
	private JTextField tfKg;

	/**
	 * Launch the application.
	 */
	public static void vista() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPeso = new JLabel("Altura (metros)");
		lblPeso.setBounds(37, 37, 90, 14);
		contentPane.add(lblPeso);
		
		JLabel lblKg = new JLabel("Peso (Kg)");
		lblKg.setBounds(221, 37, 67, 14);
		contentPane.add(lblKg);
		
		tfAltura = new JTextField();
		tfAltura.setBounds(125, 34, 72, 20);
		contentPane.add(tfAltura);
		tfAltura.setColumns(10);
		
		tfKg = new JTextField();
		tfKg.setBounds(287, 34, 77, 20);
		contentPane.add(tfKg);
		tfKg.setColumns(10);
		
		JLabel lblResultado = new JLabel("0");
		lblResultado.setBounds(233, 103, 131, 14);
		contentPane.add(lblResultado);
		
		JButton btnButton = new JButton("Calcular IMC");
		btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double valorKg = Double.parseDouble(tfKg.getText());
					double valorM = Double.parseDouble(tfAltura.getText());
					double resultado = valorKg / (valorM * valorM);					
					lblResultado.setText(String.valueOf(resultado));					
					
				} catch (Exception e2) {
					System.out.println(e2);
				}				
			}
		});
		btnButton.setBounds(37, 99, 131, 23);
		contentPane.add(btnButton);
		
		JLabel lblIMC = new JLabel("IMC");
		lblIMC.setBounds(186, 103, 48, 14);
		contentPane.add(lblIMC);
		
		
	}
}
