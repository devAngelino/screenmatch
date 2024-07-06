import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme capitaoamerica = new Filme();
        capitaoamerica.setNome("capitão america2");
        capitaoamerica.setAnoDeLancamento(1970);
        capitaoamerica.setDuracaoEmMinutos(120);
        System.out.println("Duração do filme: " + capitaoamerica.getDuracaoEmMinutos());

        capitaoamerica.exibeFichatecnica();
        capitaoamerica.avalia(5);
        capitaoamerica.avalia(8);
        capitaoamerica.avalia(3);
        System.out.println("Total de avaliações: " + capitaoamerica.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações: " + capitaoamerica.pegaMedia());


        Serie lost = new Serie();
        lost.setNome("lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(11);
        lost.setEpisodiosPorTemporada(10);
        lost.exibeFichatecnica();
        lost.setMinutosPorEpisodios(50);
        System.out.println("Duração da filme: " + lost.getDuracaoEmMinutos());

        Filme homemaranha = new Filme();
        homemaranha.setNome("Homem Aranha");
        homemaranha.setAnoDeLancamento(2003);
        homemaranha.setDuracaoEmMinutos(100);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(capitaoamerica);
        calculadora.inclui(homemaranha);
        calculadora.inclui(lost);
        System.out.println("Maratonetions: " + calculadora.getTempoTotal());





    }
}
