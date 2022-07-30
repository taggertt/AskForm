public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.name = "Илья";
        post.passport = "5555 №113344";
        post.patronymic = "Алексеевич";
        post.phone = "+7(951)-73-65-220";
        post.surname = "Иванов";
        post.subscription = true;
        post.birthday.day = 18;
        post.birthday.month = 6;
        post.birthday.year = 1987;
    }
}
