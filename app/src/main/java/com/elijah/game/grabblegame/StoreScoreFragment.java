package com.elijah.game.grabblegame;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class StoreScoreFragment extends Fragment {

    View frragmentLayout;

    public StoreScoreFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        frragmentLayout = inflater.inflate(R.layout.fragment_store_score, container, false);


        ImageView score_view_store = (ImageView) frragmentLayout.findViewById(R.id.score_view_store_fragment);
        score_view_store.setImageResource(R.drawable.score);
        return frragmentLayout;
    }
}