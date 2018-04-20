package com.a99zan.shuzitixiangbowen;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by 99zan on 2018/4/17.
 */

public class BaseActivity extends AppCompatActivity {

    public void showToast(String text){
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

}
