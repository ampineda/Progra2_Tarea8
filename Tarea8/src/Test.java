
public class Test {

    public static void main(String[] args) {

        Producto prod1 = new Producto(1,"BATERIA DE CARRO 300 WATS",1550.10);
        Producto prod2 = new Producto(2,"BATERIA DE CARRO 200 WATS",850.50);

        Alumno alum1 = new Alumno("2021-100","CARLOS RUIZ",21);
        Alumno alum2 = new Alumno("2021-200","FREDY GARCIA",27);

        System.out.println("COMPARANDO PRODUCTOS");
        System.out.println("El precio del producto: "+prod1.getNombre()+": "+prod1.getPrecio()+
                           " es igual que el precio del producto: "+prod2.getNombre()+": "+prod2.getPrecio()+"-------"+prod1.igualQue(prod2));
        System.out.println("El precio del producto: "+prod1.getNombre()+": "+prod1.getPrecio()+
                " es menor que el precio del producto: "+prod2.getNombre()+": "+prod2.getPrecio()+"-------"+prod1.menorQue(prod2));
        System.out.println("El precio del producto: "+prod1.getNombre()+": "+prod1.getPrecio()+
                " es menor o igual que el precio del producto: "+prod2.getNombre()+": "+prod2.getPrecio()+"-------"+prod1.menorIgualQue(prod2));
        System.out.println("El precio del producto: "+prod1.getNombre()+": "+prod1.getPrecio()+
                " es mayor que el precio del producto: "+prod2.getNombre()+": "+prod2.getPrecio()+"-------"+prod1.mayorQue(prod2));
        System.out.println("El precio del producto: "+prod1.getNombre()+": "+prod1.getPrecio()+
                " es mayor o igual que el precio del producto: "+prod2.getNombre()+": "+prod2.getPrecio()+"-------"+prod1.mayorIgual(prod2));

        System.out.println("");

        System.out.println("COMPARANDO ALUMNOS");
        System.out.println("La edad del alumno: "+alum1.getNombre()+": "+alum1.getEdad()+
                " años es igual que la edad del alumno: "+alum2.getNombre()+": "+alum2.getEdad()+" años -------"+alum1.igualQue(alum2));
        System.out.println("La edad del alumno: "+alum1.getNombre()+": "+alum1.getEdad()+
                " años es menor que la edad del alumno: "+alum2.getNombre()+": "+alum2.getEdad()+" años -------"+alum1.menorQue(alum2));
        System.out.println("La edad del alumno: "+alum1.getNombre()+": "+alum1.getEdad()+
                " años es menor o igual que la edad de alumno: "+alum2.getNombre()+": "+alum2.getEdad()+" años -------"+alum1.menorIgualQue(alum2));
        System.out.println("La edad del alumno: "+alum1.getNombre()+": "+alum1.getEdad()+
                " años es mayor que la edad del alumno: "+alum2.getNombre()+": "+alum2.getEdad()+" años -------"+alum1.mayorQue(alum2));
        System.out.println("La edad del alumno: "+alum1.getNombre()+": "+alum1.getEdad()+
                " años es mayor o igual que la edad del alumno: "+alum2.getNombre()+": "+alum2.getEdad()+" años -------"+alum1.mayorIgual(alum2));



    }

}
