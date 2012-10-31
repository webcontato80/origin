package br.com.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

public class User {
	public void conectarBD() {
		
		String userName = new String("");
        String passwrd = new String("");
		
		 try
	        {
	            Class.forName("com.mysql.jdbc.Driver");

	            //cria uma variavel de conexão
	            Connection con;
	            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/bancojavadb","root","vanderson");

	            String query = "SELECT * FROM password WHERE usuario = ? ";

	            PreparedStatement stmt = con.prepareStatement(query);
	            
	            //stmt.setString(1,jTextField1.getText());

	            ResultSet rs;

	            rs = stmt.executeQuery();

	            //Casting
	            //DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

	           // modelo.setNumRows(0);

	            while (rs.next())
	            {
	               
	            	userName = rs.getString("usuario");
	                passwrd = rs.getString("senha");
	                       
	                
	                           
	               // System.out.println("Nome " + rs.getString("nome") );

	            }
	           
	            	
	        }
	        catch (ClassNotFoundException ex)
	        {
	            System.out.println("Não foi possível encontrar a classe");
	        }
	        catch(SQLException e )
	        {
	            System.out.println("Ocorreu um erro de SQL" + e.getMessage());
	        }

	    }
		
	
	/*
	try {
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		if(rs.next()){
		result = true;
		nome = rs.getString("usuario");}
	    }
			catch (Exception e) 
			{
				
			}
		return result; 
		}
		
	*/	
	}

