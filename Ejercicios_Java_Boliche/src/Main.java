import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        //Ejercicios prácticos Java + Boliche

        //Ejercicio 1: Crear las variables correspondientes para leer tu nombre,
        //apellido y edad e imprimirlos por consola en una oración.

        /*
        String nombre = "Ricardo Agustín";
        String apellido = "Giordano";
        byte edad = 43;

        System.out.println("Mi nombre completo es " + nombre + " " + apellido + ". Tengo " + edad + " años.");

        */


        //Ejercicio 2: Realizar un pequeño programa que permita ingresar 3 números
        //e imprimir por consola cuál es el mayor.
        /*
        Scanner read = new Scanner(System.in);
        System.out.println("A continuación se le pedirán tres números para calcular cuál de ellos es mayor");
        System.out.println("Ingrese el primer número:");
        double n1 = read.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double n2 = read.nextDouble();
        System.out.println("Ingrese el tercer número:");
        double n3 = read.nextDouble();
        double mayor;
        if (n1 > n2) {
            mayor = n1;
        } else if (n2 > n3) {
            mayor = n2;
        } else {
            mayor = n3;
        }
        System.out.println("El mayor de los tres números es: " + mayor);
*/

        //Ejercicio 3: Realizar un pequeño programa que permita el ingreso de un
        //número e imprimir por consola su paridad.
/*

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        int numero = read.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
*/


        //Ejercicio 4: Crear el código correspondiente que permita ingresar 2 cadenas
        //de caracteres e imprima por consola si son iguales o no.

/*

        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("A continuación se le pedirán dos cadenas de texto para comprobar si son iguales o no.");
        System.out.println("");
        System.out.println("Ingrese la primera cadena de texto:");
        String cadena1 = read.next();
        System.out.println("Ingrese la segunda cadena de texto:");
        String cadena2 = read.next();
        if (cadena1.equals(cadena2)){
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas no son iguales.");
        }
*/


        //Ejercicio 5: Realizar un pequeño programa que permita el ingreso de
        //números, almacenarlos en una colección hasta ingresar un 0.

/*
        System.out.println("Ingrese número para almacenar en la colección. Ingrese 0 para terminar.");
        Scanner read = new Scanner(System.in);
        int numero;
        ArrayList<Integer> lista = new ArrayList();

        System.out.println("Ingrese un número entero:");
        numero = read.nextInt();
        while (numero != 0) {
            lista.add(numero);
            System.out.println("Ingrese otro número entero:");
            numero = read.nextInt();
        }
        System.out.println("Los números se han cargado en la lista.");
*/


        //Ejercicio 6. Crear una función que imprima un mensaje de bienvenida en la
        //consola.

/*
        saludoBienvenida();
    }
        private static String saludoBienvenida() {
            String mensaje = "¡Bienvenidos a todos!";
            System.out.println(mensaje);
            return mensaje;
*/


        //Ejercicio 7: Crear una función que reciba un número entero y devuelva si es
        //par o impar en forma de texto.

/*        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número entero para ver si es par o impar:");
        int numero = read.nextInt();
        String paridad = esPar(numero);
        System.out.println("El número es " + paridad + ".");
    }
    private static String esPar(int numero) {
        String paridad;
        if (numero % 2 == 0) {
            paridad = "par";
        } else {
            paridad = "impar";
        }
        return paridad;*/


        //Ejercicio 8: Crear una función que reciba un número y devuelva si el mismo
        //es primo o no.

/*

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número entero para ver si es primo:");
        int numero = read.nextInt();
        String mensaje = esPrimo(numero);
        System.out.println("El número " + mensaje + ".");
    }
    private static String esPrimo(int numero) {
        String mensaje = "es primo";

        for (int i = 2; i <= numero/2; i++) {
            if (numero % i == 0) {
                mensaje = "no es primo";
                break;
            }
        }

        return mensaje;
*/


        //Ejercicio 9: Crear una función que reciba una colección de números y
        //devuelva la suma de los números impares.



/*
        System.out.println("Ingrese números enteros para almacenar en la colección. Ingrese 0 para terminar.");
        Scanner read = new Scanner(System.in);
        int numero;
        ArrayList<Integer> lista = new ArrayList();

        System.out.println("Ingrese un número entero:");
        numero = read.nextInt();
        while (numero != 0) {
            lista.add(numero);
            System.out.println("Ingrese otro número entero:");
            numero = read.nextInt();
        }
        System.out.println("Los números se han cargado en la lista.");

        int sumaImpares = sumarImpares(lista);
        System.out.println("La suma de números impares es: " + sumaImpares);
    }
    private static int sumarImpares(ArrayList<Integer> lista) {
        int suma = 0;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 != 0) {
                suma += lista.get(i);
            }
        }
        return suma;
*/


        //Ejercicio 10: Crear una función que reciba una colección de números e
        //imprima los números pares y la suma de los números primos.


