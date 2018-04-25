package com.norris.believer.Contacts;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.util.Log;

import com.norris.believer.Utils.DialogUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 获取手机联系人名字
 *
 * @author Andrew
 */
public class PhoneContactsUtils {

    public static List<String> getContactsName(Context context) {

        final List<String> nameList = new ArrayList<String>();

        ContentResolver cr = context.getApplicationContext()
                .getContentResolver();
        Cursor cursor = cr.query(ContactsContract.Contacts.CONTENT_URI, null,
                null, null, null);
        while (cursor.moveToNext()) {
            int nameIndex = cursor
                    .getColumnIndex(ContactsContract.PhoneLookup.DISPLAY_NAME);
            String contact = cursor.getString(nameIndex);
            nameList.add(contact);
        }

        return nameList;
    }

    private static List<String> nameList;
    private static List<String> phoneList;

    public static List<String> getNameList() {
        return nameList;
    }

    public static List<String> getPhoneList() {
        return phoneList;
    }

    public static List<String> initContacts(Context context) {
        DialogUtils.createProgressDialog(context, " ");

        Log.e("phoneUtils", "电话号码开始搜索");
        nameList = new ArrayList<String>();
        phoneList = new ArrayList<String>();

        ContentResolver cr = context.getApplicationContext()
                .getContentResolver();
        Cursor cursor = cr.query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
        while (cursor != null && cursor.moveToNext()) {
            int nameIndex = cursor.getColumnIndex(ContactsContract.PhoneLookup.DISPLAY_NAME);
            String contact = cursor.getString(nameIndex);
            nameList.add(contact);
            //取得电话号码
            String ContactId = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts._ID));
            Cursor phone = cr.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, ContactsContract.CommonDataKinds.Phone.CONTACT_ID + "=" + ContactId, null, null);

            while (phone!=null&&phone.moveToNext()) {
                String phoneNumber = phone.getString(phone.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
                Log.e("phoneUtils", "电话号码==" + phoneNumber);
                //格式化手机号
                phoneNumber = phoneNumber.replace("-", "");
                phoneNumber = phoneNumber.replace(" ", "");
                Log.e("phoneUtils", "电话号码==" + phoneNumber);
                phoneList.add(phoneNumber);
            }
            phone.close();
        }
        cursor.close();
        Log.e("phoneUtils", "电话号码长度==" + nameList.size());
        DialogUtils.dismissProgressDialog();
        return nameList;
    }

}
