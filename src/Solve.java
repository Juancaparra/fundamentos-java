import java.util.Scanner;

public class Solve {

    public static void main(String[] arg) {
inicio();
    }
        public static void inicio() {
            Scanner scanner = new Scanner(System.in);
            String msj, msj1, msj2, msj3, msj4;
            int resp,resp1, resp2, resp3, resp4, cont;
    do{
        msj = "MENU DE OPCIONES\n";
        msj += "1. Casteo \n";
        msj += "2. Operadores de Asignación\n";
        msj += "3. Operadores de Incremento y Decremento\n";
        msj += "4. Ejercicios Combinados\n";
        msj += "SELECCIONE UNA OPCION";
        System.out.println(msj);
        resp = scanner.nextInt();
        switch (resp){
            case 1:
                msj1 = "MENU DE EJRCICIO DE CASTEO\n";
                msj1 += "1. ejercicio 1 \n";
                msj1 += "2. ejercicio 2\n";
                msj1 += "3. ejercicio 3\n";
                msj1 += "4. ejercicio 4\n";
                msj1 += "5. ejercicio 5\n";
                msj1 += "6. ejercicio 6\n";
                msj1 += "7. ejercicio 7\n";
                msj1 += "8. ejercicio 8\n";
                msj1 += "9. ejercicio 9\n";
                msj1 += "10. ejercicio 10\n";
                System.out.println(msj1);
                resp1 = scanner.nextInt();
                switch (resp1){
                    case 1:
                        System.out.println(Main.ejercicio1_1());
                        break;
                    case 2:
                        System.out.println(Main.ejercicio2_1());
                        break;
                    case 3:
                        System.out.println(Main.ejercicio3_1());
                        break;
                    case 4:
                        System.out.println(Main.ejercicio4_1());
                        break;
                    case 5:
                        System.out.println(Main.ejercicio5_1());
                        break;
                    case 6:
                        System.out.println(Main.ejercicio6_1());
                        break;
                    case 7:
                        System.out.println(Main.ejercicio7_1());
                        break;
                    case 8:
                        System.out.println(Main.ejercicio8_1());
                        break;
                    case 9:
                        System.out.println(Main.ejercicio9_1());
                        break;
                    case 10:
                        System.out.println(Main.ejercicio10_1());
                        break;
                }
                break;
            case 2:
                msj2 = "MENU DE EJRCICIO DE OPERADORES DE ASIGNACION\n";
                msj2+= "1. ejercicio 1 \n";
                msj2 += "2. ejercicio 2\n";
                msj2 += "3. ejercicio 3\n";
                msj2 += "4. ejercicio 4\n";
                msj2 += "5. ejercicio 5\n";
                System.out.println(msj2);
                resp2 = scanner.nextInt();
                switch (resp2){
                    case 1:
                        System.out.println(Main.ejercicio1_2());
                        break;
                    case 2:
                        System.out.println(Main.ejercicio2_2());
                        break;
                    case 3:
                        System.out.println(Main.ejercicio3_2());
                        break;
                    case 4:
                        System.out.println(Main.ejercicio4_2());
                        break;
                    case 5:
                        System.out.println(Main.ejercicio5_2());
                        break;
                }
                break;
            case 3:
                msj3 = "MENU DE EJRCICIO DE OPERADORES DE INCREMENTO Y DECREMENTO\n";
                msj3+= "1. ejercicio 1 \n";
                msj3 += "2. ejercicio 2\n";
                msj3 += "3. ejercicio 3\n";
                msj3 += "4. ejercicio 4\n";
                msj3 += "5. ejercicio 5\n";
                System.out.println(msj3);
                resp3 = scanner.nextInt();
                switch (resp3){
                    case 1:
                        System.out.println(Main.ejercicio1_3());
                        break;
                    case 2:
                        Main.ejercicio2_3();
                        break;
                    case 3:
                        System.out.println(Main.ejercicio3_3());
                        break;
                    case 4:
                        Main.ejercicio4_3();
                        break;
                    case 5:
                        System.out.println(Main.ejercicio5_3());
                        break;
                }
                break;
            case 4:
                msj4 = "MENU DE EJRCICIOS COMBINADOS\n";
                msj4 += "1. ejercicio 1 \n";
                msj4 += "2. ejercicio 2\n";
                msj4 += "3. ejercicio 3\n";
                msj4 += "4. ejercicio 4\n";
                msj4 += "5. ejercicio 5\n";
                msj4 += "6. ejercicio 6\n";
                msj4 += "7. ejercicio 7\n";
                msj4 += "8. ejercicio 8\n";
                msj4 += "9. ejercicio 9\n";
                msj4 += "10. ejercicio 10\n";
                System.out.println(msj4);
                resp4 = scanner.nextInt();
                switch (resp4){
                    case 1:
                        System.out.println(Main.ejercicio1_4());
                        break;
                    case 2:
                        System.out.println(Main.ejercicio2_4());
                        break;
                    case 3:
                        Main.ejercicio3_4();
                        break;
                    case 4:
                        System.out.println(Main.ejercicio4_4());
                        break;
                    case 5:
                        System.out.println(Main.ejercicio5_4());
                        break;
                    case 6:
                        System.out.println(Main.ejercicio6_4());
                        break;
                    case 7:
                        System.out.println(Main.ejercicio7_4());
                        break;
                    case 8:
                        System.out.println(Main.ejercicio8_4());
                        break;
                    case 9:
                        System.out.println(Main.ejercicio9_4());
                        break;
                    case 10:
                        System.out.println(Main.ejercicio10_4());
                        break;
                }
                break;
        }
        System.out.println("¿QUIERE CONTINUAR? si=1 no=2");
        cont = scanner.nextInt();
    } while(cont == 1);
    }
}