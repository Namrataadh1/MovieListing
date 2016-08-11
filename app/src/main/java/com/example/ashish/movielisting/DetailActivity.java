package com.example.ashish.movielisting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.ashish.movielisting.rest.response.Result;

public class DetailActivity extends AppCompatActivity {

    private static final String TAG = DetailActivity.class.getSimpleName() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent= getIntent();
        Result movieDetail =(Result) intent.getExtras().get("Movie_Detail");

        Log.i(TAG, "onCreate: "+movieDetail.getOriginalTitle());
    }
}
