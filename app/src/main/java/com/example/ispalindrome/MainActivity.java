package com.example.ispalindrome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button Submit;
    public EditText CheckText;
    public TextView GetBool;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Submit = findViewById(R.id.mSubmit);
        CheckText = findViewById(R.id.mCheckThis);
        GetBool = findViewById(R.id.mGetBool);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String checkThis = CheckText.getText().toString();
                if(checkThis.length()>0 && isPalindrome(checkThis)){
                    GetBool.setText("True");
                }else {
                    GetBool.setText("False");
                }
            }
        });

    }

    private Boolean isPalindrome(String text){
        int nol = text.length();
        Boolean TF = null;
        for (int i = 0;i<(int)nol/2 + 1 ;i++){
            if(text.charAt(i)!=text.charAt(nol-i-1)){
                TF = false;
                break;
            }else if(i==(int)nol/2 && text.charAt(i)==text.charAt(nol-i-1)){
                TF = true;
                break;
            }
        }
        return TF;
    }
}
