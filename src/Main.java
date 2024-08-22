import edu.misena.senaviewer.model.Movie;
import edu.misena.senaviewer.model.Serie;
import edu.misena.senaviewer.model.Book;
import edu.misena.senaviewer.model.Magazine;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Spider-Man", "Accion", "Stan Lee", "3:00", 2006 );
        Serie serie = new Serie("Soy leyenda", "Accion", "2:30");
        Book book= new Book("A dos metros de ti", "(21/03/2019)", "Nube de Tinta: 001 edición (21 Marzo 2019)", "8417605029 o 978-8417605025");
        Magazine magazine = new Magazine("Vogue", " 17 de diciembre de 1892", " Conde Nast Publications Inc");
        Scanner scanner = new Scanner(System.in);

            int option;
            int option2;
            int option3;
            int option4;
            int option5;

            do {System.out.println(" Menu. \n 1. Movies\n 2. Series\n 3. Books\n 4. Magazines\n 5. Report\n 6. Report Today\n 7. Exit ");
                option = scanner.nextInt();

                    switch (option) {
                        case 1:
                            do {System.out.println("1)Titulo \n2)Genero  \n3)Creador \n4)Duracion  \n5)Pelicula \n6)Todas las opciones");
                                option2 = scanner.nextInt();
                                switch (option2) {
                                    case 1:
                                        System.out.println("El titulo es: "+Movie.getTitle());
                                        break;
                                    case 2:
                                        System.out.println("El genero de la pelicula es: "+Movie.getGenre());
                                        break;
                                    case 3:
                                        System.out.println("El creador de la pelicula es: "+ Movie.getCreator());
                                        break;
                                    case 4:
                                        System.out.println("La duracion de la pelicula es: "+Movie.getDuration());
                                        break;
                                    case 5:
                                        System.out.println("El año de la pelicula es: "+Movie.getYear());
                                        break;
                                    case 6:
                                        System.out.println("El titulo es: "+Movie.getTitle()+
                                                        "\n El genero de la pelicula es: "+Movie.getGenre()+
                                                        "\n El creador de la pelicula es: "+ Movie.getCreator()+
                                                        "\n La duracion de la pelicula es: "+Movie.getDuration()+
                                                        "\n El año de la pelicula es: "+Movie.getYear());
                                        break;
                                }
                        break;
                            }while ( (option2 !=7));

                        case 2:
                            do {System.out.println("1)Titulo \n2)Genero  \n3)Duracion  \n4)Todas las opciones");
                                option3 = scanner.nextInt();
                                switch (option3) {
                                    case 1:
                                        System.out.println("El titulo de la pelicula es: "+serie.getTitle());
                                        break;
                                    case 2:
                                        System.out.println("El genero de la pelicula es: "+serie.getGenre());
                                        break;
                                    case 3:
                                        System.out.println("El titulo de la pelicula es: "+serie.getTitle()+
                                                        "\nEl genero de la pelicula es: "+serie.getGenre()+
                                                        "\nLa duracion de la pelicula es: "+serie.getDuration());
                                        break;
                                }
                        break;
                            }while ( (option3 !=7));

                        case 3:
                            do {System.out.println("1)Titulo \n2)Fecha de edicion  \n3)Editorial \n4)Isbn  \n5)Todas las opciones");
                                option4 = scanner.nextInt();
                                switch (option4) {
                                    case 1:
                                        System.out.println("El titulo del libro es: "+Book.getTitle());
                                        break;
                                    case 2:
                                        System.out.println("La fecha de edición del libro es: "+Book.getEditionDate());
                                        break;
                                    case 3:
                                        System.out.println("El editorial del libro es: "+ Book.getEditorial());
                                    case 4:
                                        System.out.println("El isbn del libro es: "+Book.getIsbn());
                                        break;
                                    case 5:
                                        System.out.println("El titulo del libro es: "+Book.getTitle()+
                                                        "\nLa fecha de edición del libro es: "+Book.getEditionDate()+
                                                        "\nEl editorial del libro es: "+Book.getEditorial()+
                                                        "\nEl isbn del libro es: "+Book.getIsbn());
                                        break;
                                }
                                break;
                            }while ( (option4 !=7));

                        case 4:
                            do {System.out.println("1)Titulo \n2)Fecha de edicion  \n3)Editorial \n4)Todas las opciones");
                                option5 = scanner.nextInt();
                                switch (option5) {
                                    case 1:
                                        System.out.println("El titulo de la revista es: "+Magazine.getTitle());
                                        break;
                                    case 2:
                                        System.out.println("La fecha de edición de la revista es: "+Magazine.getEditionDate());
                                        break;
                                    case 3:
                                        System.out.println("El editorial de la revista es: "+ Magazine.getEditorial());
                                    case 4:
                                        System.out.println("El titulo de la revista es: "+Magazine.getTitle()+
                                                        "\nLa fecha de edición de la revista es: "+Magazine.getEditionDate()+
                                                        "\nEl editorial de la revista es: "+Magazine.getEditorial());
                                        break;
                                }
                                break;
                            }while ( (option5 !=7));
                    }

            }while ( (option !=7));


        }


}