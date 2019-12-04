package com.example.mytablayout.viewPager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.mytablayout.myFragment.Fragment_1;
import com.example.mytablayout.myFragment.Fragment_2;
import com.example.mytablayout.myFragment.Fragment_3;
import com.example.mytablayout.myFragment.Fragment_4;

public class myViewPagerAdapter extends FragmentStatePagerAdapter {

    public myViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0)
            return "Tab 1";
        else  if(position==1)
            return "Tab 2";
        else  if(position==2)
            return "Tab 3";
        else if(position==3)
            return "Tab 4";
        else
            return null;
    }

    @NonNull
    @Override
    public Fragment getItem(int i) {
        if(i==0){
            Fragment fragment_1 = new Fragment_1();
            return fragment_1;
        }else if(i==1){
            Fragment fragment_2 = new Fragment_2();
            return fragment_2;
        }else if(i==2){
            Fragment fragment_3 = new Fragment_3();
            return fragment_3;
        }else if(i==3){
            Fragment fragment_4 = new Fragment_4();
            return fragment_4;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
