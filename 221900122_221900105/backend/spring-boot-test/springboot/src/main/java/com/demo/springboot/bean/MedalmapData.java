package com.demo.springboot.bean;
import com.demo.springboot.bean.Medalmap;
import java.util.ArrayList;

public class MedalmapData {

    private ArrayList<Medalmap> medalmapList;
    public ArrayList<Medalmap> getMedalmapList() {
        return medalmapList;
    }

    public void setMedalmapList(ArrayList<Medalmap> medalmapList) {
        this.medalmapList=new ArrayList<>();
        for (Medalmap m:
                medalmapList) {
            this.medalmapList.add(m);
        }
    }


}
