package graficos;

import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JButton;
import javax.swing.JPanel;
import propiedades.Conf;

public class ZonaCentro extends JPanel{
	private static final long serialVersionUID = 1L;
	// Obtengo datos del archivo de configuracion
	Conf conf = new Conf();
	int diasPorFila = Integer.parseInt(conf.getProperty("dias_fila"));
	int hgap = Integer.parseInt(conf.getProperty("hgap"));	
	int vgap = Integer.parseInt(conf.getProperty("vgap"));
	int dias;
	
	
	public ZonaCentro(GregorianCalendar fecha) {
		/*  PRUEBA */
		//fecha.set(Calendar.YEAR , 2024);  	// es bisiesto
		//fecha.set(Calendar.MONTH , 1); 
		/*         */
		
		// Configuro layout
		setLayout(new GridLayout(0, diasPorFila,hgap,vgap));
		// Calculo maximo de dias de el mes
		dias = maximoDias(fecha);
		// Calculo de la semana del dia 1 del mes para saltar 
		// los huecos que corresponda
		Calendar dia_1 = fecha;
		dia_1.set(fecha.get(Calendar.YEAR), fecha.get(Calendar.MONTH),1);
		int saltos = calculaSaltos(dia_1);
		
		// Inserto huecos
		for (int i = 0; i<saltos;i++){
			JButton nuevo = new JButton("");
			nuevo.setVisible(false);
			add(nuevo);
		}
		
		// Inserto botones con dias
		for (int i =1 ; i<=dias; i++) {
			add(new JButton( "<html>"+i +"<br>"+"Gastado"+"</html>"));
		}	
	}



	/**
	 * Calcula cuantas casillas se deben saltar en funcion del
	 * dia de la semana que sea el dia 1 del mes en que estamos
	 * trabajando
	 * @param dia . Dia uno del mes
	 * @return Número de saltos desde lunes que debe dar
	 */
	private int calculaSaltos(Calendar dia) {
		int resultado = 0;
		
		int leido = dia.get(Calendar.DAY_OF_WEEK);
		if (leido == 1) { // Es domingo, salto 6 veces
			resultado = 6;
		}else {// Los demas dias se pueden calcular restando 2
			resultado = leido - 2;		
		}		
		return resultado;
	}
	
	/**
	* Devuelve el número de dias del mes (número) pasado por parámetro
	* Si es Febrero tiene en cuenta si este año es bisiesto o no
	* Empieza por 1
	* @param mes Mes que queremos saber el número de días
	* @return Número de días de ese mes
	*/
	private int maximoDias(GregorianCalendar actual) {
		int resultado = 31;
		int mesActual = actual.get(Calendar.MONTH)+1;
		
		if (mesActual == 2 && actual.isLeapYear(actual.get(Calendar.YEAR))) {
			// Es febrero y año bisiesto
			resultado = 29;
		}else {
			// Si es febrero no entra en switch
			resultado = 28;
		}
		
		// Cambia resultado si no es febrero
		switch(mesActual){
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            resultado=31;
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            resultado=30;
            break;
		}
		return resultado;
	}
		

}