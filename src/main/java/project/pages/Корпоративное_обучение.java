package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$x;
import static project.Base.driver;

public class Корпоративное_обучение {

    /**
     * Данный метод заполняет поля в форме "Оставить заявку на корпоративное обучение"
     */
    public Корпоративное_обучение request_for_corporate_training(String фио, String телефон, String почта) {
        WebElement поле_ФИО = driver.findElement
                (By.xpath("//div [@class='form-section']//input [@placeholder ='Фамилия, имя, отчество']"));
        WebElement поле_контактный_телефон = driver.findElement
                (By.xpath("//div [@class='form-section']//input [@placeholder ='Контактный телефон']"));
        WebElement поле_почта = driver.findElement
                (By.xpath("//div [@class='form-section']//input [@placeholder ='Контактный e-mail']"));

        поле_ФИО.sendKeys(фио);
        поле_контактный_телефон.sendKeys(телефон);
        поле_почта.sendKeys(почта);

        return new Корпоративное_обучение();
    }

    /**
     * Данный метод заполняет поля в форме "Убирем галочки на настоящим подтверждаю и я ознакомлен"
     */
    public Корпоративное_обучение chek() {
        WebElement chek_now = driver.findElement
                (By.xpath("//div[@class='jq-checkbox form-reg-agree checked']"));

        WebElement chek_acquainted = driver.findElement
                (By.xpath("//div[@class='jq-checkbox form-reg-two checked']"));

        chek_now.click();
        chek_acquainted.click();


        return new Корпоративное_обучение();
    }

    /**
     * Данный метод заполняет поля в форме "Оставить заявку на корпоративное обучение Имя и телефон"
     */
    public Корпоративное_обучение request_for_corporate_training(String фио, String телефон) {
        WebElement поле_ФИО = driver.findElement
                (By.xpath("//div [@class='form-section']//input [@placeholder ='Фамилия, имя, отчество']"));
        WebElement поле_контактный_телефон = driver.findElement
                (By.xpath("//div [@class='form-section']//input [@placeholder ='Контактный телефон']"));


        поле_ФИО.sendKeys(фио);
        поле_контактный_телефон.sendKeys(телефон);

        return new Корпоративное_обучение();
    }

}
