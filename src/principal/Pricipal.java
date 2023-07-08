package principal;

import graficos.MarcoPrincipal;
import propiedades.*;


/**
 * 
 */
public class Pricipal {

	public static void main(String[] args) {
		
		/* Cargamos el idioma de la aplicacion */
		// TODO cargar por defecto desde conf.properties, insertar boton seleccion
		String idiomaActual = "es";
		//Cadenas cadenas = new Cadenas(idiomaActual);
		Conf config = new Conf();
		
		/* Mostramos ventana principal */
		//MarcoPrincipal marco = new MarcoPrincipal(cadenas);
		MarcoPrincipal marco = new MarcoPrincipal();
		marco.setVisible(true);
		
		
	}

}
