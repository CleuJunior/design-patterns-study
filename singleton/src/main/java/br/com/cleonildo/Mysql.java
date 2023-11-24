package br.com.cleonildo;

public class Mysql implements Connection {
    private static Mysql instance = null;
    private String host;
    private String user;
    private String password;

    private Mysql() {
        this.host = "host";
        this.user = "user";
        this.password = "password";
    }

    public String getHost() {
        return this.host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void executeQuery(String query) {
    }

    public static Mysql getInstance() {
        if(instance == null) {
            instance = new Mysql();
        }

        return instance;
    }

    @Override
    public String toString() {
        return "Mysql{" +
                "host='" + host + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
