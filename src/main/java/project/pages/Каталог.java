package project.pages;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import project.Base;

public class Каталог extends LuxoftHeader<Каталог> {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private WebElement комплексные_программы =
            Base.driver.findElement(By.xpath("//ul[@class='addition-menu']/li[2]/a"));

    @Override
    protected void chooseTab() {
        WebElement каталог =
                Base.driver.findElement(By.xpath("//a[text()='Каталог']"));
        каталог.click();
    }

    /**
     * Метод предназначен для перехода на вкладку "Направлние"
     */
    public Направление нажать_направление() {
        WebElement направление =
                Base.driver.findElement(By.xpath("//li[@class='active']//a"));
        направление.click();
        return new Направление();
    }


    /**
     * Метод предназначен для перехода на вкладку "КомплексныеПрограммы"
     */
    public КомплексныеПрограммы комплексныеПрограммы() {
        комплексные_программы.click();
        return new КомплексныеПрограммы();
    }

    public class Направление {
    }

    public class КомплексныеПрограммы {

    }
}
