package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ConversorDivisa extends JFrame {

	private Menu menu;
	
	private JFrame panel;
	private JPanel barListPane, textfieldPane, btnConvertirPane, btnAtrasPane;
	private JComboBox barList;
	private JTextField textfield;
	private JButton btnConvertir;
	private JButton btnAtras;
	
	public void setVisiblePanel(boolean visible) {
		this.panel.setVisible(visible);;
	}
	
	private void BtnAtrasActionPerformed(java.awt.event.ActionEvent evt, JFrame panel) {
		panel.setVisible(false);
		menu = new Menu();
		menu.setVisiblePanel(true);
	}
	
	/**
	 * Create the frame.
	 */
	public ConversorDivisa() {
		panel = new JFrame("Convertir Divisas");
        panel.setSize(400,300);
        panel.setLocationRelativeTo(null);
        panel.setVisible(true);
        panel.setResizable(false);
        panel.setLayout(null);
        this.iniciarComponentes();
        panel.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(500, 300, 450, 300);
	}
		
	public void iniciarComponentes(){
		//Lista de opciones
		barListPane = new JPanel();
		barList = new JComboBox();
		barList.addItem("-------------------------------");
		barList.addItem("Peso a Dólar");
		barList.addItem("Peso a Euro");
		barList.addItem("Peso a Libra Esterlina");
		barList.addItem("Peso a Yen Japonés");
		barList.addItem("Peso a Won");
		barList.addItem("-------------------------------");
		barList.addItem("Dólar a Peso");
		barList.addItem("Euro a Peso");
		barList.addItem("Libra Esterlina a Peso");
		barList.addItem("Yen Japonés a Peso");
		barList.addItem("Won a Peso");
		barList.setBounds(0,0,250,150);
		barListPane.add(barList);
		panel.add(barListPane);
		
		//Campo para ingresar el numero\
		textfieldPane = new JPanel();
		textfield = new JTextField();
		textfield.setBounds(0,0,250,100);
		textfieldPane.add(textfield);
		panel.add(textfieldPane);
		
		//Boton convertir
		btnConvertirPane = new JPanel();
		btnConvertir = new JButton("Convertir");
		btnConvertir.setBounds(0, 0, 50, 50);
		btnConvertirPane.add(btnConvertir);
		panel.add(btnConvertirPane);
		
		//Boton atras
		btnAtrasPane = new JPanel();
		btnAtras = new JButton("Volver al menu");
		btnAtras.setBounds(0, 0, 50, 50);
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BtnAtrasActionPerformed(e, panel);
			}
		});
		btnAtrasPane.add(btnAtras);
		panel.add(btnAtrasPane);

		barListPane.setLocation(50,10);
		barListPane.setSize(300,30);
		textfieldPane.setLocation(50,50);
		textfieldPane.setSize(300,30);
		btnConvertirPane.setLocation(100,80);
		btnConvertirPane.setSize(200,35);
		btnAtrasPane.setLocation(100,120);
		btnAtrasPane.setSize(200,35);
		panel.getContentPane().add(barListPane);
		panel.getContentPane().add(textfieldPane);
		panel.getContentPane().add(btnConvertirPane);
		panel.getContentPane().add(btnAtrasPane);
		panel.setVisible(true);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorDivisa frame = new ConversorDivisa();
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
