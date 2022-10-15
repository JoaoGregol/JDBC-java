package br.univille.poo.app;

import br.univille.poo.app.entity.Tarefa;
import br.univille.poo.app.tasks.ConcluirTarefa;
import br.univille.poo.app.tasks.CriarTarefa;
import br.univille.poo.app.tasks.ListarTarefas;

import java.util.Scanner;

public class Main {

    private static ConcluirTarefa concluirTarefa;
    public static void main(String[] args) {

        Tarefa tarefa = new Tarefa();
        tarefa.setDescricao("Segunda tarefa");

        Tarefa tarefa2 = new Tarefa();
        tarefa.setDescricao("Terceira tarefa");


        CriarTarefa criarTarefa = new CriarTarefa();
        try {
            criarTarefa.criar(tarefa);
        }catch (Exception e){
            e.printStackTrace();
        }

        ListarTarefas listarTarefas = new ListarTarefas();
        for(Tarefa t : listarTarefas.obterTodos()){
            System.out.println(t);
        }

        System.out.println("Tarefa a ser concluida");
        listarTarefas = new ListarTarefas();
        for(Tarefa t : listarTarefas.obterTodos()){
            System.out.println(t);
        }
        Scanner teclado2 = new Scanner(System.in);
        Integer escolha = teclado2.nextInt();

        ConcluirTarefa concluirTarefas = new ConcluirTarefa();
        try {
            concluirTarefa.concluir(escolha);
        }catch (Exception e){
            e.printStackTrace();
        }


    }

}

