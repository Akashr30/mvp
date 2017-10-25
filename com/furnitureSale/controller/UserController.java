package com.furnitureSale.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import org.codehaus.jettison.json.JSONObject;

import com.furnitureSale.model.User;
import com.furnitureSale.service.UserService;
import com.furnitureSale.service.UserServiceImpl;

import java.io.UnsupportedEncodingException;
import java.util.Base64; 

@Path("/user")
public class UserController {
	
	UserService userService = new UserServiceImpl();

	@Path("/auth")
	@POST
	@Produces("application/json")
	public String authUserByEmail(User user1) throws Exception
	{
		String email = user1.getEmail();
		byte[] asBytes = Base64.getDecoder().decode(user1.getPwd());
		String decodedpassword = new String(asBytes);
		
		User user = userService.findUser(email,decodedpassword);
		
		String response="";
		JSONObject jsonObject = new JSONObject();
		
		//Decrypting the Password that is stored in Db as a encrypted format using decoder Base 64
		
		if(email.equalsIgnoreCase(user.getEmail()) && decodedpassword.equalsIgnoreCase(user.getPwd())) {
		
		
		
		jsonObject.put("Status", "Success");
		jsonObject.put("name", user.getUsername());
		jsonObject.put("email", user.getEmail());

		
		response = jsonObject.toString();
	
		}
		else{
			
			jsonObject.put("Status","Failure");			
			response = jsonObject.toString();
			
		}
		
		return response;
	}
	@POST
	@Path("/add")
	@Produces("application/json")
	public String addUsers(User user) throws UnsupportedEncodingException {
		
		String encryptedpassword = Base64.getEncoder().encodeToString(user.getPwd().getBytes("utf-8"));
		user.setPwd(encryptedpassword);
		return userService.addUser(user);
	}
	
	
}
