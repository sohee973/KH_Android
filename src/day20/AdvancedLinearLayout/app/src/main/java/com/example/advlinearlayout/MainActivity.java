package com.example.advlinearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout innerLL1;
    LinearLayout innerLL2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        /*XML에서 <LinearLayout 이후에
         * layout_width와 layout_height 에 match_parent라고 줬던 작업과 동일한 작업에 해당합니다,
         *
         * 아래 코드의 XML 동의어는 다음과 같다.
         *  <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"*/
        LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
        /*LinearLayout 을 객체화함*/
        LinearLayout base = new LinearLayout(this);
        /*android:orientation="vertical"와 동의어*/
        base.setOrientation(LinearLayout.VERTICAL);
        /*android:background="#0000ff"와 동의어 */
        base.setBackgroundColor(Color.rgb(0,0,255));
        //만든 내용을 실제 화면에 출력하는 부분


        innerLL1=new LinearLayout(getApplicationContext());
        innerLL1.setLayoutParmas(
                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT,weight:1f);
        )


        setContentView(base,params);

        Button btn=new Button(this);
        btn.setText("Click this button");
        btn.setBackgroundColor(Color.MAGENTA);
        //우리가 만든 버튼 객체를 실제 화면에 출력함
        base.addView(btn);

        btn.setOnClickListener(new View.OnClickliste);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(getApplicationContext(),"색상이 바뀌었습니다.", Toast.LENGTH_LONG).show();
            }
        });
    }
}
/* 문제 20
*XML 없이 프로그램으로 LinearLayout 안에 2개의 LinearLayout과 버튼을 배치한다.
* 2개의 LinearLayout의 색상은 서로 다르다. 버튼을 누르면 서로간의 색상이 교환되게 한다.
* (힌트 : addView, layout_weight의 역할을 수행할 수 있는 메서드를 활용하면 문제 해결!)
* LinearLayout.LayoutParams(LayoutParams.MATCHPARENT,LayoutParams.MATCHPARENT,lf);)*/