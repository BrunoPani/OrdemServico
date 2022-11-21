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
import model.ClienteModel;

/**
 *
 * @author Geral
 */
public class ClienteDAO {
    
    //private java.sql.Connection conexao;
    private Connection conexao;
    PreparedStatement pst;
    ResultSet rs;
    
    public void adicionarCliente(ClienteModel obj) {

        try {
            conexao = Conexao.conectar();

            //1 passo - criar o comando sql
            String sql = "insert into tbclientes( nomecli,endcli, fonecli,emailcli) values(?,?,?,?)";

            //2 passo - conectar o banco de dados e organizar o comando sql
            pst = conexao.prepareStatement(sql);
            pst.setString(1, obj.getNome());
            pst.setString(2, obj.getEndereco());
            pst.setString(3, obj.getFone());
            pst.setString(4, obj.getEmail());

            //3 passo - executar o comando sql
            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Cliente Cadastrado com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);

        }

    }
    
    public void editarCliente(ClienteModel obj) {

        try {
            conexao = Conexao.conectar();
            //1 passo - criar o comando sql
            String sql = "update tbclientes set nomecli=?,endcli=?,fonecli=?,emailcli=? where idcli=?";

            conexao = Conexao.conectar();
            pst = conexao.prepareStatement(sql);
            pst.setString(1, obj.getNome());
            pst.setString(2, obj.getEndereco());
            pst.setString(3, obj.getFone());
            pst.setString(4, obj.getEmail());

            pst.setInt(5, obj.getId());


            //3 passo - executar o comando sql
            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Cliente alterado com Sucesso!");


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
    
    
    public void excluirCliente(ClienteModel obj) {

    try {
        conexao = Conexao.conectar();
        //1 passo - criar o comando sql
        String sql = "delete from tbclientes where idcli = ?";

        //2 passo - conectar o banco de dados e organizar o comando sql
        pst = conexao.prepareStatement(sql);
        pst.setInt(1, obj.getId());
        pst.execute();
        pst.close();

        JOptionPane.showMessageDialog(null, "Cliente exscluído com sucesso!");

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
    
}
