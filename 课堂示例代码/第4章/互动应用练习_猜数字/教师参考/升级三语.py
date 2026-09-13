from pathlib import Path
import re

root = Path(__file__).resolve().parents[1]
p = root/'GuessNumberPractice.java'
s = p.read_text(encoding='utf-8')
old_answers = ['private','GuessGame','this','maxAttempts - attempts','||','++','>','true','new GuessGame(secret, 5)','isOver','game.guess(number)','getSummary']
answers = {f'{i:02}': v for i,v in enumerate(old_answers,1)}
ru = [
'Укажите модификатор private для защиты загаданного числа.',
'Имя конструктора совпадает с именем класса; тип возвращаемого значения не указывается.',
'Используйте this, чтобы отличить поле текущего объекта от одноимённого параметра.',
'Оставшиеся попытки равны лимиту минус число использованных попыток.',
'Игра заканчивается при победе ИЛИ при исчерпании попыток.',
'Увеличьте счётчик на единицу после каждой допустимой догадки.',
'Проверьте, больше ли введённое число загаданного.',
'Запишите состояние победы после правильного ответа.',
'Создайте объект GuessGame с аргументами secret и 5.',
'Укажите имя метода, проверяющего завершение игры.',
'Вызовите метод guess объекта game с аргументом number.',
'Укажите имя метода, возвращающего итог игры.'
]
for i,r in enumerate(ru,1):
    s = re.sub(rf'(^[ \t]*// TODO{i:02}[^\n]*\n)',lambda m:m[0]+'    // RU: '+r+'\n',s,flags=re.M)

def add(old,new,num,answer,cn,ru,en):
    global s
    assert old in s,old
    indent = re.match(r'\s*',old)[0]
    hint = indent+f'// TODO{num}：{cn}\n'+indent+'// RU: '+ru+'\n'+indent+'// EN: '+en+'\n'
    s=s.replace(old,hint+new,1)
    answers[str(num)]=answer

add('    private int attempts;', '    private __TODO13__ attempts;',13,'int','填写保存已用次数的整数类型。','Укажите целочисленный тип счётчика попыток.','Fill in the integer type for the attempt count.')
add('    private boolean won;', '    private __TODO14__ won;',14,'boolean','填写保存胜负状态的布尔类型。','Укажите логический тип состояния победы.','Fill in the boolean type for the win state.')
add('        this.maxAttempts = maxAttempts;', '        this.maxAttempts = __TODO15__;',15,'maxAttempts','把构造参数保存到次数上限字段。','Сохраните параметр конструктора в поле лимита попыток.','Assign the constructor parameter to the attempt-limit field.')
add('        this.attempts = 0;', '        this.attempts = __TODO16__;',16,'0','新游戏尚未猜测，初始化次数。','Инициализируйте счётчик: в новой игре попыток ещё не было.','Initialize the count before any guesses have been made.')
add('        this.won = false;', '        this.won = __TODO17__;',17,'false','新游戏开始时尚未获胜。','В начале новой игры победы ещё нет.','The player has not won when a new game begins.')
add('    int getAttempts() { return attempts; }', '    int getAttempts() { return __TODO18__; }',18,'attempts','返回已用次数的字段。','Верните поле числа использованных попыток.','Return the field that stores attempts used.')
add('    boolean hasWon() { return won; }', '    boolean hasWon() { return __TODO19__; }',19,'won','返回胜利状态字段。','Верните поле состояния победы.','Return the win-state field.')
add('        if (number < secret) return -1;', '        if (number __TODO20__ secret) return -1;',20,'<','判断猜测是否小于答案。','Проверьте, меньше ли догадка загаданного числа.','Check whether the guess is below the answer.')
add('        Scanner input = new Scanner(System.in);', '        Scanner input = __TODO21__;',21,'new Scanner(System.in)','创建读取标准输入的 Scanner 对象。','Создайте объект Scanner для чтения из стандартного ввода.','Create a Scanner object that reads standard input.')
add('            String line = input.nextLine().trim();', '            String line = input.__TODO22__().trim();',22,'nextLine','填写读取一整行的方法名。','Укажите имя метода чтения целой строки.','Fill in the method name that reads a whole line.')
add('            if (number == 0) break;', '            if (number == 0) __TODO23__;',23,'break','输入 0 时退出当前游戏循环。','При вводе 0 выйдите из игрового цикла.','Exit the game loop when the player enters 0.')
add('            if (number < 1 || number > 20) {', '            if (number < 1 __TODO24__ number > 20) {',24,'||','小于 1 或大于 20 都是无效输入。','Числа меньше 1 или больше 20 недопустимы.','A number below 1 or above 20 is invalid.')

