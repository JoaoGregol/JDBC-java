package br.univille.poo.app.tasks;

import br.univille.poo.app.entity.Tarefa;
import br.univille.poo.app.dbDAO.TaskDAO;

import java.util.List;

public class ListarTarefas {

    private TaskDAO dao;

    public ListarTarefas(){
        dao = new TaskDAO();
    }

    public List<Tarefa> obterTodos(){
        return dao.obterTodos();
    }

}
