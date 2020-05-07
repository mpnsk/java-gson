
package com.example.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class A {
    @Override
    public String toString() {
        return "A{" +
                "block='" + block + '\'' +
                '}';
    }

    @SerializedName("block")
    @Expose
    private String block;

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

}
