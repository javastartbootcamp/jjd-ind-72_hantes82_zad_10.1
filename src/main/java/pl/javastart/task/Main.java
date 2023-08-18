package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Book[] books = new Book[3];
        int counter = 0;

        System.out.println("Podaj informację o trzech unikalnych książkach");

        while (counter < books.length) {
            System.out.println("Podaj tytuł nowej ksiazki");
            String title = scan.nextLine();
            System.out.println("Podaj liczbę stron nowej ksiazki");
            int pages = scan.nextInt();
            scan.nextLine();
            Book book = new Book(title, pages);
            boolean isDuplicate = false;
            for (int i = 0; i < counter; i++) {
                if (books[i].equals(book)) {
                    isDuplicate = true;
                    System.out.println("Duplikat");
                    break;
                }
            }
            if (!isDuplicate) {
                books[counter] = book;
                counter++;
            }
        }
        System.out.println("\nObiekty zapisane w tablicy:");

        for (Book book : books) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }
}


