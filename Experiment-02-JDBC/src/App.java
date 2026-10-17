import java.sql.*;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String dbPassword = System.getenv("COLLEGE_DB_PASSWORD");

        if (dbPassword == null || dbPassword.isBlank()) {
            throw new IllegalStateException(
                "Set COLLEGE_DB_PASSWORD before running this application."
            );
        }

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/college",
            "root",
            dbPassword
        );

        System.out.println("connected to database ");

        PreparedStatement ps = con.prepareStatement("INSERT INTO student(id,name,branch) VALUES(?,?,?)");

        ps.setInt(1, 1);
        ps.setString(2, "Ben");
        ps.setString(3, "cyber");

        int rowsAffected = ps.executeUpdate();

        System.out.println("rows Affected :" + rowsAffected);



        con.close();
    }
}
