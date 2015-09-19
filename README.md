# MaterialRecents

Easy to use adapter container. For details check the sample code. Uses CardView, works on all Android versions back to Froyo.

I was asked to extract some of the features of the Carbon library to separate projects so it's possible to include just one feature in one's app. This project is one of them. For all features, demos, changelog and Maven support check out Carbon: https://github.com/ZieIony/Carbon

![gif](https://github.com/ZieIony/MaterialRecents/blob/master/images/recents.gif)

##### Importing

To include in your project, check: https://jitpack.io/#ZieIony/MaterialRecents/d2aec46f48

    repositories {
        maven {
            url "https://jitpack.io"
        }
    }
	
    dependencies {
        compile 'com.github.ZieIony:MaterialRecents:d2aec46f48'
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
