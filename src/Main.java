import  edu.misena.senaviewer.model.Serie;

public class Main {
    public static void main(String[] args) {

        Serie serie = new Serie("Soy leyenda", "Accion", "2:30" );
        System.out.println("La serie se llama: "+Serie.getTitle());
        System.out.println("El genero de la serie es: "+Serie.getGenre());
        System.out.println("El timepo de duracion es: "+Serie.getDuration());

    }

}