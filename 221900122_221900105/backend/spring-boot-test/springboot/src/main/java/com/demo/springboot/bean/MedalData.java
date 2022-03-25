package com.demo.springboot.bean;
import com.demo.springboot.bean.Medal;
import java.util.ArrayList;

public class MedalData {
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    private int num;

    public ArrayList<Medal> getMedalList() {
        return medalList;
    }

    public void setMedalList(ArrayList<Medal> medalList) {
        this.medalList=new ArrayList<>();
        for (Medal m:
                medalList) {
            this.medalList.add(m);
        }
    }

    private ArrayList<Medal> medalList;
}
