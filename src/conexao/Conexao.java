/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.*;

/**
 *
 * @author Geral
 */
public class Conexao {
    /*private static final String DRIVE = "com.mysql.jbdc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/ordem_servico";
    private static final String USER = "root";
    private static final String PASS = "root";
    
    public static Connection getConection() throws SQLException{
        try {
            Class.forName(DRIVE);
        } catch (Exception e) {
            e.getException();
        }
        return DriverManager.getConnection(URL,USER,PASS);
    }
    
    public static void closeConnection(Connection con){
        try {
            if (con != null){
                con.close();
            }
        } catch (SQLException e) {
        e.printStackTrace(); 
       }
    }
    public static void closeConnection(Connection con, PreparedStatement stmt){
        closeConnection(con,stmt);
        try {
            if (stmt != null){
                stmt.close();
            }
        } catch (SQLException e) {
        e.printStackTrace(); 
       }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        closeConnection(con,stmt);
        try {
            if (rs != null){
                rs.close();
            }
        } catch (SQLException e) {
        e.printStackTrace(); 
       }
    }
    */
    
    public static Connection conectar(){
        Connection conexao;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/ordem_servico";
        String user = "root";
        String passWord = "root";
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, passWord);
            return conexao;
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            return null;
        }
    }
    
}
