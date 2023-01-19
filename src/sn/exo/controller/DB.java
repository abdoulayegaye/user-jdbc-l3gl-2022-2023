package sn.exo.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB {
    //Pour la connexion
    private Connection cnx;
    //Pour les requétes préparées
    private PreparedStatement pstm;
    //Pour les requétes de consultation (SELECT)
    private ResultSet rs;
    //Pour les requétes de mise à jour (INSERT INTO, UPDATE, DELETE)
    private int ok;

    //Méthode d'ouverture de la connexion
    private Connection getConnection(){
        //Paramétres de connexion
        String url = "jdbc:mysql://localhost:3306/user_jdbc_db_2023";
        String user = "root";
        String password = "";
        try {
            //Chargement du pilote
            Class.forName("com.mysql.jdbc.Driver");
            //Ouverture de la connexion
            cnx = DriverManager.getConnection(url, user, password);
            //System.out.println("Connexion Réussie !");
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return cnx;
    }

    public void initPrepar(String sql){
        try {
            getConnection();
            pstm = cnx.prepareStatement(sql);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ResultSet executeSelect(){
        rs = null;
        try {
            rs = pstm.executeQuery();
        }catch (Exception e){
            e.printStackTrace();
        }
        return rs;
    }

    public int executeMaj(){
        try {
            ok = pstm.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        return ok;
    }

    public void closeConnection(){
        try{
            if(cnx != null)
                cnx.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public PreparedStatement getPstm(){
        return pstm;
    }
}
