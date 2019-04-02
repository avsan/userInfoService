package com.user.info.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.user.info.dto.UserDTO;
import com.user.info.exception.UserException;
import com.user.info.service.IUserService;
import com.user.info.vo.UserVO;

@RestController
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	private UserDTO userDTO;
	
	//this method is used to save new user details into database.
	@PostMapping("createUser")
	@ResponseStatus(HttpStatus.CREATED)
	public void createUser(@Validated@RequestBody UserVO userVO) throws UserException {
		
		userDTO = new UserDTO();
		userDTO.setUserVO(userVO);
		userService.createUser(userDTO);
		
		
	}
	
	// need to update lombok

}
