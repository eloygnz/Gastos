package control;

import propiedades.Idioma;

public class Mes {

	private Idioma lang;
	
	public Mes(Idioma idioma) {
		lang = idioma;
	}
	
	public String[] getMeses() {
		String[] resultado = { lang.getProperty("January"),
				lang.getProperty("February"),
				lang.getProperty("March"),
				lang.getProperty("April"),
				lang.getProperty("May"),
				lang.getProperty("June"),
				lang.getProperty("July"),
				lang.getProperty("August"),
				lang.getProperty("September"),
				lang.getProperty("October"),
				lang.getProperty("Novenmber"),
				lang.getProperty("December")
				
							 };
		return(resultado);
	}
}
