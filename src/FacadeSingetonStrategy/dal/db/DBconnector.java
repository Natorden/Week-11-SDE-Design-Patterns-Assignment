package FacadeSingetonStrategy.dal.db;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;

public class DBconnector {

    private SQLServerDataSource dataSource;

    protected DBconnector()
    {
        dataSource = new SQLServerDataSource();
        dataSource.setServerName("10.176.111.31");
        dataSource.setDatabaseName("FacadeSingetonStrategy");
        dataSource.setUser("CSe20B_22");
        dataSource.setPassword("Order_66");
        dataSource.setPortNumber(1433);
    }

    protected Connection getConnection() throws SQLServerException {
        return dataSource.getConnection();
    }


}
