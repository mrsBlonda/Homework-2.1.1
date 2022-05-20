import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String city;

    public Person(PersonBuilder personBuilder) {
        this.name = personBuilder.name;
        this.surname = personBuilder.surname;
        this.age = personBuilder.age;
        this.city = personBuilder.city;
        if (personBuilder.name == null || personBuilder.surname == null) {
            throw new IllegalArgumentException("Enter your name and surname");
        }
    }

    public boolean hasAge() {
        return age >= 0;
    }

    public boolean hasAddress() {
        return city != null;
    }

    public void setAddress(String city) {
        this.city = city;
    }

    public void happyBirthday() {
        if (age >= 0) {
            age++;
        } else {
            System.out.println("Возраст неизвестен");
        }
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

    public String getCity() {
        return this.city;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder p = new PersonBuilder().setSurname(surname);
        return p;
    }

    @Override
    public String toString() {
        return "Name - " + name +
                "\nSurname - " + surname +
                "\nAge - " + age +
                "\nCity - " + city;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        return other.name.equals(name) && other.surname.equals(surname)
                && other.age == age && other.city.equals(city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, city);
    }


}
