package com.example.xml_exsersis;

public class person {
   private String name;
   private String imeg;

    public person(String name, String imeg) {
        this.name = name;
        this.imeg = imeg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImeg() {
        return imeg;
    }

    public void setImeg(String imeg) {
        this.imeg = imeg;
    }
}
