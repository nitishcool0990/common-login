package com.sb.main.controller;

import java.lang.reflect.InvocationTargetException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.sb.main.dto.ResponseBodyDTO;
import com.sb.main.dto.UserDetailDTO;
import com.sb.main.service.IUserMgmtService;



@RestController
@RequestMapping(value = "/sb")
public class SBController extends BaseController{
	
	private static final Logger log = LogManager.getLogger(SBController.class);


	@CrossOrigin
	@RequestMapping(value = "/SBService/Welcome", method = RequestMethod.GET)
	public ResponseEntity<Object> getTnCPolicy() throws Exception {
		return new ResponseEntity<>("Welcome page!!!!!", HttpStatus.OK);
	}
	
	@Autowired
	private IUserMgmtService iUserMgmtService ;
	
	@RequestMapping(value = "/createUserProfile", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseBodyDTO> createUserProfile(@RequestBody  UserDetailDTO userDeatilDto)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		HttpStatus status = HttpStatus.OK;
		boolean createStatus = false;
		try {
			createStatus = iUserMgmtService.createUser(userDeatilDto);
		} catch (Exception ex) {
			log.error(ex.getMessage());
			return prepareResponse(ex, status);
		}
		return prepareResponse(createStatus ,  status);
	}

	
}
