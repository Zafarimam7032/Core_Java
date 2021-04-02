package com.gw.ecom.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import com.gw.ecom.db.CustomerQueryExecutor;

import com.gw.ecom.helper.CustomerHelper;
import com.gw.ecom.util.ConnectionUtil;
import com.gw.ecom.vo.CustomerVO;

public class CustomerDAO implements iDao<CustomerVO> {
	static final String sqlQuery = "select * from customer";

	public static void main(String p[]) {
		CustomerDAO customerDAO = new CustomerDAO();
		CustomerVO customerVO = customerDAO.getById(1);
		System.out.println(customerVO.toString());
		System.out.println("------> Let see list of all customer");
		ArrayList<CustomerVO> arrayList = customerDAO.getAll();
		Iterator<CustomerVO> customerVoIteratorValue = arrayList.iterator();
		while(customerVoIteratorValue.hasNext()) {
			CustomerVO customerVoListValue = customerVoIteratorValue.next();
			System.out.println(customerVoListValue.toString());
		}
		System.out.println("------> End list of all customer");
		
		
	}

	public CustomerVO getById(int id) {
		String sqlQuery = CustomerDAO.sqlQuery + " where customerId = " + id;
		System.out.println(sqlQuery);
		CustomerQueryExecutor queryExecutor = new CustomerQueryExecutor();
		ArrayList<CustomerVO> customerVOList = queryExecutor.executeSql(sqlQuery);
		CustomerVO customerVO = customerVOList.get(0);
		return customerVO;
	}
	public ArrayList<CustomerVO> getAll() {
		//String sqlQuery = CustomerDAO.sqlQuery " where customerId = " + id;
		System.out.println(sqlQuery);
		CustomerQueryExecutor queryExecutor = new CustomerQueryExecutor();
		ArrayList<CustomerVO> customerVOList = queryExecutor.executeSql(sqlQuery);
		
		return customerVOList;
	}

	

	public void save(CustomerVO customerVO) {

	}

	public void update(CustomerVO customerVO, String[] params) {

	}

	public void delete(CustomerVO customerVO) {

	}

}
