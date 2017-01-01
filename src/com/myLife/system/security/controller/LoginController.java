package com.myLife.system.security.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import com.myLife.system.security.dao.IUserDao;
import com.myLife.system.security.entity.User;

/**
 * ��½������
 * @author HuYang 2016��6��1�� ����1:21:07
 *
 */
@Controller
public class LoginController {
	
	@Autowired
	private IUserDao userDao;
	
	@RequestMapping("/index")
	public Map<String, Object> index(HttpServletRequest request){
		System.out.println("�Ѿ�ͨ��");
		request.getSession().setAttribute("userName", "������");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "Hy");
		map.put("age", 23);
		User user = userDao.findById(1);
		map.put("user", user);
		map.put("session", request.getSession().getAttribute("userName"));
		ModelAndView model = new ModelAndView("index",map);
		return map;
	} 
	
	/**
	 * ��½��֤
	 * @param request
	 * @return
	 */
	@RequestMapping("/toLogin")
	public ModelAndView toLogin(User user){
		
		List<User> userList = userDao.findList(user);
		
		return new ModelAndView();
	}
	
}