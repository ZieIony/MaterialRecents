# MaterialRecents

Easy to use adapter container. For details check the sample code. Uses CardView, works on all Android versions back to Froyo.

I was asked to extract some of the features of the Carbon library to separate projects so it's possible to include just one feature in one's app. This project is one of them. For all features, demos, changelog and Maven support check out Carbon: https://github.com/ZieIony/Carbon

### _This project is not really maintained. It could be written better - reuse views, have some kind of configuration and handle touches properly. Unfortunatelly I don't have time to add any of these features. If you wish, you may reuse any parts of this project, propose pull requests to this repo or base your own solutions on my code. I'm leaving issues section open for your convenience._

![gif](https://github.com/ZieIony/MaterialRecents/blob/master/images/recents.gif)

##### Importing

To include in your project, check: https://jitpack.io/#ZieIony/MaterialRecents

    repositories {
        maven {
            url "https://jitpack.io"
        }
    }
	
    dependencies {
        compile 'com.github.ZieIony:MaterialRecents:master-SNAPSHOT'
    }

##### Usage

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
    }
