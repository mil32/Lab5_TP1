package UTN.DAO;

import java.sql.*;

public class Connector {

    static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    static final String DB_HOST = "//192.168.64.2/";
    static final String DB_NAME = "labvtp1";
    static final String DB_USER = "admin";
    static final String DB_PASS = "1234";

    private Connection connection;
    private Statement st;

    public Connector(){
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            this.connection = DriverManager.getConnection("jdbc:mariadb:"+ DB_HOST + DB_NAME, DB_USER, DB_PASS);
            this.st = this.connection.createStatement();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Integer save (String name) {

        System.out.println("GUARDANDO... ");
        String query = "INSERT into log(winner) values('"+name+"')";
        try {
            ResultSet rs = st.executeQuery(query);
            return 1;
        } catch(SQLException e){
            e.printStackTrace();
            return 0;
        }
    }

}
