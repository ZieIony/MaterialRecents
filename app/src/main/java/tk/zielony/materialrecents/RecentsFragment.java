package tk.zielony.materialrecents;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by Marcin on 2015-07-08.
 */
public class RecentsFragment extends Fragment {

    static RecentsFragment newInstance() {
        RecentsFragment f = new RecentsFragment();
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.materialrecents_activity_recents, container, false);

        final int[] colors = new int[]{0xff7fffff,0xffff7fff,0xffffff7f,0xff7f7fff,0xffff7f7f,0xff7fff7f};
        final Random random = new Random();

        RecentsList recents = (RecentsList) v.findViewById(R.id.recents);
        recents.setAdapter(new RecentsAdapter() {
            @Override
            public String getTitle(int position) {
                return "Item " + position;
            }

            @Override
            public View getView(int position) {
                ImageView iv = new ImageView(getActivity());
                iv.setImageResource(R.drawable.mazda);
                iv.setBackgroundColor(0xffffffff);
                return iv;
            }

            @Override
            public Drawable getIcon(int position) {
                return getResources().getDrawable(R.mipmap.ic_launcher);
            }

            @Override
            public int getHeaderColor(int position) {
                return colors[random.nextInt(colors.length)];
            }

            @Override
            public int getCount() {
                return 10;
            }
        });
        return v;
    }

}

