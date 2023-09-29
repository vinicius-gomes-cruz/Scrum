import java.util.Scanner;

public class Funcionario {
    private String nome;
    private String email;
    private String senha;
    private String historico;
    private String feedback;

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getHistorico() {
        return historico;
    }

    public String getFeedbacks() {
        return feedback;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public void setFeedbacks(String feedback) {
        this.feedback = feedback;
    }

    Funcionario(String nome, String email, String senha, String historico, String feedback) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.historico = historico;
        this.feedback = feedback;

    }

    public Atividade cadastrarAtividades(){
        Scanner LER = new Scanner(System.in);
        System.out.printf("Nome: ");
        String nome = LER.nextLine();
        System.out.printf("Descrição: ");
        String descricao = LER.nextLine();
        System.out.printf("Turma: ");
        String turmas = LER.nextLine();
        System.out.printf("Faixa etária: ");
        String faxia_etaria = LER.nextLine();
        System.out.printf("Níveis de habilidade: ");
        String niveis_habilidade = LER.nextLine();
        System.out.printf("Dia da semana: ");
        String diaSemana = LER.nextLine();
        System.out.printf("Horário de início: ");
        String horario_inicio = LER.nextLine();
        System.out.printf("Horário de término: ");
        String horario_termino = LER.nextLine();
        LER.close();
        return new Atividade(nome, descricao, turmas, faxia_etaria, niveis_habilidade, diaSemana, horario_inicio, horario_termino);
    }

}
