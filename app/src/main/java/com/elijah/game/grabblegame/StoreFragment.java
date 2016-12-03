package com.elijah.game.grabblegame;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.support.v4.content.ContextCompat;

import java.util.ArrayList;


public class StoreFragment extends ListFragment {
    private ArrayList<Letter> letters;
    private LetterStoreAdapter letterAdapter;


    @Override
    public void onActivityCreated(Bundle sacedInstanceState) {
        super.onActivityCreated(sacedInstanceState);

        letters = new ArrayList<Letter>();
        letters.add(new Letter(Letter.Category.A, 20));
        letters.add(new Letter(Letter.Category.B, 8));
        letters.add(new Letter(Letter.Category.C, 9));
        letters.add(new Letter(Letter.Category.D, 25));
        letters.add(new Letter(Letter.Category.E, 4));
        letters.add(new Letter(Letter.Category.F, 25));
        letters.add(new Letter(Letter.Category.G, 6));
        letters.add(new Letter(Letter.Category.H, 43));
        letters.add(new Letter(Letter.Category.I, 25));
        letters.add(new Letter(Letter.Category.J, 25));
        letters.add(new Letter(Letter.Category.K, 2));
        letters.add(new Letter(Letter.Category.L, 25));
        letters.add(new Letter(Letter.Category.M, 25));
        letters.add(new Letter(Letter.Category.N, 25));
        letters.add(new Letter(Letter.Category.O, 25));
        letters.add(new Letter(Letter.Category.P, 25));
        letters.add(new Letter(Letter.Category.Q, 25));
        letters.add(new Letter(Letter.Category.R, 25));
        letters.add(new Letter(Letter.Category.S, 25));
        letters.add(new Letter(Letter.Category.T, 25));
        letters.add(new Letter(Letter.Category.U, 25));
        letters.add(new Letter(Letter.Category.V, 25));
        letters.add(new Letter(Letter.Category.W, 25));
        letters.add(new Letter(Letter.Category.X, 25));
        letters.add(new Letter(Letter.Category.Y, 25));
        letters.add(new Letter(Letter.Category.Z, 25));


        letterAdapter = new LetterStoreAdapter(getActivity(), letters);

        setListAdapter(letterAdapter);

        getListView().setDivider(ContextCompat.getDrawable(getActivity(), R.color.black));
        getListView().setDividerHeight(1);

    }
}
