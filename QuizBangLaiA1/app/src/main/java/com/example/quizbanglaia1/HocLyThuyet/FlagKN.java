package com.example.quizbanglaia1.HocLyThuyet;

import com.example.quizbanglaia1.R;

import java.util.ArrayList;

public class FlagKN {
    Integer id ;
    String CauHoi;
    String TraLoi1;
    String TraLoi2;

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FlagKN(Integer id, String cauHoi, String traLoi1, String traLoi2) {
        this.id = id;
        this.CauHoi = cauHoi;
        this.TraLoi1 = traLoi1;
        this.TraLoi2 = traLoi2;
    }

    public String getCauHoi() {
        return CauHoi;
    }

    public void setCauHoi(String cauHoi) {
        this.CauHoi = cauHoi;
    }

    public String getTraLoi1() {
        return TraLoi1;
    }

    public void setTraLoi1(String traLoi1) {
        this.TraLoi1 = traLoi1;
    }

    public String getTraLoi2() {
        return TraLoi2;
    }

    public void setTraLoi2(String traLoi2) {
        this.TraLoi2 = traLoi2;
    }

    public static ArrayList initKhaiNiem()
    {
        ArrayList<FlagKN> arrayList = new ArrayList<>();
        arrayList.add(new FlagKN(null,"Câu 1: Khái niệm “đường bộ” được hiểu như thế nào là đúng?","Đường bộ, cầu đường bộ.","Hầm đường bộ, bến phà đường bộ."));
        arrayList.add(new FlagKN(null,"Câu 2:“Vạch kẻ đường” được hiểu như thế nào là đúng?","Vạch kẻ đường là vạch chỉ sự phân chia làn đường, vị trí hoặc hướng đi, vị trí dừng lại.",""));
        arrayList.add(new FlagKN(null,"Câu 3: Khái niệm “phần đường xe chạy” được hiểu như thế nào là đúng?","Là phần của đường bộ được sử dụng cho các phương tiện giao thông qua lại.",""));
        arrayList.add(new FlagKN(null,"Câu 4: Khái niệm “làn đường” được hiểu như thế nào là đúng?","Là một phần đường xe chạy được chia theo chiều dọc của đường, có bề rộng đủ cho xe chạy an toàn.",""));
        arrayList.add(new FlagKN(null,"Câu 5: Khái niệm “đường phố” được hiểu như thế nào là đúng?","Đường phố là đường đô thị, gồm lòng đường và hè phố.",""));
        arrayList.add(new FlagKN(null,"Câu 6: Khái niệm “dải phân cách” được hiểu như thế nào là đúng?","Là bộ phận của đường để phân chia mặt đường thành hai chiều xe chạy riêng biệt hoặc để phân chia phần đường của xe cơ giới và xe thô sơ.",""));
        arrayList.add(new FlagKN(null,"Câu 7: Dải phân cách trên đường bộ có những loại nào?","Loại cố định.","Loại di động."));
        arrayList.add(new FlagKN(null,"Câu 8: Khái niệm “đường ưu tiên” được hiểu như thế nào là đúng?","Đường ưu tiên là đường mà trên đó phương tiện tham gia giao thông đường bộ được các phương tiện đến từ hướng khác nhường đường khi qua nơi đường giao nhau, được cắm biển báo hiệu đường ưu tiên.",""));
        arrayList.add(new FlagKN(null,"Câu 9: “Phương tiện giao thông đường bộ” gồm những loại nào?","Phương tiện giao thông cơ giới đường bộ, phương tiện giao thông thô sơ đường bộ.",""));
        arrayList.add(new FlagKN(null,"Câu 10: Khái niệm “phương tiện giao thông cơ giới đường bộ” được hiểu như thế nào là đúng?","Gồm xe ô tô, máy kéo, rơ moóc hoặc sơ mi rơ moóc được kéo bởi xe ô tô, máy kéo, xe mô tô hai bánh, xe mô tô ba bánh, xe gắn máy (kể cả xe máy điện) và các loại xe tương tự.",""));
        return  arrayList;

    }
    public static ArrayList initHTBienBao()
    {
        ArrayList<FlagKN> arrayList = new ArrayList<>();
        arrayList.add(new FlagKN(null,"Câu 81: Biển nào cấm người đi bộ?","Biển 2.",""));
        arrayList.add(new FlagKN(null,"Câu 82: Gặp biển nào người lái xe phải nhường đường cho người đi bộ?","Biển 1.",""));
        arrayList.add(new FlagKN(null,"Câu 83: Biển nào chỉ đường dành cho người đi bộ, các loại xe không được đi vào khi gặp biển này?","Biển 3",""));
        arrayList.add(new FlagKN(null,"Câu 84: Biển nào báo hiệu sắp đến chỗ giao nhau nguy hiểm?","Biển 2 và 3.",""));
        arrayList.add(new FlagKN(null,"Câu 85: Biển nào báo hiệu sắp đến chỗ giao nhau với đường sắt có rào chắn?","Biển 3.",""));
        arrayList.add(new FlagKN(null,"Câu 86: Biển nào báo hiệu giao nhau có tín hiệu đèn?","Biển 3",""));
        arrayList.add(new FlagKN(null,"Câu 87: Biển nào báo hiệu nguy hiểm giao nhau với đường sắt?","Biển 1 và 3.",""));
        arrayList.add(new FlagKN(null,"Câu 88: Biển nào báo hiệu đường sắt giao nhau với đường bộ không có rào chắn?","Biển 2 và 3.",""));
        arrayList.add(new FlagKN(null,"Câu 89: Biển nào báo hiệu “Hết đoạn đường ưu tiên”?","Biển 3.",""));
        arrayList.add(new FlagKN(null,"Câu 90: Biển nào báo hiệu, chỉ dẫn xe đi trên đường này được quyền ưu tiên qua nơi giao nhau?","Biển 1 và 3",""));
        return  arrayList;

    }

