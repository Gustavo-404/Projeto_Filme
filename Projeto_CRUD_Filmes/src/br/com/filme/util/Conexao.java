package br.com.filme.util;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    
    private static Connection conexao = null;
    
    public static Connection getConexao() throws Exception {
        if(conexao == null){
        
            String driver = "org.postgresql.Driver";
            String url = "jdbc:postgresql://********/torrentz_filmes";
            String user = "postgres";
            String password = "******";
                  
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);  
        }
            return conexao;
        
        }
    }
            

