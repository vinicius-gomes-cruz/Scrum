import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    final static Scanner LER = new Scanner(System.in);
    static ArrayList<Atividade> lista_atividades = new ArrayList<>();

    public static void main(String[] args) {
        realizarCadastro(criarFuncionario());
    }

    public static Funcionario criarFuncionario() {
        return new Funcionario("Pedro", "pedro@gmail.com", "pedro", "Google e Microsoft", "Excelente");
    }

    public static void realizarCadastro(Funcionario funcionario) {
        System.out.printf("Email: ");
        String emailCad = LER.nextLine();
        System.out.printf("Senha: ");
        String senhaCad = LER.nextLine();

        if (validarCadastro(emailCad, senhaCad, funcionario)){
            System.out.println("Login feito!");
            minhasInformacoes(funcionario);
        }else{
            System.out.println("Algum dado está errado!");
        }
    }

    public static Boolean validarCadastro(String email, String senha, Funcionario funcionario) {
        if (funcionario.getEmail().equals(email) && funcionario.getSenha().equals(senha))
        return true;
        return false;
    }

    public static void minhasInformacoes(Funcionario funcionario) {
        boolean continua = true;
        while (continua){
            System.out.println("---------------------------------");
            System.out.println("[1] Ver minhas informações");
            System.out.println("[2] Cadastrar atividades");
            System.out.println("[3] Visualizar atividades");
            System.out.println("---------------------------------");
            switch (LER.nextLine()){
                case "1":
                System.out.println("Nome: "+funcionario.getNome());
                System.out.println("Email: "+funcionario.getEmail());
                System.out.println("Senha: "+funcionario.getSenha());
                System.out.println("Historico de Trabalhos: "+funcionario.getHistorico());
                System.out.println("Feedback Recebidos: "+funcionario.getFeedbacks());
                break;
                
                case "2":
                lista_atividades.add(funcionario.cadastrarAtividades());
                break;

                case "3":
                for (int i = 0; i < lista_atividades.size(); i++) {
                    System.out.println(lista_atividades.get(i).getNome());
                }
                break;

                default:
                System.out.println("Saiu!");
                continua = false;
            }
        }
    }
}
