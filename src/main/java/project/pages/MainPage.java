package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import project.Base;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPage extends Base {
    private static Logger log = LoggerFactory.getLogger(MainPage.class);
    static MainPage instance;
    public static MainPage getInstance() {
        return page(instance != null ? instance : new MainPage());
    }

    public MainPage() {
        //waitUntilFrameIsActive("");
        instance = this;
    }

    public enum Вкладки {
        Каталог("Каталог")
        , Расписание("Расписание")
        , Корпоративное_обучение("Корпоративное обучение")
        , Оценка_персонала("Оценка персонала")
        , Консалтинг("Консалтинг")
        , IT_гуру("IT-гуру");

        private String имя_вкладки;

        Вкладки(String name) {
            имя_вкладки = name;
        }
    }

    /**
     * Данный универсальный метод позволяет нажимать на различные вкладки
     */
    public MainPage userGoToPage(Вкладки имя_вкладки) {
        WebElement требуемая_вкладка = driver.findElement(By.xpath("//a[text()='" + имя_вкладки + "']"));
        требуемая_вкладка.click();
        return this;
    }

    /**
     * Данный метод переходит на страницу "Контакты"
     */
    public Контакты userGoToPageContacts() {
        WebElement праваяВверхняяПанель = driver.findElement(By.xpath("//div[@class='header__control _nav']"));
        праваяВверхняяПанель.click();
        WebElement контакты = driver.findElement(By.xpath("//li//a[text()='Контакты']"));
        контакты.click();
        return new Контакты();
    }

    /**
     * Данный метод переходит на страницу "Корпоративное обучение"
     */
    public Корпоративное_обучение userGoToPageCorporateTraining() {
        WebElement корпоративное_обучение = driver.findElement
                (By.xpath("//ul [@class='navigation__list']//a [text()='Корпоративное обучение']"));
        корпоративное_обучение.click();
        return new Корпоративное_обучение();
    }

    /**
     * Данный метод переходит на страницу "Оценка персонала"
     */
    public Оценка_персонала открыть_оценка_персонала () {
        WebElement оценка_персонала = driver.findElement
                (By.xpath("//ul [@class='navigation__list']//a [text()='Оценка персонала']"));
        оценка_персонала.click();
        return new Оценка_персонала();
    }

    /**
     * Данный метод переходит на страницу "Java"
     */
    public Java_kurs открыть_курсы_Java () {
        WebElement открыть_курсы_Java = driver.findElement
                (By.xpath("//ul [@class='search-phrase__list']//a [@href='/training/katalog_kursov/razrabotka_po_java/']"));
        открыть_курсы_Java.click();
        return new Java_kurs();
    }



    public <T> T return_to_page(T existingClassInstance) {
        return page(existingClassInstance);
    }

}
