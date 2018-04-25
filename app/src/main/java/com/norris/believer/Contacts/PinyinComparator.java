package com.norris.believer.Contacts;

import java.util.Comparator;

/**
 * 联系人没有首字母特殊处理
 * @author Administrator
 *
 */
public class PinyinComparator implements Comparator<ContactSortBean> {

	public int compare(ContactSortBean o1, ContactSortBean o2) {
		if (o1.getSortLetters().equals("@")
				|| o2.getSortLetters().equals("#")) {
			return -1;
		} else if (o1.getSortLetters().equals("#")
				|| o2.getSortLetters().equals("@")) {
			return 1;
		} else {
			return o1.getSortLetters().compareTo(o2.getSortLetters());
		}
	}

}