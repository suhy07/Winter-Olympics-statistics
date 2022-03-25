package com.demo.springboot.bean;

import java.util.ArrayList;

public class ScheduleData {
    public int getNum() {
        return num;
    }
//
    public void setNum(int num) {
        this.num = num;
    }

    private int num;

    public ArrayList<Schedule> getDetailList() {
        return scheduleList;
    }

    public void setDetailList(ArrayList<Schedule> scheduleList) {
        this.scheduleList =new ArrayList<>();
        for (Schedule d:
                scheduleList) {
            this.scheduleList.add(d);
        }
    }

    private ArrayList<Schedule> scheduleList;

}
