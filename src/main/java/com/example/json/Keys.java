
package com.example.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Keys {

    @SerializedName("#")
    @Expose
    private Sharp sharp;

    @Override
    public String toString() {
        return "Keys{" +
                "sharp=" + sharp +
                ", a=" + a +
                '}';
    }

    @SerializedName("A")
    @Expose
    private A a;

    public Sharp getSharp() {
        return sharp;
    }

    public void setSharp(Sharp sharp) {
        this.sharp = sharp;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

}
