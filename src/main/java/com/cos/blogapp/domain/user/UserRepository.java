package com.cos.blogapp.domain.user;

import java.sql.PreparedStatement;

import org.springframework.data.jpa.repository.JpaRepository;

// DAO
//@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	public void 회원가입() {
		String sql = "select * from emp";
		PreparedStatement stmt;
		stmt.executeQuery();
	}

}
