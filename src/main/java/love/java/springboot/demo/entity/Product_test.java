package love.java.springboot.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@Entity
//@Table(name = "Product_test")
@EnableAutoConfiguration
public class Product_test {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRD_SEQ")
	@SequenceGenerator(sequenceName = "prd_sequence", allocationSize = 1, name = "PRD_SEQ")
	private int productId;

	@Column(name = "prd_name")
	private String productName;

	@Column(name = "prd_price")
	private int productPrice;

	@Column(name = "prd_quantity")
	private int productQty;

	@Column(name = "prd_status")
	private String productStatus;

	public Product_test() {

	}

	public Product_test(int productId, String productName, int productPrice, int productQty, String productStatus) {
		// super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQty = productQty;
		this.productStatus = productStatus;
	}

	public Product_test(String productName, int productPrice, int productQty, String productStatus) {
		// super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQty = productQty;
		this.productStatus = productStatus;
	}

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

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQty() {
		return productQty;
	}

	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}

	public String getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	@Override
	public String toString() {
		return "Product_test [productId=" + productId + ", productName=" + productName + ", productPrice="
				+ productPrice + ", productQty=" + productQty + ", productStatus=" + productStatus + "]";
	}
	
	
}
