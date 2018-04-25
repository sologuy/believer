package com.norris.believer.Contacts;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SectionIndexer;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.lzy.widget.CircleImageView;
import com.norris.believer.R;

import java.util.List;

public class ActContactSortAdapter extends BaseAdapter implements SectionIndexer {
    private List<ContactSortBean> contactList = null;
    private Context mContext;
    private int type;
    //0; 意思是是公司总的通讯录,
    // 1: 意思是部门通讯录
    // 2, 是个人手机通讯录
    // 3, 个人社群通讯录
    //4, 是公司管理员过来选择转让管理权的列表


    public ActContactSortAdapter(Context mContext, List<ContactSortBean> list, int type) {
        this.mContext = mContext;
        this.contactList = list;
        this.type = type;
    }

    /**
     * 当ListView数据发生变化时,调用此方法来更新ListView
     *
     * @param list
     */
    public void updateListView(List<ContactSortBean> list) {
        this.contactList = list;
        notifyDataSetChanged();
    }


    public int getCount() {
        return this.contactList.size();
    }


    public Object getItem(int position) {
        return contactList.get(position);
    }


    public long getItemId(int position) {
        return position;
    }


    public View getView(final int position, View view, ViewGroup arg2) {
        ViewHolder viewHolder = null;
        final ContactSortBean mContent = contactList.get(position);
        if (view == null) {
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(mContext).inflate(R.layout.act_contacts_list_item, null);
            viewHolder.tvName = (TextView) view.findViewById(R.id.act_contact_list_item_name);
            viewHolder.tvLetter = (TextView) view.findViewById(R.id.act_contact_list_item_catalog);
            viewHolder.tvAdd = (TextView) view.findViewById(R.id.act_contact_list_item_add);
            viewHolder.head = (CircleImageView) view.findViewById(R.id.act_contact_list_item_head);
            viewHolder.tvMsg = (TextView) view.findViewById(R.id.act_contact_list_item_msg);
            viewHolder.tvRole = (TextView) view.findViewById(R.id.act_contact_list_item_role);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

//根据position获取分类的首字母的Char ascii值
        int section = getSectionForPosition(position);

//如果当前位置等于该分类首字母的Char的位置 ，则认为是第一次出现
        if (position == getPositionForSection(section)) {
            viewHolder.tvLetter.setVisibility(View.VISIBLE);
            viewHolder.tvLetter.setText(mContent.getSortLetters());
        } else {
            viewHolder.tvLetter.setVisibility(View.GONE);
        }

        switch (type) {
            case 0://说明是为了展示公司通讯录的情况
                viewHolder.tvAdd.setVisibility(View.GONE);
                if (mContent.getIsAdmin() == 0) {
                    viewHolder.tvRole.setVisibility(View.GONE);
                } else if (mContent.getIsAdmin() == 1) {
                    viewHolder.tvRole.setVisibility(View.VISIBLE);
                    viewHolder.tvRole.setText("管理员");
                    viewHolder.tvRole.setBackgroundResource(R.drawable.act_contact_list_manage_bg);
                } else if (mContent.getIsAdmin() == 2) {
                    viewHolder.tvRole.setVisibility(View.VISIBLE);
                    viewHolder.tvRole.setText("学习官");
                    viewHolder.tvRole.setBackgroundResource(R.drawable.act_contact_list_add_bg);
                }
                if (mContent.getMsg() != null) {
                    viewHolder.tvMsg.setText(mContent.getMsg());
                }else {
                    viewHolder.tvMsg.setText(" ");
                }
                break;
            case 1://说明是为了展示部门通讯录的情况
                viewHolder.tvAdd.setVisibility(View.GONE);
                if (mContent.getMsg() != null) {
                    viewHolder.tvMsg.setText(mContent.getMsg());
                }
                if (mContent.getIsAdmin() == 0) {
                    viewHolder.tvRole.setVisibility(View.GONE);
                } else if (mContent.getIsAdmin() == 3) {
                    viewHolder.tvRole.setVisibility(View.VISIBLE);
                    viewHolder.tvRole.setText("主管");
                    viewHolder.tvRole.setBackgroundResource(R.drawable.act_contact_list_manage_bg1);
                }
                break;
            case 2://说明是手机个人通讯录的情况
                viewHolder.tvAdd.setVisibility(View.VISIBLE);
                if (mContent.getNeedInvite() == 0) {
                    viewHolder.tvAdd.setText("已是成员");
                } else {
                    viewHolder.tvAdd.setText("添加");
                }
                break;
            case 3://说明是展示个人社群通讯录的情况
                viewHolder.tvAdd.setVisibility(View.GONE);
                if (mContent.getMsg() != null) {
                    viewHolder.tvMsg.setText(mContent.getMsg());
                } else {
                    viewHolder.tvMsg.setText("中国");
                }

                if (mContent.getIsAdmin() == 0) {
                    viewHolder.tvRole.setVisibility(View.GONE);
                } else if (mContent.getIsAdmin() == 1) {
                    viewHolder.tvRole.setVisibility(View.VISIBLE);
                    viewHolder.tvRole.setText("管理员");
                    viewHolder.tvRole.setBackgroundResource(R.drawable.act_contact_list_manage_bg);
                }
                break;
            case 4://说明是为了展示公司通讯录的情况
                viewHolder.tvAdd.setVisibility(View.GONE);
                if (mContent.getIsAdmin() == 0) {
                    viewHolder.tvRole.setVisibility(View.GONE);
                } else if (mContent.getIsAdmin() == 1) {
                    viewHolder.tvRole.setVisibility(View.VISIBLE);
                    viewHolder.tvRole.setText("管理员");
                    viewHolder.tvRole.setBackgroundResource(R.drawable.act_contact_list_manage_bg);
                } else if (mContent.getIsAdmin() == 2) {
                    viewHolder.tvRole.setVisibility(View.VISIBLE);
                    viewHolder.tvRole.setText("学习官");
                    viewHolder.tvRole.setBackgroundResource(R.drawable.act_contact_list_add_bg);
                }
                if (mContent.getMsg() != null) {
                    viewHolder.tvMsg.setText(mContent.getMsg());
                }
                break;
            case 5://说明是展示个人社群通讯录的情况--选择转让权的
                viewHolder.tvAdd.setVisibility(View.GONE);
                if (mContent.getMsg() != null) {
                    viewHolder.tvMsg.setText(mContent.getMsg());
                } else {
                    viewHolder.tvMsg.setText("中国");
                }

                if (mContent.getIsAdmin() == 0) {
                    viewHolder.tvRole.setVisibility(View.GONE);
                } else if (mContent.getIsAdmin() == 1) {
                    viewHolder.tvRole.setVisibility(View.VISIBLE);
                    viewHolder.tvRole.setText("管理员");
                    viewHolder.tvRole.setBackgroundResource(R.drawable.act_contact_list_manage_bg);
                }
                break;
        }


        viewHolder.tvName.setText(mContent.getName());

        Glide
                .with(mContext)
                .load(mContent.getHeadImage())
                .diskCacheStrategy(DiskCacheStrategy.RESULT)
                .error(R.mipmap.defaulthead)
                .into(viewHolder.head);

        return view;
    }


    final static class ViewHolder {
        TextView tvLetter;
        TextView tvName;
        TextView tvAdd;
        TextView tvRole;
        TextView tvMsg;
        CircleImageView head;
    }


    public static void updateDatas(){

    }
    /**
     * 根据ListView的当前位置获取分类的首字母的Char ascii值
     */
    public int getSectionForPosition(int position) {
        return contactList.get(position).getSortLetters().charAt(0);
    }


    /**
     * 根据分类的首字母的Char ascii值获取其第一次出现该首字母的位置
     */
    public int getPositionForSection(int section) {
        for (int i = 0; i < getCount(); i++) {
            String sortStr = contactList.get(i).getSortLetters();
            char firstChar = sortStr.toUpperCase().charAt(0);
            if (firstChar == section) {
                return i;
            }
        }

        return -1;
    }

    /**
     * 提取英文的首字母，非英文字母用#代替。
     *
     * @param str
     * @return
     */
    private String getAlpha(String str) {
        String sortStr = str.trim().substring(0, 1).toUpperCase();
// 正则表达式，判断首字母是否是英文字母
        if (sortStr.matches("[A-Z]")) {
            return sortStr;
        } else {
            return "#";
        }
    }


    @Override
    public Object[] getSections() {
        return null;
    }
}