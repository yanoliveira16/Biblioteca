/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author yango
 */
public class livro {
    private String Prateleira_Numero;
    private String Titulo;
    private String ISBN_RDA;
    private String Turma;
    private String Ano;
    private String Editora,Edicao;
    private String Descricao;
    private int id;

    public String getPrateleira_Numero() {
        return Prateleira_Numero;
    }

    public void setPrateleira_Numero(String Prateleira_Numero) {
        this.Prateleira_Numero = Prateleira_Numero;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getISBN_RDA() {
        return ISBN_RDA;
    }

    public void setISBN_RDA(String ISBN_RDA) {
        this.ISBN_RDA = ISBN_RDA;
    }

    public String getTurma() {
        return Turma;
    }

    public void setTurma(String Turma) {
        this.Turma = Turma;
    }

    public String getAno() {
        return Ano;
    }

    public void setAno(String Ano) {
        this.Ano = Ano;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String Editora) {
        this.Editora = Editora;
    }

    public String getEdicao() {
        return Edicao;
    }

    public void setEdicao(String Edicao) {
        this.Edicao = Edicao;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
   
}
