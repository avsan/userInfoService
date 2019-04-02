package com.user.info.dto;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;

import com.user.info.vo.UserVO;

@Scope("prototype")
public class UserDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private UserVO userVO;
	
	public UserVO getUserVO() {
		return userVO;
	}

	public void setUserVO(UserVO userVO) {
		this.userVO = userVO;
	}
	
	
	

}
