package ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelVolumen {
private static JPanel panel_volumen = new JPanel();
	
	public static JPanel panel() {
		panel_volumen.setBounds(0,80,796,426);
		panel_volumen.setLayout(null);
		panel_volumen.setVisible(false);	
		
		JLabel lblTipoConversion = new JLabel("Volumen");
		lblTipoConversion.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipoConversion.setBounds(322, 95, 150, 40);
		lblTipoConversion.setBackground(Color.BLACK);
		lblTipoConversion.setForeground(Color.WHITE);
		lblTipoConversion.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_volumen.add(lblTipoConversion);
		
		JLabel lblConversorAlura = new JLabel("Conversor Alura");
		lblConversorAlura.setHorizontalAlignment(SwingConstants.CENTER);
		lblConversorAlura.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblConversorAlura.setForeground(Color.WHITE);
		lblConversorAlura.setBounds(287, 11, 205, 27);
		panel_volumen.add(lblConversorAlura);
		
		JTextField datoSalida;
		datoSalida = new JTextField();
		datoSalida.setHorizontalAlignment(SwingConstants.CENTER);
		datoSalida.setFont(new Font("Tahoma", Font.PLAIN, 15));
		datoSalida.setEditable(false);
		datoSalida.setColumns(10);
		datoSalida.setBounds(452, 223, 161, 27);
		datoSalida.setBackground(new Color(0,0,0,150));
		datoSalida.setForeground(Color.WHITE);
		panel_volumen.add(datoSalida);
		
		JTextField datoEntrada;
		datoEntrada = new JTextField();
		datoEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		datoEntrada.setFont(new Font("Tahoma", Font.PLAIN, 15));
		datoEntrada.setColumns(10);
		datoEntrada.setBounds(175, 223, 161, 27);
		datoEntrada.setBackground(new Color(0,0,0,150));
		datoEntrada.setForeground(Color.WHITE);
		panel_volumen.add(datoEntrada);
		
		JLabel lblArrowIco = new JLabel("");
		lblArrowIco.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblArrowIco.setHorizontalAlignment(SwingConstants.CENTER);
		lblArrowIco.setIcon(new ImageIcon("C:\\Users\\0x00034a5d\\Downloads\\"
				+ "UI Conversor ALura\\image.png"));
		lblArrowIco.setBounds(337, 158, 114, 92);
		panel_volumen.add(lblArrowIco);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.setBounds(337, 310, 114, 27);
		btnConvertir.setForeground(Color.WHITE);
		btnConvertir.setBackground(new Color(0,0,0,150));
		btnConvertir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_volumen.add(btnConvertir);
		
		JComboBox medidaEntrada = new JComboBox();
		medidaEntrada.setBounds(175, 158, 161, 27);
		medidaEntrada.setForeground(Color.WHITE);
		medidaEntrada.setBackground(new Color(0,0,0,150));
		medidaEntrada.addItem("Litro");
		medidaEntrada.addItem("Galon");
		medidaEntrada.addItem("Cuarto");
		medidaEntrada.addItem("Pie Cubico");
		medidaEntrada.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_volumen.add(medidaEntrada);
		
		JComboBox medidaSalida = new JComboBox();
		medidaSalida.setBounds(452, 158, 161, 27);
		medidaSalida.setForeground(Color.WHITE);
		medidaSalida.setBackground(new Color(0,0,0,150));
		medidaSalida.addItem("Litro");
		medidaSalida.addItem("Galon");
		medidaSalida.addItem("Cuarto");
		medidaSalida.addItem("Pie Cubico");
		medidaSalida.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_volumen.add(medidaSalida);
		
		JLabel lblBackgroundImg = new JLabel("");
		lblBackgroundImg.setBounds(0, 0, 796, 426);
		lblBackgroundImg.setHorizontalAlignment(SwingConstants.CENTER);
		lblBackgroundImg.setLabelFor(lblTipoConversion);
		lblBackgroundImg.setIcon(new ImageIcon("C:\\Users\\0x00034a5d\\Downloads\\"
				+ "UI Conversor ALura\\"
				+ "volumen.png"));
		panel_volumen.add(lblBackgroundImg);
		
		return panel_volumen;
	}
}
