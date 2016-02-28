package mvp.com.mvptest.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import mvp.com.mvptest.R;


public class ViewHolderPhoto extends RecyclerView.ViewHolder implements View.OnClickListener{
    private Button btn_love,btn_comment,btn_shares;
    private TextView tvName,tvComment;
    private ImageView ivExample,thumb;
    private LinearLayout ln_comment;
    private View comment_view_2;
    private ImageView profile_avatar;
    private ImageView ivUserAvatar;
    private RelativeLayout media_group;
    private OnItemClickListener mItemClickListener;
    private OnItemClickListener mItemClickListenerLove;
    private OnItemClickListener mItemClickListenerComment;
    private OnItemClickListener mItemClickListenerShares;
    public ViewHolderPhoto(View v) {
        super(v);
        ivExample = (ImageView) v.findViewById(R.id.ic_type);
        thumb = (ImageView) v.findViewById(R.id.thumb);
        profile_avatar = (ImageView) v.findViewById(R.id.profile_avatar);
        ln_comment = (LinearLayout) v.findViewById(R.id.ln_comment);

        tvName  = (TextView) v.findViewById(R.id.tvName);
        tvComment = (TextView) v.findViewById(R.id.tvComment);
        comment_view_2 = v.findViewById(R.id.comment_view_2);
        ivUserAvatar = (ImageView) v.findViewById(R.id.ivUserAvatar);

        btn_love = (Button) v.findViewById(R.id.btn_love);
        btn_comment = (Button) v.findViewById(R.id.btn_comment);
        btn_shares = (Button) v.findViewById(R.id.btn_shares);
        media_group = (RelativeLayout) v.findViewById(R.id.media_group);
        media_group.setOnClickListener(this);
        btn_love.setOnClickListener(this);
        btn_comment.setOnClickListener(this);
        btn_shares.setOnClickListener(this);
    }

    public ImageView getImageView() {
        return ivExample;
    }

    public ImageView getIvUserAvatar() {
        return ivUserAvatar;
    }

    public void setIvUserAvatar(ImageView ivUserAvatar) {
        this.ivUserAvatar = ivUserAvatar;
    }

    public TextView getTvName() {
        return tvName;
    }

    public void setTvName(TextView tvName) {
        this.tvName = tvName;
    }

    public View getComment_view_2() {
        return comment_view_2;
    }

    public void setComment_view_2(View comment_view_2) {
        this.comment_view_2 = comment_view_2;
    }

    public TextView getTvComment() {
        return tvComment;
    }

    public void setTvComment(TextView tvComment) {
        this.tvComment = tvComment;
    }

    public Button getBtn_love() {
        return btn_love;
    }

    public void setBtn_love(Button btn_love) {
        this.btn_love = btn_love;
    }

    public Button getBtn_comment() {
        return btn_comment;
    }

    public void setBtn_comment(Button btn_comment) {
        this.btn_comment = btn_comment;
    }

    public Button getBtn_shares() {
        return btn_shares;
    }

    public void setBtn_shares(Button btn_shares) {
        this.btn_shares = btn_shares;
    }

    public OnItemClickListener getmItemClickListener() {
        return mItemClickListener;
    }

    public void setmItemClickListener(OnItemClickListener mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }

    public OnItemClickListener getmItemClickListenerLove() {
        return mItemClickListenerLove;
    }

    public void setmItemClickListenerLove(OnItemClickListener mItemClickListenerLove) {
        this.mItemClickListenerLove = mItemClickListenerLove;
    }

    public OnItemClickListener getmItemClickListenerComment() {
        return mItemClickListenerComment;
    }

    public void setmItemClickListenerComment(OnItemClickListener mItemClickListenerComment) {
        this.mItemClickListenerComment = mItemClickListenerComment;
    }

    public OnItemClickListener getmItemClickListenerShares() {
        return mItemClickListenerShares;
    }

    public void setmItemClickListenerShares(OnItemClickListener mItemClickListenerShares) {
        this.mItemClickListenerShares = mItemClickListenerShares;
    }

    public void setImageView(ImageView ivExample) {
        this.ivExample = ivExample;
    }

    public RelativeLayout getMedia_group() {
        return media_group;
    }

    public void setMedia_group(RelativeLayout media_group) {
        this.media_group = media_group;
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

    public ImageView getProfile_avatar() {
        return profile_avatar;
    }

    public void setProfile_avatar(ImageView profile_avatar) {
        this.profile_avatar = profile_avatar;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.media_group:
                if (mItemClickListener != null) {
                    mItemClickListener.onItemClick(v, getPosition());
                }
            case R.id.btn_love:
                if (mItemClickListenerLove != null) {
                    mItemClickListenerLove.onItemClick(v, getPosition());
                }
                break;

            case R.id.btn_comment:
                if (mItemClickListenerComment != null) {
                    mItemClickListenerComment.onItemClick(v, getPosition());
                }
                break;

            case R.id.btn_shares:
                if (mItemClickListenerShares != null) {
                    mItemClickListenerShares.onItemClick(v, getPosition());
                }
                break;
        }
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    public interface OnItemClickListenerLove {
        void onItemClickLove(View view, int position);
    }

    public interface OnItemClickListenerComment {
        void onItemClick(View view, int position);
    }

    public void SetOnItemClickListener(final OnItemClickListener mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }

    public void SetOnItemClickListenerLove(final OnItemClickListener mItemClickListener) {
        this.mItemClickListenerLove = mItemClickListener;
    }
    public void SetOnItemClickListenerComment(final OnItemClickListener mItemClickListener) {
        this.mItemClickListenerComment = mItemClickListener;
    }
    public void SetOnItemClickListenerShares(final OnItemClickListener mItemClickListener) {
        this.mItemClickListenerShares = mItemClickListener;
    }

}