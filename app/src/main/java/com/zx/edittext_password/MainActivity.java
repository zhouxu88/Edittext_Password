package com.zx.edittext_password;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText psdEdt;
    private ImageView psdToggleIv;
    private boolean isPsdVisible; //密码是否可见

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        psdEdt = (EditText) findViewById(R.id.psd_edt);
        psdToggleIv = (ImageView) findViewById(R.id.psd_toggle_iv);
        psdToggleIv.setOnClickListener(this);
    }

    //密码是否可见的"按钮"的点击事件
    @Override
    public void onClick(View v) {
        if(!isPsdVisible){
            //明文,设置密码可见
            psdEdt.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            isPsdVisible = true;
        }else {
            //密码，设置密码不可见
            psdEdt.setTransformationMethod(PasswordTransformationMethod.getInstance());
            isPsdVisible = false;
        }
    }
}