# Renumber by code order so students work from TODO01 to TODO24.
order = re.findall(r'__TODO(\d+)__',s)
assert len(order)==24 and len(set(order))==24
mapping={old:f'{i:02}' for i,old in enumerate(order,1)}
s=re.sub(r'TODO(\d+)',lambda m:'TODO'+mapping[m[1]],s)
s=s.replace('// Student version:', '// RU: Замените только __TODOxx__, остальной код оставьте без изменений.\n// Student version:')
s=s.replace('// The game class', '// RU: Класс игры хранит состояние и правила; главный класс отвечает за ввод и вывод.\n// The game class')
s=s.replace('// Return -1', '// RU: Верните -1, если число меньше ответа, 1 — если больше, и 0 — при совпадении.\n    // Return -1')
s=s.replace('// Call only while', '// RU: Вызывайте метод только до завершения игры и для чисел от 1 до 20.\n    // Call only while')
s=s.replace('// Use a random', '// RU: По умолчанию ответ случайный; аргумент 12 задаёт фиксированный ответ для проверки.\n        // Use a random')
s=s.replace('// Keep INPUT>', '// RU: Сохраните INPUT>, чтобы notebook распознавал запрос ввода.\n            // Keep INPUT>')
s=s.replace('// Input validation', '// RU: Обработка ошибок ввода уже предоставлена; изучайте прежде всего классы и объекты.\n            // Input validation')
translations={'You won!':'Вы победили!','Attempts:':'Попытки:','No attempts left!':'Попытки закончились!','Answer:':'Ответ:','Game stopped.':'Игра остановлена.','Attempts used:':'Использовано попыток:','The fixed answer must be within 1–20.':'Фиксированный ответ должен быть от 1 до 20.','Guess the Number':'Угадай число','Guess an integer from 1 to 20 in 5 attempts.':'Угадайте целое число от 1 до 20 за 5 попыток.','Enter 0 to quit; invalid input costs no attempt.':'Введите 0 для выхода; неверный ввод не расходует попытки.','Attempts left:':'Осталось попыток:','Enter an integer:':'Введите целое число:','Please enter an integer.':'Пожалуйста, введите целое число.','Out of range; enter 1–20.':'Вне диапазона; введите число от 1 до 20.','Too low!':'Слишком мало!','Too high!':'Слишком много!','Correct!':'Верно!'}
for en,russian in translations.items():
    # Add Russian before English in user-visible Java strings, keeping English test markers intact.
    s=s.replace('/ '+en, '/ '+russian+' / '+en)
p.write_text(s,encoding='utf-8')

generator=root/'教师参考/生成与验证.py'
g=generator.read_text(encoding='utf-8')
g=re.sub(r'^keys = .*$', 'keys = '+repr([answers[k] for k in order]),g,flags=re.M)
g=g.replace('==12','==24').replace('12 个 TODO','24 个 TODO').replace('12 TODOs','24 TODOs')
g=g.replace('类与对象_猜数字游戏_双语TODO.ipynb','类与对象_猜数字游戏_三语TODO.ipynb')
g=g.replace('## 4. 自测任务 / Self-check tasks','## 4. 自测任务 / Самопроверка / Self-check tasks')
g=g.replace('## Java 填空 / Java exercise','## Java 填空 / Заполните код Java / Java exercise')
g=g.replace('## 开始游戏 / Start the game','## 开始游戏 / Начать игру / Start the game')
g=g.replace('Fill the 24 TODOs', 'Заполните 24 пропуска TODO и выполните ячейку, чтобы сохранить Java-файл. Сохраните первую строку команды записи файла.\\n\\nFill the 24 TODOs')
g=g.replace('Save the previous cell,', 'Выполните предыдущую ячейку для сохранения кода, затем следующую для запуска игры. Отвечайте в поле ввода. Для новой игры запустите ячейку повторно. Для проверки задайте FIXED_ANSWER = "12".\\n\\nSave the previous cell,')
g=g.replace('# 参考答案 / Answer key','# 参考答案 / Ответы / Answer key')
generator.write_text(g,encoding='utf-8')
print('Updated Java exercise to 24 TODOs with trilingual hints and game messages.')
