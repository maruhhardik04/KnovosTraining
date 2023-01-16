package JDBC;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/cookmate","root","");





            System.out.println("Inserting Record");
            PreparedStatement preparedStatement=connection.prepareStatement("insert into categories value(?,?,?)");
            preparedStatement.setInt(1,0);
            preparedStatement.setString(2,"Japanese");
            preparedStatement.setString(3," images/japanese.jpg");




            System.out.println(preparedStatement.executeUpdate());
            Statement statement=connection.createStatement();
            ResultSet resultSet =statement.executeQuery("Select * from categories");
            while (resultSet.next())
            {
                System.out.printf("""
                        ID : %d,\s
                        Name : %s,\s
                        ImagePath: %s\s
                        %n""",resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3));
            }


            preparedStatement=connection.prepareStatement("Delete from categories where c_id=?");
            preparedStatement.setInt(1,29);
            System.out.println(preparedStatement.executeUpdate()+" Deleting record");


            preparedStatement=connection.prepareStatement("Update categories set c_name=?,c_image=? where c_id=?");
            preparedStatement.setString(1,"J");
            preparedStatement.setString(2,"images/j.jpg");
            preparedStatement.setInt(3,27);

            System.out.println(preparedStatement.executeUpdate()+" Record Updated");

            resultSet =statement.executeQuery("Select * from categories");
            while (resultSet.next())
            {
                System.out.printf("""
                        ID : %d,\s
                        Name : %s,\s
                        ImagePath: %s\s
                        %n""",resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3));
            }
            connection.close();


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


    }

}
