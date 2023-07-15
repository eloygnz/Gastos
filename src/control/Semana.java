package control;


import propiedades.Idioma;

public class Semana {

	private Idioma lang;
	
	public Semana(Idioma idioma) {
		lang = idioma;
	}
	
	public String[] getDias() {
		
		String[] resultado = { lang.getProperty("Monday"),
				lang.getProperty("Tuesday"),
				lang.getProperty("Wednesday"),
				lang.getProperty("Thursday"),
				lang.getProperty("Friday"),
				lang.getProperty("Saturday"),
				lang.getProperty("Sunday")
							 };
		return(resultado);
				
		}
		
		
	
}
