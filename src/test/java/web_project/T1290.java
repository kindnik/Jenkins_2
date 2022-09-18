package web_project;

import project.pages.MainPage;
import project.pages.Оценка_персонала;

import static automationTesting.allureReport.Steps.result;
import static automationTesting.allureReport.Steps.step;

public class T1290 {
    private Оценка_персонала оценка_персонала;
    private MainPage mainPage;

    public void scenario_T1290() {
        step("[Step 1]: Перейти на вкладку 'Оценка персонала'", () -> {
            mainPage = new MainPage();
            оценка_персонала = mainPage.открыть_оценка_персонала();

            result("Перешли на вкладку 'Оценка персонала'");
        });

        step("[Step 2]: Заполнить форму 'Узнать стоимость разработки тестае'", () -> {
            оценка_персонала.заполнить_форму("петров юрий иванович"
                    , "000005565464"
                    , "nok@mail.ru");

            result("Форма 'Узнать стоимость разработки теста' заполнена");
        });

    }// создание метода  public void метод


}

