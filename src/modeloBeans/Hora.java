
package modeloBeans;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Paulo Baltazar
 */
public class Hora {
    public String hora;
    SimpleDateFormat horaFormatada=new SimpleDateFormat("HH:mm:ss");
    
    public void ler_hora(){
        Date horaAtual= new Date();
        hora=horaFormatada.format(horaAtual);
    }
}
