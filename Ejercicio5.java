import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cantidad, contadorMM, contadorHm, edad, sexo;

        contadorMM = 0;
        contadorHm = 0;

        System.out.println("Ingrese una cantidad de personas");
        cantidad = entrada.nextInt();

        for (int i = 1; i < cantidad ; i++) {

            System.out.println("Ingrese la edad");
            edad = entrada.nextInt();
            System.out.println("Ingrese sexo (1 = femenino, 0 = masculino)");
            sexo = entrada.nextInt();

            if (edad >= 18){
                if (sexo == 1){
                    contadorMM++;
                }
            } else{
                if (edad < 18){
                    if(sexo == 0){
                        contadorHm++;
                    }
                }
            }
        }

        System.out.println("Hay " + contadorMM + " mujeres mayores de edad y " + contadorHm + "hombres menores de edad.");
    }
}