import paquete.Clase1;

public class ClaseHijo extends ClasePadre {
    private int campo3;

    public int getCampo3(){
        return this.campo3;
    }

    public void setCampo3(int campo3){
        this.campo3 = campo3;
    }
    //modificar los campos de la clase padre
    public void setDataPadre(){
        this.campo1 = -56;
        // variable privada heredada
        this.setCampo2(23); // tambien se pueden hacer por los siguientes metodos - super.setCampo2(23); - setCampo2(48); y mas aparte indica por dado caso tenga el programa en este caso la clase hijo tuviera uno con el mismo nombre de la clase padre indica cual es el del ´padre y la del hijo
    }

    public void useClase1(){
        Clase1 objeto1 = new Clase1();
        objeto1.x = 15;
        objeto1.setY(14);
        // objeto.z = 9; protected
        // objeto.w = 49; default pero en otro paquete 
        // objeto.restW(); default pero en otro paquete
    }

    @Override
    public String toString() {
        return super.toString() + "ClaseHijo [campo3=" + campo3 + "]";
    }
    
}
