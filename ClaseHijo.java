import paquete.Clase1; //import paquete.Clase3;

public class ClaseHijo extends ClasePadre{
    private int campo3;

    public int getCampo3 (){
        return this.campo3;
    }
       
    public void setCampo3 (int campo3){
        this.campo3 = campo3;
    }

    //modificara los campos de la clase padre
    public void setDataPadre() {
        this.campo1 = -50;
    //en este contexto sigifican lo mismo, porque no tengo un campo setcampo2 en esta clase 
    //que este sobreescribiendo al setcampo2 de la clase padre
    //para acceder a la clase heredada, aunq sea privada tenga que usar el set
        this.setCampo2(23); //super.setCampo2(23); setCampo2(23);
    }

    public void useClase1(){
        Clase1 objeto1 = new Clase1();
        objeto1.x = 15;
        objeto1.setY(13);
        // objeto1.z = 1;
        // objeto1.w = 20;
        // objeto1.restW();
    }

    @Override
    public String toString() {
        return super.toString() + "ClaseHijo [campo3=" + campo3 + "]";
    }


    
}
