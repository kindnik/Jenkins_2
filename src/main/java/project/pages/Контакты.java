package project.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import project.Base;

import java.util.List;

import static com.codeborne.selenide.Selenide.page;

/**
 * Класс описывает страницу 'Контакты'
 */
public class Контакты {

    private static Logger log = LoggerFactory.getLogger(Контакты.class);
    static Контакты instance;

    public static Контакты getInstance() {
        return page(instance != null ? instance : new Контакты());
    }

    public Контакты() {
        //waitUntilFrameIsActive("");
        instance = this;
    }

    /**
     * Данный метод проверяет город, который есть на странице
     */
    public Контакты checkButtonCity(String city) {
        WebElement кнопка = Base.driver.findElement(By.xpath("//ul[@class='addition-menu']//a[text()='" + city + "']"));
        Assertions.assertEquals(city, кнопка.getText(),
                "Элемент '" + city + "' не найден на странице");
        return this;
    }

    /**
     * Данный метод проверяет города, которых нет на странице
     */
    public Контакты checkButtonCityNotSee(String city) {
        List<WebElement> кнопка = Base.driver.findElements(By.xpath("//ul[@class='addition-menu']//a[text()='" + city + "']"));
        Assertions.assertEquals(0, кнопка.size(),
                "Элемент '" + city + "' найден на странице");
        return this;
    }

    /**
     * Данный метод проверяет города, которые есть на странице
     */
    public Контакты checkButtonCities(List<String> cities) {
        for (String city : cities) {
            checkButtonCity(city);
        }
        return this;
    }
}
