import java.util.ArrayList;
import java.util.*;

public class Campanha {

    private ArrayList<Candidato> candidatos;
    Scanner ler = new Scanner(System.in);
    public boolean Cadastro_Candidato(){

        Scanner ler_string = new Scanner(System.in);
        Scanner ler_int = new Scanner (System.in);
        int escolha = 0;
        PartidosPoliticos temp;
        boolean Candidato_existe = false;

        Candidato candidato = new Candidato();
        System.out.println("Informe o Nome do Candidato: ");
        candidato.setNome(ler_string.nextLine());

        while (Candidato_existe) {
            System.out.println("Informe o Partido:\n1.Direita\n2.Esquerda\n3.Centro\n4.Liberal");
            escolha = ler_int.nextInt();
            switch (escolha) {
                case 1:
                    candidato.setPartidosPoliticos(PartidosPoliticos.DIREITA);
                    Candidato_existe = true;
                    break;
                case 2:
                    candidato.setPartidosPoliticos(PartidosPoliticos.ESQUERDA);
                    Candidato_existe = true;
                    break;
                case 3:
                    candidato.setPartidosPoliticos(PartidosPoliticos.CENTRO);
                    Candidato_existe = true;
                    break;
                case 4:
                    candidato.setPartidosPoliticos(PartidosPoliticos.LIBERAL);
                    Candidato_existe = true;
                    break;
                default:
                    System.out.println("Opção invalida. Tente novamente.");
                    break;
            }
        }
        System.out.println("Informe a idade do Candidato:");
        candidato.setIdade(ler_int.nextInt());
        System.out.println("Informe a quantidade de votos recebidos: ");
        candidato.setNumeroDeVotos(ler_int.nextInt());


        candidatos.add(candidato);

        return true;
    }

    public Candidato candidatoJovem(ArrayList<Candidato> candidatos){
        Candidato candidatoMaisJovem = new Candidato();
        candidatoMaisJovem = candidatos.get(0);

        for (Candidato candidato: candidatos) {
            if(candidato.getIdade() < candidatoMaisJovem.getIdade()){
                candidatoMaisJovem = candidato;
            }
        }
        return candidatoMaisJovem;
    }

    public Candidato candidatoVelho(ArrayList<Candidato> candidatos){
        Candidato candidatoMaisVelho = new Candidato();
        candidatoMaisVelho = candidatos.get(0);

        for (Candidato candidato: candidatos) {
            if(candidato.getIdade() < candidatoMaisVelho.getIdade()){
                candidatoMaisVelho = candidato;
            }
        }
        return candidatoMaisVelho;
    }

    public Candidato candidatoMaisVotado(ArrayList<Candidato> candidatos){
        return null;
    }
    public Candidato candidatoMenosVotado(ArrayList<Candidato> candidatos){
        return null;
    }

    public int totalDeVotos(ArrayList<Candidato> candidatos){
        int soma = 0;
        return soma;
    }
    public int mediaDeVotosPorCandidato(ArrayList<Candidato> candidatos){
        return 0;
    }

    @Override
    public String toString() {
        return "Candidatos da campanha: " +
                candidatos.toString();
    }
}
