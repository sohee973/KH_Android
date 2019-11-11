package com.example.prob20;
/*문제 20. 아무런 이미지 파일을 10개 정도 확보한다.
 *          CheckBox를 3개 만든다.
 *          1 번째 체크 박스는 오늘 작성한 예제처럼 눈에 보이게 할지 말지를 결정하도록 한다.
 *          2 번째 체크 박스는 랜덤 여부를 판정한다.
 *          즉, 1,2번 체크 박스를 체크하면 무작위로 그림파일이 보이게 만들면 된다.
 *           (Button을 하나 만들어서 누를 때마다 무작위로 보이게 만들어준다.)
 *           3 번째 체크 박스는 순서대로 보이게 해준다.
 *           결론 : 1,2 번은 무작위 출력
 *                   1,3번은 순차 출력
 *                   2,3번은 동작 불가능 !
 *                   1번만 있을 경우엔 visible 이므로 메뉴만 보여준다고 생각하면 됨
 *                   2번이나 3번만 있을 경우엔 아무것도 보이지 않음*/
import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    CheckBox chkAgree1,chkAgree2,chkAgree3;
    Button btnOK;
    ImageView ImgLang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Random Image Print");

        tv1=(TextView)findViewById(R.id.text);
        chkAgree1=(CheckBox)findViewById(R.id.chk1);
        chkAgree2=(CheckBox)findViewById(R.id.chk2);
        chkAgree3=(CheckBox)findViewById(R.id.chk3);
        ImgLang=(ImageView)findViewById(R.id.ImgLang);
        btnOK=(Button)findViewById(R.id.btn);

        chkAgree1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chkAgree1.isChecked()==true){
                    tv1.setVisibility(View.VISIBLE);
                    chkAgree2.setVisibility(View.VISIBLE);
                    chkAgree3.setVisibility(View.VISIBLE);
                    ImgLang.setVisibility(View.VISIBLE);
                }
                else{
                    tv1.setVisibility(View.INVISIBLE);
                    chkAgree2.setVisibility(View.INVISIBLE);
                    chkAgree3.setVisibility(View.INVISIBLE);
                    ImgLang.setVisibility(View.INVISIBLE);
                }
            }
        });
        chkAgree2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chkAgree2.isChecked()==true){

                    ImgLang.setImageResource(R.drawable.i);
                }
            }
        });
    }
}