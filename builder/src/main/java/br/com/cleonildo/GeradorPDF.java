package br.com.cleonildo;

public class GeradorPDF {
    private String pageOrientation = "portrait";
    private String unit = "mm";
    private int pageSizeX = 210;
    private int pageSizeY = 297;
    private int marginTop = 30;
    private int marginRight = 20;
    private int marginBottom = 30;
    private int marginLeft = 20;
    private boolean hasHeader = false;
    private int headerHeight = 0;
    private boolean hasFooter = false;
    private int footerHeight = 0;
    private String pageColor = "#ffffff";
    private String encode = "UTF-8";

    // ### Aqui ficava o construtor - Foi Removido ###

    // Nada muda nos demais métodos Getters, Setters e toString.


    public String getPageOrientation() {
        return pageOrientation;
    }

    public void setPageOrientation(String pageOrientation) {
        this.pageOrientation = pageOrientation;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getPageSizeX() {
        return pageSizeX;
    }

    public void setPageSizeX(int pageSizeX) {
        this.pageSizeX = pageSizeX;
    }

    public int getPageSizeY() {
        return pageSizeY;
    }

    public void setPageSizeY(int pageSizeY) {
        this.pageSizeY = pageSizeY;
    }

    public int getMarginTop() {
        return marginTop;
    }

    public void setMarginTop(int marginTop) {
        this.marginTop = marginTop;
    }

    public int getMarginRight() {
        return marginRight;
    }

    public void setMarginRight(int marginRight) {
        this.marginRight = marginRight;
    }

    public int getMarginBottom() {
        return marginBottom;
    }

    public void setMarginBottom(int marginBottom) {
        this.marginBottom = marginBottom;
    }

    public int getMarginLeft() {
        return marginLeft;
    }

    public void setMarginLeft(int marginLeft) {
        this.marginLeft = marginLeft;
    }

    public boolean isHasHeader() {
        return hasHeader;
    }

    public void setHasHeader(boolean hasHeader) {
        this.hasHeader = hasHeader;
    }

    public int getHeaderHeight() {
        return headerHeight;
    }

    public void setHeaderHeight(int headerHeight) {
        this.headerHeight = headerHeight;
    }

    public boolean isHasFooter() {
        return hasFooter;
    }

    public void setHasFooter(boolean hasFooter) {
        this.hasFooter = hasFooter;
    }

    public int getFooterHeight() {
        return footerHeight;
    }

    public void setFooterHeight(int footerHeight) {
        this.footerHeight = footerHeight;
    }

    public String getPageColor() {
        return pageColor;
    }

    public void setPageColor(String pageColor) {
        this.pageColor = pageColor;
    }

    public String getEncode() {
        return encode;
    }

    public void setEncode(String encode) {
        this.encode = encode;
    }

    @Override
    public String toString() {
        return "GeradorPDF{" +
                "pageOrientation='" + pageOrientation + '\'' +
                ", unit='" + unit + '\'' +
                ", pageSizeX=" + pageSizeX +
                ", pageSizeY=" + pageSizeY +
                ", marginTop=" + marginTop +
                ", marginRight=" + marginRight +
                ", marginBottom=" + marginBottom +
                ", marginLeft=" + marginLeft +
                ", hasHeader=" + hasHeader +
                ", headerHeight=" + headerHeight +
                ", hasFooter=" + hasFooter +
                ", footerHeight=" + footerHeight +
                ", pageColor='" + pageColor + '\'' +
                ", encode='" + encode + '\'' +
                '}';
    }
}
