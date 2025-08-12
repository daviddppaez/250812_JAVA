package MARTES_JAVA;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Actividad inicial: Comparadores
        System.out.println("Comparadores");
        System.out.println(100 == 100);
        System.out.println(100 != 100);
        System.out.println(100 > 100);
        System.out.println(100 >= 100);
        System.out.println(100 < 100);
        System.out.println(100 <= 100);

        // Actividad inicial: Lógicos
        System.out.println("Lógicos");
        System.out.println(100 > 10 && 50 > 5);
        System.out.println(100 > 10 || 50 < 5);
        System.out.println(!true);
        System.out.println(!(5==5));

        // Actividad Guía: IMC
        Scanner scanner = new Scanner(System.in);
        System.out.println("====== Primera Actividad ======");
        System.out.println("IMC: Altura en metros");
        double genAltura = scanner.nextDouble(); //
        scanner.nextLine();
        System.out.println("IMC: Peso en kilogramos");
        double genPeso = scanner.nextDouble(); //
        scanner.nextLine();
        double genResultado = genPeso / (genAltura * genAltura);
        int genRedondeado = (int) genResultado;
            if (genResultado >= 30) {
                System.out.println("IMC, Obesidad: " + genResultado);
                System.out.println("Resultado entero: " + genRedondeado);
            } else if (genResultado >= 25) {
                System.out.println("IMC, Sobrepeso: " + genResultado);
                System.out.println("Resultado entero: " + genRedondeado);
            } else if (genResultado >= 18.5) {
                System.out.println("IMC, Normal: " + genResultado);
                System.out.println("Resultado entero: " + genRedondeado);
            } else {
                System.out.println("IMC, Bajo peso: " + genResultado);
                System.out.println("Resultado entero: " + genRedondeado);
            }

        // Actividad Guía: Edad Mayor
        System.out.println("====== Segunda Actividad ======");
        System.out.println("Edad: Primer Participante");
        int genPrimero = scanner.nextInt(); //
        scanner.nextLine();
        System.out.println("Edad: Segundo Participante");
        int genSegundo = scanner.nextInt(); //
        scanner.nextLine();
            if (genPrimero > genSegundo) {
                System.out.println("El primer participante es mayor");
            } else if (genPrimero < genSegundo) {
                System.out.println("El segundo participante es mayor");
            } else {
                System.out.println("Ambas edades son iguales");
            }

        // Actividad Guía: Evento
        System.out.println("====== Tercera Actividad ======");
        System.out.println("(Evento) Edad: Primer Participante");
        int genEvento1 = scanner.nextInt(); //
        scanner.nextLine();
        System.out.println("(Evento) Edad: Segundo Participante");
        int genEvento2 = scanner.nextInt(); //
        scanner.nextLine();
        // Primer "if": Mayoría de edad
            if (genEvento1 >= 18 && genEvento2 >= 18) {
                System.out.println("Ambos son mayores de edad");
            } else {
                System.out.println("Alguien no es mayor de edad");
            }
        // Segundo "if": Límite de edad
            if (genEvento1 <= 30 && genEvento2 <= 30) {
                System.out.println("Ambos son menores de 30 años");
            } else {
                System.out.println("Alguien es mayor de 30 años");
            }
        // Tercer "if": Alguna persona mayor de 50
        if (genEvento1 >= 50 || genEvento2 >= 50) {
            System.out.println("Alguien es mayor de 50 años");
        } else {
            System.out.println("Ninguno es mayor de 50 años");
        }
    }
}
