public class programador extends funcionario{
    private String linguagem;

    public String getLinguagem(){
        return linguagem;
    }

    public void setLinguagem(String linguagem){
        this.linguagem = linguagem;
    }

    public void informarLinguagem(){
        System.out.println("Informe a linguagem:");
        setLinguagem(sc2.nextLine());

    }


}
