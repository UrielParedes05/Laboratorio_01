/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasepoo_01;

/**
 *
 * @author ESTUDIANTE
 */
public class ClasePOO_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre = "Juan";
        String apellido = "Perez";
        String dni = "0001111";
        
        //Creamos el objeto per1 con el 1er constructor.
        Persona per1 = new Persona(nombre, apellido, dni);
        
        //Modificamos el valor de edad a través del método setEdad
        per1.setEdad(17);
                
        System.out.println(per1.setContenidoConsola());
        
        //Creamos el objeto per2 con el 2do constructor.
        Persona per2 = new Persona("Mario");
        
        System.out.println(per2.setContenidoConsola());

        
    }
    
}
