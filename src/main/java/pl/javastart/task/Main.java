package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Book[] books = new Book[3];
        int counter = 0;

        System.out.println("Podaj informację o trzech unikalnych książkach");

        while (counter < books.length) {
            Book book = loadBookFromUser();
            if (!checkIfDuplicate(book, books, counter)) {
                books[counter] = book;
                counter++;
            }
        }
        System.out.println("\nObiekty zapisane w tablicy:");

        printBooks(books);
    }

    static boolean checkIfDuplicate(Book book, Book[] books, int counter) {
        boolean isDuplicate = false;
        for (int i = 0; i < counter; i++) {
            if (books[i].equals(book)) {
                isDuplicate = true;
                System.out.println("Duplikat");
            }
        }
        return isDuplicate;
    }

    static Book loadBookFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj tytuł nowej ksiazki");
        String title = scan.nextLine();
        System.out.println("Podaj liczbę stron nowej ksiazki");
        int pages = scan.nextInt();
        scan.nextLine();
        Book book = new Book(title, pages);
        return book;
    }

    static void printBooks(Book[] books) {
        for (Book book : books) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }
}


