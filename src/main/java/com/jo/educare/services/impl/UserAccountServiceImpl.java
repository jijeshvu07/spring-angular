package com.jo.educare.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import com.jo.educare.model.entity.UserAccount;
import com.jo.educare.repository.UserAccountRepository;
import com.jo.educare.services.UserAccountService;

@Service
public class UserAccountServiceImpl implements UserAccountService {
	@Autowired
	private UserAccountRepository userAccountRepository;

	@Override
	public UserAccount finByUserName(String username) {
		return userAccountRepository.findByUsername(username);
	}

	@Override
	public void saveUserAccount(UserAccount userAccount) {
		userAccountRepository.save(userAccount);
	}

	@Override
	public UserAccount getLoggedUserAccount() {
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String name = user.getUsername(); // get logged in username
		return finByUserName(name);
	}

}
