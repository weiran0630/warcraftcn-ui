package tw.edu.mcu.weiranzhu.memegenerator;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {  // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(290, 290));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(5, 5, 5, 0);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    public Integer[] mThumbIds = {
            R.drawable.meme1, R.drawable.meme2, R.drawable.meme3,
            R.drawable.meme4, R.drawable.meme5, R.drawable.meme6,
            R.drawable.meme7, R.drawable.meme8, R.drawable.meme9,
            R.drawable.meme10, R.drawable.meme11, R.drawable.meme12,
            R.drawable.meme13, R.drawable.meme14, R.drawable.meme15,
            R.drawable.meme16, R.drawable.meme17, R.drawable.meme18,
            R.drawable.meme19, R.drawable.meme20, R.drawable.meme21,
            R.drawable.meme22, R.drawable.meme23, R.drawable.meme24,
            R.drawable.meme25, R.drawable.meme26, R.drawable.meme27
    };
}
