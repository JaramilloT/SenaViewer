import edu.misena.senaviewer.model.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        agregarBook.metodosBooks booksMethods = new agregarBook.metodosBooks(); // Instancia de metodosBooks

        Movie movie = new Movie("Spider-Man", "Accion", "Stan Lee", "3:00", 2008);
        Serie serie = new Serie("La Ley de los audaces", "Accion", "yotas", "8Temporadas");
        Book book = new Book("A dos metros de ti", "(21/03/2019)", "Nube de Tinta: 001 edición (21 Marzo 2019)", 841605029);
        Magazine magazine = new Magazine("Vogue", " 17 de diciembre de 1892", " Conde Nast Publications Inc");
        Chapter chapter = new Chapter("hola", "1:00", 2000);
        //Film film = new Film("Rapidos y furiosos", "Accion", "yotas", "3:00");


        Scanner scanner = new Scanner(System.in);
        int option;
        int option2;
        int option3;
        int option4;
        int option5;

        do {
            System.out.println(" Menu. \n 1. Movies\n 2. Series\n 3. Books\n 4. Magazines\n 5. Chapter\n 6. Report\n 7. Report Today\n 8. Exit ");
            option = scanner.nextInt();

            switch (option) {
                case 1: {
                    System.out.println("1)Titulo \n2)Genero  \n3)Creador \n4)Duracion  \n5)Pelicula   \n6)Todas las opciones");
                    option2 = scanner.nextInt();
                    switch (option2) {
                        case 1:
                            System.out.println("El titulo es: " + Movie.getTitle());
                            break;
                        case 2:
                            System.out.println("El genero de la pelicula es: " + Movie.getGenre());
                            break;
                        case 3:
                            System.out.println("El creador de la pelicula es: " + Movie.getCreator());
                            break;
                        case 4:
                            System.out.println("La duracion de la pelicula es: " + Movie.getDuration());
                            break;
                        case 5:
                            System.out.println("El año de la pelicula es: " + Movie.getYear());
                            break;
                        case 6:
                            System.out.println("El titulo es: " + Movie.getTitle() +
                                    "\n El genero de la pelicula es: " + Movie.getGenre() +
                                    "\n El creador de la pelicula es: " + Movie.getCreator() +
                                    "\n La duracion de la pelicula es: " + Movie.getDuration() +
                                    "\n El año de la pelicula es: " + Movie.getYear());
                            break;
                    }
                    break;
                }

                case 2: {
                    System.out.println("1)Titulo \n2)Genero  \n3)Duracion  \n4)Todas las opciones");
                    option3 = scanner.nextInt();
                    switch (option3) {
                        case 1:
                            System.out.println("El titulo de la pelicula es: " + Serie.getTitle());
                            break;
                        case 2:
                            System.out.println("El genero de la pelicula es: " + Serie.getGenre());
                            break;
                        case 3:
                            System.out.println("El titulo de la pelicula es: " + Serie.getTitle() +
                                    "\nEl genero de la pelicula es: " + Serie.getGenre() +
                                    "\nLa duracion de la pelicula es: " + Serie.getDuration());
                            break;
                    }
                    break;
                }

                case 3: {
                    System.out.println("1)Titulo \n2)Fecha de edicion  \n3)Editorial \n4)Isbn  \n5)Todas las opciones \n6)Agregar Libro \n7)ver Libro");
                    option4 = scanner.nextInt();
                    switch (option4) {
                        case 1:
                            System.out.println("El titulo del libro es: " + Book.getTitle());
                            break;
                        case 2:
                            System.out.println("La fecha de edición del libro es: " + Book.getEditionDate());
                            break;
                        case 3:
                            System.out.println("El editorial del libro es: " + Book.getEditorial());
                        case 4:
                            System.out.println("El isbn del libro es: " + Book.getIsbn());
                            break;
                        case 5:
                            System.out.println("El titulo del libro es: " + Book.getTitle() +
                                    "\nLa fecha de edición del libro es: " + Book.getEditionDate() +
                                    "\nEl editorial del libro es: " + Book.getEditorial() +
                                    "\nEl isbn del libro es: " + Book.getIsbn());
                            break;
                        case 6:
                            booksMethods.addBook();
                            break;
                        case 7:
                            booksMethods.verBook();
                            break;
                    }
                    break;
                }

                case 4: {
                    System.out.println("1)Titulo \n2)Fecha de edicion  \n3)Editorial \n4)Todas las opciones");
                    option5 = scanner.nextInt();
                    switch (option5) {
                        case 1:
                            System.out.println("El titulo de la revista es: " + Magazine.getTitle());
                            break;
                        case 2:
                            System.out.println("La fecha de edición de la revista es: " + Magazine.getEditionDate());
                            break;
                        case 3:
                            System.out.println("El editorial de la revista es: " + Magazine.getEditorial());
                        case 4:
                            System.out.println("El titulo de la revista es: " + Magazine.getTitle() +
                                    "\nLa fecha de edición de la revista es: " + Magazine.getEditionDate() +
                                    "\nEl editorial de la revista es: " + Magazine.getEditorial());
                            break;
                    }
                    break;
                }
                case 5: {
                    System.out.println("1)Titulo \n2)Fecha de edicion  \n3)Editorial \n4)Todas las opciones");
                    option5 = scanner.nextInt();
                    switch (option5) {
                        case 1:
                            System.out.println("El titulo del capitulo es: " + Chapter.getTitle());
                            break;
                        case 2:
                            System.out.println("El tiempo de duracion es: " + Chapter.getDuration ());
                            break;
                        case 3:
                            System.out.println("El año es: " + Chapter.getYear());
                        case 4:
                            System.out.println("El titulo del capitulo es: " + Chapter.getTitle() +
                                    "\nEl tiempo de duracion es: " + Chapter.getDuration() +
                                    "\nEl año es: " + Chapter.getYear());
                            break;
                    } break;
                }
            }

        }while ((option != 8)) ;
    }
}