package web_project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import project.pages.MainPage;
import project.pages.Расписание_и_цены;

import java.util.Arrays;


import static io.qameta.allure.Allure.step;
import static project.pages.MainPage.Вкладки.Расписание;


public class T1285 {
    private Logger log = LoggerFactory.getLogger(this.getClass());
    private MainPage mainPage;
    private Расписание_и_цены расписание_и_цены;

    String[] кнопи = {"Расписание", "Бесплатные семинары", "Онлайн-курсы"};

    public void scenario_T1285() {
        step("[Step 1]: Перейти на вкладку 'Расписание'", () -> {
            mainPage = new MainPage();
            расписание_и_цены = mainPage
                    .userGoToPage(Расписание)
                    .return_to_page(new Расписание_и_цены());


        });

        step("[Step 2]: Проверить отображение кнопок 'Расписание', 'Бесплатные семинары' и 'Онлайн-курсы'", () -> {
            расписание_и_цены.check_buttons_exist(Arrays.asList(кнопи));


        });
    }
}
