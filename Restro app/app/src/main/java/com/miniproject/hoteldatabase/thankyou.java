package com.miniproject.hoteldatabase;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class thankyou extends Activity {




    @Override
    public void onBackPressed() {

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thankyou);

    }
    public void main_menu(View view)
    {
//     


        Intent menu= new Intent(this,SlimpleTextClientActivity.class);
        startActivity(menu);

    }

    



}
