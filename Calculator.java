package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Calculator extends AppCompatActivity {
    final EditText editText = findViewById(R.id.editText);
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_layout);

        Button help = findViewById(R.id.help);
        Button delete = findViewById(R.id.delete);
        Button ganTanHao = findViewById(R.id.ganTanHao);
        Button ciFang = findViewById(R.id.ciFang);
        Button baiFenHao = findViewById(R.id.baiFenHao);
        Button daoShu = findViewById(R.id.daoShu);
        Button c = findViewById(R.id.c);
        Button sin = findViewById(R.id.sin);
        Button cos = findViewById(R.id.cos);
        Button tan = findViewById(R.id.tan);
        Button ln = findViewById(R.id.ln);
        Button log = findViewById(R.id.log);
        Button pi = findViewById(R.id.pi);
        Button chu = findViewById(R.id.chu);
        Button cheng = findViewById(R.id.cheng);
        Button jian = findViewById(R.id.jian);
        Button jia = findViewById(R.id.jia);
        Button deng = findViewById(R.id.deng);
        Button qianKuoHao = findViewById(R.id.qianKuoHao);
        Button fanKuoHao = findViewById(R.id.fanKuoHao);
        Button dian = findViewById(R.id.dian);
        Button bt0 = findViewById(R.id.b_0);
        Button bt1 = findViewById(R.id.b_1);
        Button bt2 = findViewById(R.id.b_2);
        Button bt3 = findViewById(R.id.b_3);
        Button bt4 = findViewById(R.id.b_4);
        Button bt5 = findViewById(R.id.b_5);
        Button bt6 = findViewById(R.id.b_6);
        Button bt7 = findViewById(R.id.b_7);
        Button bt8 = findViewById(R.id.b_8);
        Button bt9 = findViewById(R.id.b_9);

        //按键点击事件
        ganTanHao.setOnClickListener(new Click());
        ciFang.setOnClickListener(new Click());
        baiFenHao.setOnClickListener(new Click());
        daoShu.setOnClickListener(new Click());
        c.setOnClickListener(new Click());
        sin.setOnClickListener(new Click());
        qianKuoHao.setOnClickListener(new Click());
        fanKuoHao.setOnClickListener(new Click());
        pi.setOnClickListener(new Click());
        chu.setOnClickListener(new Click());
        cos.setOnClickListener(new Click());
        cheng.setOnClickListener(new Click());
        tan.setOnClickListener(new Click());
        jian.setOnClickListener(new Click());
        ln.setOnClickListener(new Click());
        jia.setOnClickListener(new Click());
        log.setOnClickListener(new Click());
        deng.setOnClickListener(new Click());
        dian.setOnClickListener(new Click());
        bt0.setOnClickListener(new Click());
        bt1.setOnClickListener(new Click());
        bt2.setOnClickListener(new Click());
        bt3.setOnClickListener(new Click());
        bt4.setOnClickListener(new Click());
        bt5.setOnClickListener(new Click());
        bt6.setOnClickListener(new Click());
        bt7.setOnClickListener(new Click());
        bt8.setOnClickListener(new Click());
        bt9.setOnClickListener(new Click());

        //帮助
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Calculator.this,"这是帮助",Toast.LENGTH_LONG).show();
            }
        });

        //换算
        Button huanSuan = findViewById(R.id.huanSuan);
        huanSuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Calculator.this, RadioButtonActivity.class);
                startActivity(in);

            }
        });




    }
    //点击事件类
    class Click implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.c:
                    editText.setText(null);
                    break;
                case R.id.b_0:
                    String str0 = editText.getText().toString();
                    str0+="0";
                    editText.setText(str0);
                case R.id.b_1:
                    String str1 = editText.getText().toString();
                    str1+="1";
                    editText.setText(str1);
                case R.id.b_2:
                    String str2 = editText.getText().toString();
                    str2+="2";
                    editText.setText(str2);
                case R.id.b_3:
                    String str3 = editText.getText().toString();
                    str3+="3";
                    editText.setText(str3);
                case R.id.b_4:
                    String str4 = editText.getText().toString();
                    str4+="4";
                    editText.setText(str4);
                case R.id.b_5:
                    String str5 = editText.getText().toString();
                    str5+="5";
                    editText.setText(str5);
                case R.id.b_6:
                    String str6 = editText.getText().toString();
                    str6+="6";
                    editText.setText(str6);
                case R.id.b_7:
                    String str7 = editText.getText().toString();
                    str7+="7";
                    editText.setText(str7);
                case R.id.b_8:
                    String str8 = editText.getText().toString();
                    str8+="8";
                    editText.setText(str8);
                case R.id.b_9:
                    String str9 = editText.getText().toString();
                    str9+="9";
                    editText.setText(str9);
                case R.id.dian:
                    String str10 = editText.getText().toString();
                    str10+=".";
                    editText.setText(str10);
                case R.id.ganTanHao:
                    String str11 = editText.getText().toString();
                    str11+="!";
                    editText.setText(str11);
                case R.id.ciFang:
                    String str12 = editText.getText().toString();
                    str12+="^";
                    editText.setText(str12);
                case R.id.baiFenHao:
                    String str13 = editText.getText().toString();
                    str13+="%";
                    editText.setText(str13);
                case R.id.sin:
                    String str14 = editText.getText().toString();
                    str14+="sin";
                    editText.setText(str14);
                case R.id.cos:
                    String str15 = editText.getText().toString();
                    str15+=".";
                    editText.setText(str15);
                case R.id.tan:
                    String str16 = editText.getText().toString();
                    str16+=".";
                    editText.setText(str16);
                case R.id.ln:
                    String str17 = editText.getText().toString();
                    str17+="ln";
                    editText.setText(str17);



            }
        }
    }


}