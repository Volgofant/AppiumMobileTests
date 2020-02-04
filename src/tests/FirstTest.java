package tests;

import lib.Core;
import org.junit.Test;
import org.openqa.selenium.By;


public class FirstTest extends Core {
    @Test
    public void testBackground() {
        waitForElementAndSendKeys(
                By.xpath("//*[contains(@text,'Search Wikipedia')]"),
                "Java",
                "Error!!!",
                5
        );
        waitForElementPresent(
                By.xpath("//*[@resource-id='org.wikipedia:id/search_results_list']//*[@text='Object-oriented programming language']"),
                "cannot find Xpath - element Java",
                15);
        driver.runAppInBackground(2); //отправили в бэкграунд, через 2 секунды вернули и проверили статью
        waitForElementPresent(
                By.xpath("//*[@resource-id='org.wikipedia:id/search_results_list']//*[@text='Object-oriented programming language']"),
                "cannot find article after returning from background",
                15);
    }


}
