package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;     
import java.sql.Statement;

//Estabelece conexão com o banco de dados, retornar um objeto Connection ou null(se erro)
public class User {
    public Connection conectarBD(){
        Connection conn = null;
        try{
//URL de conexão com o banco de dados
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
//Solicitar a conexão com DriverManager, imprime a mensagem de exceção se houver (não está sendo tratada)
            conn = DriverManager.getConnection(url);
        }catch (Exception e){}
        return conn;}

//Armazenar o nome do usuário
    public String nome = "";
//Informar se o usuário foi encontrado com sucesso ou não
    public boolean result = false;
//Verificar se o usuário e senha existem no banco de dados
    public boolean verificarUsuario (String login, String senha){
        String sql = "";
//Abrir a conexão com o banco de dados
        Connection conn= conectarBD();
    //instrução sql
    sql +="select nome from usuarios";
    sql +="where login =" + "'" + login + "'";
    sql += " and senha = " + "'" + "senha" + "';";
    try{
//Objeto Statement para executar a instrução sql
        Statement st = conn.createStatement();
//Executar consulta SQL e armazenar o resultado
        ResultSet rs = st.executeQuery(sql);
//Se encontrar o usuário, altera o resultado para true e obtém o nome 
        if(rs.next()){
            result = true;
            nome = rs.getString("nome");}
//Tratar erro (porém o bloco está vazio)
    }catch (Exception e) { }
//Retorna o resultado da verificação
    return result; }
} //fim da class


