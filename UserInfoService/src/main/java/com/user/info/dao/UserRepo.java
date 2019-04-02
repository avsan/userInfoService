package com.user.info.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.info.vo.UserVO;

public interface UserRepo extends JpaRepository<UserVO, String>  {

}
