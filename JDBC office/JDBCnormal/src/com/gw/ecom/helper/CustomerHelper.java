package com.gw.ecom.helper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.gw.ecom.vo.CustomerVO;

public class CustomerHelper {

	public ArrayList<CustomerVO> 
			covertCustomerVoListFromResultSet(ResultSet resultSet) {
		return null;
	}

	public CustomerVO covertCustomerVoFromResultSet(ResultSet resultSet) {
		CustomerVO customerVO = null;
		try {

			if (resultSet != null) {
				customerVO = new CustomerVO();
				customerVO.setCustomerId(resultSet.getInt("customerId"));
				customerVO.setCustomerName(resultSet.getString("name"));
				customerVO.setCustomerPhoneNumber(String.valueOf(resultSet.getInt("PhoneNumber")));
				customerVO.setCustomerEmail(resultSet.getString("Email"));
			}
		} catch (SQLException sqlException) {

		}
		return customerVO;
	}
}
