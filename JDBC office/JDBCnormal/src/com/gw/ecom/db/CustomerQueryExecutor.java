package com.gw.ecom.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.gw.ecom.helper.CustomerHelper;
import com.gw.ecom.util.ConnectionUtil;
import com.gw.ecom.vo.CustomerVO;

public class CustomerQueryExecutor {

	public ArrayList<CustomerVO> executeSql(String sqlQuery) {
		ResultSet resultSet = null;
		Statement statement = null;
		ConnectionUtil connectionUtil = new ConnectionUtil();
		Connection connection = connectionUtil.getConnection();
		CustomerVO customerVO = null;
		ArrayList<CustomerVO> customerVoList = null;
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sqlQuery);
			if(resultSet != null) {
				customerVoList = new ArrayList<CustomerVO>();
				resultSet.last();
				int rowCount = resultSet.getRow();
				System.out.println("rowCount -->" +rowCount);
				if(rowCount == 0) {
				CustomerHelper customerHelper = new CustomerHelper();
				customerVO = new CustomerVO();
				customerVO = customerHelper.covertCustomerVoFromResultSet(resultSet);
				customerVoList.add(customerVO);	
				}else if(rowCount > 0) {
					resultSet.beforeFirst();
					CustomerHelper customerHelper = new CustomerHelper();
					while(resultSet.next()) {
						customerVO = new CustomerVO();
						customerVO = customerHelper.covertCustomerVoFromResultSet(resultSet);
						customerVoList.add(customerVO);	
						
					}
					
				}
			}
			
		} catch (SQLException sqlException) {
			System.out.println(" sqlException in executeQuery() of  CustomerDAO" + sqlException);
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (connection != null) {
					System.out.println("connection is not null");
					connectionUtil.releaseDBConnection(connection);
				}
			} catch (Exception exception) {

			}

			
		}
		return customerVoList;
	}

}
