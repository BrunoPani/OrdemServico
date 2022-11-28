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
import model.OrdemServicoModel;

/**
 *
 * @author Geral
 */
public class OrdemServicoDAO {
    Connection conexao;
    PreparedStatement pst;
    ResultSet rs;
    
    public void emitirOs(OrdemServicoModel os, ClienteModel cliente){

        try {
            conexao = Conexao.conectar();
            String sql = "insert into tbos(tipo,situacao,equipamento,defeito,servico,tecnico,valor,idcli) values(?,?,?,?,?,?,?,?)";

            pst = conexao.prepareStatement(sql);
            pst.setString(1, os.getTipo());
            pst.setString(2, os.getSituacao());
            pst.setString(3, os.getEquipamento());
            pst.setString(4, os.getDefeito());
            pst.setString(5, os.getServico());
            pst.setString(6, os.getTecnico());
            pst.setFloat(7, Float.parseFloat(os.getValorTotal().toString()));
            pst.setInt(8, cliente.getId());
            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "OS emitida com sucesso");
            // btnOsAdicionar.setEnabled(false);
            // btnOsPesquisar.setEnabled(false);
            // btnOsImprimir.setEnabled(true);

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
