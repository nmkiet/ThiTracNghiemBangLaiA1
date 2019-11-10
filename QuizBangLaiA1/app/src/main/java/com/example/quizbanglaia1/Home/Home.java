package com.example.quizbanglaia1.Home;

public class Home {
    private int Pic;
    private String Name;

    public Home(int pic, String name) {
        this.Pic = pic;
        this.Name = name;
    }

    public int getPic() {
        return Pic;
    }

    public void setPic(int pic) {
        Pic = pic;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
