package MODEL;

import java.util.Date;

public class Cat extends HomeAnimal {

    public Cat(Date birthDate, String comands, String name, int id) {
        super(birthDate, comands, name, id);
    }

    @Override
    public String toString() {
        String type = Cat.class.getSimpleName();
        return type +
                ", birthDate=" + this.getBirthDate() +
                ", comands='" + this.getComands() + '\'' +
                ", name='" + this.getName() + '\'' +
                ", id=" + this.getId();
    }
}
