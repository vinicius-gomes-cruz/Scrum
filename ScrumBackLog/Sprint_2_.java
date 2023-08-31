import java.util.Scanner;


public class Sprint_2_ {
    final static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        String[] array = new String[6];
        array = Sprint_1_.dadosCliente; 
        System.out.println("Este é o ambiente de cadastro: \n");
        Sprint_1_.printarArray(array);
        array = oqMudar(array);

    }
    public static String[] oqMudar(String[] array){
        int x;
        do{
        System.out.println("Oque Voçê quer Mudar:");
        System.out.println("caso queira mudar nome Do Cliente Digite        [1]");
        System.out.println("caso queira mudar Endereço do Cliente Digite    [2]");
        System.out.println("caso queira mudar Numero De telefone Digite     [3]");
        System.out.println("caso queira mudar E-mail do Cliente Digite      [4]");
        System.out.println("caso queira mudar Os Dependentes Digite         [5]");
        System.out.println("caso queira mudar Os Dados de Pagamentos Digite [6]");
        System.out.println("caso queira sair da qui digite [0]");
        x = ler.nextInt();
    }while(x != 0);
       
        return array;
    }
    public static String[] opicao_1_(String[] array){
        array[0] = Sprint_1_.nomeCliente();
        return array;
    }
    public static String[] opicao_2_(String[] array){
        array[1] = Sprint_1_.enderecoDoCliente();
        return array;
    }
    public static String[] opicao_3_(String[] array){
        array[2] = Sprint_1_.numeroDeTelefone();
        return array;
    }
    public static String[] opicao_4_(String[] array){
        array[3] = Sprint_1_.emailDoCliente();
        return array;
    }
    public static String[] opicao_5_(String[] array){
        array[4] = Sprint_1_.dadosDePagamentos();
        return array;
    }
    public static String[] opicao_6_(String[] array){
        array[5] = Sprint_1_.receberDependentes();
        return array;
    }
    
}
