public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String city;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public PersonBuilder setSurname (String surname) {
        this.surname = surname;
        return this;
    }
    public PersonBuilder setAge (int age) {
        if (age < 0 || age > 105) {
            throw new IllegalArgumentException("You entered the wrong age");
        } else {
            this.age = age;
            return this;
        }

    }
    public PersonBuilder setCity (String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        return new Person(this);
    }



}