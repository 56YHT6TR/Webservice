package com.swarna.webservice.service;

import com.swarna.webservice.model.UserN;
import com.swarna.webservice.web.dto.UserRegistrationDto;

public interface UserNService {
	UserN save(UserRegistrationDto RegistraionDto);

}
