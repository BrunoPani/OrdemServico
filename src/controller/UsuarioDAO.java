/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import conexao.Conexao;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.UsuarioModel;

/**
 *
 * @author Geral
 */
public class UsuarioDAO {
    private Connection conexao;
    PreparedStatement pst;
    ResultSet rs;
    
   public void adicionarUsuario(UsuarioModel obj) {

        try {
            conexao = Conexao.conectar();

            //1 passo - criar o comando sql
            String sql = "insert into tbusuarios(usuario,fone,login,senha,perfil) values(?,?,?,md5(?),?)";

            //2 passo - conectar o banco de dados e organizar o comando sql
            pst = conexao.prepareStatement(sql);
            pst.setString(1, obj.getUsuario());
            pst.setString(2, obj.getFone());
            pst.setString(3, obj.getLogin());
            pst.setString(4, obj.getSenha());
            pst.setString(5, obj.getPerfil());

            //3 passo - executar o comando sql
            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);

        }

    }
   
   public void editarUsuario(UsuarioModel obj) {

        try {
            //1 passo - criar o comando sql
            String sql = "update tbusuarios set usuario=?,fone=?,login=?,perfil=? where iduser=?";

            //2 passo - conectar o banco de dados e organizar o comando sql
            conexao = Conexao.conectar();
            pst = conexao.prepareStatement(sql);

            pst.setString(1, obj.getUsuario());
            pst.setString(2, obj.getFone());
            pst.setString(3, obj.getLogin());
            pst.setString(4, obj.getPerfil());

            pst.setInt(5, obj.getIdUser());

            //3 passo - executar o comando sql
            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Dados do usu??rio alterados com sucesso");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }
   
   public UsuarioModel consultaUsuario(String nome) {
        try {
            conexao = Conexao.conectar();
            //1 passo - criar o sql , organizar e executar.
            String sql = "select * from tbusuarios where usuario like ?";
            pst = conexao.prepareStatement(sql);
            pst.setString(1, nome);

            rs = pst.executeQuery();
            UsuarioModel obj = new UsuarioModel();

            if (rs.next()) {

            obj.setIdUser(rs.getInt("iduser"));
            obj.setUsuario(rs.getString("usuario"));
            obj.setFone(rs.getString("fone"));
            obj.setLogin(rs.getString("login"));
            obj.setSenha(rs.getString("senha"));
            obj.setPerfil(rs.getString("perfil"));

        }
            return obj;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Usu??rio n??o encontrado!");
            return null;
        }
    }
   
}

