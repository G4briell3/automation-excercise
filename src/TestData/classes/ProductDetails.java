package TestData.classes;

import Utils.Reader;

public class ProductDetails 
{
 private String productName;
 private String productCategory;
 private String productPrice;
 private String productAvailability;
 private String productCondition;
 private String productBrand;
 
 public ProductDetails(String details)
 {
	 this.productName=Reader.json(details).get("product name").toString();
	 this.productCategory=Reader.json(details).get("category").toString();
	 this.productPrice=Reader.json(details).get("price").toString();
	 this.productAvailability=Reader.json(details).get("availability").toString();
	 this.productCondition=Reader.json(details).get("condition").toString();
	 this.productBrand=Reader.json(details).get("brand").toString();
 }

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public String getProductCategory() {
	return productCategory;
}

public void setProductCategory(String productCategory) {
	this.productCategory = productCategory;
}

public String getProductPrice() {
	return productPrice;
}

public void setProductPrice(String productPrice) {
	this.productPrice = productPrice;
}

public String getProductAvailability() {
	return productAvailability;
}

public void setProductAvailability(String productAvailability) {
	this.productAvailability = productAvailability;
}

public String getProductCondition() {
	return productCondition;
}

public void setProductCondition(String productCondition) {
	this.productCondition = productCondition;
}

public String getProductBrand() {
	return productBrand;
}

public void setProductBrand(String productBrand) {
	this.productBrand = productBrand;
}
 
 
}
