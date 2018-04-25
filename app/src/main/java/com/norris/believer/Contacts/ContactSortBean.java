package com.norris.believer.Contacts;


import java.util.List;

public class ContactSortBean {


	private String name;   //显示的数据
	private List<String> mobileList;
	private String sortLetters;  //显示数据拼音的首字母
	private int needInvite = 0;
	private String headImage = "";
	private String memId ;
	private int UserID;
	private int isAdmin;
	private String msg;

	public int getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getMobileList() {
		return mobileList;
	}

	public void setMobileList(List<String> mobileList) {
		this.mobileList = mobileList;
	}

	public String getSortLetters() {
		return sortLetters;
	}

	public void setSortLetters(String sortLetters) {
		this.sortLetters = sortLetters;
	}

	public int getNeedInvite() {
		return needInvite;
	}

	public void setNeedInvite(int needInvite) {
		this.needInvite = needInvite;
	}

	public String getHeadImage() {
		return headImage;
	}

	public void setHeadImage(String headImage) {
		this.headImage = headImage;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}
}