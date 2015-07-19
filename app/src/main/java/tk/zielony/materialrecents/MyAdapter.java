package tk.zielony.materialrecents;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by Marcin on 2015-07-08.
 */
public class MyAdapter extends android.support.v4.app.FragmentPagerAdapter {
    static final int NUM_ITEMS = 10;

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    @Override
    public Fragment getItem(int position) {
        return RecentsFragment.newInstance();
    }
}
