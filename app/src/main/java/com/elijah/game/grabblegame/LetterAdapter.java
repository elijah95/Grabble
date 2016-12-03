package com.elijah.game.grabblegame;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.elijah.game.grabblegame.Letter;
import com.elijah.game.grabblegame.R;

import java.util.ArrayList;

/**
 * Created by Elijah on 11/2/2016.
 */

public class LetterAdapter extends ArrayAdapter<Letter> {
    public class ViewHolder {
        TextView value;
        ImageView letterImage;
    }

    public LetterAdapter(Context context, ArrayList<Letter> letters) {

        super(context, 0, letters);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup paret) {
        Letter letter = getItem(position);
        ViewHolder viewHolder;
        if (convertView == null) {

            viewHolder = new ViewHolder();

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.fragment_store_adapter, paret, false);

            viewHolder.value = (TextView) convertView.findViewById(R.id.cost_text_store_fragment);
            viewHolder.letterImage = (ImageView) convertView.findViewById(R.id.letter_view_store_fragment);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.value.setText(letter.getValue());
        viewHolder.letterImage.setImageResource(letter.getAssociatedDrawable());


        return convertView;


    }

}
