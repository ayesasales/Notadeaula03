import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        funcionario f = new funcionario();
        gerente g = new gerente();
        programador p = new programador();

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String r;

        do{System.out.println("Digite 0 se for Programador e 1 se for Gerente");
            int opcao = sc.nextInt();

            System.out.println("Digite o nome do Funcionario: ");
            f.setNome(sc2.nextLine());

            System.out.println("Digite o ano de nascimento: ");
            f.setNascimento(sc.nextInt());

            System.out.println("Digite o salario do Funcionario: ");
            f.setSalario(sc.nextDouble());


            switch(opcao){
                case(0):
                    p.informarLinguagem();
                    break;

                case(1):
                    g.informarProjeto();
                    break;

            }

            System.out.println("Nome: "+f.getNome());
            f.calcularIdade();
            System.out.println("Idade: "+f.getIdade());
            System.out.println("Salario: "+f.getSalario());
            if(opcao==0){
                System.out.println("Linguagem: " + p.getLinguagem());
            }else{
                System.out.println("Projeto "+ g.getProjeto());
            }

            System.out.println("Deseja cadastrar outro usuário, digite S");
            r = sc.next();

        }while (r.equalsIgnoreCase("S"));

    }
}