package com.kevin.dbm;

import java.sql.*;

/**
 * @author Kevin KDA on 2019/11/20 00:52
 * @version 2.0
 * @project JSP_Course_Assignments
 * @package com.kevin.dbm
 * @classname DBUtil
 * @description TODO
 * @interface/enum
 */
public class DBUtil {
    //数据库连接驱动
    /**
     * 连接MSSQL
     */
    private final static String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private final static String URL = "jdbc:sqlserver://localhost:1433;DatabaseName=People";
    /**
     * 连接MySQL
     */
//    private final static String DRIVER= "com.mysql.jdbc.Driver";
//    private final static String URL = "jdbc:mysql://127.0.0.1:3306/jsp?characterEncoding=UTF-8";
//    private final static String URL = "jdbc:mysql://192.168.1.22:3306/jsp?characterEncoding=UTF-8";

    /**
     * 连接Oracle
     */
    //连接驱动
//	private final static String DRIVE = "oracle.jdbc.driver.OracleDriver";
    //访问oracle路径
//	private final static String URL = "jdbc:oracle:thin:@localhost:1521:ORCL";

    /**
     * 提供与数据库访问的用户名和密码
     */
    private static final String USER = "kevin";
    private static final String PASSWORD = "0921";

    private static Connection conn = null;

    /**
     * @author Kevin KDA on 2019/11/20 00:57
     * @description DBUtil / static initializer TODO 静态代码块（将加载驱动、连接数据库放入静态块中）
     * @param
     * @returns
     * @throws
     */
    static {
        try {
            //1.加载驱动程序
            Class.forName(DRIVER);
            //2.获得数据库的连接
            conn = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param []
     * @throws
     * @author Kevin KDA on 2019/11/20 00:57
     * @description DBUtil / getConnection TODO 对外提供一个方法来获取数据库连接
     * @returns java.sql.Connection
     */
    public static Connection getConnection() {
        return conn;
    }
}
