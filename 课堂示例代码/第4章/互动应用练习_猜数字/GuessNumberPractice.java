import java.util.Random;
import java.util.Scanner;

// 学生版：只替换 __TODOxx__，其他代码保持不变。
// RU: Замените только __TODOxx__, остальной код оставьте без изменений.
// Student version: replace only __TODOxx__; keep the other code unchanged.
// 游戏类负责规则和状态；主类负责键盘输入与屏幕输出。
// RU: Класс игры хранит состояние и правила; главный класс отвечает за ввод и вывод.
// The game class manages rules and state; the main class handles keyboard input and output.
class GuessGame {
    // TODO01：用私有修饰符保护答案。 / Protect the answer with the private modifier.
    // RU: Укажите модификатор private для защиты загаданного числа.
    __TODO01__ int secret;
    private int maxAttempts;
    // TODO02：填写保存已用次数的整数类型。
    // RU: Укажите целочисленный тип счётчика попыток.
    // EN: Fill in the integer type for the attempt count.
    private __TODO02__ attempts;
    // TODO03：填写保存胜负状态的布尔类型。
    // RU: Укажите логический тип состояния победы.
    // EN: Fill in the boolean type for the win state.
    private __TODO03__ won;

    // TODO04：构造方法与类同名，没有返回类型。 / A constructor has the class name and no return type.
    // RU: Имя конструктора совпадает с именем класса; тип возвращаемого значения не указывается.
    __TODO04__(int secret, int maxAttempts) {
        // TODO05：用 this 区分当前对象的字段和同名参数。 / Use this to distinguish the field from the parameter.
    // RU: Используйте this, чтобы отличить поле текущего объекта от одноимённого параметра.
        __TODO05__.secret = secret;
        // TODO06：把构造参数保存到次数上限字段。
        // RU: Сохраните параметр конструктора в поле лимита попыток.
        // EN: Assign the constructor parameter to the attempt-limit field.
        this.maxAttempts = __TODO06__;
        // TODO07：新游戏尚未猜测，初始化次数。
        // RU: Инициализируйте счётчик: в новой игре попыток ещё не было.
        // EN: Initialize the count before any guesses have been made.
        this.attempts = __TODO07__;
        // TODO08：新游戏开始时尚未获胜。
        // RU: В начале новой игры победы ещё нет.
        // EN: The player has not won when a new game begins.
        this.won = __TODO08__;
    }

    // TODO09：返回已用次数的字段。
    // RU: Верните поле числа использованных попыток.
    // EN: Return the field that stores attempts used.
    int getAttempts() { return __TODO09__; }
    int getRemaining() {
        // TODO10：剩余次数 = 最大次数 - 已用次数。 / Remaining attempts = limit minus attempts used.
    // RU: Оставшиеся попытки равны лимиту минус число использованных попыток.
        return __TODO10__;
    }
    // TODO11：返回胜利状态字段。
    // RU: Верните поле состояния победы.
    // EN: Return the win-state field.
    boolean hasWon() { return __TODO11__; }
    boolean isOver() {
        // TODO12：猜中或次数用完，任一成立即结束。 / End when the player has won OR used all attempts.
    // RU: Игра заканчивается при победе ИЛИ при исчерпании попыток.
        return won __TODO12__ attempts >= maxAttempts;
    }

    // 返回 -1 表示偏小，1 表示偏大，0 表示猜中。
    // RU: Верните -1, если число меньше ответа, 1 — если больше, и 0 — при совпадении.
    // Return -1 for too low, 1 for too high, and 0 for correct.
    // 调用前应确认游戏未结束且输入在 1–20 内。
    // RU: Вызывайте метод только до завершения игры и для чисел от 1 до 20.
    // Call only while the game is active and the guess is within 1–20.
    int guess(int number) {
        // TODO13：每次有效猜测增加一次计数。 / Increase the count for each valid guess.
    // RU: Увеличьте счётчик на единицу после каждой допустимой догадки.
        attempts__TODO13__;
        // TODO14：判断猜测是否小于答案。
        // RU: Проверьте, меньше ли догадка загаданного числа.
        // EN: Check whether the guess is below the answer.
        if (number __TODO14__ secret) return -1;
        // TODO15：判断输入是否大于答案。 / Check whether the guess is greater than the answer.
    // RU: Проверьте, больше ли введённое число загаданного.
        if (number __TODO15__ secret) return 1;
        // TODO16：猜中时记录胜利状态。 / Record the win when the guess is correct.
    // RU: Запишите состояние победы после правильного ответа.
        won = __TODO16__;
        return 0;
    }

    String getSummary() {
        if (won) return "猜中了！/ Вы победили! / You won! 猜测次数 / Попытки: / Attempts: " + attempts;
        if (isOver()) return "次数用完！/ Попытки закончились! / No attempts left! 答案 / Ответ: / Answer: " + secret;
        return "游戏已退出。/ Игра остановлена. / Game stopped. 已用次数 / Использовано попыток: / Attempts used: " + attempts;
    }
}

