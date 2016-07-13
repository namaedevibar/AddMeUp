package com.activity.devibar.addmeup;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    add();
    }


    private EditText m1st;
    private EditText m2nd;
    private TextView mAns;
    private Button mAdd;

    public void add(){

        m1st = (EditText) findViewById(R.id.et1st);
        m2nd = (EditText) findViewById(R.id.et2nd);
        mAns = (TextView) findViewById(R.id.txtAns);
        mAdd = (Button) findViewById(R.id.btnAdd);


        mAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputMethodManager input = (InputMethodManager)
                        getSystemService(Context.INPUT_METHOD_SERVICE);

                input.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);

                try{
                    if (m1st.getText().toString().matches("")){
                        m1st.setText("");

                    }
                    else if ( m2nd.getText().toString().matches("")){

                        m2nd.setText("");

                    }
                    else {


                        double first = Double.parseDouble(m1st.getText().toString());
                        double second = Double.parseDouble(m2nd.getText().toString());
                        double total = first + second;


                        m1st.setText("");
                        m2nd.setText("");

                        mAns.setText(total+"");
                    }


                }catch(Exception e){
                    m1st.setText("");
                    m2nd.setText("");
                }


            }
        });
    }



}
