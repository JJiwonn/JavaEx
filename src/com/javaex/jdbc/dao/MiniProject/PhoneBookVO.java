package com.javaex.jdbc.dao.MiniProject;

//데이터 전송 객체(DTO)
//- 데이터베이스 필드에 매칭되는 필드
//- 기본(로직) 생성자 있어야한다
//- getters/setters
//- 로직은 (가급적) 포함하지 않는다
//- toString(), equals() 메서드는 포함하기도 한다
public class PhoneBookVO {
	// 필드
	private Long PhonebookId; // PK
	private String PhonebookName;
	private int Phonebookhp;
	private int Phonebooktel;


	// 기본 생성자
	public PhoneBookVO() {
		
	}

	// 전체 필드를 세팅할 수 있는 생성자
	public PhoneBookVO(Long PhonebookId, String PhonebookName, int Phonebookhp, int Phonebooktel) {
		super();
		this.PhonebookId = PhonebookId;
		this.PhonebookName = PhonebookName;
		this.Phonebookhp = Phonebookhp;
		this.Phonebooktel = Phonebooktel;
	}

	public PhoneBookVO(String PhonebookName, int Phonebookhp, int Phonebooktel) {
		super();
		this.PhonebookName = PhonebookName;
		this.Phonebookhp = Phonebookhp;
		this.Phonebooktel = Phonebooktel;
	}

	// - Getters / Setters
	public Long getPhonebookId() {
		return PhonebookId;
	}

	public void setPhonebookId(Long phonebookId) {
		PhonebookId = phonebookId;
	}

	public String getPhonebookName() {
		return PhonebookName;
	}

	public void setPhonebookName(String phonebookName) {
		PhonebookName = phonebookName;
	}

	public int getPhonebookhp() {
		return Phonebookhp;
	}

	public void setPhonebookhp(int phonebookhp) {
		Phonebookhp = phonebookhp;
	}

	public int getPhonebooktel() {
		return Phonebooktel;
	}

	public void setPhonebooktel(int phonebooktel) {
		Phonebooktel = phonebooktel;
	}

	@Override
	public String toString() {
		return "PhoneBookVO [PhonebookId=" + PhonebookId + ", PhonebookName=" + PhonebookName + ", Phonebookhp="
				+ Phonebookhp + ", Phonebooktel=" + Phonebooktel + "]";
	}
	
	
}
	

	
	
	
	
