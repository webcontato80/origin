package br.com.model;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;



@SuppressWarnings("serial")
public class CadastrarAgencia extends HttpServlet { 
	 
	 
public void doPost( HttpServletRequest req, HttpServletResponse res )  
 
  throws IOException { 
  
	// irá utilizar o objeto response para gerar uma resposta 
    PrintWriter out = res.getWriter(); 


    out.println( "<html>" ); 
    out.println( "<body>" ); 
    out.println( "<p>" ); 
    // obtendo o parâmetro enviado pelo cliente  
    // (dentro do frame de requisição http) 
     
    String codigo = req.getParameter( "campo_codigo" ); 
    String nome = req.getParameter( "campo_nome" );  

    
    System.out.println("Dados Cadastrados");
    out.println("Codigo:" + codigo);
    out.println("<p>Nome:" + nome);
    out.println( "</p>" ); 
    out.println( "</body>" ); 
    out.println( "</html>" ); 
  	
  	

}

}
