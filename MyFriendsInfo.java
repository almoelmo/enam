package kirill.tasks_oop.fourthTask;

public enum MyFriendsInfo {

    Kirill("+3456787654", 25),
    Maxim("+45678987654", 22),
    Alex("+76545678997", 24);

    ;
    //Тут хранится важная информация о моих друзьях(имя и возраст). Чтобы быстро получить к этим данным доступ, тоесть тут могут быть и другие контактные и личные данные
    private String phoneNumber;
    private int age;

    MyFriendsInfo(String phoneNumber, int age) {
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }
}
