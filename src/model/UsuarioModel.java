/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Geral
 */
public class UsuarioModel {
    private int idUser;
    private String usuario;
    private String senha;
    private String fone;
    private String login;
    private String perfil;

    
    public UsuarioModel() {
    }

    public UsuarioModel(int idUser, String usuario, String senha, String fone, String login, String perfil) {
        this.idUser = idUser;
        this.usuario = usuario;
        this.senha = senha;
        this.fone = fone;
        this.login = login;
        this.perfil = perfil;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
        
    
    
    
}
