import java.util.ArrayList;
import java.util.*;

public class Campanha {

    private ArrayList<Candidato> candidatos;

    public Campanha(ArrayList<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    public boolean Cadastro_Candidato(){

        Scanner ler_string = new Scanner(System.in);
        Scanner ler_int = new Scanner (System.in);
        int escolha = 0;
        PartidosPoliticos temp;
        boolean Candidato_existe = true;

        Candidato candidato = new Candidato();
        System.out.println("Informe o Nome do Candidato: ");
        candidato.setNome(ler_string.nextLine());

        while (Candidato_existe) {
            System.out.println("Informe o Partido:\n1.Direita\n2.Esquerda\n3.Centro\n4.Liberal");
            escolha = ler_int.nextInt();
            switch (escolha) {
                case 1:
                    candidato.setPartidosPoliticos(PartidosPoliticos.DIREITA);
                    Candidato_existe = false;
                    break;
                case 2:
                    candidato.setPartidosPoliticos(PartidosPoliticos.ESQUERDA);
                    Candidato_existe = false;
                    break;
                case 3:
                    candidato.setPartidosPoliticos(PartidosPoliticos.CENTRO);
                    Candidato_existe = false;
                    break;
                case 4:
                    candidato.setPartidosPoliticos(PartidosPoliticos.LIBERAL);
                    Candidato_existe = false;
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

    public Candidato candidatoJovem(){
        Candidato candidatoMaisJovem = new Candidato();
        candidatoMaisJovem = candidatos.get(0);

        for (Candidato candidato: candidatos) {
            if(candidato.getIdade() < candidatoMaisJovem.getIdade()){
                candidatoMaisJovem = candidato;
            }
        }
        return candidatoMaisJovem;
    }

    public Candidato candidatoVelho(){
        Candidato candidatoMaisVelho = new Candidato();
        candidatoMaisVelho = candidatos.get(0);

        for (Candidato candidato: candidatos) {
            if(candidato.getIdade() > candidatoMaisVelho.getIdade()){
                candidatoMaisVelho = candidato;
            }
        }
        return candidatoMaisVelho;
    }

    public Candidato candidatoMaisVotado(){
        Candidato candidatoMaisVotado = new Candidato();
        candidatoMaisVotado = candidatos.get(0);

        for (Candidato candidato: candidatos) {
            if(candidato.getNumeroDeVotos() > candidatoMaisVotado.getNumeroDeVotos()){
                candidatoMaisVotado = candidato;
            }
        }
        return candidatoMaisVotado;
    }
    public Candidato candidatoMenosVotado(){
        Candidato candidatoMaisVotado = new Candidato();
        candidatoMaisVotado = candidatos.get(0);

        for (Candidato candidato: candidatos) {
            if(candidato.getNumeroDeVotos() < candidatoMaisVotado.getNumeroDeVotos()){
                candidatoMaisVotado = candidato;
            }
        }
        return candidatoMaisVotado;
    }

    public int totalDeVotos(){
        int soma = 0;
        for (Candidato candidatos: candidatos) {
            soma += candidatos.getNumeroDeVotos();
        }
        return soma;
    }
    public int mediaDeVotosPorCandidato(){
        int soma = 0;
        for (Candidato candidatos: candidatos) {
            soma += candidatos.getNumeroDeVotos();
        }
        return (soma/candidatos.size());
    }

    @Override
    public String toString() {
        return "Candidatos da campanha: " +
                candidatos.toString();
    }
}
