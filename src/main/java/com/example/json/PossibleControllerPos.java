
package com.example.json;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PossibleControllerPos {

    @SerializedName("onEdge")
    @Expose
    private List<Object> onEdge = null;

    public List<Object> getOnEdge() {
        return onEdge;
    }

    public void setOnEdge(List<Object> onEdge) {
        this.onEdge = onEdge;
    }

    @Override
    public String toString() {
        return "PossibleControllerPos{" +
                "onEdge=" + onEdge +
                '}';
    }
}
