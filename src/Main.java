import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Informe quantos de candidatos");
        Scanner leitura = new Scanner(System.in);
        int quantidadeDeCandidatos = leitura.nextInt();
        Campanha campanha = new Campanha(new ArrayList<Candidato>());

        for (int i = 0; i < quantidadeDeCandidatos; i++) {
            campanha.Cadastro_Candidato();
            System.out.println("Candidato " + (i+1) + " cadastrado");
        }

        System.out.println("Mais novo " + campanha.candidatoJovem().toString());
        System.out.println();
        System.out.println("Mais velho " + campanha.candidatoVelho().toString());
        System.out.println();
        System.out.println("Candidato mais Votado: " + campanha.candidatoMaisVotado().toString());
        System.out.println();
        System.out.println("Candidato menos Votado: " + campanha.candidatoMenosVotado().toString());
        System.out.println();
        System.out.println("Total de votos na Eleição: " + campanha.totalDeVotos());
        System.out.println();
        System.out.println("Média de votos na Eleição por candidato: " + campanha.mediaDeVotosPorCandidato());

    }
}