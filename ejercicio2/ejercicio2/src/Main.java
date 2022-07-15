public class Main {
    public static void main(String[] args) {
        var numeroIf = 19;
        if(numeroIf == 0) {
            System.out.println("el número es un cero");
        }else if (numeroIf < 0) {
            System.out.println("el número es negativo");
        }else {
            System.out.println("el número es positivo");
        }

        var numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        numeroWhile = 0;
        do {
            numeroWhile++;
        }while (numeroWhile == 1);{
            System.out.println(numeroWhile);
        }

        var numeroFor = 0;
        for(;numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        var estacion = "verano";
        switch (estacion) {
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                 break;
            case "verano":
                System.out.println("Estamos en verano");
                break;
            default:System.out.println("se ha pasado el año");
        }

    }

}