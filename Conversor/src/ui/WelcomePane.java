package ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class WelcomePane {
	private static JPanel pane_bienvenida = new JPanel();
	
	public static JPanel pane() {
		pane_bienvenida.setBounds(0,80,796,426);
		pane_bienvenida.setLayout(null);
		pane_bienvenida.setVisible(true);
		
		JLabel lblBienvenido = new JLabel("Bienvenido");
		lblBienvenido.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblBienvenido.setForeground(new Color(255, 255, 255));
		lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenido.setBounds(0, 10, 796, 64);
		pane_bienvenida.add(lblBienvenido);
		
		JLabel lblDescripcion = new JLabel("<html><center>Challenge \"Conversor de unidades\" realizado en el programa Oracle Next Education (ONE)</center></html>");
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDescripcion.setForeground(new Color(255, 255, 255));
		lblDescripcion.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion.setBounds(118, 102, 564, 82);
		pane_bienvenida.add(lblDescripcion);
		
		JLabel lblDesarrollador = new JLabel("Desarrollado por Mathias Ledesma");
		lblDesarrollador.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDesarrollador.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesarrollador.setForeground(new Color(255, 255, 255));
		lblDesarrollador.setBounds(0, 284, 796, 34);
		pane_bienvenida.add(lblDesarrollador);
		
		JLabel lblAnno = new JLabel("2023");
		lblAnno.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAnno.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnno.setForeground(new Color(255, 255, 255));
		lblAnno.setBounds(0, 326, 796, 24);
		pane_bienvenida.add(lblAnno);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon("./resources/images/bienvenida.png"));
		lblBackground.setBounds(0, 0, 796, 421);
		pane_bienvenida.add(lblBackground);
		
		return pane_bienvenida;
	}
}
