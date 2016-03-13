package com.vsii.tsc.TSCSelenium06.tranglt.Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.vsii.tsc.TSCSelenium06.tranglt.Pages.Cart;
import com.vsii.tsc.TSCSelenium06.tranglt.Pages.Product;
import org.openqa.selenium.By;

public class AddToCart extends TestBase {
	Cart cart = new Cart();
	Product product = new Product();
	Product product_2 = new Product();
	Product product_3 = new Product();
	Product product1 = new Product();
	Product product2 = new Product();
	Product product3 = new Product();

	// Case5: thuc hien add to cart
	// Sau khi add xong, kiem tra product trong cart co dung la product da thuc
	// hien add khong
	@Test(priority = 0)
	public void checkAddToCart() throws InterruptedException {
		cart.setDriver(driver);
		product.setDriver(driver);
		driver.get(urlBase + "/index.php");
		cart.clickProduct1();
		Thread.sleep(3000);
		product1 = product.getProduct1Info(product);
		product.close();
		driver.get(urlBase + "/index.php?controller=order");
		 Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='cart_summary']/tbody/tr[1]/td[2]/p")).getText(),
		 product1.getProductName());
		 //Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='cart_summary']/tbody/tr[1]/td[2]/small/a")).getText(),
		 //product2.getProductAttributes());
		 Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='cart_summary']/tbody/tr[1]/td[4]/span/span")).getText(),
		 product1.getProductPrice());
	}

	// Case 6: Kiểm tra tổng giá tiền của đơn hàng đúng bằng tổng các sản phẩm
	// được chọn không.
	 @Test(priority=1)
	public void checkPriceTotal() throws InterruptedException {
		cart.setDriver(driver);
		product.setDriver(driver);
		product_2.setDriver(driver);
		product_3.setDriver(driver);
		driver.get(urlBase + "/index.php");
		cart.clickProduct1();
		Thread.sleep(3000);
		product1 = product.getProduct1Info(product);
		product.close();
		cart.clickProduct2();
		Thread.sleep(3000);
		product2 = product_2.getProduct1Info(product_2);
		product.close();
		cart.clickProduct3();
		Thread.sleep(3000);
		product3 = product_3.getProduct1Info(product_3);
		product.close();
		driver.get(urlBase + "/index.php?controller=order");

		double price1 = convertToPrice(product1.getProductPrice());
		double price2 = convertToPrice(product2.getProductPrice());
		double price3 = convertToPrice(product3.getProductPrice());
		double shipPrice = convertToPrice(product1.getProductShipping());
		double total = price1 + price2 + price3 + shipPrice;
		Assert.assertEquals(total, convertToPrice(driver.findElement(By.xpath(".//*[@id='total_price']")).getText()));

	}

	public double convertToPrice(String price) {
		double pr = 0;
		String pr2 = price.substring(1);
		pr = Double.parseDouble(pr2);
		return pr;
	}

}
