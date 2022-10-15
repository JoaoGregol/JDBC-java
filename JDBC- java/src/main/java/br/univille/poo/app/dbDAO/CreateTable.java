package br.univille.poo.app.dbDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class CreateTable {

    private final static String CREATE_TABLE_TASK = "create table if not exists tarefa(" +
            "                id integer primary key autoincrement" +
            "               ,descricao  varchar(200)" +
            "               ,concluido  boolean" +
            "            )";

    public static void CreateTable(){
        List<String> lista = new ArrayList<>();
        lista.add(CREATE_TABLE_TASK);
        for (String comando : lista){
            try(Connection c = ConectionClass.obterInstancia().getConection();
                PreparedStatement p = c.prepareStatement(comando)) {
                p.execute();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }

}