public class GuessNumberPractice {
    // 完整程序入口：点击 main 旁的运行按钮即可启动，无需填写此方法。
    // RU: Готовая точка входа: запустите main; этот метод заполнять не нужно.
    // EN: Complete entry point: run main; no blanks need to be filled in this method.
    public static void main(String[] args) {
        play(args);
    }

    // main 调用此方法执行交互流程。先完成所有 TODO，再运行 main。
    // RU: main вызывает этот метод для игры. Сначала заполните все TODO, затем запустите main.
    // EN: main calls this method to run the game. Complete all TODOs before running main.
    private static void play(String[] args) {
        // 默认随机出题；命令行传入 12 可固定答案，方便调试。
        // RU: По умолчанию ответ случайный; аргумент 12 задаёт фиксированный ответ для проверки.
        // Use a random answer by default; pass 12 as an argument for reproducible practice.
        int secret = args.length == 0 ? new Random().nextInt(20) + 1 : Integer.parseInt(args[0]);
        if (secret < 1 || secret > 20) {
            System.out.println("固定答案必须在 1–20 内。/ Фиксированный ответ должен быть от 1 до 20. / The fixed answer must be within 1–20.");
            return;
        }
        // TODO17：创建一个 GuessGame 对象，传入 secret 和 5 次机会。
    // RU: Создайте объект GuessGame с аргументами secret и 5.
        // Create a GuessGame object using secret and a limit of 5 attempts.
        GuessGame game = __TODO17__;
        // TODO18：创建读取标准输入的 Scanner 对象。
        // RU: Создайте объект Scanner для чтения из стандартного ввода.
        // EN: Create a Scanner object that reads standard input.
        Scanner input = __TODO18__;
        System.out.println("=== 猜数字 / Угадай число / Guess the Number ===");
        System.out.println("答案为 1–20 的整数，你有 5 次机会。/ Угадайте целое число от 1 до 20 за 5 попыток. / Guess an integer from 1 to 20 in 5 attempts.");
        System.out.println("输入 0 退出；无效输入不扣次数。/ Введите 0 для выхода; неверный ввод не расходует попытки. / Enter 0 to quit; invalid input costs no attempt.");

        // TODO19：调用判断游戏是否结束的方法，填写方法名。
    // RU: Укажите имя метода, проверяющего завершение игры.
        // Fill in the method name that checks whether the game is over.
        while (!game.__TODO19__()) {
            System.out.println("剩余次数 / Осталось попыток: / Attempts left: " + game.getRemaining());
            // INPUT> 同时供 notebook 识别输入时机，保留此前缀。
            // RU: Сохраните INPUT>, чтобы notebook распознавал запрос ввода.
            // Keep INPUT> so the notebook can detect when to request input.
            System.out.println("INPUT> 请输入整数 / Введите целое число: / Enter an integer:");
            if (!input.hasNextLine()) break;
            // TODO20：填写读取一整行的方法名。
            // RU: Укажите имя метода чтения целой строки.
            // EN: Fill in the method name that reads a whole line.
            String line = input.__TODO20__().trim();
            int number;
            // 输入校验已提供，重点学习类与对象。
            // RU: Обработка ошибок ввода уже предоставлена; изучайте прежде всего классы и объекты.
            // Input validation is provided so you can focus on classes and objects.
            try {
                number = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("请输入整数。/ Пожалуйста, введите целое число. / Please enter an integer.");
                continue;
            }
            // TODO21：输入 0 时退出当前游戏循环。
            // RU: При вводе 0 выйдите из игрового цикла.
            // EN: Exit the game loop when the player enters 0.
            if (number == 0) __TODO21__;
            // TODO22：小于 1 或大于 20 都是无效输入。
            // RU: Числа меньше 1 или больше 20 недопустимы.
            // EN: A number below 1 or above 20 is invalid.
            if (number < 1 __TODO22__ number > 20) {
                System.out.println("范围错误，请输入 1–20。/ Вне диапазона; введите число от 1 до 20. / Out of range; enter 1–20.");
                continue;
            }
            // TODO23：调用 game 的 guess 方法，传入 number，获得判断结果。
    // RU: Вызовите метод guess объекта game с аргументом number.
            // Call guess on game with number and store its result.
            int result = __TODO23__;
            if (result < 0) System.out.println("太小了！/ Слишком мало! / Too low!");
            else if (result > 0) System.out.println("太大了！/ Слишком много! / Too high!");
            else System.out.println("正确！/ Верно! / Correct!");
        }
        // TODO24：调用总结方法，填写方法名。 / Fill in the summary method name.
    // RU: Укажите имя метода, возвращающего итог игры.
        System.out.println(game.__TODO24__());
        input.close();
    }
}
