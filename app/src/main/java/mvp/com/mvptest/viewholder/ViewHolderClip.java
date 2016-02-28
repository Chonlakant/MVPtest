package mvp.com.mvptest.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import mvp.com.mvptest.R;


public class ViewHolderClip extends RecyclerView.ViewHolder implements View.OnClickListener {

    private ImageView ivExample, thumb;
    private LinearLayout ln_comment;
    private RelativeLayout media_group;
    private OnItemClickListener mItemClickListener;
    private OnItemClickListener mItemClickListenerview;

    public ViewHolderClip(View v) {
        super(v);
        ivExample = (ImageView) v.findViewById(R.id.ic_type);
        thumb = (ImageView) v.findViewById(R.id.thumb);
        ln_comment = (LinearLayout) v.findViewById(R.id.ln_comment);
        media_group = (RelativeLayout) v.findViewById(R.id.media_group);
        media_group.setOnClickListener(this);
    }

    public ImageView getImageView() {
        return ivExample;
    }

    public void setImageView(ImageView ivExample) {
        this.ivExample = ivExample;
    }

    public ImageView getIvExample() {
        return ivExample;
    }

    public void setIvExample(ImageView ivExample) {
        this.ivExample = ivExample;
    }

    public ImageView getThumb() {
        return thumb;
    }

    public void setThumb(ImageView thumb) {
        this.thumb = thumb;
    }

    public LinearLayout getLn_comment() {
        return ln_comment;
    }

    public void setLn_comment(LinearLayout ln_comment) {
        this.ln_comment = ln_comment;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.media_group:
                if (mItemClickListener != null) {
                    mItemClickListener.onItemClick(v, getPosition());
                }
//            case R.id.view_coclick:
//                if (mItemClickListenerview != null) {
//                    mItemClickListenerview.onItemClick(v, getPosition());
//                }
//                break;
        }
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    public void SetOnItemClickListener(final OnItemClickListener mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }

    public interface OnItemClickListenerView {
        void onItemClick(View view, int position);
    }

    public void SetOnItemClickListenerView(final OnItemClickListener mItemClickListener) {
        this.mItemClickListenerview = mItemClickListener;
    }
}