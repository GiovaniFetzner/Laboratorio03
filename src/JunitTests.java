import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


class JunitTests {

    private ArrayList<Candidato> candidatos;

    private Campanha campanha;
    private Candidato candidato01;
    private Candidato candidato02;

    JunitTests(){
        candidatos = new ArrayList<>();
        campanha = new Campanha(candidatos);
        candidato01 = new Candidato("Ademar", PartidosPoliticos.DIREITA,50, 110);
        candidato02 = new Candidato("Angelina", PartidosPoliticos.LIBERAL, 65,100);
        candidatos.add(candidato01);
        candidatos.add(candidato02);
    }

  /*  @Test
    void cadastro_Candidato() {
    }*/

    @Test
    void candidatoJovem() {
        assertEquals(candidato01,campanha.candidatoJovem());
    }

    @Test
    void candidatoVelho() {
        assertEquals(candidato02,campanha.candidatoVelho());
    }

    @Test
    void candidatoMaisVotado() {
        assertEquals(candidato01,campanha.candidatoMaisVotado());
    }

    @Test
    void candidatoMenosVotado() {
        assertEquals(candidato02,campanha.candidatoMenosVotado());
    }

    @Test
    void totalDeVotos() {
        assertEquals(210,campanha.totalDeVotos());
    }

    @Test
    void mediaDeVotosPorCandidato() {
        assertEquals(((candidato01.getNumeroDeVotos()+candidato02.getNumeroDeVotos())/2),
                campanha.mediaDeVotosPorCandidato());
    }
}