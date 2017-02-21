package com.jo.educare.services;

import com.jo.educare.model.entity.UserAccount;

public interface UserAccountService {
  UserAccount finByUserName(String username);
  void saveUserAccount(UserAccount userAccount);
  UserAccount getLoggedUserAccount() ;
}
