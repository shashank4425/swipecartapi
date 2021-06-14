package com.swipecartitem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name="CARTLIST_TAB")
public class CartItem {
	
	@Id
	  @Column(name="ID")
	   int id;
	   @Column(name="PROD_ID")
	   String prodid;
	   @Column(name="PROD_URI")
	   String url;
	   @Column(name="PROD_NAME")
	   String prodName;
	   @Column(name="PROD_TITLE")
	   String prodTitle;
	   @Column(name="PROD_PATH")
	   String prodPath;
	   @Column(name="PROD_CAMARA")
	   String prodCamara;
	   @Column(name="PROD_BATTERY")
	   String prodBattery;
	   @Column(name="PROD_OFFERPRICE")
	   String prodOfferPrice;
	   @Column(name="PROD_PREVPRICE")
	   String prodPrevPrice;
	   @Column(name="PROD_RAM")
	   String prodRam;
	   @Column(name="PROD_ROM")
	   String prodRom;
	   @Column(name="PROD_DISPLAYSIZE")
	   String prodDisplaySize;
	   @Column(name="PROD_COLOR")
	   String prodColor;
	   @Column(name="PROD_QUANTITY")
	   String quantity;
	   
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProdid() {
		return prodid;
	}
	public void setProdid(String prodid) {
		this.prodid = prodid;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdTitle() {
		return prodTitle;
	}
	public void setProdTitle(String prodTitle) {
		this.prodTitle = prodTitle;
	}
	public String getProdPath() {
		return prodPath;
	}
	public void setProdPath(String prodPath) {
		this.prodPath = prodPath;
	}
	public String getProdCamara() {
		return prodCamara;
	}
	public void setProdCamara(String prodCamara) {
		this.prodCamara = prodCamara;
	}
	public String getProdBattery() {
		return prodBattery;
	}
	public void setProdBattery(String prodBattery) {
		this.prodBattery = prodBattery;
	}
	public String getProdOfferPrice() {
		return prodOfferPrice;
	}
	public void setProdOfferPrice(String prodOfferPrice) {
		this.prodOfferPrice = prodOfferPrice;
	}
	public String getProdPrevPrice() {
		return prodPrevPrice;
	}
	public void setProdPrevPrice(String prodPrevPrice) {
		this.prodPrevPrice = prodPrevPrice;
	}
	public String getProdRam() {
		return prodRam;
	}
	public void setProdRam(String prodRam) {
		this.prodRam = prodRam;
	}
	public String getProdRom() {
		return prodRom;
	}
	public void setProdRom(String prodRom) {
		this.prodRom = prodRom;
	}
	public String getProdDisplaySize() {
		return prodDisplaySize;
	}
	public void setProdDisplaySize(String prodDisplaySize) {
		this.prodDisplaySize = prodDisplaySize;
	}
	public String getProdColor() {
		return prodColor;
	}
	public void setProdColor(String prodColor) {
		this.prodColor = prodColor;
	}	
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "CartItem [id=" + id + ", prodid=" + prodid + ", url=" + url + ", prodName=" + prodName + ", prodTitle="
				+ prodTitle + ", prodPath=" + prodPath + ", prodCamara=" + prodCamara + ", prodBattery=" + prodBattery
				+ ", prodOfferPrice=" + prodOfferPrice + ", prodPrevPrice=" + prodPrevPrice + ", prodRam=" + prodRam
				+ ", prodRom=" + prodRom + ", prodDisplaySize=" + prodDisplaySize + ", prodColor=" + prodColor
				+ ", quantity=" + quantity + "]";
	}	
}