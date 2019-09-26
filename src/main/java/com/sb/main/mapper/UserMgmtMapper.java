package com.sb.main.mapper;

import org.springframework.stereotype.Component;
import com.sb.main.dto.UserDetailDTO;
import com.sb.main.entity.SbUserProfile;

@Component("UserMgmtMapper")
public class UserMgmtMapper {
	
	
	
	public SbUserProfile MapUserDetailsDtoTOEntity( UserDetailDTO userDetailDto){
		
		SbUserProfile sbUserProfileVO = new SbUserProfile();
		sbUserProfileVO.setFirstName(userDetailDto.getFirstName());
		sbUserProfileVO.setLastName(userDetailDto.getLastName());
		sbUserProfileVO.setDefaultAdd(userDetailDto.getAddress());
		sbUserProfileVO.setUserId(1);
		
		return sbUserProfileVO;
		
	}
	
     

}
