package com.myLife.core.base.dao;

import java.io.Serializable;
import java.util.List;

public interface ICoreDao<T,PK extends Serializable> {

	/**
	 * ͨ��ID��ѯʵ��
	 * @param id
	 * @return 
	 * @author HuYang
	 * @date 2016��11��8�� ����10:24:48
	 */
	public T findById(PK id);
	
	/**
	 * ͨ��ʵ�����Բ�ѯʵ���б�
	 * @param o
	 * @return 
	 * @author HuYang
	 * @date 2016��11��8�� ����10:25:06
	 */
	public List<T> findList(T o);
	
	/**
	 * ��ѯ����ʵ��
	 * @return 
	 * @author HuYang
	 * @date 2016��11��8�� ����10:25:27
	 */
	public List<T> findAll();
	
	/**
	 * д��ʵ��
	 * @param o
	 * @return 
	 * @author HuYang
	 * @date 2016��11��8�� ����10:26:22
	 */
	public int insert(T o);
	
	/**
	 * ����ʵ��
	 * @param o
	 * @return 
	 * @author HuYang
	 * @date 2016��11��8�� ����1:04:04
	 */
	public int update(T o);
	
	/**
	 * ͨ��IDɾ��ʵ��
	 * @param id
	 * @return 
	 * @author HuYang
	 * @date 2016��11��9�� ����6:00:44
	 */
	public int deleteById(int id);
	
	
	
}

