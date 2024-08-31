import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Pelicula> peliculas = new ArrayList<>();
        peliculas.add(new Pelicula("E.T.", "Steven Spielberg", 1982));
        peliculas.add(new Pelicula("Avatar", "James Cameron", 2009));
        peliculas.add(new Pelicula("Salvar al soldado Ryan", "Steven Spielberg", 1998));
        peliculas.add(new Pelicula("Origen", "Christopher Nolan", 2010));
        peliculas.add(new Pelicula("L.A. Confidential", "Curtis Hanson", 1997));

        System.out.println("\n");

        System.out.println("Películas que estrenadas en el siglo XXI: ");
        peliculas.stream().filter(p -> p.getEstreno() >= 2000)
                .forEach(p -> System.out.println(p));

        System.out.println("\n");

        String movies = peliculas.stream().filter(p -> p.getDirector().equals("Steven Spielberg"))
                .map(p -> p.getTitulo())
                .collect(Collectors.joining(", ", "Peliculas dirigidas por Steven Spielberg ", ""));

        System.out.println(movies);

        System.out.println("\n");

        System.out.println("Películas ordenadas alfabéticamente");
        Comparator<Pelicula> cName = (p1 , p2) -> p1.getTitulo().compareToIgnoreCase(p2.getTitulo());
        peliculas.stream().sorted(cName).forEach(p -> System.out.println(p));
    }
}