package com.example.quizbanglaia1.MeoThi;

import java.util.ArrayList;

public class FlagMeoThi implements Comparable<FlagMeoThi> {
    public String ctmeo;
    public int id;

    public FlagMeoThi(String ctmeo, int id, String stt) {
        this.ctmeo = ctmeo;
        this.id = id;
        this.stt = stt;
    }

    public FlagMeoThi(String stt, String ctmeo) {
        this.ctmeo = ctmeo;
        this.stt = stt;
    }

    public String getCtmeo() {
        return ctmeo;
    }

    public void setCtmeo(String ctmeo) {
        this.ctmeo = ctmeo;
    }

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    public String stt;

    @Override
    public int compareTo(FlagMeoThi flagMeoThi) {
        return stt.compareToIgnoreCase(flagMeoThi.stt);
    }


    public  static ArrayList initFlagLT(){
        ArrayList<FlagMeoThi> arrayList = new ArrayList<>();
        arrayList.add(new FlagMeoThi("1:","Những câu hỏi về khái niệm trong đề bài có ngoặc kép và xuất hiện từ."));
        arrayList.add(new FlagMeoThi("2: ","Những câu hỏi có 2 đáp án mà trong đề bài xuất hiện những từ số nhiều:Những - Gồm - Các => chọn cả 2 đáp án"));
        arrayList.add(new FlagMeoThi("3:","Đáp án bị nghiêm cấm luôn đúng"));
        arrayList.add(new FlagMeoThi("4: ","Những câu hỏi về nồng độ cồn áp dụng mẹo: Mô tô không vượt quá 50/100 và 0.25 lít"));
        arrayList.add(new FlagMeoThi("5: ","Đáp án Không được...luôn đúng"));
        arrayList.add(new FlagMeoThi("6: ","Những câu hỏi có liên quan đến hiệu lệnh của cảnh sát giao thông, trong đề bài xuất hiện: Tay giang => Đáp án(1)"));

        return arrayList;
    }
    public static ArrayList initFlagTT(){
        ArrayList<FlagMeoThi> arrayList = new ArrayList<>();
        arrayList.add(new FlagMeoThi("1.Điều đầu tiên và cơ bản nhất đó là bạn phải biết đi xe máy. ","Việc phần thực hành trượt nhiều một phần nguyên nhân là do các bạn chưa biết đi xe máy. Vậy nếu bạn muốn thi đỗ thì đầu tiên phải biết đi xe cái đã."));
        arrayList.add(new FlagMeoThi("2.Tập trước vòng số 8 ở nhà.","Phần thi thực hành trượt nhiều nhất là ở phần thi vòng số 8. Do đó, việc bạn đã biết đi xe máy thành thạo nhưng chưa tập qua vòng số 8 thì cũng rất dễ bị trượt.Bạn nên tập qua vòng số 8 càng nhiều lần càng tốt. Ít nhất là lúc đi xe vào vòng số 8 không còn cảm thấy loạng choạng."));
        arrayList.add(new FlagMeoThi("3.Hôm thi lên sân thi thật sớm. ","Tại sao chúng tôi lại khuyên bạn như vậy? Bởi vì xe của bạn thì bạn quen với nó, bạn đi rất ngon lành. Nhưng xe của sân thi thì khác nhiều đấy,nếu bạn không đến sân sớm để làm quen thì cũng rất dễ trượt."));
        arrayList.add(new FlagMeoThi("4.Cách đi để không bị chạm vạch ","Bạn không cần phải đi quá nhanh như người đàn ông này. Hãy đi chậm chậm vừa phải, đừng để ngã xe hay chạm vạch là được."));

        return arrayList;
    }
}
