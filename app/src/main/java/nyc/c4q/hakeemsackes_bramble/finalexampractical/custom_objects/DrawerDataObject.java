package nyc.c4q.hakeemsackes_bramble.finalexampractical.custom_objects;

import android.graphics.drawable.Drawable;
import android.view.View;

/**
 * Created by hakeemsackes-bramble on 2/12/17.
 */
public class DrawerDataObject implements View.OnClickListener {
    private View.OnClickListener onClickListener;
    private String text;
    private Drawable icon;

    public Drawable getIcon() {
        return icon;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    public View.OnClickListener getOnClickListener() {
        return onClickListener;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void onClick(View v) {

    }
}
