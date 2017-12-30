/**
 * 
 */
package com.yzy.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yzy.bean.User;

/**
 * @author yzy
 *
 */
@RestController
public class UserController {

	@RequestMapping(name = "/user", method = RequestMethod.GET)
	public List<User> query(@RequestParam String userName) {
		System.out.println(ReflectionToStringBuilder.toString("", ToStringStyle.MULTI_LINE_STYLE));
		System.out.println(userName);
		List<User> datas = new ArrayList<>();
		datas.add(new User());
		datas.add(new User());
		datas.add(new User());
		return datas;
	}
}
