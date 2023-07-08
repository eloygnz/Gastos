package propiedades;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Idioma extends Properties{

	private static final long serialVersionUID = 1L;

	private String archivo;
	public Idioma(String idioma) {
		switch(idioma){
        case "es":
        	archivo = "resources/espanol.properties";
        	
            break;
        case "en":
        	archivo = "resources/english.properties";
            break;
        default:
        	archivo = "resources/espanol.properties";
		}
		
		try {
			FileInputStream in = new FileInputStream(archivo);
	        load(in);
			} catch (IOException ex) {
				System.out.println("Error al cargar configuracion");
			}
	}
	
	
	/*
	private void getProperties(String idioma) {
        try {
        	FileInputStream in = new FileInputStream(idioma);
            load(in);
        } catch (IOException ex) {
        	System.out.println("Error al cargar archivo de idiomas");
        }
   }*/
	
}


