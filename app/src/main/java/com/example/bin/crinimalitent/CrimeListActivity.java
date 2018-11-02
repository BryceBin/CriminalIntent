package com.example.bin.crinimalitent;

import android.support.v4.app.Fragment;

/**
 * @Author: Bhy
 * @Date: 2018/11/2
 */
public class CrimeListActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
