import java.util.Scanner;

public class VisaoGerente {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        Funcionario[] listadeFuncionarios = new Funcionario[5];
        Funcionario funcionario1 = new Funcionario("Pedro", "pedro@gmail.com", "pedro", "Google e Microsoft", "Excelente");
        Funcionario funcionario2 = new Funcionario("Henrique", "henrique@gmail.com", "henrique", "Linux e Opera", "Decente");
        
        listadeFuncionarios[0] = funcionario1;
        listadeFuncionarios[1] = funcionario2;
        informacoesFuncionario(listadeFuncionarios);

    }

    public static Funcionario criarFuncionario() {
        return new Funcionario("Pedro", "pedro@gmail.com", "pedro", "Google e Microsoft", "Excelente");
    }

    public static void informacoesFuncionario(Funcionario[] listadeFuncionarios) {
        System.out.println("Informações dos Funcionarios");
        boolean continua = true;
        while (continua){
            System.out.println("---------------------------------");
            System.out.printf("Digite o nome do funcionario ou S para sair: ");
            String nome = LER.nextLine();
            System.out.println("---------------------------------");

            if (nome.equals("S")){
                break;
            }
            for (Funcionario f: listadeFuncionarios){
                if (f.getNome().equals(nome)){
                    System.out.println("Nome: "+f.getNome());
                    System.out.println("Nome: "+f.getEmail());
                    System.out.println("Nome: "+f.getHistorico());
                    System.out.println("Nome: "+f.getFeedbacks());
                    break;
                }
            }
        }
    }
}
