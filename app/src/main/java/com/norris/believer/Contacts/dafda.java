package com.norris.believer.Contacts;//package com.lhdd.reading4.Contacts;
//
//import android.app.Activity;
//import android.content.ContentResolver;
//import android.database.Cursor;
//import android.net.Uri;
//import android.os.Bundle;
//import android.provider.ContactsContract;
//import android.View.View;
//import android.widget.Button;
//import android.widget.Toast;
//
//import com.lhdd.reading4.R;
//
///**
// * Created by admin on 2017/5/27.
// */
//
//public class dafda extends Activity {
//    //定义变量
//    private Button button = null;
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main);
//
//        //根据控件Id得到控件对象
//        button = (Button) findViewById(R.id.button);
//        //给按钮控件添加单击事件监听器
//        button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                //调用显示联系人方法
//                printContacts();
//
//            }
//        });
//    }
//
//    /*
//     * 自定义显示Contacts提供的联系人的方法
//     */
//    public void printContacts() {
//        //生成ContentResolver对象
//        ContentResolver contentResolver = getContentResolver();
//
//        // 获得所有的联系人
//        /*Cursor cursor = contentResolver.query(
//                ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
//         */
//        //这段代码和上面代码是等价的，使用两种方式获得联系人的Uri
//        Cursor cursor = contentResolver.query(Uri.parse("content://com.android.contacts/contacts"), null, null, null, null);
//
//        // 循环遍历
//        if (cursor.moveToFirst()) {
//
//            int idColumn = cursor.getColumnIndex(ContactsContract.Contacts._ID);
//            int displayNameColumn = cursor
//                    .getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME);
//
//            do {
//                // 获得联系人的ID
//                String contactId = cursor.getString(idColumn);
//                // 获得联系人姓名
//                String displayName = cursor.getString(displayNameColumn);
//
//                //使用Toast技术显示获得的联系人信息
//                Toast.makeText(this, "联系人姓名：" + displayName, Toast.LENGTH_LONG).show();
//
//
//                // 查看联系人有多少个号码，如果没有号码，返回0
//                int phoneCount = cursor.getInt(cursor.getColumnIndex(ContactsContract.Contacts.HAS_PHONE_NUMBER));
//
//                if (phoneCount > 0) {
//                    // 获得联系人的电话号码列表
//                    Cursor phoneCursor = getContentResolver().
//                            query(ContactsContract.
//                                            CommonDataKinds.Phone.CONTENT_URI,
//                                    null,
//                                    ContactsContract.CommonDataKinds.Phone.CONTACT_ID + "=" + contactId, null, null);
//                    if (phoneCursor.moveToFirst()) {
//                        do {
//                            //遍历所有的联系人下面所有的电话号码
//                            String phoneNumber = phoneCursor.getString(phoneCursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
//                            //使用Toast技术显示获得的号码
//                            Toast.makeText(this, "联系人电话：" + phoneNumber, Toast.LENGTH_LONG).show();
//
//                        } while (phoneCursor.moveToNext());
//                    }
//                }
//
//
//            } while (cursor.moveToNext());
//        }
//
//    }
//}
