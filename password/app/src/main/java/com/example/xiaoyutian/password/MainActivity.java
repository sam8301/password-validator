package com.example.xiaoyutian.password;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


        EditText editText;
        TextView textView;
        Button button;



        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            button=(Button)findViewById(R.id.mybutton);
            textView= (TextView)findViewById(R.id.output);
            editText=(EditText)findViewById(R.id.input);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String password = editText.getText().toString();

                    if(case1(password) == 5) {
                        textView.setText("strong enough");
                    }
                    else{
                        textView.setText("Not strong enough");
                    }
                }
            });
        }

        public static int case1(String password) {
            int passtime=0;

            if(password == null || password.isEmpty()) {
                return 0;
            }

            //not password
            if(! password.equalsIgnoreCase("password")) {
                passtime++;
            }

            //longer than 8
            if(password.length() >= 8 ) {
                passtime++;
            }

            //requiring at least 1 special character
            if(!password.matches("[a-zA-Z0-9 ]*")) {
                passtime++;
            }

            //at least 1 digit
            if(password.matches(".*\\d.*")) {
                passtime++;
            }

            //both upper and lower case
            if(!password.equals(password.toLowerCase()) && !password.equals(password.toUpperCase())) {
                passtime++;
            }

            return passtime;
        }



}
