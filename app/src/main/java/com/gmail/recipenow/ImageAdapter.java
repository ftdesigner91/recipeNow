package com.gmail.recipenow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ImageAdapter extends BaseAdapter
{

    private int [] images_id = {R.drawable.img_placeholder,
            R.drawable.img_placeholder,R.drawable.img_placeholder,
            R.drawable.img_placeholder,R.drawable.img_placeholder,
            R.drawable.img_placeholder,R.drawable.img_placeholder,
            R.drawable.img_placeholder,R.drawable.img_placeholder,
            R.drawable.img_placeholder,R.drawable.img_placeholder,
            R.drawable.img_placeholder,R.drawable.img_placeholder,
            R.drawable.img_placeholder,R.drawable.img_placeholder,
            R.drawable.img_placeholder,R.drawable.img_placeholder,
            R.drawable.img_placeholder,R.drawable.img_placeholder,
            R.drawable.img_placeholder,R.drawable.img_placeholder,
            R.drawable.img_placeholder,R.drawable.img_placeholder,
            R.drawable.img_placeholder,R.drawable.img_placeholder,
            R.drawable.img_placeholder,R.drawable.img_placeholder};

    Context ctx;
    ImageAdapter(Context ctx)
    {
        this.ctx=ctx;
    }
    @Override
    public int getCount() {
        return images_id.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return images_id[i];
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View gridView = view;

        if (gridView==null)
        {
            LayoutInflater inflater= (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.custom_image_layout,null);
        }
        ImageView imageView = (ImageView) gridView.findViewById(R.id.myImage);
        imageView.setImageResource(images_id[i]);
        return gridView;
    }
}
