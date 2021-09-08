
public class Producto implements Comparador {

    private int id;
    private String nombre;
    private double precio;

    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }


    public boolean igualQue(Object par1) {

        Producto a = (Producto)par1;

        return this.precio == a.precio;
    }

    public boolean menorQue(Object par1) {

        Producto a = (Producto)par1;

        return this.precio < a.precio;
    }

    public boolean menorIgualQue(Object par1) {

        Producto a = (Producto)par1;

        return this.precio <= a.precio;
    }

    public boolean mayorQue(Object par1) {

        Producto a = (Producto)par1;

        return this.precio > a.precio;
    }

    public boolean mayorIgual(Object par1) {

        Producto a = (Producto)par1;

        return this.precio >= a.precio;
    }

    public String getNombre(){
        return this.nombre;
    }

    public double getPrecio(){
        return this.precio;
    }


}
