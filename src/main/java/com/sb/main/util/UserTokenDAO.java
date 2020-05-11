package com.sb.main.util;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Repository;

///import com.gn.config.Constants;

@Repository
public class UserTokenDAO {

	@Autowired
	@Qualifier("stringRedisTemplate")
	private StringRedisTemplate redisTemplate;
 
	public StringRedisTemplate getRedisTemplate() {
		return redisTemplate;
	}

	public void setRedisTemplate(StringRedisTemplate redisTemplate) {
		this.redisTemplate = redisTemplate;
	}
	
	public boolean setTokenInRedis(String token,String userId,String value) {
		try {
			this.getRedisTemplate().opsForHash().putIfAbsent(token, userId, value);
			redisTemplate.expire(token, 1800, TimeUnit.SECONDS);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
}
