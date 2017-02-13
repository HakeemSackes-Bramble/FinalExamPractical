package nyc.c4q.hakeemsackes_bramble.finalexampractical.recycler_view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import nyc.c4q.hakeemsackes_bramble.finalexampractical.R;

/**
 * Created by hakeemsackes-bramble on 2/12/17.
 */
public class GeneralViewHolder extends RecyclerView.ViewHolder {
    //linear layout for drawer layout xml file
    public LinearLayout drawerHolder;
    //textiew for integer
    public TextView integerViewer;


    public GeneralViewHolder(View parent) {
        super(parent);
        drawerHolder = (LinearLayout) itemView.findViewById(R.id.drawer_layout_id);
        integerViewer = (TextView) itemView.findViewById(R.id.integer_layout_textview);
    }


}
