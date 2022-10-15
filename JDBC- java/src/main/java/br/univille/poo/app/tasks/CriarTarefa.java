package br.univille.poo.app.tasks;

import br.univille.poo.app.entity.Tarefa;
import br.univille.poo.app.dbDAO.TaskDAO;

public class CriarTarefa {

    private TaskDAO dao;

    public CriarTarefa(){
        dao = new TaskDAO();
    }

    public void criar(Tarefa tarefa) throws Exception {
        if(tarefa.getDescricao() == null || tarefa.getDescricao().length() < 4){
            throw  new Exception("INSERIR TAREFA");
        }
        dao.inserir(tarefa);
    }

}
