package MODEL;

import java.util.Date;

public class Camel extends RidingAnimal{
    public Camel(Date birthDate, String comands, String name, int id) {
        super(birthDate, comands, name, id);
    }

    @Override
    public String toString() {
        String type = Camel.class.getSimpleName();
        return type +
                ", birthDate=" + this.getBirthDate() +
                ", comands='" + this.getComands() + '\'' +
                ", name='" + this.getName() + '\'' +
                ", id=" + this.getId();
    }
}
