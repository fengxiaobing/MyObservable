package com.example.myobservable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.myobservable.interf.Observable;
import com.example.myobservable.interf.Observe;

public class MainActivity extends AppCompatActivity implements Observe{
    ObservableImp observableImp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        observableImp = new ObservableImp();
        observableImp.register(this);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                observableImp.notify("3");
            }
        });
    }

    @Override
    public void update(String msg) {
        Log.e("TAG",msg);
    }
}
