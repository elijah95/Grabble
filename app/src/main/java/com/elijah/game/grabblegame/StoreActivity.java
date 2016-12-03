package com.elijah.game.grabblegame;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;

public class StoreActivity extends FragmentActivity {

    public static final String NEW_NOTE_EXTRA = "New Note";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);


        createFragmentAndAddFragment();

    }


    private void createFragmentAndAddFragment() {

        Intent intent = getIntent();


        StoreFragment storeFragment = new StoreFragment();
        StoreScoreFragment scoreStoreFragment = new StoreScoreFragment();


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        transaction.add(R.id.My_Container_1_ID, storeFragment, "STORE_FRAGMENT");
        transaction.add(R.id.My_Container_2_ID, scoreStoreFragment, "STORE_SCORE_FRAGMENT");

        transaction.commit();

    }

}

