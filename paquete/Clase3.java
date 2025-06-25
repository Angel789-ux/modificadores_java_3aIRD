package paquete;

public class Clase3 {
    Clase1 objeto1 = new Clase1();

    public void setDataClase1(){
        objeto1.x = 10; // usando la variable publica de Clase1
        // solo si la variable x es estatica en Clase1
        // Clase1.x = 9;
        objeto1.w = 29; // aun que no hereda puede usar w
        objeto1.restW();
    }
}
