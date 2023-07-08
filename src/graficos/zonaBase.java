package graficos;

import java.awt.BorderLayout;
import java.util.*;


import javax.swing.JPanel;

public class zonaBase extends JPanel{

	public zonaBase() {
		setLayout(new BorderLayout());
		GregorianCalendar fechaActual = new GregorianCalendar();
		zonaCentro centro = new zonaCentro(fechaActual);
		
		add(centro, BorderLayout.CENTER);
		
	}
}
	
