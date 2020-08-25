package blackjack1;

import java.util.Scanner;

public class Blackjack1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean yes = true;
        while (yes == true) {
            int i, valor, suma = 0, sumaneta, c = 0, numA = 0, valoresA,
                    valor1A = 0, valor2A = 0, valor3A = 0, valor4A = 0,
                    suma2 = 0, g = 0;
            String op;
            boolean x = true, repetido = false;
            int[] valorescartas = new int[2];
            String[] cartas = new String[2];
            String[] baraja = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "2",
                "3", "4", "5", "6", "7", "8", "9", "10", "2", "3", "4", "5", "6",
                "7", "8", "9", "10", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "J", "Q", "K", "J", "Q", "K", "J", "Q", "K", "J", "Q", "K", "A", "A",
                "A", "A"};
            int[] repetidos = new int[10];
            int[] repetidos2 = new int[10];
            while (suma < 17) {
                c = c + 1;
                sumaneta = 0;
                valor = 0;
                valoresA = 0;
                i = (int) (Math.random() * 51);
                switch (baraja[i]) {
                    case "2":
                        valor = 2;
                        break;
                    case "3":
                        valor = 3;
                        break;
                    case "4":
                        valor = 4;
                        break;
                    case "5":
                        valor = 5;
                        break;
                    case "6":
                        valor = 6;
                        break;
                    case "7":
                        valor = 7;
                        break;
                    case "8":
                        valor = 8;
                        break;
                    case "9":
                        valor = 9;
                        break;
                    case "10":
                    case "J":
                    case "Q":
                    case "K":
                        valor = 10;
                        break;
                    default:
                        break;
                }
                repetidos[g] = i;
                if (g >= 1) {
                    for (int h = 0; h <= g - 1; h++) {
                        if (repetidos[h] == i) {
                            repetido = true;
                            /*if (repetido==true) {
                                c=c-1;
                    		}*/
                        }
                    }
                    if (repetido == false) {
                        //if (c==1){
                        System.out.println("La carta numero " + c + " es: " + baraja[i]);
                        //}
                        if (baraja[i].equals("A")) {
                            numA = numA + 1;
                            switch (numA) {
                                case 1:
                                    if (suma > 10) {
                                        valoresA = 1;
                                        valor1A = 1;
                                    } else {
                                        valoresA = 11;
                                        valor1A = 11;
                                    }
                                    break;
                                case 2:
                                    if (suma > 10) {
                                        valoresA = 1;
                                        valor2A = 1;
                                    } else {
                                        valoresA = 11;
                                        valor2A = 11;
                                    }
                                    break;
                                case 3:
                                    if (suma > 10) {
                                        valoresA = 1;
                                        valor3A = 1;
                                    } else {
                                        valoresA = 11;
                                        valor3A = 11;
                                    }
                                    break;
                                case 4:
                                    if (suma > 10) {
                                        valoresA = 1;
                                        valor4A = 1;
                                    } else {
                                        valoresA = 11;
                                        valor4A = 11;
                                    }
                                    break;
                            }
                        } else {
                            sumaneta = sumaneta + valor;
                        }
                        sumaneta = sumaneta + valoresA;
                        suma = suma + sumaneta;
                        if (suma > 21 && valor1A == 11) {
                            suma = suma - 10;
                            valor1A = 1;
                        }
                        if (suma > 21 && valor2A == 11) {
                            suma = suma - 10;
                            valor2A = 1;
                        }
                        if (suma > 21 && valor3A == 11) {
                            suma = suma - 10;
                            valor3A = 1;
                        }
                        if (suma > 21 && valor4A == 11) {
                            suma = suma - 10;
                            valor4A = 1;
                        }
                    }
                } else {
                    //if (c==1){
                    System.out.println("La carta numero " + c + " es: " + baraja[i]);
                    //}
                    if (baraja[i].equals("A")) {
                        numA = numA + 1;
                        switch (numA) {
                            case 1:
                                if (suma > 10) {
                                    valoresA = 1;
                                    valor1A = 1;
                                } else {
                                    valoresA = 11;
                                    valor1A = 11;
                                }
                                break;
                            case 2:
                                if (suma > 10) {
                                    valoresA = 1;
                                    valor2A = 1;
                                } else {
                                    valoresA = 11;
                                    valor2A = 11;
                                }
                                break;
                            case 3:
                                if (suma > 10) {
                                    valoresA = 1;
                                    valor3A = 1;
                                } else {
                                    valoresA = 11;
                                    valor3A = 11;
                                }
                                break;
                            case 4:
                                if (suma > 10) {
                                    valoresA = 1;
                                    valor4A = 1;
                                } else {
                                    valoresA = 11;
                                    valor4A = 11;
                                }
                                break;
                        }
                    } else {
                        sumaneta = sumaneta + valor;
                    }
                    sumaneta = sumaneta + valoresA;
                    suma = suma + sumaneta;
                    if (suma > 21 && valor1A == 11) {
                        suma = suma - 10;
                        valor1A = 1;
                    }
                    if (suma > 21 && valor2A == 11) {
                        suma = suma - 10;
                        valor2A = 1;
                    }
                    if (suma > 21 && valor3A == 11) {
                        suma = suma - 10;
                        valor3A = 1;
                    }
                    if (suma > 21 && valor4A == 11) {
                        suma = suma - 10;
                        valor4A = 1;
                    }
                }
                repetido = false;
                g = g + 1;
            }
            System.out.println(suma);

            numA = 0;
            c = 0;
            valor1A = 0;
            valor2A = 0;
            valor3A = 0;
            valor4A = 0;
            g = 0;
            repetido = false;
            while (x == true) {
                sumaneta = 0;
                valor = 0;
                valoresA = 0;
                i = (int) (Math.random() * 51);
                switch (baraja[i]) {
                    case "2":
                        valor = 2;
                        break;
                    case "3":
                        valor = 3;
                        break;
                    case "4":
                        valor = 4;
                        break;
                    case "5":
                        valor = 5;
                        break;
                    case "6":
                        valor = 6;
                        break;
                    case "7":
                        valor = 7;
                        break;
                    case "8":
                        valor = 8;
                        break;
                    case "9":
                        valor = 9;
                        break;
                    case "10":
                    case "J":
                    case "Q":
                    case "K":
                        valor = 10;
                        break;
                    default:
                        break;
                }
                repetidos2[g] = i;
                if (g >= 1) {
                    for (int h = 0; h <= g - 1; h++) {
                        if (repetidos2[h] == i) {
                            repetido = true;
                        }
                    }
                    if (repetido == false) {
                        if (c <= 1) {
                            cartas[c] = baraja[i];
                        }
                        if (c == 1) {
                            System.out.println("Sus dos primeras cartas son: " + cartas[0]
                                    + " y " + cartas[1]);
                        }
                        if (c > 1) {
                            System.out.println("Su nueva carta es: " + baraja[i]);
                        }
                        if (baraja[i].equals("A")) {
                            numA = numA + 1;
                            switch (numA) {
                                case 1:
                                    if (suma2 > 10) {
                                        valoresA = 1;
                                        valor1A = 1;
                                    } else {
                                        valoresA = 11;
                                        valor1A = 11;
                                    }
                                    break;
                                case 2:
                                    if (suma2 > 10) {
                                        valoresA = 1;
                                        valor2A = 1;
                                    } else {
                                        valoresA = 11;
                                        valor2A = 11;
                                    }
                                    break;
                                case 3:
                                    if (suma2 > 10) {
                                        valoresA = 1;
                                        valor3A = 1;
                                    } else {
                                        valoresA = 11;
                                        valor3A = 11;
                                    }
                                    break;
                                case 4:
                                    if (suma2 > 10) {
                                        valoresA = 1;
                                        valor4A = 1;
                                    } else {
                                        valoresA = 11;
                                        valor4A = 11;
                                    }
                                    break;
                            }
                        } else {
                            sumaneta = sumaneta + valor;
                        }
                        sumaneta = sumaneta + valoresA;
                        suma2 = suma2 + sumaneta;
                        if (suma2 > 21 && valor1A == 11) {
                            suma2 = suma2 - 10;
                            valor1A = 1;
                        }
                        if (suma2 > 21 && valor2A == 11) {
                            suma2 = suma2 - 10;
                            valor2A = 1;
                        }
                        if (suma2 > 21 && valor3A == 11) {
                            suma2 = suma2 - 10;
                            valor3A = 1;
                        }
                        if (suma2 > 21 && valor4A == 11) {
                            suma2 = suma2 - 10;
                            valor4A = 1;
                        }
                        if (c <= 1 && !baraja[i].equals("A")) {
                            valorescartas[c] = valor;
                        } else if (c <= 1 && baraja[i].equals("A")) {
                            valorescartas[c] = valoresA;
                        }
                        if (suma2 >= 21 || suma2 == 20) {
                            x = false;
                        }
                        if (c >= 1 && suma2 < 20) {
                            System.out.println("Desea tomar otra carta? "
                                    + "Ahora mismo la suma da " + suma2);
                            op = scanner.nextLine();

                            while (!"Si".equals(op) && !"si".equals(op)
                                    && !"no".equals(op) && !"No".equals(op)) {
                                System.out.println("Ingrese una opcion valida");
                                op = scanner.nextLine();
                            }

                            if (op.equals("si") || op.equals("Si")) {
                                x = true;
                            } else if (op.equals("no") || op.equals("No")) {
                                x = false;
                            }
                        }
                    }
                } else {
                    if (c <= 1) {
                        cartas[c] = baraja[i];
                    }
                    if (c == 1) {
                        System.out.println("Sus dos primeras cartas son: " + cartas[0]
                                + " y " + cartas[1]);
                    }
                    if (c > 1) {
                        System.out.println("Su nueva carta es: " + baraja[i]);
                    }
                    if (baraja[i].equals("A")) {
                        numA = numA + 1;
                        switch (numA) {
                            case 1:
                                if (suma2 > 10) {
                                    valoresA = 1;
                                    valor1A = 1;
                                } else {
                                    valoresA = 11;
                                    valor1A = 11;
                                }
                                break;
                            case 2:
                                if (suma2 > 10) {
                                    valoresA = 1;
                                    valor2A = 1;
                                } else {
                                    valoresA = 11;
                                    valor2A = 11;
                                }
                                break;
                            case 3:
                                if (suma2 > 10) {
                                    valoresA = 1;
                                    valor3A = 1;
                                } else {
                                    valoresA = 11;
                                    valor3A = 11;
                                }
                                break;
                            case 4:
                                if (suma2 > 10) {
                                    valoresA = 1;
                                    valor4A = 1;
                                } else {
                                    valoresA = 11;
                                    valor4A = 11;
                                }
                                break;
                        }
                    } else {
                        sumaneta = sumaneta + valor;
                    }
                    sumaneta = sumaneta + valoresA;
                    suma2 = suma2 + sumaneta;
                    if (suma2 > 21 && valor1A == 11) {
                        suma2 = suma2 - 10;
                        valor1A = 1;
                    }
                    if (suma2 > 21 && valor2A == 11) {
                        suma2 = suma2 - 10;
                        valor2A = 1;
                    }
                    if (suma2 > 21 && valor3A == 11) {
                        suma2 = suma2 - 10;
                        valor3A = 1;
                    }
                    if (suma2 > 21 && valor4A == 11) {
                        suma2 = suma2 - 10;
                        valor4A = 1;
                    }
                    if (c <= 1 && !baraja[i].equals("A")) {
                        valorescartas[c] = valor;
                    } else if (c <= 1 && baraja[i].equals("A")) {
                        valorescartas[c] = valoresA;
                    }
                    if (suma2 >= 21 || suma2 == 20) {
                        x = false;
                    }
                    if (c >= 1 && suma2 < 20) {
                        System.out.println("Desea tomar otra carta? Ahora mismo la suma da " + suma2);
                        op = scanner.nextLine();

                        while (!"Si".equals(op) && !"si".equals(op) && !"no".equals(op) && !"No".equals(op) && !"n".equals(op) && !"s".equals(op)) {
                            System.out.println("Ingrese una opcion valida");
                            op = scanner.nextLine();
                        }
                        if (op.equals("si") || op.equals("Si") || op.equals("s")) {
                            x = true;
                        } else if (op.equals("no") || op.equals("No") || op.equals("n")) {
                            x = false;
                        }
                    }
                }
                // if (repetido==false){c=c+1};
                c = c + 1;
                repetido = false;
                g = g + 1;
            }
            System.out.println(suma2);
            if (suma2 <= 21) {
                System.out.println(suma + " vs " + suma2);
                if (valorescartas[0] + valorescartas[1] == 21) {
                    System.out.println("¡Blackjack!");
                } else if (suma2 > suma) {
                    System.out.println("Ganaste");
                } else if (suma <= 21 && suma2 < suma) {
                    System.out.println("Perdiste");
                } else if (suma > 21) {
                    System.out.println("Ganaste");
                } else if (suma2 == suma) {
                    System.out.println("Empate");
                }
            } else {
                System.out.println("Perdiste ");
            }
        }

    }

}
