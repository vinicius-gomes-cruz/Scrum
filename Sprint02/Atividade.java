

public class Atividade {
    private String nome;
    private String descricao;
    private String faxia_etaria;
    private String niveis_habilidade;
    private String turmas;
    private String diaSemana;
    private String horario_inicio;
    private String horario_termino;

    public String getNome() {
        return nome;
    }

    public String getfaxia_etaria() {
        return faxia_etaria;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getFaxia_etaria() {
        return faxia_etaria;
    }

    public String getNiveis_habilidade() {
        return niveis_habilidade;
    }

    public String getTurmas() {
        return turmas;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public String getHorario_inicio() {
        return horario_inicio;
    }

    public String getHorario_termino() {
        return horario_termino;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setFaxia_etaria(String faxia_etaria) {
        this.faxia_etaria = faxia_etaria;
    }

    public void setNiveis_habilidade(String niveis_habilidade) {
        this.niveis_habilidade = niveis_habilidade;
    }

    public void setTurmas(String turmas) {
        this.turmas = turmas;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public void setHorario_inicio(String horario_inicio) {
        this.horario_inicio = horario_inicio;
    }

    public void setHorario_termino(String horario_termino) {
        this.horario_termino = horario_termino;
    }

    Atividade(String nome, String descricao, String turmas, String faxia_etaria, String niveis_habilidade, String diaSemana, String horario_inicio, String horario_termino){
        this.nome = nome;
        this.descricao = descricao;
        this.faxia_etaria = faxia_etaria;
        this.niveis_habilidade = niveis_habilidade;
        this.diaSemana = diaSemana;
        this.turmas = turmas;
        this.horario_inicio = horario_inicio;
        this.horario_termino = horario_termino;
    }
}
