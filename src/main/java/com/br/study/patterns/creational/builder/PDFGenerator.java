package com.br.study.patterns.creational.builder;

import java.util.StringJoiner;

public class PDFGenerator {
    private String pageOrientation = "portrait";
    private String unit = "mm";
    private int pageSizeX = 210;
    private int pageSizeY = 297;
    private int marginTop = 30;
    private int marginBottom = 30;
    private int marginRight = 20;
    private int marginLeft = 20;
    private boolean hasHeader = false;
    private int headerHeight = 0;
    private boolean hasFooter = false;
    private int footerHeight = 0;
    private String pageColor = "#FFFFFF";
    private String encoder = "UTF-8";

    public String getPageOrientation() {
        return this.pageOrientation;
    }

    public void setPageOrientation(String pageOrientation) {
        this.pageOrientation = pageOrientation;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getPageSizeX() {
        return this.pageSizeX;
    }

    public void setPageSizeX(int pageSizeX) {
        this.pageSizeX = pageSizeX;
    }

    public int getPageSizeY() {
        return this.pageSizeY;
    }

    public void setPageSizeY(int pageSizeY) {
        this.pageSizeY = pageSizeY;
    }

    public int getMarginTop() {
        return this.marginTop;
    }

    public void setMarginTop(int marginTop) {
        this.marginTop = marginTop;
    }

    public int getMarginBottom() {
        return this.marginBottom;
    }

    public void setMarginBottom(int marginBottom) {
        this.marginBottom = marginBottom;
    }

    public int getMarginRight() {
        return this.marginRight;
    }

    public void setMarginRight(int marginRight) {
        this.marginRight = marginRight;
    }

    public int getMarginLeft() {
        return this.marginLeft;
    }

    public void setMarginLeft(int marginLeft) {
        this.marginLeft = marginLeft;
    }

    public boolean isHasHeader() {
        return this.hasHeader;
    }

    public void setHasHeader(boolean hasHeader) {
        this.hasHeader = hasHeader;
    }

    public int getHeaderHeight() {
        return this.headerHeight;
    }

    public void setHeaderHeight(int headerHeight) {
        this.headerHeight = headerHeight;
    }

    public boolean isHasFooter() {
        return this.hasFooter;
    }

    public void setHasFooter(boolean hasFooter) {
        this.hasFooter = hasFooter;
    }

    public int getFooterHeight() {
        return this.footerHeight;
    }

    public void setFooterHeight(int footerHeight) {
        this.footerHeight = footerHeight;
    }

    public String getPageColor() {
        return this.pageColor;
    }

    public void setPageColor(String pageColor) {
        this.pageColor = pageColor;
    }

    public String getEncoder() {
        return this.encoder;
    }

    public void setEncoder(String encoder) {
        this.encoder = encoder;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", PDFGenerator.class.getSimpleName() + "[", "]")
                .add("pageOrientation='" + this.pageOrientation + "'")
                .add("unit='" + this.unit + "'")
                .add("pageSizeX=" + this.pageSizeX)
                .add("pageSizeY=" + this.pageSizeY)
                .add("marginTop=" + this.marginTop)
                .add("marginBottom=" + this.marginBottom)
                .add("marginRight=" + this.marginRight)
                .add("marginLeft=" + this.marginLeft)
                .add("hasHeader=" + this.hasHeader)
                .add("headerHeight=" + this.headerHeight)
                .add("hasFooter=" + this.hasFooter)
                .add("footerHeight=" + this.footerHeight)
                .add("pageColor='" + this.pageColor + "'")
                .add("encoder='" + this.encoder + "'")
                .toString();
    }
}
