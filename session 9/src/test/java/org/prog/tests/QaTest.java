package org.prog.tests;

import org.testng.annotations.Test;

import java.sql.*;

public class QaTest {
    @Test
    public void sqlReadTest() throws ClassNotFoundException,
            SQLException {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@//95.216.251.208:1521/ORCLPDB",
                    "test_user",
                    "education2020"
            );
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM PERSONS_QA");
        while (resultSet.next()){
            System.out.print(resultSet.getString("Title") + " ");
            System.out.print(resultSet.getString("FirstName") + " ");
            System.out.print(resultSet.getString("LastName"));
        }
        resultSet.close();
        statement.close();
    }
}
