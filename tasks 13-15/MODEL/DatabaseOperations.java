package MODEL;

import VIEW.View;

import java.util.Date;

public interface DatabaseOperations {

    void addComands(Animal animal, String comands);

    void addAnimal(Counter id, View view);

    String showComands(Animal animal);

}
