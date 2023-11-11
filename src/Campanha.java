import java.util.ArrayList;
import java.util.*;

public class Campanha {

    private ArrayList<Candidato> candidatos;
    Scanner ler = new Scanner(System.in);
    public boolean Cadastro_Candidato(){

            Candidato candidato = new Candidato();
            System.out.println("");

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
