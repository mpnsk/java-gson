
package com.example.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Keys_ {

    @SerializedName("O")
    @Expose
    private String o;
    @SerializedName("C")
    @Expose
    private String c;
    @SerializedName("I")
    @Expose
    private String i;

    public String getO() {
        return o;
    }

    public void setO(String o) {
        this.o = o;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Keys_{" +
                "o='" + o + '\'' +
                ", c='" + c + '\'' +
                ", i='" + i + '\'' +
                '}';
    }
}
