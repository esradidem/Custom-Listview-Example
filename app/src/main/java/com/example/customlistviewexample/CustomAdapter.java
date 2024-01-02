package com.example.customlistviewexample;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<String>
{
    Context mContext;
    List<String> mData;
    public CustomAdapter(Context context, List<String> data)
    {
        super(context, 0, data);
        mContext = context;
        mData = data;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View listItem = convertView;

        if (listItem == null)
        {
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false);
        }

        TextView textView = listItem.findViewById(R.id.textView);
        ImageView imageMeyve = listItem.findViewById(R.id.imageMeyve);

        textView.setText(mData.get(position));

        if (mData.get(position).equals("Elma"))
        {
            imageMeyve.setImageResource(R.drawable.elma);
        }
        else if (mData.get(position).equals("Armut"))
        {
            imageMeyve.setImageResource(R.drawable.armut);
        }
        else if (mData.get(position).equals("Çilek"))
        {
            imageMeyve.setImageResource(R.drawable.cilek);
        }
        else if (mData.get(position).equals("Muz"))
        {
            imageMeyve.setImageResource(R.drawable.muz);
        }
        else if (mData.get(position).equals("Karpuz"))
        {
            imageMeyve.setImageResource(R.drawable.karpuz);
        }
        else if (mData.get(position).equals("Mango"))
        {
            imageMeyve.setImageResource(R.drawable.mango);
        }


        textView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(mContext, String.valueOf(position), Toast.LENGTH_SHORT).show();
            }
        });
        return listItem;
    }
}
