package web_project;

import project.pages.MainPage;
import project.pages.Контакты;

import java.util.Arrays;

import static io.qameta.allure.Allure.step;

public class T1286 {
    private MainPage mainPage;
    private Контакты контакты;

    String[] города = {"Москва", "Санкт-Петербург", "Омск"};

    public void scenario_T1286() {

        step("[Steps 1-2]: Нажать на иконку 'Три полоски' в правом верхнем углу, которое открывает правую панель. " +
                "2. В правой панели выбрать раздел 'Контакты' ", () -> {
            mainPage = new MainPage();
            контакты = mainPage.userGoToPageContacts();


        });

        step("[Step 3]: Проверить, что отображаются кнопки: '" + города + "'", () -> {
            контакты.checkButtonCities(Arrays.asList(города));


        });

        step("[Step 4]: Проверить, что не отображается кнопка: 'Екатеринбург'", () -> {
            контакты.checkButtonCityNotSee("Москва");


        });
    }
}
