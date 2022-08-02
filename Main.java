public class Main {
    public static void main(String[] args) {

        int numerolf = -10;
        int numeroWhile = 0;
        int numeroFor = 0;
        var estacion = "Invierno";

        if (numerolf >= 0){
            System.out.println("El numero es positivo++");}
             else
                 System.out.println("El numero es negativo--");

        while (numeroWhile < 3){
          numeroWhile++;
            System.out.println(numeroWhile);
        }

        do{
            numeroWhile++;}
        while (numeroWhile<3);
            System.out.println(numeroWhile);

        for (;numeroFor<=3; numeroFor++){
            System.out.println(numeroFor);}

        switch (estacion) {
            case "Verano":
                System.out.println("La estacion es Verano");
                break;
            case "Invierno":
                System.out.println("La estacion es Invierno");
                break;
            case "Otoño":
                System.out.println("La estacion es Otoño");
                break;
            case "Primavera":
                System.out.println("La estacion es Primavera");
                break;
            default:
                System.out.println("No se ingreso una estacion");
        }
        }}
