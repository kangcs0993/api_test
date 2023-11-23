package com.api.test;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.UserDAO;
import util.Common;
import vo.UserVO;

@Controller
public class MainController {
	UserDAO udao;
	
	public MainController(UserDAO udao) {
		this.udao = udao;
	}

	@RequestMapping("/")
	public String main(Model model) {
		List<UserVO> list = udao.selectAll();
		
		model.addAttribute("ulist", list);
		
		return Common.MainPath.mainPath("main");
	}
}
