package com.a99zan.shuzitixiangbowen;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends BaseActivity {

    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        init();
        
    }

    private void init() {
        editText = (EditText) findViewById(R.id.et);
        button = (Button) findViewById(R.id.btn);
        BadgeView badgeView = new BadgeView(this, button);
        badgeView.setText("99");
        badgeView.setBadgePosition(BadgeView.POSITION_TOP_RIGHT);
        badgeView.setBadgeMargin(10);
        badgeView.show();
        badgeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("badgeview");
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("buttonclick");
            }
        });
    }
}
