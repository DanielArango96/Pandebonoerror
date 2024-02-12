package org.example;


import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String cedula;
        LocalDate fecha = LocalDate.now();
        String nombreCliente;


        String nombreEmpleado;
        String contrasenaEmpleado;
        String nombreEmpleadoBD = "daniel96";
        String contrasenaEmpleadoBD = "daniel123";

        Integer opcion;
        Scanner leer = new Scanner(System.in);


        System.out.println("********Pandebonos Nairo********");
        System.out.println("*********************************");

        System.out.println("Apreciado empleado, Inicie sesíon por favor: ");
        boolean bandera = false;


        while (bandera == false) {

            System.out.println("Digite su usuario: ");
            nombreEmpleado = leer.nextLine();
            System.out.println("Digite su contraseña: ");
            contrasenaEmpleado = leer.nextLine();

            // login
            if (nombreEmpleado.equals(nombreEmpleadoBD) && contrasenaEmpleado.equals(contrasenaEmpleadoBD)) {
                System.out.println("Cargando sistema .......");
                bandera = true;

            } else {

                System.out.println("Usuario incorrecto");

            }

        }

        System.out.println("\n........pandesoftware.........");
        System.out.println("1.Registrar Compra");
        System.out.println("2.Calcular Total");
        System.out.println("3.Modificar Compra");
        System.out.println("4.Salir");

        do {
            System.out.println("Seleccione una opcion");
            opcion = leer.nextInt();

            Integer cantidadTradicional = 0;
            Integer cantidadGuayaba = 0;
            Integer cantidadArequipe = 0;
            Integer cantidad7Quesos = 0;
            Integer cantidadBebidas = 0;

            Integer productoSeleccionado;

            switch (opcion) {
                case 1:
                    System.out.println("1.Pandebono Tradicional ($8000)");
                    System.out.println("2.Pandebono Guayaba ($9500)");
                    System.out.println("3.Pandebono Arequipe ($12000)");
                    System.out.println("4.Pandebono 7 quesos ($20000)");
                    System.out.println("5.Bebida Caliente ($9500)");
                    System.out.println("6.Terminar Pedido");
                    System.out.println("*********************************");

                    do {
                        System.out.println("Digite el producto deseado");
                        productoSeleccionado = leer.nextInt();
                        switch (productoSeleccionado) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            default:
                                break;


                        }
                        while (productoSeleccionado != 6) {
                        }
                        break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        default:
                            break;


                    }


            } while (opcion != 4);


        }
    }

    }


