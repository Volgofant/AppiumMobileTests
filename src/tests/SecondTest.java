package tests;

import lib.Core;
import org.junit.Test;
import org.openqa.selenium.By;

public class SecondTest extends Core {

    @Test
    public void testSwipe() {
        waitForElementAndSendKeys(
                By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText"),
                "Appium",
                "Error!!!",
                5
        );
        waitForElementAndClick(
                By.xpath("//*[@resource-id='org.wikipedia:id/search_results_list']//*[@text='Appium']"),
                "cannot find Xpath - element Java",
                15);
        swipeUpToFindElement(
                By.xpath("//*[@text='View page in browser']"),
                "Test error message",
                20
        );

    }

}
