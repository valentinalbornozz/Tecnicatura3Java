package test;

//Se importan los paquetes para su posterior uso
import paquete1.Clase1;
import paquete2.Clase3;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();
        System.out.println("clase1 = "+ clase1.atributoPublic);
        clase1.metodoPublico();

        //Se agrega una nueva clase
        Clase3 claseHija = new Clase3();
        System.out.println("claseHija = "+ claseHija); //Se imprime por pantalla

    }
}
