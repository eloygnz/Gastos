package graficos;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import propiedades.Cadenas;
import propiedades.Idioma;

public class MarcoPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	
	// *********** VARIABLES  ***********//
	// Para tamaño de pantalla
	int altoPantalla = 0;
	int anchoPantalla = 0;
	
	// ********* FIN VARIABLES  *********//
	
	//public MarcoPrincipal(Cadenas cadenas){
	public MarcoPrincipal(){
		// Obtengo datos de resolucion de pantalla
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		altoPantalla  = screenSize.height;
		anchoPantalla = screenSize.width;
		Idioma id=new Idioma("es");
		//*************** Configuro marco para pantalla principal ***************//	
		setTitle(id.getProperty("titulo"));
		setSize(anchoPantalla, altoPantalla);
		
		
		/* Configuro cierre */
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
		
		
		/* Para botones redondos */
		try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }
		setDefaultLookAndFeelDecorated(true);
		
		
		/* Inserto zona base */
		zonaBase base = new zonaBase();
		add(base);
	}
}
