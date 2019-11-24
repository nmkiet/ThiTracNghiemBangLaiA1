package com.example.quizbanglaia1.TraCuu;

import java.util.ArrayList;

public class FlagTC {
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    String name;
    String chitiet;

    public String getChitiet() {
        return chitiet;
    }

    public void setChitiet(String chitiet) {
        this.chitiet = chitiet;
    }

    public FlagTC(String name, String chitiet) {

        this.name = name;
        this.chitiet = chitiet;
    }
    public  static ArrayList initFlagOT(){
        ArrayList<FlagTC> arrayList = new ArrayList<>();
        arrayList.add(new FlagTC("Làn,vạch kẻ đường","Điều khiển xe không đúng,phần đường và làn đường(300.000 - 400.000)"));
        arrayList.add(new FlagTC("Biển báo, đèn tín hiệu","Không chấp hành biển báo, vạch kẻ đường(60.000 - 80.000)"));
        arrayList.add(new FlagTC("Tốc độ, khoảng cách","Không giữ khoảng cách (60.000 - 80.000)"));
        arrayList.add(new FlagTC("Dừng đỗ","Dừng đổ trên phần đường xe chạy (100.000 - 200.000)"));
        return arrayList;
    }
    public  static ArrayList initFlagXM(){
        ArrayList<FlagTC> arrayList = new ArrayList<>();
        arrayList.add(new FlagTC("Làn,vạch kẻ đường","Điều khiển xe không đúng,phần đường và làn đường(300.000 - 400.000)"));
        arrayList.add(new FlagTC("Biển báo, đèn tín hiệu","Không chấp hành biển báo, vạch kẻ đường(60.000 - 80.000)"));
        arrayList.add(new FlagTC("Tốc độ, khoảng cách","Không giữ khoảng cách (60.000 - 80.000)"));
        arrayList.add(new FlagTC("Dừng đỗ","Dừng đổ trên phần đường xe chạy (100.000 - 200.000)"));
        return arrayList;
    }
    public  static ArrayList initFlagNDB(){
        ArrayList<FlagTC> arrayList = new ArrayList<>();
        arrayList.add(new FlagTC("Làn,vạch kẻ đường","Điều khiển xe không đúng,phần đường và làn đường(300.000 - 400.000)"));
        arrayList.add(new FlagTC("Biển báo, đèn tín hiệu","Không chấp hành biển báo, vạch kẻ đường(60.000 - 80.000)"));
        arrayList.add(new FlagTC("Tốc độ, khoảng cách","Không giữ khoảng cách (60.000 - 80.000)"));
        arrayList.add(new FlagTC("Dừng đỗ","Dừng đổ trên phần đường xe chạy (100.000 - 200.000)"));
        return arrayList;
    }
    public  static ArrayList initFlagGX(){
        ArrayList<FlagTC> arrayList = new ArrayList<>();
        arrayList.add(new FlagTC("Làn,vạch kẻ đường","Điều khiển xe không đúng,phần đường và làn đường(300.000 - 400.000)"));
        arrayList.add(new FlagTC("Biển báo, đèn tín hiệu","Không chấp hành biển báo, vạch kẻ đường(60.000 - 80.000)"));
        arrayList.add(new FlagTC("Tốc độ, khoảng cách","Không giữ khoảng cách (60.000 - 80.000)"));
        arrayList.add(new FlagTC("Dừng đỗ","Dừng đổ trên phần đường xe chạy (100.000 - 200.000)"));
        return arrayList;
    }
}
