package Modelo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Esta clase pemite obtener una fecha especifica, la cual se podra emplear 
 * para calular el tiempo de demora o la edad del importador
 * 
 * @author Andrés Morales
 */
public class Fecha {
    
    private int Anio;
    private int Mes;
    private int Dia;
    private String Fecha;

    /**
     * Constructor parametrico el cual otorga a las variables de la clase datos 
     * previamente declarados de la Fecha
     * 
     * @param Anio
     * @param Mes
     * @param Dia
     * @param Hora
     * @param Minuto
     * @param Fecha
     */
    public Fecha(int Anio, int Mes, int Dia, int Hora, int Minuto, String Fecha) {
        this.Anio = Anio;
        this.Mes = Mes;
        this.Dia = Dia;
        this.Fecha = Fecha;
    }

    /**
     * Constructor que inicializa las variables de la clase con unos datos de
     * Fecha del 1 de Enero de 1900 , con hora 00:00
     */
    public Fecha() {
        this.Anio = 1900;
        this.Mes = 1;
        this.Dia = 1;
        this.Fecha = "";
    }

    /**
     * Funcion que retorna el año especificado para esta fecha
     * 
     * @return
     */
    public int getAnio() {
        return Anio;
    }

    /**
     * Permite establecer un año para esta fecha especifica
     * 
     * @param Anio
     */
    public void setAnio(int Anio) {
        this.Anio = Anio;
    }

    /**
     * Funcion que retorna el Mes especificado para esta fecha
     * 
     * @return int
     */
    public int getMes() {
        return Mes;
    }

    /**
     * Permite establecer un Mes para esta fecha especifica
     * 
     * @param Mes
     */
    public void setMes(int Mes) {
        this.Mes = Mes;
    }

    /**
     * Funcion que retorna el Dia especificado para esta fecha
     * @return
     */
    public int getDia() {
        return Dia;
    }

    /**
     * Permite establecer un Dia para esta fecha especifica
     * 
     * @param Dia
     */
    public void setDia(int Dia) {
        this.Dia = Dia;
    }

    

    /**
     * Funcion que retorna una cadena de caracteres, que podra ser empleada para mostrar en 
     * pantalla despues
     * 
     * @return
     */
    public String getFecha() {
        return Fecha;
    }

    /**
     * Permite establecer una cadena de caracteres especifica para luego 
     * mostrarse en pantalla
     * 
     * @param Fecha
     */
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    /**
     * Funcion, cuyo algoritmo es capaz de calcular la edad de una persona, 
     * tomando la fecha ingresada y la fecha actual del sistema
     */
    public void CalcularFecha()
    {   
        Calendar fecha = Calendar.getInstance();
        
        Anio = fecha.get(Calendar.YEAR) - Anio;
        Mes = fecha.get(Calendar.MONTH) - Mes+1;
        Dia = fecha.get(Calendar.DAY_OF_MONTH) - Dia;
        
         Fecha = String.valueOf(Anio) + " años";
        
        if (Mes<=0)
        {
            if (Mes==0)
            {
                if(Dia<0)
                {
                    Anio = Anio - 1;
                    Fecha = String.valueOf(Anio) + " años";
                }
            }
            
            else
            {
                    Anio = Anio - 1;
                    Fecha = String.valueOf(Anio) + " años";
            }
                
        }
        
        if (Anio<=0)
            Fecha = "Ingrese fecha valida";
    }
     
}
