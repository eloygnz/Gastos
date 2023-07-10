package principal;

import graficos.MarcoPrincipal;
import propiedades.*;


/**
 * 
 */
public class Pricipal {

	public static void main(String[] args) {
		/* Cargo datos configuracion */
		Conf config = new Conf();
		/* Cargamos el idioma de la aplicacion */
		Idioma lang=new Idioma(config.getProperty("def_lang"));	
		
		/* Mostramos ventana principal */
		//MarcoPrincipal marco = new MarcoPrincipal(cadenas);
		MarcoPrincipal marco = new MarcoPrincipal(lang);
		marco.setVisible(true);
		
		
	}

}
