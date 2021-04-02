package com.gw.ecom.dao;

import java.util.List;
import java.util.Optional;

import com.gw.ecom.vo.CustomerVO;

public interface iDao<T> {
	//Optional<T> getById(int id);
	Object getById(int id);
	List<T> getAll();

	void save(T t);

	void update(T t, String[] params);

	void delete(T t);
}
