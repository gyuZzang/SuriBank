package com.howtolivelikehuman.suribank.service;

import javax.servlet.http.HttpSession;

import com.howtolivelikehuman.suribank.dto.UserVO;

public interface UserService {

	//ȸ������
	public boolean signup(UserVO vo) throws Exception;
	
	//�α��� üũ
	public boolean login(UserVO vo, HttpSession session);
	
	//�α׾ƿ�
	public void logout(HttpSession session);
}
