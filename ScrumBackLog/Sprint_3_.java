import java.util.Scanner;

public class Sprint_3_{
    final static Scanner ler = new Scanner(System.in);
    static String[] dadosFuncionario;
    public static void main(String[] args) {
        dadosFuncionario = new String[6];
        dadosFuncionario = completaVetor(dadosFuncionario);
        printarArray(dadosFuncionario);
        
    }
    public static String[] completaVetor(String[] array){
        array[0] = nomeFuncionario();
        array[1] = enderecoDoFuncionario();
        array[2] = numeroDeTelefone();
        array[3] = emailDoFuncionario();
        array[4] = cargoDoFuncionarioio();
        array[5] = salarioDoFuncionario(); 
        return array;
    }
    public static String nomeFuncionario(){
        String x;
        System.out.println("Informe o Nome do Funcionario:");
        
        x = ("Nome: "+ler.next());
        
        return x;
    }
    public static String enderecoDoFuncionario(){
        String x;
        String Y;
        String Z;
        String W;
        System.out.println("Em qual Bairro o Funcionario Mora: ");
        x = ler.next();
        
        System.out.println("Qual é a Rua em que ele mora: ");
        Y = ler.next();

        System.out.println("Qual é o Numero da casa: ");
        Z = ler.next();
        W = ("O Funcionario mora no Bairo "+x+", na rua "+Y+", na casa "+Z+";");
        return W;
    }
    public static String numeroDeTelefone(){
        String x;
        System.out.println("qual o numero de Telefone Do Funcionario: ");
        
        x = ("Numero: "+ler.next());        
        return x;
    }
    public static String emailDoFuncionario(){
        String x;
        System.out.println("Qual o E-Mail Do Funcionario: ");
        x = ("E-mail: "+ler.next());
        return x;
    }
    public static String salarioDoFuncionario(){
        System.out.println("a qunatos dependentes?");
        int x = ler.nextInt();
        String[] dependentes = new String[x];
        for (int i = 0; i < dependentes.length; i++) {
            System.out.println("Informe os nomes Dos dependentes 1 por 1: ");
            dependentes[i] = ler.next();
        }
        return String.join(";", dependentes);
    }
    public static String cargoDoFuncionarioio(){
        System.out.println("Informe o numero de Cartão: ");
        String x = ("Numero Cartão: "+ler.next());
        return x;
    }
    public static void printarArray(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]); 
        }
    }
}