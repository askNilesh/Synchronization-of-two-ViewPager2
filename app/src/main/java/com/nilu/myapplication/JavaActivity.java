package com.nilu.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class JavaActivity extends AppCompatActivity {

    ViewPager2 myFirstViewPager, mySecondViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        myFirstViewPager = findViewById(R.id.myFirstViewPager);
        mySecondViewPager = findViewById(R.id.mySecondViewPager);

        MyAdapter myAdapter = new MyAdapter(this);
        myFirstViewPager.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
        myFirstViewPager.setAdapter(myAdapter);

        mySecondViewPager.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
        mySecondViewPager.setAdapter(myAdapter);

        myFirstViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                mySecondViewPager.setCurrentItem(position, false);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });

        mySecondViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                myFirstViewPager.setCurrentItem(position, false);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });

    }


}
