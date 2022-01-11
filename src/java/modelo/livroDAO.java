/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Administrador
 */
public class livroDAO extends DataBaseDAO{
    public void inserir(livro l) throws Exception{
        String sql = "INSERT INTO livro (Prateleira_Numero,Edicao,Ano,Descricao,ISBN_RDA,Editora,Turma,Titulo) VALUES(?,?,?,?,?,?,?,?)";
        this.conectar();
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, l.getPrateleira_Numero());
        pstm.setString(2, l.getEdicao());
        pstm.setString(3, l.getAno());
        pstm.setString(4, l.getDescricao());
        pstm.setString(5, l.getISBN_RDA());
        pstm.setString(6, l.getEditora());
        pstm.setString(7, l.getTurma());
        pstm.setString(8, l.getTitulo());
        pstm.execute();
        this.desconectar();
    }
    public ArrayList<livro> listar() throws Exception{
        ArrayList<livro> lista = new ArrayList<livro>();
        String sql = "SELECT * FROM livro";
        this.conectar();
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            livro l = new livro();
            l.setId(rs.getInt("id"));
            l.setPrateleira_Numero(rs.getString("Prateleira_Numero"));
            l.setEdicao(rs.getString("Edicao"));
            l.setAno(rs.getString("Ano"));
            l.setDescricao(rs.getString("Descricao"));
            l.setISBN_RDA(rs.getString("ISBN_RDA"));
            l.setEditora(rs.getString("Editora"));
            l.setTurma(rs.getString("Turma"));
            l.setTitulo(rs.getString("Titulo"));          
          
            lista.add(l);
        }
        this.desconectar();
        return lista;
    }
    public void excluir(int id) throws Exception{
        String sql = "DELETE FROM livro WHERE id=?";
        this.conectar();
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id);
        pstm.execute();
        this.desconectar();
    }
    
    public livro carregarPorId(int id) throws Exception{
        livro l = new livro();
        String sql = "SELECT * FROM livro WHERE id=?";
        this.conectar();
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id);
        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            l.setId(rs.getInt("id"));
            l.setPrateleira_Numero(rs.getString("Prateleira_Numero"));
            l.setEdicao(rs.getString("Edicao"));
            l.setAno(rs.getString("Ano"));
            l.setDescricao(rs.getString("Descricao"));
            l.setISBN_RDA(rs.getString("ISBN_RDA"));
            l.setEditora(rs.getString("Editora"));
            l.setTurma(rs.getString("Turma"));
            l.setTitulo(rs.getString("Titulo"));
        }
        this.desconectar();
        return l;
    }
    public void alterar(livro l) throws Exception{
        String sql = "UPDATE livro SET Prateleira_Numero=?,Edicao=?,Ano=?,Descricao=?,ISBN_RDA=?,Editora=?,Turma=?,Titulo=? WHERE id=?";
        this.conectar();
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, l.getPrateleira_Numero());
        pstm.setString(2, l.getEdicao());
        pstm.setString(3, l.getAno());
        pstm.setString(4, l.getDescricao());
        pstm.setString(5, l.getISBN_RDA());
        pstm.setString(6, l.getEditora());
        pstm.setString(7, l.getTurma());
        pstm.setString(8, l.getTitulo());
        pstm.setInt(9, l.getId());
        pstm.execute();
        this.desconectar();
    }
}
