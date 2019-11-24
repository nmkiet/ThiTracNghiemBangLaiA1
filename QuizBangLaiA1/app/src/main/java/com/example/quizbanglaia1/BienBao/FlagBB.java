package com.example.quizbanglaia1.BienBao;

import com.example.quizbanglaia1.R;

import java.util.ArrayList;

public class FlagBB {
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    String name;
    String chitiet;

    public String getChitiet() {
        return chitiet;
    }

    public void setChitiet(String chitiet) {
        this.chitiet = chitiet;
    }

    public FlagBB (int id, String name,String chitiet) {
        this.id=id;
        this.name = name;
        this.chitiet = chitiet;
    }
    public  static ArrayList initFlagBBC(){
        ArrayList<FlagBB> arrayList = new ArrayList<>();
        arrayList.add(new FlagBB(R.drawable.bbngcchieu,"Cấm đi ngược chiều","Báo đường cấm tất cẩ loại (xe cơ giới và thô sơ) đi vào theo chiều đặt biển trừ các xe được ưu tiên theo qui định"));
        arrayList.add(new FlagBB(R.drawable.bbcam,"Đường cấm","Báo đường cấm tất cả các loại phương tiện (cơ giới và thô sơ) đi lại cat hai hướng, trừ các xe ửu tiên theo quy định."));
        arrayList.add(new FlagBB(R.drawable.bbcamoto,"Cấm Ô tô","Báo đường cấm tất cả các loại xe cơ giới kể cả mô tô 3 bánh có thùng đi qua, trừ mô tô 2 bánh, xe gắn máy và các xe được ưu tiên theo quy định.)"));
        arrayList.add(new FlagBB(R.drawable.bbcamreoto,"Cấm ô tô rẻ phải ","Báo đường cấm tất cả các laoij xe cơ giới kể cả mô tô 3 bánh có thùng rẽ phải, trừ mô tô 2 bánh và các loại xe được ửu tiên theo quy dịnh."));
        arrayList.add(new FlagBB(R.drawable.cammoto,"Cấm mô tô","Báo đường cấm tất cả các loại mô tô đi quam trừ các xe mô tô được ưu tiên theo quy định."));
        return arrayList;
    }
    public  static ArrayList initFlagBBCD(){
        ArrayList<FlagBB> arrayList = new ArrayList<>();
        arrayList.add(new FlagBB(R.drawable.bduutien,"Bắt đầu đường ưu tiên","Để biểu thị ưu tiên cho các phương tiện trên đường có đặt biển này được đi trước. Biển đặt tại vị trí thích hợp trước khi đường nhánh sắp nhập vào trục đường chính, yêu cầu phương tiện từ đường nhánh ra phati dừng lại nhường cho phương tiện đường chính đi trước."));
        arrayList.add(new FlagBB(R.drawable.hetuutien,"Hết đoạn đường ưu tiên","Báo hiệu hết đoạn đường được ưu tiên."));
        arrayList.add(new FlagBB(R.drawable.dgchooto,"Đường dành cho ô tô","Để chỉ dẫn bát đâu đường dành cho các loại ô tô đi lại, các loại phương tiện giao thông khác không được phép đi vào đoạn đường có đặt biển này."));
        arrayList.add(new FlagBB(R.drawable.dgchootoxemay,"Đường dành cho ô tô, xe máy","Để chỉ dẫn bắt đầu đường dành cho các loại ô tô, xe máy(kể cả xe gắn máy) đi lại, các loại phương tiện giao thông khác không được phép đi vào đoạn đường có đặt biển này."));
        arrayList.add(new FlagBB(R.drawable.hetdgchooto,"Hết đường dành cho ô tô","Để chỉ dẫn hết đoạn đường dành cho ô tô đi lại"));
        arrayList.add(new FlagBB(R.drawable.hetdgchootoxemay,"Hết đường dành cho ô tô, xe máy","Để chỉ dẫn hết đoạn đường dành cho ô tô, xe máy đi lại."));
        arrayList.add(new FlagBB(R.drawable.dgcutphai,"Đường cụt","Để chỉ dẫn đường cụt, lối rẽ vào đường cụt phía bên phải."));
        arrayList.add(new FlagBB(R.drawable.dgcuttrai,"Đường cụt","Để chỉ dẫn đường cụt, lối rẽ vào đường cụt phía bên trái."));
        return arrayList;
    }
    public  static ArrayList initFlagBBNH(){
        ArrayList<FlagBB> arrayList = new ArrayList<>();
        arrayList.add(new FlagBB(R.drawable.ngoatphai,"Chỗ ngaowjt nguy hiểm vòng bên phải","Báo trước sắp đến một chỗ ngoạt nguy hiểm phía bên phải."));
        arrayList.add(new FlagBB(R.drawable.dghep2ben,"Đường bị hẹp cả hai bên.","Báo trước sắp đến một đoạn đường bị hẹp đột ngột cả hai bên."));
        arrayList.add(new FlagBB(R.drawable.vongxuyen,"Giao nhau chạy theo vòng xuyến","Báo trước nơi giao nhau có bố trí đảo an toàn giữa nút giao thông, các loại xe qua nút giao phải đi vòng xuyến quanh đảo an toàn theo chiều mũi tên."));
        arrayList.add(new FlagBB(R.drawable.giaonhaudguutien,"Giao nhau với đường ưu tiên","Để báo trước sắp đến nơi giao nhau với đường ưu tiên."));
        arrayList.add(new FlagBB(R.drawable.giaonhaukouutien,"Giao nhau với đường ưu tiên","Để báo trước sắp đến nơi giao nhau với đường không ưu tiên."));
        arrayList.add(new FlagBB(R.drawable.giaonhauvsdgsat,"Giao nhau với đường sắt không có rào chắn","Để báo trước sắp đến chỗ giao nhau giữa đường bộ và đường sắt không có rào chắn, không có người điểu khiển giao thông."));
        return arrayList;
    }
}
