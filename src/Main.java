import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Informe quantos de candidatos");
        Scanner leitura = new Scanner(System.in);
        int quantidadeDeCandidatos = leitura.nextInt();
        Campanha campanha = new Campanha(new ArrayList<Candidato>());

        for (int i = 0; i < quantidadeDeCandidatos; i++) {

            Scanner ler_string = new Scanner(System.in);
            Scanner ler_int = new Scanner (System.in);
            int escolha = 0;
            PartidosPoliticos temp;
            boolean Candidato_existe = true;

            Candidato CriaCandidato = new Candidato();
            System.out.println("Informe o Nome do Candidato: ");
            CriaCandidato.setNome(ler_string.nextLine());

            while (Candidato_existe) {
                System.out.println("Informe o Partido:\n1.Direita\n2.Esquerda\n3.Centro\n4.Liberal");
                escolha = ler_int.nextInt();
                switch (escolha) {
                    case 1:
                        CriaCandidato.setPartidosPoliticos(PartidosPoliticos.DIREITA);
                        Candidato_existe = false;
                        break;
                    case 2:
                        CriaCandidato.setPartidosPoliticos(PartidosPoliticos.ESQUERDA);
                        Candidato_existe = false;
                        break;
                    case 3:
                        CriaCandidato.setPartidosPoliticos(PartidosPoliticos.CENTRO);
                        Candidato_existe = false;
                        break;
                    case 4:
                        CriaCandidato.setPartidosPoliticos(PartidosPoliticos.LIBERAL);
                        Candidato_existe = false;
                        break;
                    default:
                        System.out.println("Opção invalida. Tente novamente.");
                        break;
                }
            }
            System.out.println("Informe a idade do Candidato:");
            CriaCandidato.setIdade(ler_int.nextInt());
            System.out.println("Informe a quantidade de votos recebidos: ");
            CriaCandidato.setNumeroDeVotos(ler_int.nextInt());

           campanha.add(CriaCandidato);

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