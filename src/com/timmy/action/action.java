package com.timmy.action;



import com.opensymphony.xwork2.ActionSupport;

public class action extends ActionSupport {
	private userService userService;
	

	public void setUserService(userService userService) {
		this.userService = userService;
	}


	@Override
	public String execute() throws Exception {
		System.out.println("1");
		userService.add();
		return "ok";
	}
	
	

}
