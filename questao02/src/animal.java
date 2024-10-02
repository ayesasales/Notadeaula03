public class Animal {
    protected String nome, raca, locomocao;

    public Animal() {
    }

    public Animal(String nome, String raca, String locomocao) {
        this.nome = nome;
        this.raca = raca;
        this.locomocao = locomocao;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getLocomocao() {
        return locomocao;
    }

    public void setLocomocao(String locomocao) {
        this.locomocao = locomocao;
    }


}

