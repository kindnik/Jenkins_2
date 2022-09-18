package web_project;

import project.pages.MainPage;
import project.pages.Корпоративное_обучение;

import static automationTesting.allureReport.Steps.result;
import static automationTesting.allureReport.Steps.step;

public class T1289 {
    private MainPage mainPage;
    private Корпоративное_обучение корпоративное_обучение;

    public void scenario_T1289() {
        step("[Step 1]: Перейти на вкладку 'Корпоративное обучение'", () -> {
            mainPage = new MainPage();
            корпоративное_обучение = mainPage.userGoToPageCorporateTraining();

            result("Перешли на вкладку 'Корпоративное обучение'");
        });

        step("[Step 2]: Заполнить форму 'Оставить заявку на корпоративное обучение'", () -> {

            корпоративное_обучение.request_for_corporate_training("Елена Анженко Олеговна"
                    , "89043351485"
                    , "norm@mail.ru");

            result("Форма 'Оставить заявку на корпоративное обучение' заполнена");
        });
    }
}
