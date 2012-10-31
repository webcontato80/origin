/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JCadClienteView.java
 *
 * Created on 12/08/2012, 20:20:48
 */

package br.com.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.controller.Controle;
import br.com.controller.validaDados;

import javax.swing.JOptionPane;





    public class JCadClienteView extends javax.swing.JFrame {

    /** Creates new form JCadClienteView */
    public JCadClienteView() {
        initComponents();
    }

 
    public static boolean ehTexto(String nome) { 
	if (! nome.matches("[a-zA-Z\\s]*"))
        {
		return false;
	}
	return true;
}
    
    
    
    public static boolean cpfEhValido(String cpf) {
		if (! cpf.matches("\\d{3}\\.?\\d{3}\\.?\\d{3}-?\\d{2}") ) {
			return false;
		}
		return true;
	}
    
    
    
    
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textField1 = new java.awt.TextField();
        textField2 = new java.awt.TextField();
        textField3 = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("CPF: ");

        jLabel3.setText("Endereco: ");

        jLabel4.setText("Cadastro de Clientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(textField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            //Indica o driver de conexão com o banco de dados
            Class.forName("com.mysql.jdbc.Driver");

            //Cria a variavel de conexão
            Connection con ;

            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/bancojavadb","root","vanderson");

            //Cria a string para inserir no banco de dados
            String query = "INSERT INTO clientes (nome,cpf,endereco) VALUES (?,?,?) ";

            //Comando para inserir
            PreparedStatement stmt = con.prepareStatement(query);
            validaDados v = new validaDados();
            
            //Seta os valores na string de inserção
            stmt.setString(1,textField1.getText());
            //VALIDAÇÂO DE DADOS NA CLASSE CONTROLE
            String nome =  textField1.getText();
            
            
            stmt.setString(2,textField2.getText());
            
            String cpf =  textField2.getText();
          
            
            stmt.setString(3,textField3.getText());   
            
            
            if ( ehTexto(nome))
            {
                              
              if ( cpfEhValido(cpf) ) 
                {
                                       
                    //executa o comando no banco de dados   
                    stmt.executeUpdate();
                    //Fecha o comando e a conexão
                    stmt.close();
                    con.close(); 
                    
                }            
                else
		{
			//System.out.println("CPF Invalido");
                        JOptionPane.showMessageDialog(null, "CPF Inválido");  
         
		}
            }
            
            else
                {
		
                        //System.out.println("Nome Invalido");
                        JOptionPane.showMessageDialog(null, "Nome Inválido");  
		
                }
                      
                

        }
        catch (ClassNotFoundException ex)
        {
            System.out.println("Não Foi Possivel Encontrar a Classe");
        }
        catch(SQLException e )
        {
            System.out.println("Ocorreu um erro de SQL  = " + e.getMessage());
        }
           
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        textField1.setText("");
        textField2.setText("");
        textField3.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JCadClienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    // End of variables declaration//GEN-END:variables

}
