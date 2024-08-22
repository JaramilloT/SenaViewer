import edu.misena.senaviewer.model.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class agregarBook {


    public static class metodosBooks {
        private List<Book> book;

        public metodosBooks() {
            book = new ArrayList<>();
        }

        public void addBook() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese el título del libro:");
            String title = scanner.nextLine();

            System.out.println("Ingrese la fecha de edición (YYYY-MM-DD):");
            String editionDate = scanner.nextLine();

            System.out.println("Ingrese la editorial:");
            String editorial = scanner.nextLine();

            System.out.println("Ingrese el ISBN:");
            int isbn = scanner.nextInt(); // Cambiado a String

            Book newBook = new Book(title, editionDate, editorial, isbn);
            book.add(newBook);
            System.out.println("Libro agregado con éxito");

        }

            public void verBook() {
                if (book.isEmpty()) {
                    System.out.println("No se han agregado libros.\nDebes agregar un libro");
                    return;
                }
                for (Book book : book) {
                            System.out.println("Título: " + book.getTitle());
                            System.out.println("Fecha de Edición: " + book.getEditionDate());
                            System.out.println("Editorial: " + book.getEditorial());
                            System.out.println("ISBN: " + book.getIsbn());
                    }
            }





    }
}