package br.univille.poo.app.dbDAO;

import java.sql.Connection;

class BaseDAO {

    protected Connection getConection(){
        return ConectionClass.obterInstancia().getConection();
    }

}
