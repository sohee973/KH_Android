package com.example.prob21;

/*문제 21. 오늘 우리는 Activity를 동적으로 추가하는 방법을 배웠다.
* LayoutInflater를 통해 Context도 관리할 수 있다. XML의 도움 없이 버튼을 누르면 계속 LinearLayout이
* 추가되도록 오늘의 예제 프로그램을 개조해보자 ! */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
