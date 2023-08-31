import java.util.Scanner;

public class Sprint_1_{
    final static Scanner ler = new Scanner(System.in);
    static String[] dadosCliente;
    public static void main(String[] args) {
        dadosCliente = new String[6];
        dadosCliente = completaVetor(dadosCliente);
        printarArray(dadosCliente);
        
    }
    public static String[] completaVetor(String[] array){
        array[0] = nomeCliente();
        array[1] = enderecoDoCliente();
        array[2] = numeroDeTelefone();
        array[3] = emailDoCliente();
        array[4] = dadosDePagamentos();
        array[5] = receberDependentes();
        return array;
    }
    public static String nomeCliente(){
        String x;
        System.out.println("Informe o Nome do Cliente:");
        
        x = ("Nome: "+ler.next());
        
        return x;
    }
    public static String enderecoDoCliente(){
        String x;
        String Y;
        String Z;
        String W;
        System.out.println("Em qual Bairro o Cliente Mora: ");
        x = ler.next();
        
        System.out.println("Qual é a Rua em que ele mora: ");
        Y = ler.next();

        System.out.println("Qual é o Numero da casa: ");
        Z = ler.next();
        W = ("O cliente mora no Bairo "+x+", na rua "+Y+", na casa "+Z+";");
        return W;
    }
    public static String numeroDeTelefone(){
        String x;
        System.out.println("qual o numero de Telefone Do Cliente: ");
        
        x = ("Numero: "+ler.next());        
        return x;
    }
    public static String emailDoCliente(){
        String x;
        System.out.println("Qual o E-Mail Do Cliente: ");
        x = ("E-mail: "+ler.next());
        return x;
    }
    public static String receberDependentes(){
        System.out.println("a qunatos dependentes?");
        int x = ler.nextInt();
        String[] dependentes = new String[x];
        for (int i = 0; i < dependentes.length; i++) {
            System.out.println("Informe os nomes Dos dependentes 1 por 1: ");
            dependentes[i] = ler.next();
        }
        return String.join(";", dependentes);
    }
    public static String dadosDePagamentos(){
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