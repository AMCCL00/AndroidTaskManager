package com.example.andrewmcclary.taskmanager;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @OnClick(R.id.button_add_task)
    protected void addTaskClicked(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("What is the title of your Task?");

        builder.setMessage("When is your task due by?");

        builder.setMessage("What are you doing in this task?");
        //creating alert dialog
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }
}
