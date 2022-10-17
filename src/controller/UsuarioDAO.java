/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;

/**
 *
 * @author Geral
 */
public class UsuarioDAO {
    private final Connection connection;
    
    public UsuarioDAO() throws SQLException{
        this.connection = Conexao.getConnection();
    }
}
