package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{

    int randomNumber;

    public void generateRandomNumber()
    {
        Random random = new Random();
        randomNumber = random.nextInt(10 ) + 1;
    }

    public void guessing(View view)
    {

            EditText editText = (EditText) findViewById(R.id.editText);
            String n = editText.getText().toString();
            int a = Integer.parseInt(n);

             if (randomNumber < a) {
                Toast.makeText(this, "Lower", Toast.LENGTH_SHORT).show();
            } else if (randomNumber > a) {
                Toast.makeText(this, "Higher", Toast.LENGTH_SHORT).show();
            }else
                {
        Toast.makeText(this, "The no is " + a, Toast.LENGTH_SHORT).show();

        generateRandomNumber();
                }






    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        generateRandomNumber();
    }
}
