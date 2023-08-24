package com.miniproject.hoteldatabase;

import static android.content.ContentValues.TAG;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.WindowManager;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;




public class SlimpleTextClientActivity extends Activity{

    EditText editText;
    static int tablex;
    private EditText textField;
    private Button button;
    private String messsage;

    String message;


    @Override
    public void onBackPressed() {
         //do nothing.
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_slimple_text_client);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.slimple_text_client, menu);
        return true;
    }

    public void nextAct(View view) {
        EditText table = (EditText) findViewById(R.id.table_no);
        if (table.getText().toString().isEmpty()) {

            Toast.makeText(getApplicationContext(),
                    "Please enter valid table number upto 25", Toast.LENGTH_SHORT).show();
        }
        else {
            Editable newTxt = (Editable) table.getText();
            String tbl_no = newTxt.toString();
            tablex = Integer.parseInt(tbl_no); // get the text message on the text field
            textField = (EditText) findViewById(R.id.table_no);
            message=textField.getText().toString();
            textField.setText(""); // Reset the text field to blank
            if (tablex<=25 && tablex!=0)
            {
                Toast.makeText(this, "Table Booked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, Orders.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadin, R.anim.fadout);
            } else{
                Toast.makeText(getApplicationContext(),
                        "Please enter valid table number upto 25", Toast.LENGTH_SHORT).show();
            }
        }

    }

}


