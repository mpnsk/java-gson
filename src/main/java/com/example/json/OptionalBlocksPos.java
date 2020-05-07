
package com.example.json;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OptionalBlocksPos {

    @SerializedName("layer0")
    @Expose
    private List<List<String>> layer0 = null;
    @SerializedName("layer1")
    @Expose
    private List<List<String>> layer1 = null;
    @SerializedName("layer2")
    @Expose
    private List<List<String>> layer2 = null;
    @SerializedName("keys")
    @Expose
    private Keys_ keys;

    @Override
    public String toString() {
        return "OptionalBlocksPos{" +
                "layer0=" + layer0 +
                ", layer1=" + layer1 +
                ", layer2=" + layer2 +
                ", keys=" + keys +
                '}';
    }

    public List<List<String>> getLayer0() {
        return layer0;
    }

    public void setLayer0(List<List<String>> layer0) {
        this.layer0 = layer0;
    }

    public List<List<String>> getLayer1() {
        return layer1;
    }

    public void setLayer1(List<List<String>> layer1) {
        this.layer1 = layer1;
    }

    public List<List<String>> getLayer2() {
        return layer2;
    }

    public void setLayer2(List<List<String>> layer2) {
        this.layer2 = layer2;
    }

    public Keys_ getKeys() {
        return keys;
    }

    public void setKeys(Keys_ keys) {
        this.keys = keys;
    }

}
