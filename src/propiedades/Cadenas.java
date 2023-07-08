package propiedades;


public class Cadenas {
	String archivos;
	String saludo;
	String titulo;
	
	public Cadenas(String lang){
		
		Idioma idioma = new Idioma(lang);
		archivos = idioma.getProperty("archivos");
		saludo = idioma.getProperty("saludo");
		titulo = idioma.getProperty("titulo");
		
	}
	
	
	public String getArchivos(){
		return archivos;
	}
	
	public String getSaludo(){
		return saludo;
	}
	
	public String getTitulo(){
		return titulo;
	}
}
