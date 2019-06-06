package com.training.ifaces;

import java.util.List;

public interface BookDao<T> {

	public int[] add(T t);
	public List<T> findAll();
	public int remove(long pkey);

}
