/*Paquete Exercises*/
package Exercises;


/*Clase Sobrecarga*/
public class Sobrecarga {

    String nombre;
    String materia;
    int calificacion;

    public Sobrecarga(String nombre, String materia, int calificacion) {
        this.nombre = nombre;
        this.materia = materia;
        this.calificacion = calificacion;
    }
    public String reprobar(){
        if (this.calificacion>5)
            return "true";
        else
            return "false";
            
    }

    /**
     * Profesor
     */
    class Profesor extends Sobrecarga{
        public Profesor(String nombre, String materia, int calificacion){
            super(nombre, materia, calificacion);
        }

        /*Se sobreescribe el metodo reprobar()*/
        @Override
        public String reprobar(){
            if(this.calificacion > 5)
                return ">:) Sacaste "+this.calificacion+" en " + this.materia;
            else
                return ":(";
        }
    }

    /**
     * Alumno
     */
    class Alumno extends Sobrecarga{
        public Alumno(String nombre, String materia, int calificacion){
            super(nombre, materia, calificacion);
        }
        /*Se sobreescribe el metodo reprobar()*/
        @Override
        public String reprobar(){
            if(this.calificacion < 6)
                return ":( ";
            else
                return ":)";
        }   
    }
}

