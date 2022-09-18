package project.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static project.Base.driver;

public class Java_kurs {

    /**
     * Метод для проверки текста на странице
     */
    public void checkText(String text) {
        WebElement element = driver.findElement(By.xpath("//div [@class='main-filter-container']" +
                "//h2 [text() ='" + text + "']"));
        Assertions.assertEquals("Выберите уровень", element.getText(),
                "Текст сообщения не совпадает");//для коротких текстов

        //Assertions.assertTrue(element.getText().contains("Выберите"));// для длинных текстов
    }
}

