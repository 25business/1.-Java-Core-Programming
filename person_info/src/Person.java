public class Person {
    String first_name;
    String last_name;
    int year_of_birth;

    boolean isOlderThan(Person p2) {
        return year_of_birth < p2.year_of_birth;
    }

    boolean isAdult() {
        return 2022 - year_of_birth >= 18;
    }

    int getAge() {
        return 2022 - year_of_birth;
    }
}
