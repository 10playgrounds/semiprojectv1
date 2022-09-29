package zzyzzy.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zzyzzy.spring.mvc.dao.MemberDAO;
import zzyzzy.spring.mvc.vo.MemberVO;

@Service("msrv")
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAO mdao;
	
	@Override
	public boolean newMember(MemberVO mvo) {
		boolean isInsert = false;
		
		// 회원가입 성공시 true 리턴
		if (mdao.insertMember(mvo) > 0) isInsert = true;
		
		return isInsert;
	}

}
