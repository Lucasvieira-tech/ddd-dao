package br.com.fiap.agenda.dao;

import br.com.fiap.agenda.models.Contato;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//Classe reponsável pelo CRUD  de contato
public class ContatoDAO {
    private Connection conexao;
    //CRUD -> Create (cadastro) : SQL: insert

    public void cadastrar(Contato contato) {
        conexao = ConnectionFactory.obterConexao();
        PreparedStatement comandoSql = null;
        try {
            String sql = "insert into tbl_contato (ID_CONTATO,NOME_CONTATO," +
                    "CELULAR_CONTATO,EMAIL_CONTATO,INSTAGRAM,TIPO)" +
                    "values(?,?,?,?,?, ?)";
            comandoSql = conexao.prepareStatement(sql);
            comandoSql.setInt(1, contato.getId());
            comandoSql.setString(2, contato.getNome());
            comandoSql.setString(3, getCelular);
            comandoSql.setString(4, getEmail());
            comandoSql.setString(5, getInstagram());
            comandoSql.setString(6, getTipo());
            comandoSql.executeUpdate();
            comandoSql.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //CRUD - R: READ - SQL: Select

    public  Contato buscarPorId(int id){
        conexao = ConnectionFactory.obterConexao();
        PreparedStatement ps = null;
        Contato contato = new Contato();
        try {
            ps = conexao.prepareStatement("select * from TBL_CONTATO where ID_CONTATO = ?");
            ps = setInt.(1, id);
            ResultSet rs =  ps.executeQuery();
            if (rs.next()){
                contato.setId(rs.getInt(1));
                contato.setNome(rs.getInt(2));
                contato.setCelular(rs.getInt(3));
                contato.setEmail(rs.getInt(4));
                contato.setInstagram(rs.getInt(5));
                contato.setTipo(rs.getInt(6));
            }
        }catch (SQLException e ){
            throw new RuntimeException(e);
        }
    }
}