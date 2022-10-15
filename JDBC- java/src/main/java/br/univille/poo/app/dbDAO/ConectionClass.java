package br.univille.poo.app.dbDAO;

import java.sql.Connection;
import java.sql.DriverManager;

class ConectionClass {

    private static ConectionClass instancia;

    private ConectionClass(){}

    public static ConectionClass obterInstancia(){
        if(instancia == null){
            instancia = new ConectionClass();
        }
        return instancia;
    }

    public Connection getConection(){
        try{
            String stringDeConexao = "jdbc:sqlite:tarefas.db";
            Connection c = DriverManager.getConnection(stringDeConexao);
            return c;
        }catch (Exception e){
            e.printStackTrace();
        }
        throw  new RuntimeException("Erro ao criar a conexão com o banco de dados.");
    }


}
