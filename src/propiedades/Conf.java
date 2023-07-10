package propiedades;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Conf extends Properties {

	private static final long serialVersionUID = 1L;
	String archivo = "resources/conf.properties";
	
	public Conf(){
		try {
			FileInputStream in = new FileInputStream(archivo);
        load(in);
		} catch (IOException ex) {
			System.out.println("Error al cargar configuracion");
		}	
	}
}