    public static ArrayList initSaHinh()
    {
        ArrayList<FlagKN> arrayList = new ArrayList<>();
        arrayList.add(new FlagKN(null,"Câu 116: Thứ tự các xe đi như thế nào là đúng quy tắc giao thông?","Xe tải, mô tô, xe lam, xe con.",""));
        arrayList.add(new FlagKN(null,"Câu 117: Thứ tự các xe đi như thế nào?","Mô tô, xe lam, xe tải.",""));
        arrayList.add(new FlagKN(null,"Câu 118: Trường hợp này xe nào được quyền đi trước?","Xe con",""));
        arrayList.add(new FlagKN(null,"Câu 119: Thứ tự các xe đi như thế nào?","Xe lam, xe cứu thương, xe con.",""));
        arrayList.add(new FlagKN(null,"Câu 120: Xe nào được quyền đi trước trong trường hợp này?","Xe cứu thương.",""));
        arrayList.add(new FlagKN(null,"Câu 121: Theo tín hiệu đèn, xe nào được đi trước?","Xe con và xe khách.",""));
        arrayList.add(new FlagKN(null,"Câu 122: Theo tín hiệu đèn, xe nào được quyền đi là đúng quy tắc giao thông?","Xe con, xe tải.",""));
        arrayList.add(new FlagKN(null,"Câu 123: Các xe đi theo mũi tên, xe nào vi phạm quy tắc giao thông?","Xe khách, xe con, mô tô.",""));
        arrayList.add(new FlagKN(null,"Câu 124: Thứ tự các xe đi như thế nào là đúng quy tắc giao thông?","Xe tải.Mô tô, xe tải, xe khách, xe con.",""));
        arrayList.add(new FlagKN(null,"Câu 125: Trong trường hợp này xe nào đỗ vi phạm quy tắc giao thông?","Xe tải.",""));
        return  arrayList;

    }
    public static ArrayList initVanHoa()
    {
        ArrayList<FlagKN> arrayList = new ArrayList<>();
        arrayList.add(new FlagKN(null,"Câu 76: Khái niệm về văn hóa giao thông được hiểu như thế nào là đúng?","Là sự hiểu biết và chấp hành nghiêm chỉnh pháp luật về giao thông, là ý thức trách nhiệm với cộng đồng khi tham gia giao thông.","Là ứng xử văn hóa có tình yêu thương con người trong các tình huống không may xảy ra khi tham gia giao thông."));
        arrayList.add(new FlagKN(null,"Câu 77: Người lái xe cố tình vi phạm Luật giao thông đường bộ, không phân biệt làn đường, vạch phân làn, phóng nhanh, vượt ẩu, vượt đèn đỏ, đi vào đường cấm, đường một chiều được coi là hành vi nào trong các hành vi sau đây?","Là thiếu văn hóa giao ",""));
        arrayList.add(new FlagKN(null,"Câu 78: Trong các hành vi dưới đây, người lái xe mô tô có văn hóa giao thông phải ứng xử như thế nào?","Chấp hành quy định về tốc độ, đèn tín hiệu, biển báo hiệu, vạch kẻ đường khi lái xe.","Chấp hành hiệu lệnh, chỉ dẫn của người điều khiển giao thông, nhường đường cho người đi bộ, người già, trẻ em, người khuyết tật."));
        arrayList.add(new FlagKN(null,"Câu 79: Trong các hành vi dưới đây, người lái xe mô tô có văn hóa giao thông phải ứng xử như thế nào?","Điều khiển xe đi bên phải chiều đi của mình.","Đi đúng phần đường, làn đường quy định; đội mũ bảo hiểm đúng quy cách."));
        arrayList.add(new FlagKN(null,"Câu 80: Người có văn hóa giao thông, khi điều khiển xe cơ giới tham gia giao thông đường bộ phải đảm bảo các điều kiện gì?","Có giấy phép lái xe phù hợp với loại xe được phép điều khiển, xe cơ giới đảm bảo các quy định về chất lượng, an toàn kỹ thuật và bảo vệ môi trường.",""));
        return  arrayList;

    }

}
