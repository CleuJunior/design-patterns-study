package br.com.cleonildo;

public class Main {
    public static void main(String[] args) {

        Mysql bancoMySql1 = Mysql.getInstance();
        String query = "CREATE TABLE usuario (" +
                "id INT(11) AUTO_INCREMENT PRIMARY KEY," +
                "nome VARCHAR(100) NOT NULL," +
                "email VARCHAR(60)," +
                "senha VARCHAR(100)" +
                ")";

        bancoMySql1.executeQuery(query);

        System.out.println("==== bancoMySql1 ====");
        System.out.println(bancoMySql1);
        System.out.println();

        Mysql bancoMySql2 = Mysql.getInstance();

        System.out.println("==== bancoMySql2 ====");
        System.out.println(bancoMySql2);
        System.out.println();


        System.out.println("==== MUDANÇA DE USUÁRIO EM bancoMySql1 ====");
        bancoMySql1.setUser("mariaDaSilva");
        System.out.println();


        System.out.println("==== bancoMySql1 ====");
        System.out.println(bancoMySql1);
        System.out.println("==== bancoMySql2 ====");
        System.out.println(bancoMySql2);

    }
}

