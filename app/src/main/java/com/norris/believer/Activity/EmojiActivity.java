package com.norris.believer.Activity;

import android.os.Bundle;
import android.view.View;

import com.norris.believer.Base.BaseActivityForPerms;
import com.norris.believer.Base.BaseInterface;
import com.norris.believer.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.github.rockerhieu.emojicon.EmojiconEditText;
import io.github.rockerhieu.emojicon.EmojiconGridFragment;
import io.github.rockerhieu.emojicon.EmojiconTextView;
import io.github.rockerhieu.emojicon.EmojiconsFragment;
import io.github.rockerhieu.emojicon.emoji.Emojicon;

public class EmojiActivity extends BaseActivityForPerms implements BaseInterface, EmojiconGridFragment.OnEmojiconClickedListener, EmojiconsFragment.OnEmojiconBackspaceClickedListener {

    @Bind(R.id.txtEmojicon)
    EmojiconTextView txtEmojicon;
    @Bind(R.id.editEmojicon)
    EmojiconEditText editEmojicon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emoji);
        ButterKnife.bind(this);
        initView();
        initData();
        initViewOper();
    }

    @Override
    public void initView() {
//        EmojiconsView emojiconsView = (EmojiconsView) findViewById(R.id.emojicons_view);
//        emojiconsView.setPages(Arrays.asList(
//                new EmojiconPage(Emojicon.TYPE_PEOPLE, null, false, R.drawable.ic_emoji_people_light),
//                new EmojiconPage(Emojicon.TYPE_NATURE, null, false, R.drawable.ic_emoji_nature_light),
//                new EmojiconPage(Emojicon.TYPE_OBJECTS, null, false, R.drawable.ic_emoji_objects_light),
//                new EmojiconPage(Emojicon.TYPE_PLACES, null, false, R.drawable.ic_emoji_places_light),
//                new EmojiconPage(Emojicon.TYPE_SYMBOLS, null, false, R.drawable.ic_emoji_symbols_light)
//        ));
    }

    @Override
    public void initData() {
        EmojiconsFragment.newInstance(true);
    }

    @Override
    public void initViewOper() {

    }


    @Override
    public void onEmojiconBackspaceClicked(View v) {
        EmojiconsFragment.backspace(editEmojicon);
    }

    @Override
    public void onEmojiconClicked(Emojicon emojicon) {
        EmojiconsFragment.input(editEmojicon,emojicon);
    }
}
