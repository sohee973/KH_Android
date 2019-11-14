package com.example.prob22;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_MENU=10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button accBtn = (Button)findViewById(R.id.acc);
        accBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),AccActivity.class);
                startActivityForResult(intent,REQUEST_CODE_MENU);
            }
        });
        Button itemBtn = (Button)findViewById(R.id.item);
        itemBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),ItemActivity.class);
                startActivityForResult(intent,REQUEST_CODE_MENU);
            }
        });
        Button rankBtn = (Button)findViewById(R.id.ranking);
        rankBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),LankActivity.class);
                startActivityForResult(intent,REQUEST_CODE_MENU);
            }
        });
        Button promBtn = (Button)findViewById(R.id.prom);
        promBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),PromActivity.class);
                startActivityForResult(intent,REQUEST_CODE_MENU);
            }
        });
    }


    protected void onActivityResult(int requestCode,int resultCode,@Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE_MENU) {
            Toast.makeText(getApplicationContext(), "onActivityResult Called : " + requestCode, Toast.LENGTH_SHORT).show();
        }

        if (resultCode == RESULT_OK) {
            String name = data.getStringExtra("name");
            Toast.makeText(getApplicationContext(), "Response name : " + name, Toast.LENGTH_SHORT).show();
        }
    }
}
/*문제 22. 아래와 같은 버튼들을 만든다.
 * 강화, 승급, 아이템, 랭킹
 *
 * 버튼을 누르면 각각의 전용 Activity로 이동을 하도록 한다.
 * 각각의 전용 Activity에는 나가기 버튼이 있다.
 * 나가기 버튼을 누르면 원본 화면으로 복귀를 하도록 만들어보자 !
 * Request Code 와 Result Code를 Toast 방식이 아닌 TextView로 보여주도록 하자 ! */