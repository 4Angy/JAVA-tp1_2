import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Inserta el numero de ejercicio que quieres ver:");
        String ejnum = scanner.nextLine();

    switch (ejnum) {
        case "1":
                System.out.println("¿Cual es tu nombre?");
                String nombre = scanner.nextLine();
                System.out.println("¡¡Bienvenido/a " + nombre + "!!");
                break;
            //REVISARR PT.2 !!!!!!
        case "2":
                //JOptionPane jOptionPane = new JOptionPane(System.in);
                System.out.println("¿Cual es tu nombre?");
                String nomjO = new Scanner (System.in).nextLine();
                JOptionPane.showMessageDialog(null, "¡¡Bienvenido/a " + nomjO + "!!");
                break;
        case "3":
                int primerNum = 2;
                int segundoNum = 4;

                int multiplicacion = (primerNum * segundoNum);
                int suma = (primerNum + segundoNum);
                int resta = (segundoNum - primerNum);
                int division = (segundoNum / primerNum);
                int resto = (primerNum % segundoNum);

                System.out.println("Los numeros a calcular son " + primerNum + " " + segundoNum);
                System.out.println("Sumados son: " + suma);
                System.out.println("Restados (de manera entera) son: " + resta);
                System.out.println("Multiplicados son: " + multiplicacion);
                System.out.println("Divididos (de manera entera) son: " + division);
                System.out.println("Su resto al dividir (de manera entera) es: " + resto);
                break;

        case "4":
                //primera prueba
                int n1 = 2;
                int n2 = 4;
                //segunda prueba
                int n3 = 6;
                int n4 = 3;
                //tercera prueba
                int n5 = 9;

                //inicio primer prueba

                System.out.println("Los numeros son: " + n1 + " y " + n2);
                if (n1 < n2) {
                    System.out.println(n1 + " es menor a " + n2);
                } else if (n2 < n1) {
                    System.out.println(n1 + " es mayor a " + n2);
                } else System.out.println("Son iguales");

                //segunda prueba con distintos valores
                System.out.println("Los numeros son: " + n3 + " y " + n4);
                if (n3 < n4) {
                    System.out.println(n3 + " es menor a " + n4);
                } else if (n4 < n3) {
                    System.out.println(n3 + " es mayor a " + n4);
                } else {
                    System.out.println("Son iguales");
                }

                // tercera prueba con valores iguales
                System.out.println("Los numeros son: " + n5 + " y " + n5);
                if (n5 < n5) {
                    System.out.println(n5 + " es menor a " + n5);
                } else if (n5 < n5) {
                    System.out.println(n5 + " es mayor a " + n5);
                } else {
                    System.out.println("Son iguales");
                }
                break;
        case "5":
                System.out.println("Ingresa un numero para saber si es divisible por 2:");
                int num1 = scanner.nextInt();

                if (num1 % 2 == 0) {
                    System.out.println("El numero " + num1 + " es divisible por 2.");
                } else {
                    System.out.println("El numero " + num1 + " no es divisible por 2.");
                }
                break;
        case "6":

                System.out.println("Ingrese el precio para saber su costo con IVA");
                double precio = scanner.nextDouble();

                //calculo

                double total;

                double impuesto = ((21 * precio) / 100);
                total = (impuesto + precio);

                //mensaje en pantalla

                System.out.println("Su total con impuestos es de: " + total);
                break;

        case "7":
                int cuenta = 1;

                while (cuenta <= 100)
                    cuenta++;
                System.out.println(cuenta);
                break;

        case "8":

                for (int cuentaFor = 1; cuentaFor <= 100; cuentaFor++)
                    System.out.println(cuentaFor);
                break;

        case "9":
                int cuenta_2 = 1;
                while (cuenta_2 <= 100)
                    cuenta_2++;
                if (cuenta_2 % 2 == 0)
                    System.out.println(cuenta_2);
                else if (cuenta_2 % 3 == 0)
                    System.out.println(cuenta_2);
                break;

        case "10":
                int nro;
                do {
                    System.out.println("Ingrese un numero;");
                    nro = scanner.nextInt();
                } while (nro <= 0);
                System.out.println(nro);
                break;

        case "11":
                int intentos = 3;
                String contrasena = "1234";
                String contraUsuario;

                do {
                    System.out.println(" Ingrese la contraseña. " + intentos + " intentos restantes.");
                    contraUsuario = scanner.nextLine();
                    if (contraUsuario.equals(contrasena)) {
                        System.out.println("Acceso permitido");
                    } else {
                        intentos--;
                        if (intentos > 0) {
                            System.out.println("Incorrecto, " + intentos + " intentos restantes.");
                        } else {
                            System.out.println("Acceso denegado, 0 intentos restantes");
                        }
                    }
                } while (!contraUsuario.equals(contrasena) && intentos > 0);
                break;

        case "12":
                System.out.println("Ingrese un dia de la semana");
                String diaIngresado = scanner.nextLine().toLowerCase();
                switch (diaIngresado) {
                    case "lunes":
                        System.out.println("Dia laboral");
                        break;
                    case "martes":
                        System.out.println("Dia laboral");
                        break;
                    case "miercoles":
                        System.out.println("Dia laboral");
                        break;
                    case "jueves":
                        System.out.println("Dia laboral");
                        break;
                    case "viernes":
                        System.out.println("Dia laboral");
                        break;
                    case "sabado":
                        System.out.println("Dia no laboral");
                        break;
                    case "domingo":
                        System.out.println("Dia no laboral");
                        break;
                    default:
                        System.out.println("El texto ingresado no es un dia de la semana");
                }
                break;

        case "13":
                System.out.print("Ingrese un número: ");
                int numUser = Integer.parseInt(scanner.nextLine());
                if (numPrimo(numUser)) {
                    System.out.println(numUser + " es primo.");
                } else {
                    System.out.println(numUser + " no es primo.");
                }
                break;

            case "14":
                int numrandom = new Double(Math.random() * 100).intValue();
                int intentos_14 = 0;
                int adivinanza;
                System.out.println("Adivina el número entre 0 y 100.");
                do {
                    System.out.print("Introduce un número: ");
                    adivinanza = scanner.nextInt();
                    intentos_14++;
                    if (adivinanza < numrandom) {
                        System.out.println("El número debe ser mayor");
                    } else if (adivinanza > numrandom) {
                        System.out.println("El número debe ser menor");
                    }
                } while (adivinanza != numrandom);
                System.out.println("Número correcto!!.");
                System.out.println("Adivinaste en " + intentos_14 + " intentos.");
                break;

            default:
                System.out.println("Eso no es un ejercicio, intente de nuevo.");
                break;
    }
        scanner.close();
    }
    //funcion para ejercicio 13
    public static boolean numPrimo(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
