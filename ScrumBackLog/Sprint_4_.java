import java.util.Scanner;

public class Sprint_4_ {

    public static void main(String[] args) {
        String funcionario;
        String permissao;

        funcionario = Sprint_3_.nomeFuncionario();
        permissao = nivelPermissao();

        System.out.println("Funcionario: " + funcionario + "Nivel de Permissão: " + permissao);
    }
    public static String nivelPermissao(){
        String x;
        System.out.println("Informe o Nivel de permissao do Funcionario (A) Administrador (G) Gerente (S) Sem permissão ");

        x = ler.next();

        return x;
    }
}
