package MODEL;

import java.util.Date;

public abstract class Animal {

    private Date birthDate;
    private String comands;
    private String name;
    private int id;

    public Animal(Date birthDate, String comands, String name, int id) {
        this.birthDate = birthDate;
        this.comands = comands;
        this.name = name;
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void doSomeCommand() {

    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getComands() {
        return comands;
    }

    public String getName() {
        return name;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setComands(String comands) {
        this.comands = comands;
    }

    public void setName(String name) {
        this.name = name;
    }

}
