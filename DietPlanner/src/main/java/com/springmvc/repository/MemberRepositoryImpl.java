package com.springmvc.repository;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc.domain.Member;

@Repository
public class MemberRepositoryImpl implements MemberRepository 
{
	private JdbcTemplate template;
	
	@Autowired
	public void setJdbcTemplate(DataSource dataSource)
	{
		this.template = new JdbcTemplate(dataSource);
	}
	
	@Override
	public void addMember(Member member) 
	{
		String SQL = "insert into Member"
				+ "(memberId, memberName, memberPassword, memberBirth, memberAddr, memberPhone01, memberPhone02, memberPhone03, "
				+ "memberGender, memberEmail)"
				+ "values(?,?,?,?,?,?,?,?,?,?);";
		
		template.update(SQL, member.getMemberId(),member.getMemberName(), member.getMemberPassword(), member.getMemberBirth(), member.getMemberAddr()
				        , member.getMemberPhone01(), member.getMemberPhone02(), member.getMemberPhone03(), member.getMemberGender()
				        , member.getMemberEmail());
	}
	
}