/*
        System.out.println("Ingrese número para almacenar en la colección. Ingrese 0 para terminar.");
        Scanner read = new Scanner(System.in);
        int numero;
        ArrayList<Integer> lista = new ArrayList();

        System.out.println("Ingrese un número entero:");
        numero = read.nextInt();
        while (numero != 0) {
            lista.add(numero);
            System.out.println("Ingrese otro número entero:");
            numero = read.nextInt();
        }
        System.out.println("Los números se han cargado en la lista.");

        imprimirParesYSumaDePrimos(lista);
    }
    private static void imprimirParesYSumaDePrimos(ArrayList<Integer> lista) {
        int suma = 0;
        boolean hayPares = false;
        System.out.println("Números pares:");
        for (int i = 0; i < lista.size(); i++) {
            if (esPar(lista.get(i))) {
                System.out.println(lista.get(i));
                hayPares = true;
            }
            if (esPrimo(lista.get(i))) {
                suma += lista.get(i);
            }
        }
        if (!hayPares) System.out.println("No hay números pares.");
        System.out.println("La suma de números primos es: " + suma);
    }

    private static boolean esPrimo(int numero) {
        boolean esPrimo = true;

        if (numero != 1) {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        } else {
            esPrimo = false;
        }


        return esPrimo;
    }

    private static boolean esPar(int numero) {
        boolean esPar;
        if (numero % 2 == 0) {
            esPar = true;
        } else {
            esPar = false;
        }
        return esPar;
        */


        //Ejercicio 11: Crear una función que imprima por consola un pequeño
        //menú con las opciones básicas de una calculadora agregando
        //la opción 0 para salir del mismo.

/*      int opcion;
        opcion = cargarMenuCalculadora();
        System.out.println("Se seleccionó la opción " + opcion);
    }
    private static int cargarMenuCalculadora() {
        Scanner read = new Scanner(System.in);
        int opcion;

        System.out.println("");
        System.out.println(" _________________");
        System.out.println("|   CALCULADORA   |");
        System.out.println(" -----------------");
        System.out.println("");
        System.out.println("(1) Sumar");
        System.out.println("(2) Restar");
        System.out.println("(3) Multiplicar");
        System.out.println("(4) Dividir");
        System.out.println("(0) Salir");
        System.out.println("");

        opcion = read.nextInt();
        return opcion;*/


        //Ejercicio 12: Crear otra función que ocupe la del punto anterior para poder
        //crear una pequeña calculadora usando switch. Tener en cuenta
        //el caso de la división por 0.

/*
        abrirCalculadora();
    }

    private static void abrirCalculadora(){
        int opcion;

        do {
            opcion = cargarMenuCalculadora();
            switch (opcion) {
                case 1: sumar();
                    break;
                case 2: restar();
                    break;
                case 3: multiplicar();
                    break;
                case 4: dividir();
                    break;
                case 0: break;
                default:
                    System.out.println("Opción incorrecta. Inténtelo nuevamente.");

            }
        } while (opcion != 0);
        System.out.println("Ha salido del sistema.");
    }
    private static int cargarMenuCalculadora() {
        Scanner read = new Scanner(System.in);
        int opcion;

        System.out.println("");
        System.out.println(" _________________");
        System.out.println("|   CALCULADORA   |");
        System.out.println(" -----------------");
        System.out.println("");
        System.out.println("(1) Sumar");
        System.out.println("(2) Restar");
        System.out.println("(3) Multiplicar");
        System.out.println("(4) Dividir");
        System.out.println("(0) Salir");
        System.out.println("");

        opcion = read.nextInt();
        return opcion;
    }

    private static double sumar() {
        Scanner read = new Scanner(System.in);
        double numero1;
        double numero2;
        double suma;
        System.out.println("Ingrese los números que va a sumar:");
            numero1 = read.nextDouble();
            numero2 = read.nextDouble();
            suma = numero1 + numero2;
        System.out.println("El resultado de la suma es: " + suma);
        return suma;
    }

    private static double restar() {
        Scanner read = new Scanner(System.in);
        double numero1;
        double numero2;
        double diferencia;
        System.out.println("Ingrese los números que va a restar:");
        numero1 = read.nextDouble();
        numero2 = read.nextDouble();
        diferencia = numero1 - numero2;
        System.out.println("El resultado de la resta es: " + diferencia);
        return diferencia;
    }

    private static double multiplicar() {
        Scanner read = new Scanner(System.in);
        double numero1;
        double numero2;
        double producto;
        System.out.println("Ingrese los números que va a multiplicar:");
        numero1 = read.nextDouble();
        numero2 = read.nextDouble();
        producto = numero1 * numero2;
        System.out.println("El resultado de la resta es: " + producto);
        return producto;
    }

    private static double dividir() {
        Scanner read = new Scanner(System.in);
        double numero1;
        double numero2;
        double cociente;
        System.out.println("Ingrese los números que va a dividir (primero el dividendo y después el divisor):");
        numero1 = read.nextDouble();
        numero2 = read.nextDouble();
        while (numero2 == 0) {
            System.out.println("La división por cero no está definida. Ingrese otro divisor, por favor:");
            numero2 = read.nextDouble();
        }
        cociente = numero1 / numero2;
        System.out.println("El resultado de la resta es: " + cociente);
        return cociente;

*/

        //Ejercicio 13: Crear el algoritmo necesario para poder gestionar el ingreso
        //a un boliche. El mismo deberá contar con un pequeño menú con
        //las siguientes opciones:
        //  ● Ingreso de datos.
        //  ● Capacidad disponible.
        //  ● Dinero recaudado.
        //  ● Salir del sistema.
        //
        //Crear las variables correspondientes para controlar la capacidad
        //y el dinero recaudado. Siendo la capacidad máxima de 500
        //personas y la entrada costar 1500 por persona y 2000 la
        //entrada vip. La primera opción del menú deberá tomar los datos
        //personales del ingresante (nombre, edad, DNI y pase). El
        //algoritmo deberá detectar si la persona está apta para el
        //ingreso, ya que solo se dejará pasar a los mayores de 21 años.
        //Verificar antes de cobrar la entrada si posee pase vip con el cual
        //ingresará gratis o si posee pase con descuento el cual le
        //permitirá solo abonar la mitad del valor de la entrada. Al
        //momento de hacer el cobro se deberá preguntar si quiere
        //comprar la entrada normal o vip y finalmente darle la bienvenida
        //en caso de que todo haya salido bien, volviendo al menú
        //principal. Las variables correspondientes tendrán que reflejar el
        //ingreso tanto de personas como de dinero.


