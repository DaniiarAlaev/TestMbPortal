Feature: Тестирование тестового портала Мбанк Пупкин И. на лимиты

  Background:
    Given пользователь в тестовом портале Пупкин Иванов

    @Ivan
    Scenario: Тестирование на упор лимитов(перевод между счетами)
      When пользователь кликает на перевод между счетами
      And нажать на поле выбора счета
      And выбирает второй счет
      And ввод суммы
      And кликнуть на продолжить у Пупкина
      Then кликнуть на перевести у Пупкина

      @Ivan
      Scenario: упор на лимит при переводе по номеру телефона
        When пользователь кликает на перевод по номеру телефона
        And ввести номер телефона получателя Пупкин Иван
        And кликнуть на продолжить в переводе по номеру телефона Пупкин Иван
        And ввести сумму платежа Пупкин Иван
        And кликнуть на продолжить после ввода суммы Пупкин Иван
      And кликнуть перевести в переводе по номеру телефона
