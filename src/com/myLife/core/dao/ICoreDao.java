package com.myLife.core.dao;

import java.io.Serializable;
import java.util.List;

public interface ICoreDao<T,PK extends Serializable> {

	/**
	 * 通过ID查询实体
	 * @param id
	 * @return 
	 * @author HuYang
	 * @date 2016年11月8日 上午10:24:48
	 */
	public T findById(PK id);
	
	/**
	 * 通过实体属性查询实体列表
	 * @param o
	 * @return 
	 * @author HuYang
	 * @date 2016年11月8日 上午10:25:06
	 */
	public List<T> findList(T o);
	
	/**
	 * 查询所有实体
	 * @return 
	 * @author HuYang
	 * @date 2016年11月8日 上午10:25:27
	 */
	public List<T> findAll();
	
	/**
	 * 写入实体
	 * @param o
	 * @return 
	 * @author HuYang
	 * @date 2016年11月8日 上午10:26:22
	 */
	public int insert(T o);
	
	/**
	 * 更新实体
	 * @param o
	 * @return 
	 * @author HuYang
	 * @date 2016年11月8日 下午1:04:04
	 */
	public int update(T o);
	
	/**
	 * 通过ID删除实体
	 * @param id
	 * @return 
	 * @author HuYang
	 * @date 2016年11月9日 下午6:00:44
	 */
	public int deleteById(int id);
	
	
	
}


