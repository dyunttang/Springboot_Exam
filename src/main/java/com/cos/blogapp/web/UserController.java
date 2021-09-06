package com.cos.blogapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cos.blogapp.web.dto.LoginReqDto;

@Controller
public class UserController {
	

	@GetMapping("/home")
	public String home() {
		return "home";
	}
		
	// /login -> login.jsp
	// /views/user/login.jsp
		
	// /WEB-INF/views/user/loginForm.jsp
	@GetMapping("/loginForm")
	public String loginForm() {
		return "user/loginForm";
	}
	
	// /WEB-INF/views/user/joinForm.jsp
	@GetMapping("/signupForm")
	public String signupForm() {
		return "user/signupForm";
	}
	
	@PostMapping("/login")
	public String login(LoginReqDto dto) {
		
		// 1. username, password 받기
		System.out.println(dto.getUsername());
		System.out.println(dto.getPassword());
		// 2. DB -> 조회
		// 3. 있으면
		// 4. session에 저장
		// 5. 메인페이지를 돌려주기
		return "home";
	}
}
