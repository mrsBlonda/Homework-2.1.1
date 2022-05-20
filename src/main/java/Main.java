public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Anna")
                .setSurname("Ilina")
                .setAge(31)
                .setCity("Sidney")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Irina")
                .build();

        System.out.println(mom);
        System.out.println(son);


        try {
            // Не хватает обязательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}