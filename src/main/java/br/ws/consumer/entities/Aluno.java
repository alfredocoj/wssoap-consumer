package br.ws.consumer.entities;

public class Aluno {

    protected int alunoId;

    protected String alunoName;

    protected int alunoIdade;

    protected String alunoClasse;

    public int getId() {
        return alunoId;
    }

    public int getAlunoId() {
        return alunoId;
    }
    public void setAlunoId(int alunoId) {
        this.alunoId = alunoId;
    }
    public String getAlunoName() {
        return alunoName;
    }
    public void setAlunoName(String alunoName) {
        this.alunoName = alunoName;
    }
    public int getAlunoIdade() {
        return alunoIdade;
    }
    public void setAlunoIdade(int alunoIdade) {
        this.alunoIdade = alunoIdade;
    }
    public String getAlunoClasse() {
        return alunoClasse;
    }
    public void setAlunoClasse(String alunoClasse) {
        this.alunoClasse = alunoClasse;
    }

    @Override
    public String toString() {
        return "Aluno [alunoId=" + alunoId + ", alunoName=" + alunoName + ", alunoIdade=" + alunoIdade
                + ", alunoClasse=" + alunoClasse + "]";
    }
}
