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
 * Класс описывает страницу 'Расписание и цены'
 */
public class Расписание_и_цены {
    private static Logger log = LoggerFactory.getLogger(Расписание_и_цены.class);
    static Расписание_и_цены instance;

    public static Расписание_и_цены getInstance() {
        return page(instance != null ? instance : new Расписание_и_цены());
    }

    public Расписание_и_цены() {
        //waitUntilFrameIsActive("");
        instance = this;
    }

    /**
     * Данный универсальный метод позволяет проверять кнопку на странице
     */
    public void check_button_exist(String button) {
        WebElement кнопка = Base.driver.findElement(By.xpath("//ul[@class='addition-menu']//a[text()='" + button + "']"));
        Assertions.assertEquals(button, кнопка.getText(),
                "Кнопка: '" + button + "' отсутсвует на странице");
    }

    /**
     * Данный универсальный метод позволяет проверять кнопки на странице
     */
    public void check_buttons_exist(List<String> buttons) {
        for (String button : buttons) {
            check_button_exist(button);
        }
    }
}
