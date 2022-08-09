﻿package guide;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Member implements Serializable, Comparable<Member>{
	
	private static final long serialVersionUID = -5365298043362044895L;
	
	// 회원관리번호
	private int mNum;
	// 회원 이름
	private String mName;
	// 회원 아이디
	private String mId;
	// 회원 비밀번호
	private String mPw;
	//회원가입일
	private long reg;
	
	
	public Member() {}

	// 회원 로그인 및 정보 검색용 생성자
	public Member(String mId, String mPw) {
		this.mId = mId;
		this.mPw = mPw;
	}

	// 회원가입 용
	public Member(int mNum, String mName, String mId, String mPw, long reg) {
		this.mNum = mNum;
		this.mName = mName;
		this.mId = mId;
		this.mPw = mPw;
		this.reg = reg;
	}
	
	public int getmNum() {
		return mNum;
	}

	public void setmNum(int mNum){
		this.mNum = mNum;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getmPw() {
		return mPw;
	}

	public void setmPw(String mPw) {
		this.mPw = mPw;
	}
	
	// 자신이 가지고 있는  long type의 값을  2020-10-23 12:11:21 형식의 문자열이 반환 하도록 변경
	// SimpleDateFormat 객체 활용
	public String getReg() {
		SimpleDateFormat sdf
		= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// java.util.Date
		Date date = new Date(this.reg);
		String reg = sdf.format(date);
		return reg;
	}

	// System의 현재시간을 m/s으로 전달 받아 저장
	public void setReg(long reg) {
		this.reg = reg;
	}

	// 회원정보의 mId field와 mPw field가 일치하면 동일한 객체로 
	// 인식할 수 있도록 재정의
	@Override
	public boolean equals(Object o) {
		if(o instanceof Member) {
			Member m = (Member)o;
			if(this.mId.equals(m.getmId())
					&&
			   this.mPw.equals(m.getmPw())
			  ) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Member{ [mNum : "+this.mNum+"] [mName : " +this.mName +"] [ mId : " + this.mId+"] [reg : "+this.getReg()+"]}";
	}

	@Override
	public int compareTo(Member o) {
		return o.mNum - this.mNum;
	}

}










