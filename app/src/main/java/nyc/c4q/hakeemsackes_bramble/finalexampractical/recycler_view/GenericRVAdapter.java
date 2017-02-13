package nyc.c4q.hakeemsackes_bramble.finalexampractical.recycler_view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.hakeemsackes_bramble.finalexampractical.R;
import nyc.c4q.hakeemsackes_bramble.finalexampractical.custom_objects.DrawerDataObject;

/**
 * Created by hakeemsackes-bramble on 2/12/17.
 */

public class GenericRVAdapter<Object> extends RecyclerView.Adapter<GeneralViewHolder> {
    List<Object> toastClicks;
    private int posit;

    public GenericRVAdapter(List<Object> toastClicks) {
        this.toastClicks = toastClicks;
    }


    @Override
    public GeneralViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View innerView;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        if (toastClicks.get(0).getClass().equals(DrawerDataObject.class)) {
            innerView = inflater.inflate(R.layout.drawer_layout, parent, false);
        } else {
            innerView = inflater.inflate(R.layout.integer_layout_file, parent, false);
        }
        return new GeneralViewHolder(innerView);
    }

    @Override
    public void onBindViewHolder(GeneralViewHolder holder, int position) {
        if (toastClicks.get(position).getClass().equals(DrawerDataObject.class)) {
            holder.drawerHolder.setOnClickListener(((DrawerDataObject) toastClicks.get(position)).getOnClickListener());
        } else {
            String t = "Settings-  " + (toastClicks.get(position).toString());
            holder.integerViewer.setText(t);
            posit = position;
        }
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        int count = 0;
        if (toastClicks != null) {
            count = toastClicks.size();
        }
        return count;

    }

    @Override
    public void onViewAttachedToWindow(GeneralViewHolder holder) {
        super.onViewAttachedToWindow(holder);
        if (toastClicks.get(0).getClass().equals(Integer.class)) {
            if (((Integer) toastClicks.get(toastClicks.size() - 1) != Integer.MAX_VALUE) && posit==toastClicks.size() - 1) {
                int g = (Integer) toastClicks.get(toastClicks.size() - 1);
                toastClicks.add(holder.getAdapterPosition()+1, (Object) Integer.valueOf(g + 1));
                toastClicks.remove(0);
            }else {
                int g = (Integer) toastClicks.get(0);
                toastClicks.add(holder.getAdapterPosition()-27, (Object) Integer.valueOf(g - 1));
                toastClicks.remove(holder.getAdapterPosition());
            }
        }
    }


    @Override
    public void onViewDetachedFromWindow(GeneralViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
        if (toastClicks.get(0).getClass().equals(Integer.class)) {
            if (((Integer) toastClicks.get(toastClicks.size() - 1) != Integer.MAX_VALUE) && posit==toastClicks.size() - 1) {
                int g = (Integer) toastClicks.get(toastClicks.size() - 1);
                toastClicks.add(holder.getAdapterPosition()+1, (Object) Integer.valueOf(g + 1));
                toastClicks.remove(0);
            }else {
                int g = (Integer) toastClicks.get(0);
                toastClicks.add(holder.getAdapterPosition()-27, (Object) Integer.valueOf(g - 1));
                toastClicks.remove(holder.getAdapterPosition());
            }
        }
    }
}
