/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Geral
 */
public class UsuarioDAO {
    private final Connection connection;
    
    public UsuarioDAO() throws SQLException{
        this.connection = Conexao.getConection();
    }
}
