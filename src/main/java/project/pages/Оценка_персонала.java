package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static project.Base.driver;

public class Оценка_персонала {

    /**
     * Данный метод заполняет поля в форме "Узнать стоимость разработки теста"
     */
    public Оценка_персонала заполнить_форму (String фио, String телефон, String почта) {
        //WebElement поле_ФИО = $x("//div [@class='form-section']//input [@name ='form_text_687']"); // так должно быть
        WebElement поле_ФИО = driver.findElement
                (By.xpath("//div [@class='form-section']//input [@name ='form_text_687']"));
        WebElement поле_контактный_телефон = driver.findElement
                (By.xpath("//div [@class='form-section']//input [@name ='form_text_688']"));
        WebElement поле_почта = driver.findElement
                (By.xpath("//div [@class='form-section']//input [@name ='form_email_689']"));

        поле_ФИО.sendKeys(фио);
        поле_контактный_телефон.sendKeys(телефон);
        поле_почта.sendKeys(почта);

        return new Оценка_персонала();
    }
}
