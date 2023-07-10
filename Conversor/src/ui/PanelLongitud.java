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

public class PanelLongitud {
	private static JPanel panel_longitud = new JPanel();
	
	public static JPanel panel() {
		panel_longitud.setBounds(0,80,796,426);
		panel_longitud.setLayout(null);
		panel_longitud.setVisible(false);	
		
		JLabel lblTipoConversion = new JLabel("Longitud");
		lblTipoConversion.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipoConversion.setBounds(322, 95, 150, 40);
		lblTipoConversion.setBackground(Color.BLACK);
		lblTipoConversion.setForeground(Color.WHITE);
		lblTipoConversion.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_longitud.add(lblTipoConversion);
		
		JLabel lblConversorAlura = new JLabel("Conversor Alura");
		lblConversorAlura.setHorizontalAlignment(SwingConstants.CENTER);
		lblConversorAlura.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblConversorAlura.setForeground(Color.WHITE);
		lblConversorAlura.setBounds(287, 11, 205, 27);
		panel_longitud.add(lblConversorAlura);
		
		JTextField datoSalida;
		datoSalida = new JTextField();
		datoSalida.setHorizontalAlignment(SwingConstants.CENTER);
		datoSalida.setFont(new Font("Tahoma", Font.PLAIN, 15));
		datoSalida.setEditable(false);
		datoSalida.setColumns(10);
		datoSalida.setBounds(452, 223, 161, 27);
		datoSalida.setBackground(new Color(0,0,0,150));
		datoSalida.setForeground(Color.WHITE);
		panel_longitud.add(datoSalida);
		
		JTextField datoEntrada;
		datoEntrada = new JTextField();
		datoEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		datoEntrada.setFont(new Font("Tahoma", Font.PLAIN, 15));
		datoEntrada.setColumns(10);
		datoEntrada.setBounds(175, 223, 161, 27);
		datoEntrada.setBackground(new Color(0,0,0,150));
		datoEntrada.setForeground(Color.WHITE);
		panel_longitud.add(datoEntrada);
		
		JLabel lblArrowIco = new JLabel("");
		lblArrowIco.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblArrowIco.setHorizontalAlignment(SwingConstants.CENTER);
		lblArrowIco.setIcon(new ImageIcon("C:\\Users\\0x00034a5d\\Downloads\\"
				+ "UI Conversor ALura\\image.png"));
		lblArrowIco.setBounds(337, 158, 114, 92);
		panel_longitud.add(lblArrowIco);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.setBounds(337, 310, 114, 27);
		btnConvertir.setForeground(Color.WHITE);
		btnConvertir.setBackground(new Color(0,0,0,150));
		btnConvertir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_longitud.add(btnConvertir);
		
		JComboBox medidaEntrada = new JComboBox();
		medidaEntrada.setBounds(175, 158, 161, 27);
		medidaEntrada.setForeground(Color.WHITE);
		medidaEntrada.setBackground(new Color(0,0,0,150));
		medidaEntrada.addItem("Metro");
		medidaEntrada.addItem("Pulgada");
		medidaEntrada.addItem("Pie");
		medidaEntrada.addItem("Yarda");
		medidaEntrada.addItem("Milla");
		medidaEntrada.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_longitud.add(medidaEntrada);
		
		JComboBox medidaSalida = new JComboBox();
		medidaSalida.setBounds(452, 158, 161, 27);
		medidaSalida.setForeground(Color.WHITE);
		medidaSalida.setBackground(new Color(0,0,0,150));
		medidaSalida.addItem("Metro");
		medidaSalida.addItem("Pulgada");
		medidaSalida.addItem("Pie");
		medidaSalida.addItem("Yarda");
		medidaSalida.addItem("Milla");
		medidaSalida.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_longitud.add(medidaSalida);
		
		JLabel lblBackgroundImg = new JLabel("");
		lblBackgroundImg.setBounds(0, 0, 796, 426);
		lblBackgroundImg.setHorizontalAlignment(SwingConstants.CENTER);
		lblBackgroundImg.setLabelFor(lblTipoConversion);
		lblBackgroundImg.setIcon(new ImageIcon("C:\\Users\\0x00034a5d\\Downloads\\"
				+ "UI Conversor ALura\\"
				+ "longitud.png"));
		panel_longitud.add(lblBackgroundImg);
		
		return panel_longitud;
	}
}
