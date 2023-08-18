/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasepoo_01;

/**
 *
 * @author ESTUDIANTE
 */
public class Persona {
 
    //Atributos de la clase Persona.
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;

    //Creamos el constructor.
    public Persona(String nombre, String apellido, String dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    
    //Creamos otro constructor que se inicialice solamente 
    //con el atributo "nombre".
    public Persona(String nombre){
        this.nombre = nombre;
    }
    
    //Métodos setter.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Métodos getter.
    public String getNombre() {
        if(this.nombre == null)
            return "Sin nombre";
        return nombre;
    }
        
    public String getApellido() {
        if(this.apellido == null)
            return "Sin apellido";
        return apellido;
    }

    public String getDni() {
        if(this.dni == null)
            return "Sin DNI";
        return dni;
    }

    public int getEdad() {
        return edad;
    }
    
    //Método para imprimir en consola.
    public String setContenidoConsola(){
        return ("El nombre es: " + this.getNombre()
                + "\nEl apellido es: "  + this.getApellido()
                + "\nEl DNI es: " + this.getDni()
                + "\nLa edad es: " + this.getEdad()
                + "\n---------------------------------");
    }
    
}
