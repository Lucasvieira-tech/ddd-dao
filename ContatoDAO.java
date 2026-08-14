package br.com.fiap.agenda.dao;

import br.com.fiap.agenda.models.Contato;

import java.sql.Connection;
import java.sql.PreparedStatement;

//Classe reponsável pelo CRUD  de contato
public class ContatoDAO {
    private Connection conexao;

    public void cadastrar(Contato contato){
        conexao = ConnectionFactory.obterConexao();
        PreparedStatement comandoSql = null;
        try{
            String sql = "insert into tbl_contato values(1, 'Lucas'," +
                    "'11974849466','martivieiralucas@gmail,com',null,null);";
        }
    }
}
