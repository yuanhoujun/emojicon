package com.rockerhieu.emojicon.example;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import io.github.rockerhieu.emojicon.EmojiconTextView;

/**
 * 自定义Emoji表情Activity
 *
 * @author Scott Smith 2017-11-05 09:18
 */
public class CustomEmojiActivity extends AppCompatActivity {
    private EmojiconTextView mTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_emoji);

        mTextView = (EmojiconTextView) findViewById(R.id.text_emoji);

        mTextView.setText(new String(Character.toChars(0x1F60A)));
    }
}
