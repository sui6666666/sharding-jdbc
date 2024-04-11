package com.cxytiandi.sharding.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.cxytiandi.sharding.domain.entity.Suilang;
import com.cxytiandi.sharding.domain.entity.SysDic;
import com.cxytiandi.sharding.domain.entity.User;
import com.cxytiandi.sharding.service.SuilangService;
import com.cxytiandi.sharding.service.SysDicService;
import org.apache.shardingsphere.infra.hint.HintManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cxytiandi.sharding.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@Autowired
	private SuilangService suilangService;

	@Autowired
	private SysDicService sysDicService;
	
	@GetMapping("/users")
	public Object list() {
		return userService.list();
	}

	@GetMapping("/dic/add")
	@Transactional
	public Object addDic() {
		SysDic dic = new SysDic();
		dic.setType("pay_type");
		dic.setName("支付方式");
		dic.setValue("0");
		sysDicService.save(dic);
		return "success";
	}

	@GetMapping("/dic/get/{id}")
	@Transactional
	public Object getDic(@PathVariable Long id) {
		return sysDicService.getById(id);
	}
	
	@GetMapping("/add")
	@Transactional
	public Object add() {

		for (long i = 0; i < 20; i++) {
			User user = new User();
			user.setId(i);
			user.setCity("深圳");
			user.setName("李四");
			userService.insert2(user);
		}
//		User user = new User();
//		user.setCity("深圳");
//		user.setName("李四");
//		userService.insert2(user);

		return "success";
	}
	@GetMapping("/addSuilang")
	@Transactional
	public Object addSuilang() {

		for (long i = 0; i < 10; i++) {
			Suilang suilang = new Suilang();
			suilang.setCity("深圳");
			suilang.setName("李四");
			suilangService.save(suilang);
		}
//		User user = new User();
//		user.setCity("深圳");
//		user.setName("李四");
//		userService.insert2(user);

		return "success";
	}

	@GetMapping("/suilang/{id}")
	public Object getSuilang(@PathVariable Long id) {
		return suilangService.getById(id);
	}


	@GetMapping("/users/{id}")
	public Object get(@PathVariable Long id) {
		return userService.getById(id);
	}
	
	@GetMapping("/users/query")
	public Object get(String name) {
		LambdaQueryWrapper eq = Wrappers.<User>lambdaQuery()
				.eq(User::getName,name);
		return userService.getOne(eq);
	}
	
}
