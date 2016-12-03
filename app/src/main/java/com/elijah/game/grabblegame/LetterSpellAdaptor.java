package com.elijah.game.grabblegame;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;


import static android.content.Context.LAYOUT_INFLATER_SERVICE;

public class LetterSpellAdaptor extends PagerAdapter {
    private int[] image_resource = {};
    private Context ctx;
    private LayoutInflater layourInflater;

    public LetterSpellAdaptor(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return image_resource.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layourInflater = (LayoutInflater) ctx.getSystemService(LAYOUT_INFLATER_SERVICE);
        View item_view = layourInflater.inflate(R.layout.fragment_spell_adapter, container, false);


        ImageView value_view = (ImageView) item_view.findViewById(R.id.value_view_adapter);
        value_view.setImageResource(R.drawable.value);

        ImageView copies_view = (ImageView) item_view.findViewById(R.id.copies_view_adapter);
        copies_view.setImageResource(R.drawable.copies);

        ImageButton letterButton = (ImageButton) item_view.findViewById(R.id.letter_button_adapter);
        letterButton.setImageResource(image_resource[position]);
        letterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        container.addView(item_view);
        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }

    public int[] getImage_resource() {
        return image_resource;
    }

    public void setImage_resource(int[] image_resource) {
        this.image_resource = image_resource;
    }
}

