package com.example.windows71110.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    private RadioButton rbMale = null;
    private RadioButton rbFemale = null;
    private CheckBox cbFootBall = null;
    private CheckBox cbBasketBall = null;
    private Button btnSave = null;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbMale = (RadioButton) super.findViewById(R.id.male);
        rbFemale = (RadioButton) super.findViewById(R.id.female);
        cbFootBall = (CheckBox) super.findViewById(R.id.football);
        cbBasketBall = (CheckBox) super.findViewById(R.id.basketball);
        btnSave = (Button) super.findViewById(R.id.save);
        btnSave.setOnClickListener(new SaveOnClickListener());
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }

    private class SaveOnClickListener implements View.OnClickListener {
        public void onClick(View v) {
            String sGender="";
            String sFav="";
            String sInfo="";
            if(rbMale.isChecked())
                sGender=rbMale.getText().toString();
            if(rbFemale.isChecked())
                sGender=rbFemale.getText().toString();
            if(cbFootBall.isChecked())
                sFav=sFav+cbFootBall.getText().toString();
            if(cbBasketBall.isChecked())
                sFav=sFav+cbBasketBall.getText().toString();
            sInfo="性别："+sGender+"-----"+"爱好："+sFav;
            Toast.makeText(getApplicationContext(), sInfo, Toast.LENGTH_SHORT).show();
        }
    }
    public void onClick(View view)
    {
        //startActivity(new Intent("com.example.windows71110.LoginActivity"));
        startActivity(new Intent("com.example.windows71110.Main2Activity"));
    }
}