/*
        Scanner read = new Scanner(System.in);
        byte opcion;
        short capacidadMaxima = 500;
        short capacidadRestante = capacidadMaxima;
        float valorGeneral = 1500;
        float valorVIP = 2000;
        char tipoEntrada;
        float montoAPagar;
        float recaudacion = 0;
        ArrayList<Cliente> listaClientes = new ArrayList();

        do {
            System.out.println(" __________________");
            System.out.println("|       MENU       |");
            System.out.println(" ------------------");
            System.out.println("");
            System.out.println("(1) Ingreso de datos");
            System.out.println("(2) Capacidad disponible");
            System.out.println("(3) Dinero recaudado");
            System.out.println("(4) Salir del sistema");

            opcion = read.nextByte();

            switch (opcion) {
                case 1:
                    if(capacidadRestante > 0){
                        if(ingresarDatos(listaClientes)){
                            if (listaClientes.get(listaClientes.size() - 1).getPase().equals("v")){
                                montoAPagar = 0;
                            } else {
                                System.out.println("¿Desea comprar la entrada normal (N) o la VIP (V)?");
                                tipoEntrada = read.next().toLowerCase().charAt(0);
                                while (tipoEntrada !='n' && tipoEntrada != 'v'){
                                    System.out.println("El valor ingresado no es válido. Ingrese \"N\" o \"V\", por favor:");
                                    tipoEntrada = read.next().toLowerCase().charAt(0);
                                }
                                if (tipoEntrada == 'n') {
                                    montoAPagar = valorGeneral;
                                } else {
                                    montoAPagar = valorVIP;
                                }

                                if (listaClientes.get(listaClientes.size() - 1).getPase().equals("d")){
                                    montoAPagar = montoAPagar / 2;
                                }

                            }
                            capacidadRestante -= 1;
                            recaudacion += montoAPagar;
                            System.out.println("¡Bienvenido!");
                        }
                    } else {
                        System.out.println("El local está en su capacidad máxima. No es posible el ingreso de más clientes.");
                    }

                    break;
                case 2:
                    System.out.println("Capacidad disponible: " + capacidadRestante);
                    break;
                case 3:
                    System.out.println("El dinero recaudado hasta el momento es: $" + recaudacion);
                    break;
            }


        } while (opcion != 4);
        System.out.println("Ha salido del sistema.");
    }

    private static boolean ingresarDatos(ArrayList<Cliente> listaClientes){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        String nombre;
        boolean retorno = true;
        byte edad;
        int dni;
        String pase;
        Cliente cliente;
        byte edadMinima = 21;

        System.out.println("Carga de datos del ingresante");
        System.out.println("");
        System.out.println("Ingrese el nombre completo del cliente:");
        nombre = read.next();
        System.out.println("Edad:");
        edad = Byte.parseByte(read.next());
        if (edad < edadMinima) {
            System.out.println("El cliente debe ser mayor de " + edadMinima + " años para poder ingresar.");
            retorno = false;
        } else {
            System.out.println("DNI:");
            dni = Integer.parseInt(read.next());
            System.out.println("¿Tiene pase vip (V), pase con descuento (D) o no tiene pase (N)?");
            pase = read.next().toLowerCase();
            while (!pase.equals("v") && !pase.equals("d") && !pase.equals("n")){
                System.out.println("El valor ingresado no es válido. ¿Tiene pase vip (V), pase con descuento (D) o no tiene pase (N)?");
                pase = read.next().toLowerCase();
            }


            cliente = new Cliente(nombre, edad, dni, pase);
            listaClientes.add(cliente);
        }

        return retorno;
    }

}

class Cliente {
    private String nombre;
    private byte edad;
    private int dni;
    private String pase;

    public Cliente() {
    }

    public Cliente(String nombre, byte edad, int dni, String pase) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.pase = pase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getPase() {
        return pase;
    }

    public void setPase(String pase) {
        this.pase = pase;

*/






    }

}