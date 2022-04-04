package com.vc.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vc.models.MF_Amcs;

@Service
public class AmcsServices {

	@Autowired
	private RestTemplate restTemplate;
	public String getamcsmf()
	{
		String url = "https://www.truthscreen.com/InstantSearch/encrypted_string";
		//HttpEntity<MF_Amcs> entity=new HttpEntity<>(panSeeding,headers);
		restTemplate=new RestTemplate();

		Object responseEntity = restTemplate.getForObject(url,MF_Amcs.class);
		System.out.println(responseEntity);
		return responseEntity.toString();
//		Map<String, String> objMap = new HashMap<String, String>();
//		
//		objMap.put( "requestData", responseEntity);
	}
}
