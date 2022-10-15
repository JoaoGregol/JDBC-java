package br.univille.poo.app.entity;

public class Tarefa {

    private int id;
    private String descricao;
    private boolean finished;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluido() {
        return finished;
    }

    public void setConcluido(boolean finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", finished=" +  +
                '}';
    }

}
