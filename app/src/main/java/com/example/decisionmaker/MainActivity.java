package com.example.decisionmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Random myRandom = new Random(); //create a random variable called myRandom

        Button generate = findViewById(R.id.generate);                      //set the button 'generate' to the variable generate
        final EditText text1 = findViewById(R.id.text1);                    //set EditText 1 to text1
        final EditText text2 = findViewById(R.id.text2);                    //set EditText 2 to text2
        final EditText text3 = findViewById(R.id.text3);                    //set EditText 3 to text3
        final EditText text4 = findViewById(R.id.text4);                    //set EditText 4 to text4
        final EditText text5 = findViewById(R.id.text5);                    //set EditText 5 to text5
        final TextView generatedValue= findViewById(R.id.generatedValue);   //set TextView to generatedView

        generate.setOnClickListener(new View.OnClickListener() {    //set onclick listen when generate button is pressed
            @Override
            public void onClick(View v) {

                int number = 5; //create a variable number

                String str1 = text1.getText().toString();   //convert text in text1 to string str1
                String str2 = text2.getText().toString();   //convert text in text2 to string str2
                String str3 = text3.getText().toString();   //convert text in text3 to string str3
                String str4 = text4.getText().toString();   //convert text in text4 to string str4
                String str5 = text5.getText().toString();   //convert text in text5 to string str5

                if (TextUtils.isEmpty(text1.getText().toString())&&
                    TextUtils.isEmpty(text2.getText().toString())&&
                    TextUtils.isEmpty(text3.getText().toString())&&
                    TextUtils.isEmpty(text4.getText().toString())&&
                    TextUtils.isEmpty(text5.getText().toString()))
                {
                    Toast.makeText(MainActivity.this, "Insert text to make a decision", Toast.LENGTH_SHORT).show();
                }

                int num = myRandom.nextInt(number); //create a random number between 0 and number-1

                if (num == 0)
                {
                    generatedValue.setText(str1);   //set text in generatedView to str1
                }
                if (num == 1)
                {
                    generatedValue.setText(str2);   //set text in generatedView to str2
                }
                if (num == 2)
                {
                    generatedValue.setText(str3);   //set text in generatedView to str3
                }
                if (num == 3)
                {
                    generatedValue.setText(str4);   //set text in generatedView to str4
                }
                if (num == 4)
                {
                    generatedValue.setText(str5);   //set text in generatedView to str5
                }
            }
        });
    }
}
