/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_8_heap;

/**
 *
 * @author Manuel Fernando Parra Gonzalez 12/09/2023
 */
public class EVA1_8_HEAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Persona perso = new Persona();
    Persona perso2 = new Persona("Juan","Perez", 50);
    
   // System.out.println("perso");
    //System.out.println("perso 2");
    perso = null; //BORRA EL OBJETO DE LA MEMORIA AL ELIMINAR LA DIRECCION EN EL STACK
    
    // ESTO NO ES UNA COPIA DE OBJETOS, ESTAMOS COPIANDO DIRECCIONES DE MEMORIA AL MISMI OBJETO
    //Persona copia = perso2;
    Persona copia = new Persona();
    copia.setNombre(perso2.getNombre());
    copia.setApellido(perso2.getApellido());
    copia.setEdad(perso2.getEdad());
    
    //COPIA MODIFICA EL MISMO OBJETO AL QUE APUNTA PERSO2
        copia.setNombre("asdasdsads");
        
        System.out.println(perso2.getNombre());
        System.out.println(perso2.getApellido());
        System.out.println(perso2.getEdad());
    
    //if (perso == perso2)
      //      System.out.println("Objetos iguales");
    //else
      //      System.out.println("Objetos distintos");
    // TODO code application logic here
        System.out.println(perso2);
        System.out.println(copia);
    }
}
    
class Persona{
    private String nombre;
    private String apellido;
    private int edad;

        public Persona() {
        }
   
        public Persona(String nombre, String apellido, int edad) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
    
}

