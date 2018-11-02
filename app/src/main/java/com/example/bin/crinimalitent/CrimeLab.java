package com.example.bin.crinimalitent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @Author: Bhy
 * @Date: 2018/11/2
 */
//单例
public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;

    public static CrimeLab get(Context context){
        //若实例存在则返回，否则新建一个实例
        if(sCrimeLab==null){
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context){
        //私有构造方法，除了get()方法以外，其他类无法创建CrimeLab实例
        mCrimes = new ArrayList<>();
        for(int i=0;i<100;i++){//生成100个Crime对象并存入mCrimes中
            Crime crime = new Crime();
            crime.setTitle("Crime #"+i);
            crime.setSovled(i%2 == 0);
            crime.setRequiesPolice(i%2);
            mCrimes.add(crime);
        }
    }

    public List<Crime> getCrimes(){
        return mCrimes;
    }

    public Crime getCrime(UUID id){//根据UUID返回对应的Crime对象
        for(Crime crime : mCrimes){
            if(crime.getId().equals(id)){
                return crime;
            }
        }
        return null;
    }
}
