public class Candidato {
    private String nome;
    PartidosPoliticos partidosPoliticos;
    private int idade, numeroDeVotos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PartidosPoliticos getPartidosPoliticos() {
        return partidosPoliticos;
    }

    public void setPartidosPoliticos(PartidosPoliticos partidosPoliticos) {
        this.partidosPoliticos = partidosPoliticos;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroDeVotos() {
        return numeroDeVotos;
    }

    public void setNumeroDeVotos(int numeroDeVotos) {
        this.numeroDeVotos = numeroDeVotos;
    }
}
