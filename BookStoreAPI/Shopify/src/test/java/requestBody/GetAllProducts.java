package requestBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetAllProducts {

	private String productName;
	private int minPrice;
	private int maxPrice;
	private ArrayList<String> productCategory;
	private ArrayList<String> productSubCategory;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(int minPrice) {
		this.minPrice = minPrice;
	}
	public int getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(int maxPrice) {
		this.maxPrice = maxPrice;
	}
	public ArrayList<String> getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(ArrayList<String> productCategory) {
		this.productCategory = productCategory;
	}
	public ArrayList<String> getProductSubCategory() {
		return productSubCategory;
	}
	public void setProductSubCategory(ArrayList<String> productSubCategory) {
		this.productSubCategory = productSubCategory;
	}
	
	
	
}
