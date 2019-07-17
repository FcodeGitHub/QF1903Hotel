package com.hy.hotel.pojo;

public class Food {
    private Integer id;

    private String className;

    private String classinfo;

    private String money;

    private Float grade;

    public Food() {
    }

    public Food(Integer id, String className, String classinfo, String money, Float grade) {
        this.id = id;
        this.className = className;
        this.classinfo = classinfo;
        this.money = money;
        this.grade = grade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassinfo() {
        return classinfo;
    }

    public void setClassinfo(String classinfo) {
        this.classinfo = classinfo;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public Float getGrade() {
        return grade;
    }

    public void setGrade(Float grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", className='" + className + '\'' +
                ", classinfo='" + classinfo + '\'' +
                ", money='" + money + '\'' +
                ", grade=" + grade +
                '}';
    }
}