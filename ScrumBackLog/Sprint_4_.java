import java.util.Scanner;

public class Sprint_4_ {
    static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        String funcionario;
        String permissao;

        String[] vet = Sprint_3_.retornaVetor();
        funcionario = "";
        permissao = nivelPermissao();

        System.out.println("Funcionario: " + funcionario + "Nivel de Permissão: " + permissao);
    }
    public static String nivelPermissao(){
        String x;
        System.out.println("Informe o Nivel de permissao do Funcionario (A) Administrador (G) Gerente (S) Sem permissão ");

        x = LER.next();

        return x;
    }
}
