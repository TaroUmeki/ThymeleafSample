package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Member;
@Controller
public class ThymeleafController {
	
	@GetMapping("show")
	public String showView(Model model) {
		
		 // Memberを作成
		Member member = new Member(1,"会員01");
		
		//[Model]にデータを格納する
		model.addAttribute("name","太郎");
		
		//Modelに対して、「て「名前：mb」、「値：member」を「addAttribute」メソッドで格納」
		model.addAttribute("mb",member);
		
		//戻り値はビュー名を返す
		return "main";
	}
}
