package com.driving.model;

/**
 * Created by Administrator on 2017/11/24 0024.
 */
public class Coach {
    private String id;
    private String name;
    private String img;
    private String intro;
    private String rank;

    public Coach(){super();}

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImg() {
        return img;
    }

    public String getIntro() {
        return intro;
    }

    public String getRank() {
        return rank;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    @Override
    public String toString() {
        return "Coach{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", img='" + img + '\'' +
                ", intro='" + intro + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
