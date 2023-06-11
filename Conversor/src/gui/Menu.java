package gui;

import java.awt.Color;
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
	private JPanel btnOkPane, btnCancelPane;
	private JButton btnOk, btnCancel;
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
	
	private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {
		String opcion = this.listaConversiones.getSelectedItem() + "";
		
		switch(opcion) {
			case "Divisa": {
				this.panel.setVisible(false);
				conversorDivisa = new ConversorDivisa();
				conversorDivisa.setVisiblePanel(true);
			}
				break;
			
			case "Temperatura": {
				this.panel.setVisible(false);
				conversorTemperatura = new ConversorTemperatura();
				conversorTemperatura.setVisible(true);
			}
				break;
				
			case "Bit": {
				this.panel.setVisible(false);
				conversorByte = new ConversorByte();
				conversorByte.setVisible(true);
			}
				break;
			
			default: System.out.println("Opcion no valida por alguna razon porque al estar las opciones establecidas no se puede ingresar una opcion no valida");
		}
	}
	
	private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0);
	}
	
	/**
	 * Create the frame.
	 */
	public Menu() {
		panel = new JFrame("Conversor Alura");
		panel.setBounds(500, 300, 0, 0);
		panel.setVisible(false);
		panel.setSize(400, 175);
		panel.setResizable(false);
	    panel.setLayout(null);
		this.iniciarComponentes();
        panel.setDefaultCloseOperation(EXIT_ON_CLOSE);
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
		descripcionPane.setSize(200,35);
		
		
		//Lista conversiones
		listaConversionesPane = new JPanel();
		listaConversiones = new JComboBox();
		listaConversiones.addItem("Divisa");
		listaConversiones.addItem("Temperatura");
		listaConversiones.addItem("Bit");
		listaConversiones.setSize(listaConversionesPane.getSize());
		listaConversionesPane.add(listaConversiones);
		listaConversionesPane.setLocation(100,45);
		listaConversionesPane.setSize(200,35);
		
		//Boton OK
		btnOkPane = new JPanel();
		btnOk = new JButton("Ok");
		btnOk.setSize(15,15);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnOkActionPerformed(e);
			}
		});
		btnOkPane.add(btnOk);
		btnOkPane.setSize(90,40);
		btnOkPane.setLocation(100,85);
		
		//Boton Cancelar
		btnCancelPane = new JPanel();
		btnCancel = new JButton("Cancelar");
		btnCancel.setSize(15,15);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCancelActionPerformed(e);
			}
		});
		btnCancelPane.add(btnCancel);
		btnCancelPane.setSize(90,40);
		btnCancelPane.setLocation(200,85);
		
		panel.getContentPane().add(descripcionPane);
		panel.getContentPane().add(listaConversionesPane);
		panel.getContentPane().add(btnOkPane);
		panel.getContentPane().add(btnCancelPane);
		
		panel.setVisible(true);
		
	}
	
	/**
	 * Launch the application.
	 */


}
