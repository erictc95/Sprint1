package sportnews;

import java.util.ArrayList;
import java.util.Scanner;

public class NewsMain {
    private static Scanner sc = new Scanner(System.in);
    private static int caso = 0;
    private static ArrayList<Editors> redactores = new ArrayList<>();
    private static ArrayList<News> noticias = new ArrayList<>();


    static void main(String[] args) {
        while (caso != 7) {
            System.out.println("Este es el programa de -->ERIC TARRES CABRISAS<--");
            System.out.println();
            System.out.println("--> DIGITAL DAILY NEWS<--");
            System.out.println();
            System.out.println("1. Insert Editor");
            System.out.println("2. Erase Editor");
            System.out.println("3. Insert new to an Editor");
            System.out.println("4. Erase New of Editor (Need the name of Editor and Titular)");
            System.out.println("5. Show the News of Editor");
            System.out.println("6. Calculate Score of News");
            System.out.println("7. Calculate Price of News");
            System.out.println("8. Exit");
            System.out.println();
            System.out.print("Elige una opción: ");
            caso = sc.nextInt();


            switch (caso) {
                case 1:
                    insertEditor();
                    break;
                case 2:
                    if (redactores.isEmpty()) {
                        System.out.println("There aren't Editors to Erase!");
                    } else {
                        eraseEditor();
                    }
                    break;
                case 3:
                    instertNewtoEditor();
                    break;
                case 4:
                    eraseNewstoEditor();
                    break;
                case 5:
                    showtheNewsofEditor();
                    break;
                case 6:
                    calculateScoreNews();
                    break;
                case 7:
                    calculatePriceNews();
                case 8:
                    sc.close();
                    System.out.println("See you soon!");
                    break;
                default:
                    System.out.println("Option not válid. Try again.");
            }
            if (caso != 8) {
                System.out.println("\nPress ENTER to continue...");
                sc.nextLine();   // <<< aquí espera a que pulses ENTER
            }
        }
    }

    public static void insertEditor() {
        System.out.println("Name of Editor: ");
        String name = sc.nextLine();
        System.out.println("DNI of Editor: ");
        String dni = sc.nextLine();
        redactores.add(new Editors(name, dni));
    }

    public static void eraseEditor() {
        System.out.println("DNI of Editor to Erase: ");
        String dniErase = sc.nextLine();
        for (int i = 0; i < redactores.size(); i++) {
            if (redactores.get(i).getDni().equals(dniErase)) {
                redactores.remove(i);
                System.out.println("Editor Erased!");
                break;
            }
        }
    }

    public static void instertNewtoEditor() {

    }

    public static void eraseNewstoEditor() {

    }

    public static void showtheNewsofEditor() {

    }

    public static void calculateScoreNews() {

    }

    public static void calculatePriceNews() {

    }
}
