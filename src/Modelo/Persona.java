  package Modelo;

/**
 * Esta clase permite definir algunos de los atributos basicos de una persona natural
 * @author Andrés Morales
 */
public abstract class Persona {
    
    private String Nombre;
    private String Apellido;
    private Fecha Edad;
    private String Direccion;
    private int Telefono; /*Se puede haceruso en caso de que el producto no haya sido entregado */

    /**
     * Constructor que permite otrorgarle datos a los atributos basicos de una 
     * persona previamente declarados
     * @param Nombre
     * @param Apellido
     * @param Edad
     * @param Direccion
     * @param Telefono
     */
    public Persona(String Nombre, String Apellido, Fecha Edad, String Direccion, int Telefono) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
    }

    /**
     * Constructor sin parametros que permite incializar los atributos de la 
     * persona
     */
    public Persona() {
        this.Nombre = "";
        this.Apellido = "";
        this.Edad = new Fecha();
        this.Direccion = "";
        this.Telefono = 0;
    }

    /**
     * Funcion que retorna el nombre de la persona
     * @return
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Permite establecer un nombre a la persona
     * @param Nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * Funcion que retorna la edad de la persona, la cual se calcula mediante una funcion
     * @return
     */
    public Fecha getEdad() {
        return Edad;
    }

    /**
     * Permite establecer, mediante una funcion, el dato de la edad de la persona
     * @param Edad
     */
    public void setEdad(Fecha Edad) {
        this.Edad = Edad;
    }

    /**
     * Funcion que retorna la Direccion de residencia de la persona
     * @return
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * Permite establecer la Direccion de residencia de la persona
     * @param Direccion
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    /**
     * Funcion que retorna el telefono de Contacto de la persona
     * @return
     */
    public int getTelefono() {
        return Telefono;
    }

    /**
     * Permite establecer el telefono de contacto de la persona
     * @param Telefono
     */
    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    /**
     * Funcion que retorna el apellido de identificacion de la persona
     * @return
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * Permite establecer el dato del apellido de la persona
     * @param Apellido
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Edad=" + Edad.getFecha()+ ", Direccion=" + Direccion + ", Telefono=" + Telefono + '}';
    }
    
     
}
