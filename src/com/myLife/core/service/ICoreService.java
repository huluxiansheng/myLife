package com.myLife.core.service;

import java.io.Serializable;
import java.util.List;

/**
 * @author HuYang 
 * @date 2016��11��9�� ����10:04:12
 */
public interface ICoreService<T, PK extends Serializable> {

	/**
	 * ����ʵ��
	 * @param o
	 * @return int
	 * @author HuYang
	 * @date 2016��11��9�� ����10:05:48
	 */
	public int addEntity(T o);
	
	/**
	 * ����Bean��ѯʵ���б�
	 * @param o
	 * @return List
	 * @author HuYang
	 * @date 2016��11��9�� ����10:11:07
	 */
	public List<T> selectEntitys(T o);
	
	/**
	 * ����ʵ��
	 * @param o 
	 * @author HuYang
	 * @date 2016��11��9�� ����10:13:34
	 */
	public int updateEntity(T o);
	
	/**
	 * ͨ��IDɾ��ʵ��
	 * @param id
	 * @return 
	 * @author HuYang
	 * @date 2016��11��9�� ����10:14:06
	 */
	public int deleteById(int id);
	
	
	
	
	
	
}