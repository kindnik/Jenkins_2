package project.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import project.Base;

import static com.codeborne.selenide.Selenide.page;

/**
 * Класс описывает страницу 'Каталог курсов по направлениям'
 */
public class Каталог_курсов_по_направлениям {

    private static Logger log = LoggerFactory.getLogger(Каталог_курсов_по_направлениям.class);
    static Каталог_курсов_по_направлениям instance;

    public static Каталог_курсов_по_направлениям getInstance() {
        return page(instance != null ? instance : new Каталог_курсов_по_направлениям());
    }

    public Каталог_курсов_по_направлениям() {
        //waitUntilFrameIsActive("");
        instance = this;
    }

    /**
     * Метод предназначен для ввода курсв в поисковую строку и его дальнейший выбор
     */
    public Каталог_курсов_по_направлениям searchCourse(String course) {
        WebElement полеВвода = Base.driver.findElement(By.xpath("//div[@class='search container']//input"));
        полеВвода.sendKeys(course);
        Base.driver.findElements(By.xpath("//div[@class='search container']//input")).get(1).click();
        return this;
    }

    /**
     * Метод для проверки отображения курсов на странице
     */
    public void checkCourse(String course) {
        Assertions.assertTrue(Base.driver.findElement(By.xpath("//div[@class='search-item']"))
                .getText().contains(course), "Курс: '" + course + "' не отобразился на странице");
    }

}
