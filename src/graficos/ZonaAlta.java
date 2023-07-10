package graficos;

import javax.swing.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.swing.JPanel;

import propiedades.Idioma;

public class ZonaAlta extends JPanel{

	private static final long serialVersionUID = 1L;

	public ZonaAlta(GregorianCalendar fecha, Idioma lang) {
		JLabel etqMes =new JLabel(lang.getProperty("mes_actual") + ": " + 
						   // Obtebgo mes en ingles y lo filtro en idioma
	                       lang.getProperty(fecha.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH)));
		
		JLabel etqAnyo = new JLabel(lang.getProperty("anyo_actual")+ ": " + fecha.get(Calendar.YEAR));
		
		add(etqMes);
		add(etqAnyo);
	}
}
