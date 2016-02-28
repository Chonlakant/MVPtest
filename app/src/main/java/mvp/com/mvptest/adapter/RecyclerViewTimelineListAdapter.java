package mvp.com.mvptest.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import me.iwf.photopicker.PhotoPagerActivity;
import mvp.com.mvptest.R;
import mvp.com.mvptest.model.PostStory;
import mvp.com.mvptest.viewholder.RecyclerViewSimpleTextViewHolder;
import mvp.com.mvptest.viewholder.ViewHolderClip;
import mvp.com.mvptest.viewholder.ViewHolderPhoto;
import mvp.com.mvptest.viewholder.ViewHolderText;
import mvp.com.mvptest.wiget.RoundedTransformation;

public class RecyclerViewTimelineListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    // The items to display in your RecyclerView
    ArrayList<PostStory> list = new ArrayList<>();
    Context context;
    private final int PHOTO = 0, IMAGE = 1, CLIP = 3;

    // Provide a suitable constructor (depends on the kind of dataset)
    public RecyclerViewTimelineListAdapter(Context context, ArrayList<PostStory> list) {
        this.list = list;
        this.context = context;
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public int getItemViewType(int position) {
        String postType = list.get(position).type;
        Log.e("getItemViewType", position + ":" + postType);
        switch (postType) {
            case "text":
                return 0;
            case "photo":
                return 1;
            case "clip":
                return 2;
            default:
                return 0;


        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        RecyclerView.ViewHolder viewHolder;
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());

        switch (viewType) {
            case 0:
                View v1 = inflater.inflate(R.layout.item_feed_text, viewGroup, false);
                viewHolder = new ViewHolderText(v1);
                break;
            case 1:
                View v2 = inflater.inflate(R.layout.item_feed_photo, viewGroup, false);
                viewHolder = new ViewHolderPhoto(v2);
                break;
            case 2:
                View v3 = inflater.inflate(R.layout.item_feed_clip, viewGroup, false);
                viewHolder = new ViewHolderClip(v3);
                break;
            default:
                View v = inflater.inflate(android.R.layout.simple_list_item_1, viewGroup, false);
                viewHolder = new RecyclerViewSimpleTextViewHolder(v);
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        //More to come
        switch (viewHolder.getItemViewType()) {
            case 0:
                ViewHolderText vh1 = (ViewHolderText) viewHolder;
                configureViewHolder1(vh1, position);
                break;
            case 1:
                ViewHolderPhoto vh2 = (ViewHolderPhoto) viewHolder;
                configureViewHolder2(vh2, position);
                break;
            case 2:
                ViewHolderClip vh3 = (ViewHolderClip) viewHolder;
                configureViewHolder3(vh3, position);
                break;
            default:
                RecyclerViewSimpleTextViewHolder vh = (RecyclerViewSimpleTextViewHolder) viewHolder;
                configureDefaultViewHolder(vh, position);
                break;
        }
    }

    private void configureDefaultViewHolder(RecyclerViewSimpleTextViewHolder vh, int position) {
        vh.getLabel().setText((CharSequence) list.get(position));
    }

    private void configureViewHolder1(ViewHolderText vh1, int position) {
        PostStory item = list.get(position);
        if (item != null) {
            vh1.getLabel1().setText(item.text);
            vh1.getLabel2().setText(item.author.name);
            String imagUrl = "http://candychat.net/" + item.author.avatarPath;
            Log.e("ddd", item.author.avatarPath);


            if(item.comment != null){
                vh1.getLn_comment().setVisibility(View.VISIBLE);
                vh1.getComment_view_1().setVisibility(View.VISIBLE);
                vh1.getTvName().setText(item.comment.get(0).text);
                vh1.getTvComment().setText(item.comment.get(0).user.name);
                vh1.getComment_view_2().setVisibility(View.GONE);
            }else{
                vh1.getComment_view_1().setVisibility(View.GONE);
                vh1.getComment_view_2().setVisibility(View.GONE);
            }

            if(item.type.equals("text")) {
                Picasso.with(context)
                        .load(imagUrl)
                        .centerCrop()
                        .resize(200, 200)
                        .transform(new RoundedTransformation(100, 4))
                        .into(vh1.getProfile_avatar());

                vh1.getComment_view_1().setVisibility(View.VISIBLE);
                vh1.getComment_view_2().setVisibility(View.GONE);

                Picasso.with(context)
                        .load(imagUrl)
                        .centerCrop()
                        .resize(200, 200)
                        .transform(new RoundedTransformation(100, 4))
                        .into(vh1.getIvUserAvatar1());

                vh1.getBtn_comment().setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "comment", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }
    }

    private void configureViewHolder2(ViewHolderPhoto vh2, int position) {
        //vh2.getThumb().setImageResource(R.drawable.imge);

        final PostStory item = list.get(position);
        Log.e("sss", item.media.url);
        String imagUrl = "http://candychat.net/" + item.media.url;
        String imagAva = "http://candychat.net/" + item.author.avatarPath;


        Picasso.with(context)
                .load(imagUrl)
                .centerCrop()
                .resize(200, 200)
                .transform(new RoundedTransformation(100, 4))
                .into(vh2.getImageView());

        Picasso.with(context)
                .load(imagAva)
                .centerCrop()
                .resize(200, 200)
                .transform(new RoundedTransformation(100, 4))
                .into(vh2.getProfile_avatar());

        Picasso.with(context)
                .load(imagUrl)
                .fit().centerCrop()
                .into(vh2.getThumb());

        if(item.comment != null){
            String avatarComment = "http://candychat.net/" + item.comment.get(0).user.avatar;
            vh2.getLn_comment().setVisibility(View.VISIBLE);
            vh2.getTvName().setText(item.comment.get(0).text);
            vh2.getTvComment().setText(item.comment.get(0).user.name);
            vh2.getComment_view_2().setVisibility(View.GONE);

            Picasso.with(context)
                    .load(avatarComment)
                    .centerCrop()
                    .resize(200, 200)
                    .transform(new RoundedTransformation(100, 4))
                    .into(vh2.getIvUserAvatar());
        }else{
            vh2.getLn_comment().setVisibility(View.GONE);
            vh2.getComment_view_2().setVisibility(View.GONE);
        }



        vh2.SetOnItemClickListener(new ViewHolderPhoto.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(context, item.media.url, Toast.LENGTH_SHORT).show();

                String urlPhoto = "http://candychat.net/" + item.media.url;
                Log.e("urlPhoto", urlPhoto);
                Intent intent = new Intent(context, PhotoPagerActivity.class);

                ArrayList<String> listUrls = new ArrayList<String>();
                listUrls.add(urlPhoto);
//
//                for (int i = 0; i < listUrls.size();i++) {
//                    listUrls.add(urlPhoto);
//                }

//                    String imageUrl = urlPhoto;
//                    urls.add(0, imageUrl);
                intent.putExtra("current_item", position);
                intent.putStringArrayListExtra("photos", listUrls);
                context.startActivity(intent);
            }
        });
        vh2.SetOnItemClickListenerLove(new ViewHolderPhoto.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(context, "4", Toast.LENGTH_SHORT).show();
            }
        });

        vh2.SetOnItemClickListenerComment(new ViewHolderPhoto.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(context, "1", Toast.LENGTH_SHORT).show();
            }
        });

        vh2.SetOnItemClickListenerShares(new ViewHolderPhoto.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(context,"2", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void configureViewHolder3(ViewHolderClip vh3, int position) {
        PostStory item = list.get(position);
        Picasso.with(context)
                .load(item.media.getThumbUrl())
                .centerCrop()
                .resize(200, 200)
                .transform(new RoundedTransformation(100, 4))
                .into(vh3.getImageView());


        //vh3.getThumb().setImageResource(R.drawable.imge);
        vh3.getLn_comment().setVisibility(View.VISIBLE);
    }
}