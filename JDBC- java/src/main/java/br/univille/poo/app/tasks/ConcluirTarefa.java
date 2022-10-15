package br.univille.poo.app.tasks;

import br.univille.poo.app.entity.Tarefa;
import br.univille.poo.app.dbDAO.TaskDAO;

public class ConcluirTarefa {


    private TaskDAO dao;

    public ConcluirTarefa(){
        dao = new TaskDAO();
    }


    public void finished(Tarefa tarefa) throws Exception {
        if(tarefa.getId() < 1){
            throw  new Exception("A tarefa não possui um id válido.");
        }
        if(tarefa.isConcluido()){
            throw  new Exception("A tarefa "+tarefa.getId()+" está concluída.");
        }
        tarefa.setConcluido(true);
        dao.atualizar(tarefa);
    }

    public void concluir(interger idTarefa) throws Exception {
        dao.add(idTarefa);
    }

    public void concluir(Integer idTarefa) throws Exception {

        dao.atualizar(idTarefa);
    }
}
