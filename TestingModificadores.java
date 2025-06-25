import paquete.Clase1;//asi importas clases que estan en otros paquetes

public class TestingModificadores {
    public static void main(String[] args) {
        ClasePadre unPapa = new ClasePadre();
        ClaseHijo  unHijo = new ClaseHijo();
        Clase1 objeto1 = new Clase1();
        System.out.println("\n"+unPapa.toString());
        //unPapa.setDatos(); una vez que hay set y get no es util
        //System.out.println("\n"+unPapa.toString());

        //modificar el campo publico
        unPapa.campo1 = 28;
        unPapa.setCampo2(-12);
        System.out.println(unPapa.toString());
        //el echo de que iuna variable sea privada es para que la privacidad del dato se respete y no cualquiera pueda nodificarla
        //como puedo moddificar un campo privado. solo creandole un set
        //que pasa si ponemos privado a una clase?. es ilegal, inutil

        //comportamiento de clampo privado y publico en el hijo
        
        unHijo.campo1 = 32; //unHijo es un objeto de la clse padre puede usar campo1 como si fuera suyo
        unHijo.setCampo2(-45);
        unHijo.setCampo3(32);
        System.out.println("\n"+unHijo.toString());

        //comportamiento dde campos de una clase en un paquete 
        objeto1.x = 56;
        objeto1.setY(42);
        //objeto1.z = 98; no se puede acceder porque no esta en el mismo paquete y es tipo protect
        System.out.println("\n"+objeto1.toString());  
          
    }
}
