package com.elijah.game.grabblegame;

import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class LetterListFragment extends ListFragment {
    private ArrayList<Letter> letters;
    private LetterAdapter letterAdapter;


    @Override
    public void onActivityCreated(Bundle sacedInstanceState) {
        super.onActivityCreated(sacedInstanceState);


        letters = new ArrayList<Letter>();
        letters.add(new Letter(Letter.Category.A, 8));
        letters.add(new Letter(Letter.Category.D, 3));
        letters.add(new Letter(Letter.Category.F, 6));
        letters.add(new Letter(Letter.Category.W, 32));
        letters.add(new Letter(Letter.Category.H, 31));


        letterAdapter = new LetterAdapter(getActivity(), letters);

        setListAdapter(letterAdapter);
    }
}
