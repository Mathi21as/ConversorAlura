package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class Menu extends JFrame {

	private ConversorDivisa conversorDivisa;
	private ConversorTemperatura conversorTemperatura;
	private ConversorByte conversorByte;
	private JFrame panel;
	private JPanel descripcionPane, listaConversionesPane;
	private JTextField descripcion;
	private Font descripcionFont;
	private JComboBox listaConversiones;
	
	public void setVisiblePanel(boolean visible){
		this.panel.setVisible(visible);
	}

	private void divisaActionPerformed(java.awt.event.ActionEvent evt) {
		this.setVisible(false);
		conversorDivisa = new ConversorDivisa();
		conversorDivisa.setVisiblePanel(true);
	}
	
	private void tempActionPerformed(java.awt.event.ActionEvent evt) {
		this.setVisible(false);
		conversorTemperatura = new ConversorTemperatura();
		conversorTemperatura.setVisible(true);
	}
	
	private void bitActionPerformed(java.awt.event.ActionEvent evt) {
		this.setVisible(false);
		conversorByte = new ConversorByte();
		conversorByte.setVisible(true);
	}
	
	/**
	 * Create the frame.
	 */
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 300, 400, 200);
		panel = new JFrame();
		panel.setVisible(false);
		panel.setSize(400, 200);
		
		this.iniciarComponentes();
		
		

		
	}
	
	public void iniciarComponentes() {
		//descripcion
		descripcionPane = new JPanel();
		descripcion = new JTextField("¿Que desea convertir?");
		descripcionFont = new Font(
			descripcion.getFont().getName(),
			descripcion.getFont().getStyle(),
			20);
		descripcion.setEditable(false);
		descripcion.setBackground(getBackground());
		descripcion.setBorder(null);
		descripcion.setFont(descripcionFont);
		descripcion.setSize(400,40);
		descripcionPane.add(descripcion);
		descripcionPane.setLocation(100,10);
		descripcionPane.setSize(200,30);
		panel.add(descripcionPane);
		
		//Lista conversiones
		listaConversionesPane = new JPanel();
		listaConversiones = new JComboBox();
		listaConversiones.addItem("Divisa");
		listaConversiones.addItem("Temperatura");
		listaConversiones.addItem("Bit");
		listaConversionesPane.add(listaConversiones);
		listaConversionesPane.setLocation(100,150);
		listaConversionesPane.setSize(400,30);
		panel.add(listaConversionesPane);
		
		panel.getContentPane().add(descripcionPane);
		panel.getContentPane().add(listaConversionesPane);
		
		panel.setVisible(true);
		
	}
	
	/**
	 * Launch the application.
	 */


}
