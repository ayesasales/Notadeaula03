import java.util.Scanner;
public class funcionario {
    protected String nome;
    protected int nascimento;
    protected double salario;
    protected int idade;

    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner (System.in);

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNascimento(int nascimento){
        this.nascimento = nascimento;
    }

    public int nascimentos(){
        return nascimento;
    }

    public void informarSalario(){
        System.out.println("Informe salário");
        setSalario(sc.nextDouble());
    }
    public void calcularIdade() {
        idade = 2024 - nascimento;


    }


}
