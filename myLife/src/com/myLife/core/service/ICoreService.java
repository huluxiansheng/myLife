package com.myLife.core.service;

import java.io.Serializable;
import java.util.List;

/**
 * @author HuYang 
 * @date 2016年11月9日 上午10:04:12
 */
public interface ICoreService<T, PK extends Serializable> {

	/**
	 * 添加实体
	 * @param o
	 * @return int
	 * @author HuYang
	 * @date 2016年11月9日 上午10:05:48
	 */
	public int addEntity(T o);
	
	/**
	 * 根据Bean查询实体列表
	 * @param o
	 * @return List
	 * @author HuYang
	 * @date 2016年11月9日 上午10:11:07
	 */
	public List<T> selectEntitys(T o);
	
	/**
	 * 更新实体
	 * @param o 
	 * @author HuYang
	 * @date 2016年11月9日 上午10:13:34
	 */
	public int updateEntity(T o);
	
	/**
	 * 通过ID删除实体
	 * @param id
	 * @return 
	 * @author HuYang
	 * @date 2016年11月9日 上午10:14:06
	 */
	public int deleteById(int id);
	
	
	
	
	
	
}
