public class Alumno implements Comparador {

    private String carne;
    private String nombre;
    private int edad;

    public Alumno(String carne, String nombre, int edad) {
        this.carne = carne;
        this.nombre = nombre;
        this.edad = edad;
    }

    public boolean igualQue(Object par1) {

        Alumno a = (Alumno)par1;

        return this.edad == a.edad ;
    }

    public boolean menorQue(Object par1) {

        Alumno a = (Alumno)par1;

        return this.edad < a.edad;
    }

    public boolean menorIgualQue(Object par1) {

        Alumno a = (Alumno)par1;

        return this.edad <= a.edad;
    }

    public boolean mayorQue(Object par1) {

        Alumno a = (Alumno)par1;

        return this.edad > a.edad;
    }

    public boolean mayorIgual(Object par1) {

        Alumno a = (Alumno)par1;

        return this.edad >= a.edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

}
