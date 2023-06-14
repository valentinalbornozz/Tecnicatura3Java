package domain;
public class Empleado {
    //Clase 4 
    protected String nombre;
    protected double sueldo;

    public Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    //Método para la sobreescritura
    public String obtenerDetalles(){
        return "Nombre: "+this.nombre+", sueldo: "+this.sueldo;
    }

    //Getters and Setters
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
