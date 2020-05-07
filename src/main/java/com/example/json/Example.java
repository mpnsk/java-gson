
package com.example.json;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {
    @Override
    public String toString() {
        return "Example{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", fixedSize=" + fixedSize +
                ", controller='" + controller + '\'' +
                ", controllerNeeded=" + controllerNeeded +
                ", specificControllerPosition=" + specificControllerPosition +
                ", specificControllerPositionRotational=" + specificControllerPositionRotational +
                ", fixedControllerAmount=" + fixedControllerAmount +
                ", specificControllerLayer=" + specificControllerLayer +
                ", controllerLayer=" + controllerLayer +
                ", controllerAmount=" + controllerAmount +
                ", possibleControllerPos=" + possibleControllerPos +
                ", blockConfig=" + blockConfig +
                ", optionalBlocks=" + optionalBlocks +
                ", optionalBlocksPos=" + optionalBlocksPos +
                '}';
    }

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("size")
    @Expose
    private List<Integer> size = null;
    @SerializedName("fixedSize")
    @Expose
    private Boolean fixedSize;
    @SerializedName("controller")
    @Expose
    private String controller;
    @SerializedName("controllerNeeded")
    @Expose
    private Boolean controllerNeeded;
    @SerializedName("specificControllerPosition")
    @Expose
    private Boolean specificControllerPosition;
    @SerializedName("specificControllerPositionRotational")
    @Expose
    private Boolean specificControllerPositionRotational;
    @SerializedName("fixedControllerAmount")
    @Expose
    private Boolean fixedControllerAmount;
    @SerializedName("specificControllerLayer")
    @Expose
    private Boolean specificControllerLayer;
    @SerializedName("controllerLayer")
    @Expose
    private Integer controllerLayer;
    @SerializedName("controllerAmount")
    @Expose
    private Integer controllerAmount;
    @SerializedName("possibleControllerPos")
    @Expose
    private PossibleControllerPos possibleControllerPos;
    @SerializedName("blockConfig")
    @Expose
    private BlockConfig blockConfig;
    @SerializedName("optionalBlocks")
    @Expose
    private Boolean optionalBlocks;
    @SerializedName("optionalBlocksPos")
    @Expose
    private OptionalBlocksPos optionalBlocksPos;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getSize() {
        return size;
    }

    public void setSize(List<Integer> size) {
        this.size = size;
    }

    public Boolean getFixedSize() {
        return fixedSize;
    }

    public void setFixedSize(Boolean fixedSize) {
        this.fixedSize = fixedSize;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public Boolean getControllerNeeded() {
        return controllerNeeded;
    }

    public void setControllerNeeded(Boolean controllerNeeded) {
        this.controllerNeeded = controllerNeeded;
    }

    public Boolean getSpecificControllerPosition() {
        return specificControllerPosition;
    }

    public void setSpecificControllerPosition(Boolean specificControllerPosition) {
        this.specificControllerPosition = specificControllerPosition;
    }

    public Boolean getSpecificControllerPositionRotational() {
        return specificControllerPositionRotational;
    }

    public void setSpecificControllerPositionRotational(Boolean specificControllerPositionRotational) {
        this.specificControllerPositionRotational = specificControllerPositionRotational;
    }

    public Boolean getFixedControllerAmount() {
        return fixedControllerAmount;
    }

    public void setFixedControllerAmount(Boolean fixedControllerAmount) {
        this.fixedControllerAmount = fixedControllerAmount;
    }

    public Boolean getSpecificControllerLayer() {
        return specificControllerLayer;
    }

    public void setSpecificControllerLayer(Boolean specificControllerLayer) {
        this.specificControllerLayer = specificControllerLayer;
    }

    public Integer getControllerLayer() {
        return controllerLayer;
    }

    public void setControllerLayer(Integer controllerLayer) {
        this.controllerLayer = controllerLayer;
    }

    public Integer getControllerAmount() {
        return controllerAmount;
    }

    public void setControllerAmount(Integer controllerAmount) {
        this.controllerAmount = controllerAmount;
    }

    public PossibleControllerPos getPossibleControllerPos() {
        return possibleControllerPos;
    }

    public void setPossibleControllerPos(PossibleControllerPos possibleControllerPos) {
        this.possibleControllerPos = possibleControllerPos;
    }

    public BlockConfig getBlockConfig() {
        return blockConfig;
    }

    public void setBlockConfig(BlockConfig blockConfig) {
        this.blockConfig = blockConfig;
    }

    public Boolean getOptionalBlocks() {
        return optionalBlocks;
    }

    public void setOptionalBlocks(Boolean optionalBlocks) {
        this.optionalBlocks = optionalBlocks;
    }

    public OptionalBlocksPos getOptionalBlocksPos() {
        return optionalBlocksPos;
    }

    public void setOptionalBlocksPos(OptionalBlocksPos optionalBlocksPos) {
        this.optionalBlocksPos = optionalBlocksPos;
    }

}
