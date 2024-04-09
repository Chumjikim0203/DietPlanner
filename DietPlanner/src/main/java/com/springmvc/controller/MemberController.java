package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController 
{
	@GetMapping("/addMember")
	public String addMember()
	{
		return "addMember";
	}
	
	@PostMapping("/addMember")
	public String addMemberDone()
	{
		return "addMemberDone";
	}
	
}
