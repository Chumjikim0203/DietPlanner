package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.domain.Member;
import com.springmvc.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService 
{
	@Autowired
	private MemberRepository memberRepository;

	@Override
	public void addMember(Member member) 
	{
		memberRepository.addMember(member);
	}
	
}
