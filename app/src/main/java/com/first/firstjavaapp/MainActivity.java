package com.first.firstjavaapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button submit,clear;
    EditText name,email,password,about_something;
    RadioButton male,female;
    CheckBox java,kotlin,python;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.submit_btn);

        name = findViewById(R.id.get_name);
        email = findViewById(R.id.get_email);
        password = findViewById(R.id.get_password);
        about_something = findViewById(R.id.get_something);

        male = findViewById(R.id.male);
        female = findViewById(R.id.female);

        java = findViewById(R.id.java);
        kotlin = findViewById(R.id.kotlin);
        python = findViewById(R.id.python);

        clear = findViewById(R.id.clear_btn);

        //manually we call it
        View.OnClickListener viewListner = view -> {

            String person_name = name.getText().toString();
            String person_email = email.getText().toString();
            String person_password = password.getText().toString();
            String person_something = about_something.getText().toString();

            //Validate Data
            if(person_name.trim().equals("")){
                Toast.makeText(this,"Name is Required",Toast.LENGTH_SHORT).show();
                name.setError("Name is Required !!");
                return;
            }
            if(person_email.trim().equals("")){
                Toast.makeText(this,"Email is Required",Toast.LENGTH_SHORT).show();
                email.setError("Email is Required !!");
                return;
            }
            if(person_password.trim().equals("")){
                Toast.makeText(this,"Password is Required",Toast.LENGTH_SHORT).show();
                password.setError("Password is Required !!");
                return;
            }
            if(person_something.trim().equals("")){
                Toast.makeText(this,"About Yourself is Required",Toast.LENGTH_SHORT).show();
                about_something.setError("YourSelf is Required !!");
                return;
            }


            //get Value from Radio Button
            String gender = "";
            if(male.isChecked()){
                gender = "Male";
            }
            if(female.isChecked()){
                gender = "Female";
            }

            // get Value from checkBox
            String courses="";

            if (java.isChecked()){
                courses += "Java";
            }
            if (kotlin.isChecked()){
                courses += " Kotlin";
            }
            if (python.isChecked()){
                courses += " Python";
            }


            Log.i("Name",person_name);
            Log.i("Email",person_email);
            Log.i("Password",person_password);
            Log.i("About Self",person_something);

            Log.i("Gender",gender);
            Log.i("Courses",courses);


        };

        submit.setOnClickListener(viewListner);


    }
}