package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class SearchTrip extends BaseTest {

    @Test
    public void testSearchWithoutProvidingData() {
        HomePage homePage = new HomePage(driver);
        homePage.openPage();
        homePage.clickSearch();

        // Verifikasi terlebih dahulu, setelah melakukan search, harga pertama muncul
        String firstPrice = homePage.getFirstPrice();
        Assert.assertNotNull(firstPrice, "First price is not null");
        System.out.println("First Price: " + firstPrice);

    }
}