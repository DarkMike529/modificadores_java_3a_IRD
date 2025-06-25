package paquete;

public class Clase3 {
    Clase1 objeto1 = new Clase1();
    
    public void setDataClase1(){
        objeto1.x = 10;//usando la var. publica de clase 1
        //Solo si la variable x es static en la clase origen
        //Clase1.x = 9;
        objeto1.w = 29;
        objeto1.restW();
        //

    }
}
