package web_project;

import project.pages.MainPage;
import project.pages.Корпоративное_обучение;

import static automationTesting.allureReport.Steps.result;
import static automationTesting.allureReport.Steps.step;

public class T1292 {
    private MainPage mainPage;
    private Корпоративное_обучение корпоративное_обучение;

    public void scenario_T1292() {
        step("[Step 1]: Перейти на вкладку 'Корпоративное обучение'", () -> {
            mainPage = new MainPage();
            корпоративное_обучение = mainPage.userGoToPageCorporateTraining();

            result("Перешли на вкладку 'Корпоративное обучение'");
        });

        step("[Step 2]: убрать галочки настоящим я подтверждаю и ознакомлен'", () -> {

            корпоративное_обучение.chek();

            result("убрать галочки настоящим я подтверждаю и ознакомлен");
        });

        step("[Step 3]: Заполнить форму 'Оставить заявку на корпоративное обучение ФИО и телефон'", () -> {

            корпоративное_обучение.request_for_corporate_training("Ошурков Никита Юрьевич"
                    , "89043351485");

            result("Форма 'Оставить заявку на корпоративное обучение' заполнена ФИО и телефон");
        });
    }
}
