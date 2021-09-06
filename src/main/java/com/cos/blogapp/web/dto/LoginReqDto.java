package com.cos.blogapp.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// DTO = Data Transfer Object(데이터 전송 오브젝트)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginReqDto {
	private String username;
	private String password;
	private String phone;
	
	public static void main(String[] args) {
		LoginReqDto dto = new LoginReqDto();
	}

}
