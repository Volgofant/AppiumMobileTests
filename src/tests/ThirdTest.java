package tests;

import lib.Core;
import org.junit.Test;
import org.openqa.selenium.By;

public class ThirdTest extends Core {
    @Test
    public void testDelete() {
        waitForElementAndSendKeys(
                By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText"),
                "Java",
                "Error!!!",
                5
        );
        waitForElementAndClick(
                By.xpath("//*[@resource-id='org.wikipedia:id/search_results_list']//*[@text='Object-oriented programming language']"),
                "cannot find Xpath - element Java",
                15);
        waitForElementAndClick(
                By.xpath("//android.widget.ImageView[@content-desc=\"Add this article to a reading list\"]\n"),
                "cannot find 'add to reading list' element",
                5
        );
        waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Got it')]"),
                "cannot find GOT IT from ID",
                5
        );
        waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Create new')]"),
                "cannot use 'click new'",
                5
        );
        waitForElementAndSendKeys(
                By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText\n"),
                "Первый лист",
                "cant save list",
                5
        );
        waitForElementAndClick(
                By.xpath("//*[contains(@text, 'OK')]"),
                "cannot click 'OK'",
                5
        );
        waitForElementAndClick(
                By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]\n"),
                "cannot press 'Back'"
        );
        waitForElementAndClick(
                By.xpath("//*[@text='No thanks']"),
                "cant close 'Sync reading lists'",
                5
        );
        waitForElementAndClick(
                By.xpath("//android.widget.FrameLayout[@content-desc=\"My lists\"]/android.widget.ImageView\n"),
                "XX"
        );
        waitForElementAndClick(By.xpath("//*[@text='Первый лист']"),
                "cannot find my list"
        );
        swipeElementToLeft(
                By.xpath("//*[@text='Object-oriented programming language']"),
                "cannot swipe element"
        );
        waitForElementNotPresent(
                By.xpath("//*[@text='Object-oriented programming language']"),
                "element located");
    }
}
