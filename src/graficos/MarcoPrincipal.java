package graficos;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import propiedades.Conf;
import propiedades.Idioma;

public class MarcoPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	
	// *********** VARIABLES  ***********//
	// Para tamaño de pantalla
	int altoPantalla = 0;
	int anchoPantalla = 0;
	Conf config = new Conf();
	
	// ********* FIN VARIABLES  *********//
	
	//public MarcoPrincipal(Cadenas cadenas){
	public MarcoPrincipal(Idioma lang){
		// Obtengo datos de resolucion de pantalla
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		altoPantalla  = screenSize.height;
		anchoPantalla = screenSize.width;
		
		//*************** Configuro marco para pantalla principal ***************//	
		setTitle(lang.getProperty("titulo"));
		setSize(anchoPantalla, altoPantalla);
		
		
		/* Configuro cierre */
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
		
		
		/* Cambio aspecto de botones */
		try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (config.getProperty("btn_aspect").equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                }
            }
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null,"Error configurando aspecto de ventana"); 
        }
		setDefaultLookAndFeelDecorated(true);
		
		
		/* Inserto zona base */
		ZonaBase base = new ZonaBase(lang);
		add(base);
	}
}
