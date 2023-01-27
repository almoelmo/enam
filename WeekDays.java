package kirill.tasks_oop.fourthTask;

public enum WeekDays {
    //Можно использовать для определения дня недели и составлять расписание в зависимости от дня
    MONDAY ("Понедельник"),
    TUESDAY ("Вторник"),
    WEDNESDAY ("Среда"),
    THURSDAY ("Четверг"),
    FRIDAY ("Пятница"),
    SATURDAY ("Суббота"),
    SUNDAY ("Воскресенье");

    private String name;

    WeekDays(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
