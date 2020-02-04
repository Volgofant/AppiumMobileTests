package tests;

import lib.Core;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class FourthTest extends Core {
    private String xpathOfElement = "//*[@resource-id='org.wikipedia:id/page_list_item_title']";
    @Test
    public void testFoundResults() {
        waitForElementAndSendKeys(
                By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText"),
                "Linkin Park Diskography",
                "Error!!!",
                5
        );
        waitForElementPresent(
                By.xpath(xpathOfElement),
                "cannot find Xpath - element Java",
                15);
        int amount_of_search_results = getAmountOfElements(By.xpath(xpathOfElement));

        Assert.assertTrue(
                "we found too few results!",
                amount_of_search_results > 0
        );

    }
}
