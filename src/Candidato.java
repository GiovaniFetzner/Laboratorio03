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

    public void setPartidosPoliticos(PartidosPoliticos partidosPoliticos) {
        this.partidosPoliticos = partidosPoliticos;

    }

    public PartidosPoliticos getPartidosPoliticos() {
        return partidosPoliticos;
    }

    public Candidato() {
    }

    public Candidato(String nome, PartidosPoliticos partidosPoliticos, int idade, int numeroDeVotos) {
        this.nome = nome;
        this.partidosPoliticos = partidosPoliticos;
        this.idade = idade;
        this.numeroDeVotos = numeroDeVotos;
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
