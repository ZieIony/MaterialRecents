package tk.zielony.materialrecents;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

/**
 * Created by Marcin on 2015-04-14.
 */
public class RecentsActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.materialrecents_activity_recents);

        final int[] colors = new int[]{0xff7fffff,0xffff7fff,0xffffff7f,0xff7f7fff,0xffff7f7f,0xff7fff7f};
        final Random random = new Random();

        RecentsList recents = (RecentsList) findViewById(R.id.recents);
        recents.setAdapter(new RecentsAdapter() {
            @Override
            public String getTitle(int position) {
                return "Item "+position;
            }

            @Override
            public View getView(int position) {
                ImageView iv  =new ImageView(RecentsActivity.this);
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
    }
}
