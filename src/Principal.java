import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                ConsultaApi consulta = new ConsultaApi();
                Gson gson = new Gson();
                JsonProcessor processor = new JsonProcessor();

                int opcion;
                double importe;

                do {
                    System.out.println("\n-------------------");
                    System.out.println("\nCONVERSOR DE MONEDA");
                    System.out.println("\n-------------------");
                    System.out.println("\nMenú de opciones:");
                    System.out.println("1. Dolar ==> Peso Argentino");
                    System.out.println("2. Peso Argentino ==> Dolar");
                    System.out.println("3. Dolar ==> Real Brasileño");
                    System.out.println("4. Real Brasileño ==> Dolar");
                    System.out.println("5. Dolar ==> Peso Colombiano");
                    System.out.println("6. Peso Colombiano ==> Dolar");
                    System.out.println("7. Salir");
                    System.out.print("\nIngrese su opción: ");

                    opcion = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    switch (opcion) {
                        case 1:
                            //double importe;
                            System.out.println("\nIngrese valor que desea convertir .... ");
                            importe = scanner.nextDouble();
                            //ConsultaApi consulta = new ConsultaApi();
                            ServicioApi conversor = consulta.buscaServicio("USD","ARS",importe);
                            //System.out.println(conversor);
                            // Convierto la instancia conversor a Json usando Gson
                            //Gson gson = new Gson();
                            String json = gson.toJson(conversor);
                            // creo instancia de Jsonprocessor para mostrar valores
                            //JsonProcessor processor = new JsonProcessor();
                            processor.mostrarValores(String.valueOf(json) , importe);
                            break;
                        case 2:
                            //double importe;
                            System.out.println("\nIngrese valor que desea convertir .... ");
                            importe = scanner.nextDouble();
                            //ConsultaApi consulta = new ConsultaApi();
                            ServicioApi conversor2 = consulta.buscaServicio("ARS","USD",importe);
                            //System.out.println(conversor2);
                            String json2 = gson.toJson(conversor2);
                            // creo instancia de Jsonprocessor para mostrar valores
                            //JsonProcessor processor = new JsonProcessor();
                            processor.mostrarValores(String.valueOf(json2) , importe);
                            break;
                        case 3:
                            //double importe;
                            System.out.println("\nIngrese valor que desea convertir .... ");
                            importe = scanner.nextDouble();
                            //ConsultaApi consulta = new ConsultaApi();
                            ServicioApi conversor3 = consulta.buscaServicio("USD","BRL",importe);
                            //System.out.println(conversor3);
                            String json3 = gson.toJson(conversor3);
                            // creo instancia de Jsonprocessor para mostrar valores
                            //JsonProcessor processor = new JsonProcessor();
                            processor.mostrarValores(String.valueOf(json3) , importe);
                            break;
                        case 4:
                            //double importe;
                            System.out.println("\nIngrese valor que desea convertir .... ");
                            importe = scanner.nextDouble();
                            //ConsultaApi consulta = new ConsultaApi();
                            ServicioApi conversor4 = consulta.buscaServicio("BRL","USD",importe);
                            //System.out.println(conversor4);
                            String json4 = gson.toJson(conversor4);
                            // creo instancia de Jsonprocessor para mostrar valores
                            //JsonProcessor processor = new JsonProcessor();
                            processor.mostrarValores(String.valueOf(json4) , importe);
                            break;
                        case 5:
                            //double importe;
                            System.out.println("\nIngrese valor que desea convertir .... ");
                            importe = scanner.nextDouble();
                            //ConsultaApi consulta = new ConsultaApi();
                            ServicioApi conversor5 = consulta.buscaServicio("USD","COP",importe);
                            //System.out.println(conversor5);
                            String json5 = gson.toJson(conversor5);
                            // creo instancia de Jsonprocessor para mostrar valores
                            //JsonProcessor processor = new JsonProcessor();
                            processor.mostrarValores(String.valueOf(json5) , importe);
                            break;
                        case 6:
                            //double importe;
                            System.out.println("\nIngrese valor que desea convertir .... ");
                            importe = scanner.nextDouble();
                            //ConsultaApi consulta = new ConsultaApi();
                            ServicioApi conversor6 = consulta.buscaServicio("COP","USD",importe);
                            //System.out.println(conversor6);
                            String json6 = gson.toJson(conversor6);
                            // creo instancia de Jsonprocessor para mostrar valores
                            //JsonProcessor processor = new JsonProcessor();
                            processor.mostrarValores(String.valueOf(json6) , importe);
                            break;
                        case 7:
                            System.out.println("Saliendo del programa...");
                            break;
                        default:
                            System.out.println("Opción no válida, intenta de nuevo.");
                            break;
                    }
                } while (opcion != 7);

                scanner.close();

    }
}
