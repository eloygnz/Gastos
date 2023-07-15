package graficos;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.swing.JPanel;

import control.Mes;
import propiedades.Conf;
import propiedades.Idioma;

public class ZonaAlta extends JPanel{

	private static final long serialVersionUID = 1L;
	private Conf config = new Conf();
	
	public ZonaAlta(GregorianCalendar fecha, Idioma lang) {
		//layouts
		JPanel base = new JPanel(new FlowLayout());
		JLabel etqMes =new JLabel(lang.getProperty("mes_actual"));
		JLabel etqAnyo = new JLabel(lang.getProperty("anyo_actual"));
		etqMes.setFont(new Font(config.getProperty("fuente_cabecera"), 
				Font.PLAIN, 
				Integer.parseInt(config.getProperty("tam_fuente_cabecera"))));
		etqAnyo.setFont(new Font(config.getProperty("fuente_cabecera"), 
				Font.PLAIN, 
				Integer.parseInt(config.getProperty("tam_fuente_cabecera"))));
		// Creo combo box para seleccionar el mes
		JComboBox<String> cbMes = new JComboBox<String>();
		
		//Lleno comboBox con meses del año
		String[] listaMeses = new Mes(lang).getMeses();
		for (String actual : listaMeses) {
			cbMes.addItem(actual);
		}
		// Selelciona mes actual
		cbMes.setSelectedIndex(fecha.get(Calendar.MONTH));
		
		
		// ComboBox para año
		JComboBox<Integer> cbYear = new JComboBox<Integer>() ;
		int min = Integer.parseInt(config.getProperty("min_year"));
		int max = Integer.parseInt(config.getProperty("max_year"));
		for (int year = min; year<=max; year++) {
			cbYear.addItem(year);
		}
		
		// Selecciono en el comboBox el año que marca la fecha actualmente
		String anyoActual = Integer.toString(fecha.get(Calendar.YEAR));
		String item;
		cbYear.getModel().setSelectedItem(fecha.get(Calendar.YEAR));
		for (int i = 0; i < cbMes.getItemCount(); i++){
            item = cbYear.getItemAt(i).toString();
            if (item.equalsIgnoreCase(anyoActual))
            {
                cbYear.setSelectedIndex(i);
                break;
            }
		}
		
		
		base.add(etqMes);
		base.add(cbMes);
		base.add(etqAnyo);
		base.add(cbYear);
		add(base);
		/*
		int cols = Integer.parseInt(config.getProperty("dias_fila"));
		JPanel diasSemana = new JPanel(new FlowLayout());
		JPanel botones = new JPanel(new GridLayout(0,cols));
		
		
		JLabel etqMes =new JLabel(lang.getProperty("mes_actual") + ": " + 
						   // Obtebgo mes en ingles y lo filtro en idioma
	                       lang.getProperty(fecha.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH)));
		
		JLabel etqAnyo = new JLabel(lang.getProperty("anyo_actual")+ ": " + fecha.get(Calendar.YEAR));
		
		
		String[] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		for (String string : dias) {
			//System.out.println(string);
			JLabel nueva = new JLabel(string);
			diasSemana.add(nueva);
		}
		
		//add(base);
		//base.add(botones, BorderLayout.NORTH);
		//base.add(diasSemana, BorderLayout.SOUTH);
		add(diasSemana);
		botones.add(etqMes);
		botones.add(etqAnyo);
		*/
	}
}
