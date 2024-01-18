package com.iesam.avilaEnTapas.features.tapas.presentation;

import com.iesam.avilaEnTapas.features.tapas.data.TapaDataRepository;
import com.iesam.avilaEnTapas.features.tapas.domain.*;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTapa {
    
    static int id = 1;

    public static void printTapas(){
        GetTapasUseCase tapasUseCase = new GetTapasUseCase(TapaDataRepository.newInstance());
        ArrayList<Tapa> tapas = tapasUseCase.execute();

        System.out.println(tapas.toString());
    }

    public static void printTapa(String tapaId){
        GetTapaUseCase getTapaUseCase = new GetTapaUseCase(TapaDataRepository.newInstance());
        Tapa tapa = getTapaUseCase.execute(tapaId);
        System.out.println(tapa.toString());
    }

    public static void deleteTapa(String tapaId){
        DeleteTapaUseCase deleteTapaUseCase = new DeleteTapaUseCase(TapaDataRepository.newInstance());
        deleteTapaUseCase.execute(tapaId);
    }

    public static void createTapa(Tapa tapa){
        TapaDataRepository tapaDataRepository = TapaDataRepository.newInstance();
        SaveTapaUseCase saveTapaUseCase = new SaveTapaUseCase(tapaDataRepository);
        saveTapaUseCase.execute(tapa);
    }

    public static void updateTapa(Tapa tapa){
        UpdateTapaUseCase updateTapaUseCase = new UpdateTapaUseCase(TapaDataRepository.newInstance());
        updateTapaUseCase.execute(tapa);

        System.out.println("");
    }

    public static void menu(){
        int option = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("-------------Menu-------------\n" +
                    "Seleccionar '1' para: Crear tapa\n" +
                    "Seleccionar '2' para: Modificar tapa\n" +
                    "Seleccionar '3' para: Eliminar tapa\n" +
                    "Seleccionar '4' para: Mostrar listado de tapas\n" +
                    "Seleccionar '5' para: Salir del programa" );
            option = sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("Seleccionaste crear tapa");
                    menuCreate();
                    break;
                case 2:
                    System.out.println("Seleccionaste modificar tapa");
                    menuUpdate();
                    break;
                case 3:
                    System.out.println("Seleccionaste eliminar tapa");
                    menuDelete();
                    break;
                case 4:
                    System.out.println("Seleccionaste mostrar listado de tapas");
                    menuPrints();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida selecciona otra vez");
                    break;
            }

        }while (option != 5);
        sc.close();
    }
    public static void menuCreate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Añade la siguiente informacion separada por espacios (salvo los ingredientes que puede ir con comas o separados)");
        System.out.println("Nombre, Estableciemiento , Puntos Totales, Media de votos, Numero de participantes, Votos totales, Ingredientes");
        createTapa(new Tapa(Integer.toString(id++),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextLine()));
    }
    public static void menuUpdate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Añade la siguiente informacion separada por espacios");
        System.out.println("ID, Nombre, Estableciemiento , Puntos Totales, Media de votos, Numero de participantes, Votos totales, Ingredientes");
        updateTapa(new Tapa(sc.next(), sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextLine()));

    }
    public static void menuDelete(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el ID de la tapa a eliminar");
        deleteTapa(sc.nextLine());

    }
    public static void menuPrints(){
        printTapas();

    }
}
