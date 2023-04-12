package MODEL;

import java.util.Date;

public class Dog extends HomeAnimal {


    public Dog(Date birthDate, String comands, String name, int id) {
        super(birthDate, comands, name, id);
    }


    @Override
    public String toString() {
        String type = Dog.class.getSimpleName();
        return type +
                ", birthDate=" + this.getBirthDate() +
                ", comands='" + this.getComands() + '\'' +
                ", name='" + this.getName() + '\'' +
                ", id=" + this.getId();
    }
}
