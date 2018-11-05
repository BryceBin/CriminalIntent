package com.example.bin.crinimalitent;

import java.util.Date;
import java.util.UUID;

/**
 * @Author: Bhy
 * @Date: 2018/10/17
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSovled;
    private int mRequiresPolice;

    public Crime(){
        mId = UUID.randomUUID();//产生随机唯一ID值
        mDate = new Date();
    }

    public int getRequiresPolice() {
        return mRequiresPolice;
    }

    public void setRequiresPolice(int requiesPolice) {
        mRequiresPolice = requiesPolice;
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSovled() {
        return mSovled;
    }

    public void setSovled(boolean sovled) {
        mSovled = sovled;
    }
}
