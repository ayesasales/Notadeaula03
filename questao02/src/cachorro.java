public class Cachorro extends Animal{
    private String late;

    public String getLate() {
        return late;
    }

    public void setLate(String late) {
        this.late = late;
    }

    public Cachorro() {
    }

    public Cachorro(String nome, String raca, String locomocao, String late) {
        super(nome, raca, locomocao);
        this.late = late;

    }
}
