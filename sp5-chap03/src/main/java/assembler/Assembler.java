package assembler;

import spring.ChangePasswordService;
import spring.MemberDao;
import spring.MemberRegisterService;

public class Assembler {
	// 생성자를 이용해서 필요한 객체를 생성함
	private MemberDao memberDao; 
	private MemberRegisterService regSvc;
	private ChangePasswordService pwdSvc;

	public Assembler() {
		memberDao = new MemberDao(); //MemberDao 객체를 생성하고
		regSvc = new MemberRegisterService(memberDao); //MemberRegisterService 객체를 생성할 때 MemberDao 객체를 주입함.
		pwdSvc = new ChangePasswordService();//ChangePasswordService 객체를 생성하고
		pwdSvc.setMemberDao(memberDao); //MemberDao
	}
	// 생성한 객체들을 꺼내줌.
	public MemberDao getMemberDao() {
		return memberDao;
	}

	public MemberRegisterService getMemberRegisterService() {
		return regSvc;
	}

	public ChangePasswordService getChangePasswordService() {
		return pwdSvc;
	}

}