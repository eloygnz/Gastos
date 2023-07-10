package graficos;

import java.awt.BorderLayout;
import java.util.*;


import javax.swing.JPanel;

import propiedades.Idioma;

public class ZonaBase extends JPanel{

	private static final long serialVersionUID = 1L;

	public ZonaBase(Idioma lang) {
		setLayout(new BorderLayout());
		GregorianCalendar fechaActual = new GregorianCalendar();
		ZonaCentro centro = new ZonaCentro(fechaActual);
		ZonaAlta cabecera = new ZonaAlta(fechaActual, lang);
		add(centro, BorderLayout.CENTER);
		add(cabecera, BorderLayout.NORTH);
		
	}
}
	
