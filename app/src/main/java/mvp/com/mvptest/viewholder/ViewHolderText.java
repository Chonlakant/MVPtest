package mvp.com.mvptest.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import mvp.com.mvptest.R;


public class ViewHolderText extends RecyclerView.ViewHolder implements  View.OnClickListener{

    private TextView label1, label2,tvName;
    private ImageView profile_avatar;
    private LinearLayout ln_comment;
    private View comment_view_1;
    private View comment_view_2;
    private TextView tvComment;
    private Button btn_comment;
    private ImageView ivUserAvatar1;
    private OnItemClickListener mItemClickListener;
    private OnItemClickListener mItemClickListenerview;
    public ViewHolderText(View v) {
        super(v);
        label1 = (TextView) v.findViewById(R.id.text);
        label2 = (TextView) v.findViewById(R.id.profile_name);
        ln_comment = (LinearLayout) v.findViewById(R.id.ln_comment);
        profile_avatar = (ImageView) v.findViewById(R.id.profile_avatar);
        comment_view_1 =  v.findViewById(R.id.comment_view_1);
        comment_view_2 =  v.findViewById(R.id.comment_view_2);
        btn_comment = (Button) v.findViewById(R.id.btn_comment);
        tvComment = (TextView) v.findViewById(R.id.tvComment);
        ivUserAvatar1 = (ImageView) comment_view_1.findViewById(R.id.ivUserAvatar);
        tvName = (TextView) v.findViewById(R.id.tvName);
    }

    public TextView getLabel1() {
        return label1;
    }

    public TextView getTvComment() {
        return tvComment;
    }

    public LinearLayout getLn_comment() {
        return ln_comment;
    }

    public void setLn_comment(LinearLayout ln_comment) {
        this.ln_comment = ln_comment;
    }

    public void setTvComment(TextView tvComment) {
        this.tvComment = tvComment;
    }

    public void setLabel1(TextView label1) {
        this.label1 = label1;
    }

    public TextView getLabel2() {
        return label2;
    }

    public void setLabel2(TextView label2) {
        this.label2 = label2;
    }

    public ImageView getProfile_avatar() {
        return profile_avatar;
    }

    public void setProfile_avatar(ImageView profile_avatar) {
        this.profile_avatar = profile_avatar;
    }

    public View getComment_view_1() {
        return comment_view_1;
    }

    public void setComment_view_1(View comment_view_1) {
        this.comment_view_1 = comment_view_1;
    }

    public View getComment_view_2() {
        return comment_view_2;
    }

    public void setComment_view_2(View comment_view_2) {
        this.comment_view_2 = comment_view_2;
    }

    public ImageView getIvUserAvatar1() {
        return ivUserAvatar1;
    }

    public void setIvUserAvatar1(ImageView ivUserAvatar1) {
        this.ivUserAvatar1 = ivUserAvatar1;
    }

    public TextView getTvName() {
        return tvName;
    }

    public void setTvName(TextView tvName) {
        this.tvName = tvName;
    }

    public Button getBtn_comment() {
        return btn_comment;
    }

    public void setBtn_comment(Button btn_comment) {
        this.btn_comment = btn_comment;
    }

    @Override
    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.profile_avatar:
//                if (mItemClickListener != null) {
//                    mItemClickListener.onItemClick(v, getPosition());
//                }
//            case R.id.view_coclick:
//                if (mItemClickListenerview != null) {
//                    mItemClickListenerview.onItemClick(v, getPosition());
//                }
//                break;
//        }
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
