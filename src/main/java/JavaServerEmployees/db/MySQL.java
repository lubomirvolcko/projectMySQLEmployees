package JavaServerEmployees.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MySQL {
    private Connection conn;
    private String driver = "com.mysql.jdbc.Driver";
    private String url="jdbc:mysql://localhost:3306/employees";
    private String username="root";
    private String password="";


    public String getSalary(String name){
        String salary="";

        try {
            Class.forName(driver).newInstance();

            conn = DriverManager.getConnection(url,username,password);
            String query = "select salaries.salary as salary from salaries "+
            "inner join employees on salaries.emp_no=employees.emp_no "+
            "where employees.last_name like '"+name+"'";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            if (rs.next()){
                salary = rs.getString("salary");
            }

        }catch(Exception ex){
            System.out.println("Error: "+ ex.getMessage());
        }
        return salary;
    }
}
