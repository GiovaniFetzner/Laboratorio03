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

        for (int i = 0; i < candidatos.size(); i++) {
            if (candidatos.get(i).getIdade() < candidatos.get(i+1).getIdade()){

            }
        }
        return null;

    }

    public Candidato candidatoVelho(ArrayList candidatos){
        return null;
    }

    public Candidato candidatoMaisVotado(ArrayList candidatos){
        return null;
    }
    public Candidato candidatoMenosVotado(ArrayList candidatos){
        return null;
    }

    public int totalDeVotos(ArrayList candidatos){
        return 0;
    }
    public int mediaDeVotosPorCandidato(ArrayList candidatos){
        return 0;
    }

    @Override
    public String toString() {
        return "Candidatos da campanha: " +
                candidatos.toString();
    }
}
