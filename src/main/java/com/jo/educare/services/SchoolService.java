package com.jo.educare.services;

import com.jo.educare.model.entity.School;
import com.jo.educare.model.entity.UserAccount;

public interface SchoolService {
  void saveSchool(School school);
  School findSchoolByUserAccount(UserAccount userAccount);
}
