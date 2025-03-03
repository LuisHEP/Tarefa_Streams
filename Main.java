import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Jogador> jogadores = Arrays.asList(
                new Jogador("Alice", "Digimon TCG", "Feminino"),
                new Jogador("Bob", "Magic The Gathering", "Masculino"),
                new Jogador("Charlie", "Pokemon TCG", "Masculino"),
                new Jogador("Diana", "Digimon TCG", "Feminino"),
                new Jogador("Eva", "Magic The Gathering", "Feminino")
        );

        // Filtrar apenas jogadoras femininas usando lambda e filter
        List<Jogador> mulheres = jogadores.stream()
                .filter(jogador -> jogador.getGenero().equalsIgnoreCase("Feminino"))
                .collect(Collectors.toList());

        // Imprimir a lista de mulheres
        System.out.println("Lista de Jogadoras Femininas:");
        mulheres.forEach(jogador -> System.out.println(jogador.getNome()));
    }
}


