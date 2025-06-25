import paquete.Clase1; // usar clases que esten en paquetes

public class TestingModificadores {
    public static void main(String[] args){
        ClasePadre unPapa = new ClasePadre();
        ClaseHijo unHijo = new ClaseHijo();
        Clase1 objeto1 = new Clase1();
        System.out.println();
        System.out.println(unPapa.toString());
        
        unPapa.campo1 = 28; //Modificar el campo publico
        unPapa.setCampo2(-12); //Modificar el campo privado

        System.out.println(unPapa.toString());

        // comportamiento de campo privado y ´publico en el hijo
        unHijo.campo1 = 32; // campo publico heredado
        unHijo.setCampo2(-45); // campo heredado
        unHijo.setCampo3(12); // campo privado propio

        System.out.println(unHijo.toString());

        //Comportamiento de campos de una clase en un paquete
        objeto1.x = 56; // campo publico
        objeto1.setY(42); // campo privado
        // objeto1.z = 98; //no se puede accceder porque no esta en el mismo paquete y es tipo protected
        System.out.println(objeto1.toString());
    }
}