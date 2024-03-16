package com.jsp.jdbc.HibernateProject.HibernateProject__Product_db_QueryInterface;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
		private int productId;
		private String productName;
		private String productBrand;
		private String productCatagory;
		private int productPrice;
		private String productStatus;
		public int getProductId() {
			return productId;
		}
		public void setProductId(int productId) {
			this.productId = productId;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public String getProductBrand() {
			return productBrand;
		}
		public void setProductBrand(String productBrand) {
			this.productBrand = productBrand;
		}
		public String getProductCatagory() {
			return productCatagory;
		}
		public void setProductCatagory(String productCatagory) {
			this.productCatagory = productCatagory;
		}
		public int getProductPrice() {
			return productPrice;
		}
		public void setProductPrice(int productPrice) {
			this.productPrice = productPrice;
		}
		public String getProductStatus() {
			return productStatus;
		}
		public void setProductStatus(String productStatus) {
			this.productStatus = productStatus;
		}
		@Override
		public String toString() {
			return "Product [productId=" + productId + ", productName=" + productName + ", productBrand=" + productBrand
					+ ", productCatagory=" + productCatagory + ", productPrice=" + productPrice + ", productStatus="
					+ productStatus + "]";
		}
		
		
		
}
