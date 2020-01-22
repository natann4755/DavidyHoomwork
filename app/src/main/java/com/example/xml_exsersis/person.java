package com.example.xml_exsersis;

public class person {
   private String name;
   private int imeg;

    public person(String name, int imeg) {
        this.name = name;
        this.imeg = imeg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImeg() {
        return imeg;
    }

    public void setImeg(int imeg) {
        this.imeg = imeg;
    }
}
