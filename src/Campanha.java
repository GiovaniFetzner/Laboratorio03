import java.util.ArrayList;
import java.util.*;

public class Campanha {

    private ArrayList candidatos;
    Scanner ler = new Scanner(System.in);
    public boolean Cadastro_Candidato(){

            Candidato candidato = new Candidato();
            System.out.println("");

            candidatos.add(candidato);

        return true;
    }

    public Candidato candidatoJovem(ArrayList candidatos){
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

}
