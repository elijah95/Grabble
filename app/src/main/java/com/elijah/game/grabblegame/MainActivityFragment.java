package com.elijah.game.grabblegame;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements View.OnClickListener {

    View frragmentLayout;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        frragmentLayout = inflater.inflate(R.layout.fragment_main, container, false);

        ImageButton play = (ImageButton) frragmentLayout.findViewById(R.id.play);
        play.setOnClickListener(this);
        ImageButton settings = (ImageButton) frragmentLayout.findViewById(R.id.settings);
        settings.setOnClickListener(this);
        return frragmentLayout;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.play:
                Intent intent = new Intent(getActivity(), GameActivity.class);
                startActivity(intent);
                break;
            case R.id.settings:
                Intent intent2 = new Intent(getActivity(), SettingsActivity.class);
                startActivity(intent2);
                break;

        }
    }
}
