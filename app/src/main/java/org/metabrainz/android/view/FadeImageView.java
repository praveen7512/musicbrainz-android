package org.metabrainz.android.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.appcompat.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;

public class FadeImageView extends AppCompatImageView {

    private static final int DURATION = 500;

    public FadeImageView(Context context) {
        super(context);
    }

    public FadeImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void setImageBitmap(Bitmap bm) {
        super.setImageBitmap(bm);
        fadeIn();
    }

    @Override
    public void setImageResource(int resId) {
        super.setImageResource(resId);
        fadeIn();
    }

    @Override
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        fadeIn();
    }

    private void fadeIn() {
        AlphaAnimation fadeIn = new AlphaAnimation(0, 1);
        fadeIn.setDuration(DURATION);
        startAnimation(fadeIn);
    }

}