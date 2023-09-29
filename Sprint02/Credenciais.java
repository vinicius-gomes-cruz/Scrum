import java.util.Scanner;

/**
 * Credenciais
 */
public class Credenciais {

    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        Usuario usuario = criarUsuario();
        realizarCadastro(usuario);
    }

    public static Usuario criarUsuario() {
        return new Usuario("Rodrigo", "rodrigo@gmail.com", "rodrigo");
    }

    public static void realizarCadastro(Usuario usuario) {
        System.out.printf("Email: ");
        String emailCad = LER.nextLine();
        System.out.printf("Senha: ");
        String senhaCad = LER.nextLine();

        if (validarCadastro(emailCad, senhaCad, usuario)){
            System.out.println("Login feito!");
            minhasInformacoes(usuario);
        }else{
            System.out.println("Algum dado está errado!");
        }
    }

    public static Boolean validarCadastro(String email, String senha, Usuario usuario) {
        if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha))
        return true;
        return false;
    }

    public static void minhasInformacoes(Usuario usuario) {
        System.out.println("---------------------------------");
        System.out.println("[1] Ver minhas informações");
        System.out.println("[2] Atualizar nome");
        System.out.println("[3] Atualizar email");
        System.out.println("[4] Atualizar senha");
        System.out.println("---------------------------------");
        switch (LER.nextLine()){
            case "1":
            System.out.println("Nome: "+usuario.getNome());
            System.out.println("Email: "+usuario.getEmail());
            System.out.println("Senha: "+usuario.getSenha());
            case "2":
            System.out.printf("Informe o novo nome: ");
            usuario.setNome(LER.nextLine());
            System.out.println("Nome atualizado!");
            break;

            case "3":
            System.out.printf("Informe o novo email: ");
            usuario.setNome(LER.nextLine());
            System.out.println("Email atualizado!");
            break;

            case "4":
            System.out.printf("Informe a nova senha: ");
            usuario.setNome(LER.nextLine());
            System.out.println("Senha atualizada!");
            break;

            default:
            System.out.println("Sair");
        }
    }

}