package mvp.com.mvptest.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import mvp.com.mvptest.R;
import mvp.com.mvptest.model.post;

public class CustomAdapter extends BaseAdapter {
    Context mContext;
    ArrayList<post> list = new ArrayList<>();

    public CustomAdapter(Context context, ArrayList<post> list) {
        this.mContext = context;
        this.list = list;

    }

    public int getCount() {
        return list.size();
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View view, ViewGroup parent) {
        post listPost = list.get(position);
        LayoutInflater mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (view == null)
            view = mInflater.inflate(R.layout.item_listview, parent, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        Picasso.with(mContext)
                .load(listPost.getPosts().get(position).getThumbnail())
                .fit().centerCrop()
                .into(imageView);

        return view;
    }
}