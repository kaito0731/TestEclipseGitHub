package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* Servlet implementation class ShowDateServlet
*/
@WebServlet(name = "Test", urlPatterns = { "/Test" })
public class Test extends javax.servlet.http.HttpServlet
        implements javax.servlet.Servlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("");
        out.println("");
        out.println(new java.util.Date());
        out.println("");
        out.println("");
        System.out.println("hello_search");
    	
    	
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        /*
        try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
            //-----------------
            // 接続
            //-----------------
        	connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ih14","nhs40308", "b19940731");
            statement = connection.createStatement();

            //-----------------
            // SQLの発行
            //-----------------
            //ユーザー情報のテーブル
            resultSet = statement.executeQuery("SELECT * FROM customer");

            //-----------------
            // 値の取得
            //-----------------
            // フィールド一覧を取得
            List<String> fields = new ArrayList<String>();
            ResultSetMetaData rsmd = resultSet.getMetaData();
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                fields.add(rsmd.getColumnName(i));
            }

            //結果の出力
            int rowCount = 0;
            while (resultSet.next()) {
                rowCount++;

                System.out.println("---------------------------------------------------");
                System.out.println("--- Rows:" + rowCount);
                System.out.println("---------------------------------------------------");

                //値は、「resultSet.getString(<フィールド名>)」で取得する。
                for (String field : fields) {
                    System.out.println(field + ":" + resultSet.getString(field));
                }
            }


        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
            //接続を切断する
            if (resultSet != null) {
                try {
					resultSet.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
            if (statement != null) {
                try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
            if (connection != null) {
                try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        }
        */
    }
    

}