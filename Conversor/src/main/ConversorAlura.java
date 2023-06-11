package main;

import java.awt.EventQueue;

import gui.Menu;

/**
 * 
 * @author Mathias Ledesma
 * @version 1.0.0
 *
 */

public class ConversorAlura {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisiblePanel(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
