public class Main {
    public static void main(String[] args) {
        suma(10, 10,20);
        Coche miCoche = new Coche();
        System.out.println(miCoche.sumarPuertas());
    }

    public static void suma(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}

class Coche {
    private int numPuertas = 0;
    public int sumarPuertas() {
        this.numPuertas = this.numPuertas + 1;
        return  this.numPuertas;
    }
}

