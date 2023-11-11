import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


class JunitTests {

    private ArrayList<Candidato> candidatos;
    private Candidato candidato01;
    private Candidato candidato02;

    JunitTests(){
        Campanha campanha = new Campanha(candidatos);
        candidato01 = new Candidato("Ademar", PartidosPoliticos.DIREITA,
        50, 110); //String nome, PartidosPoliticos partidosPoliticos, int idade, int numeroDeVotos
        candidato02 = new Candidato("Angelina", PartidosPoliticos.LIBERAL, 65,100);
        candidatos.add(candidato01);
        candidatos.add(candidato02);
    }

    @Test
    void cadastro_Candidato() {
    }

    @Test
    void candidatoJovem() {
    }

    @Test
    void candidatoVelho() {
    }

    @Test
    void candidatoMaisVotado() {
    }

    @Test
    void candidatoMenosVotado() {
    }

    @Test
    void totalDeVotos() {
    }

    @Test
    void mediaDeVotosPorCandidato() {
    }
}