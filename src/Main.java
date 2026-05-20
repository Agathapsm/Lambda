import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cliente> lista = new ArrayList<Cliente>();

        lista.add(new Cliente(true, "agatha@gmail.com", 1, "Agatha" ));
        lista.add(new Cliente(false, "lucas@gmail.com", 2, "Lucas" ));
        lista.add(new Cliente(true, "pedro@gmail.com", 3, "Pedro" ));
        lista.add(new Cliente(false, "ana@gmail.com", 4, "Ana" ));
        lista.add(new Cliente(false, "maria@gmail.com", 5, "Maria" ));
        lista.add(new Cliente(true, "felipe@gmail.com", 6, "Felipe" ));

        System.out.println("---- LISTA GERAL ----");
        lista.forEach(c -> {
            System.out.println(c);
        });

        System.out.println("---- LISTA ATIVOS ----");
        //criterio 1 - apenas ativos
        exibe_por_criterio(lista, c -> c.isAtivo());

        System.out.println("---- LISTA DE NOMES MAIORES DE 4 LETRAS ----");
        exibe_por_criterio(lista, c -> c.getNome().length() > 4);

        System.out.println("---- NOMES QUE COMEÇAM COM A ----");
        exibe_por_criterio(lista, c -> c.getNome().startsWith("A"));
    }

    public static void exibe_por_criterio(ArrayList<Cliente> lista, Predicate<Cliente> predicate) {
        lista.forEach(c -> {
            if (predicate.test(c)) {
                System.out.println(c);
            }
        });
    }
}