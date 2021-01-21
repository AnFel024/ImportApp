/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.io.*;
import javax.swing.JOptionPane;
//import java.util.StringTokenizer;

/**
 * Clase que permite la conexion entre un archivo fuera del programa y el mismo, 
 * esto para mantener los datos de las empresas existentes 
 * @author Andrés
 */
public class Conexion {

    protected BufferedReader ent ;
    protected FileReader archLee;
    protected FileWriter archEscr;
    protected PrintWriter sal;
        
    /**
     * Constuctor
     * @param archivo
     * @throws IOException
     */
    public Conexion(String archivo) throws IOException  {

        archLee = new FileReader(archivo);
        archEscr = new FileWriter(archivo,true);
    }

    /**
     * Constructor basico que permite inicializar los atributos de conexion
     * de la clase
     * @throws IOException
     */
    public Conexion() throws IOException  {

        archLee = null;
        archEscr = null;
    }

    /**
     * Funcion que permite analizar los datos del archivo exterior al promrama
     * @return
     * @throws IOException
     */
    public String leerDatos() throws IOException
    { 	
        archLee = new FileReader("Empresas.txt");

            ent = new BufferedReader(archLee);
            String datos = "";
            String lineaa = this.ent.readLine();

            while (lineaa != null) 
            {
                datos+=lineaa+"\n";
                lineaa = ent.readLine();
            }

       ent.close();

       return datos;

    }
    
    /**
     * Funcion que permite borrar una linea de datos del archivo existente
     * @param lineABorrar
     * @throws IOException
     */
    public void borrarDatos(String lineABorrar) throws IOException
    { 	       
       try {
            File Actual = new File("Empresas.txt");
            File Temp = new File(Actual.getAbsolutePath() + ".tmp");
            BufferedReader NuevoArchivo = new BufferedReader(new FileReader("Empresas.txt"));
            PrintWriter Archivo = new PrintWriter(new FileWriter(Temp));
            String linea ;
            
            while ((linea = NuevoArchivo.readLine()) != null) {
                if (!linea.trim().contains(lineABorrar)) {
                    Archivo.println(linea);
                    Archivo.flush();
                }
            }
            Archivo.close();
            NuevoArchivo.close();
 
            
            if (!Actual.delete()) {
                JOptionPane.showMessageDialog(null, "Error al borrar el Archivo Actual");
                return;
            }
            
            if (!Temp.renameTo(Actual))
                JOptionPane.showMessageDialog(null, "Error al renombrarel Archivo Actual");
 
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    /**
     * Funcion que permite sobreescribir un archivo con nuevos datos
     * @param datos
     * @throws IOException
     */
    public void EscribeDatos(String datos) throws IOException
    {
       archEscr=new FileWriter("Empresas.txt",true);
       sal = new PrintWriter(archEscr);
       sal.println(datos);
       sal.close();

    }
}