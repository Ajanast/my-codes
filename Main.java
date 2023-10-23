import java.sql.*;
public class Main {

    public static void main(String[] args) throws SQLException {
        batchDemo();

    }

    //printdata
    public static void printRecord() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String userName = "root";
        String passWord = "0008";
        String query = "SELECT * FROM employee";
        Connection con = DriverManager.getConnection(url, userName, passWord);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        System.out.println(rs.getInt(1));
        System.out.println(rs.getString(2));
        System.out.println(rs.getDouble(3));

        con.close();
    }

    //insert data
    public static void insert() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String userName = "root";
        String passWord = "0008";
        String query = "INSERT INTO employee VALUES(2,'Ajin',200000)";
        Connection con = DriverManager.getConnection(url, userName, passWord);
        Statement st = con.createStatement();
        int rs = st.executeUpdate(query);
        System.out.println("Rows affected " + rs);

        con.close();
    }

    //insert data with variable
    public static void insertVar() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String userName = "root";
        String passWord = "0008";
        int id = 3;
        String name = "Ganesh";
        int salary = 300000;
        //String query ="INSERT INTO employee VALUES(2,'Ajin',200000)";
        String query = "INSERT INTO employee VALUES(" + id + ",'" + name + " '," + salary + " );";
        Connection con = DriverManager.getConnection(url, userName, passWord);
        Statement st = con.createStatement();
        int rs = st.executeUpdate(query);
        System.out.println("Rows affected : " + rs);

        con.close();
    }

    //prepared statement
    public static void insertusingpst() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String userName = "root";
        String passWord = "0008";
        int id = 4;
        String name = "Sush";
        int salary = 300000;
        //String query ="INSERT INTO employee VALUES(2,'Ajin',200000)";
        String query = "INSERT INTO employee VALUES(?,?,?);";
        Connection con = DriverManager.getConnection(url, userName, passWord);
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, id);
        pst.setString(2, name);
        pst.setInt(3, salary);
        int rs = pst.executeUpdate();
        System.out.println("Rows affected : " + rs);

        con.close();

    }

    public static void delete() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String userName = "root";
        String passWord = "0008";
        int id = 3;
        String query = "DELETE FROM employee WHERE emp_id=" + id + ";";
        Connection con = DriverManager.getConnection(url, userName, passWord);
        Statement st = con.createStatement();
        int rs = st.executeUpdate(query);
        System.out.println("Rows affected " + rs);

        con.close();
    }

    //update
    public static void update() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String userName = "root";
        String passWord = "0008";
        String query = "UPDATE employee SET salary=2000 WHERE emp_id=1;";
        Connection con = DriverManager.getConnection(url, userName, passWord);
        Statement st = con.createStatement();
        int rs = st.executeUpdate(query);
        System.out.println("Rows affected " + rs);

        con.close();
    }

    //Stored procedure with callable statement
    public static void sp() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String userName = "root";
        String passWord = "0008";
        Connection con = DriverManager.getConnection(url, userName, passWord);
        CallableStatement cs = con.prepareCall("{call getemp()}");
        ResultSet rs = cs.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getInt(3));
        }


        con.close();
    }

    //Stored procedure with input parameter
    public static void sp2() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String userName = "root";
        String passWord = "0008";
        int id = 2;
        Connection con = DriverManager.getConnection(url, userName, passWord);
        CallableStatement cs = con.prepareCall("{call getempById(?)}");
        cs.setInt(1, id);
        ResultSet rs = cs.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getInt(3));
        }


        con.close();
    }

    // Stored procedure with input & out parameters
    public static void sp3() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String userName = "root";
        String passWord = "0008";
        int id = 2;
        Connection con = DriverManager.getConnection(url, userName, passWord);
        CallableStatement cs = con.prepareCall("{call getnameById(?,?)}");
        cs.setInt(1, id);
        cs.registerOutParameter(2, Types.VARCHAR);
        cs.executeUpdate();
        System.out.println(cs.getString(2));


        con.close();

    }
    //commit vs autocommit
    public static void updatecommit() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String userName = "root";
        String passWord = "0008";
        String query1 = "UPDATE employee SET salary=52000 WHERE emp_id=1;";
        String query2 = "UPDATE employee SET salary=52000 WHERE emp_id=2;";
        Connection con = DriverManager.getConnection(url, userName, passWord);
        con.setAutoCommit(false);
        Statement st = con.createStatement();
        int row1 = st.executeUpdate(query1);
        System.out.println("Rows affected " + row1);
        int row2=st.executeUpdate(query2);
        System.out.println("Rows affected " + row2);
        if(row1>0 && row2>0){
            con.commit();
        }

        con.close();
    }

    //batch Processing
    public static void batchDemo() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String userName = "root";
        String passWord = "0008";
        String query1 = "UPDATE employee SET salary=1000 WHERE emp_id=1;";
        String query2 = "UPDATE employee SET salary=1000 WHERE emp_id=2;";
        String query4 = "UPDATE employee SET salary=1000 WHERE emp_id=4;";
        Connection con = DriverManager.getConnection(url, userName, passWord);
        con.setAutoCommit(false);
        Statement st = con.createStatement();
        st.addBatch(query1);
        st.addBatch(query2);
        st.addBatch(query4);
        int[] rows =st.executeBatch();
        for(int i : rows){
            if(i>0){
               continue;
            }
            else {
                con.rollback();
            }
        }
        con.commit();

        con.close();
    }

}