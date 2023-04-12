package VIEW;

import MODEL.Animal;
import MODEL.AnimalStorage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Terminal implements IView {

    @Override
    public int mainMenu() {
        while (true) {
            try {
                System.out.println("MENU");
                System.out.println("1 Add animal");
                System.out.println("2 View commands list");
                System.out.println("3 Teach new commands");
                System.out.print("Choose menu number: ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int num = Integer.parseInt(reader.readLine());
                if (num > 0 && num < 4) return num;
                else System.out.println("Try one more time");
            } catch (InputMismatchException | IOException e) {
                System.out.println("Try one more time");
            }
        }

    }

    @Override
    public int animalTypeMenu() {
        while (true) {
            try {
                System.out.println("ANIMAL TYPES");
                System.out.println("1 Dog");
                System.out.println("2 Cat");
                System.out.println("3 Mouse");
                System.out.println("4 Horse");
                System.out.println("5 Camel");
                System.out.println("6 Donkey");
                System.out.println("Choose animal type: ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int num = Integer.parseInt(reader.readLine());
                if (num > 0 && num < 7) return num;
                else System.out.println("Try one more time");
                return num;
            } catch (InputMismatchException | IOException e) {
                System.out.println("Try one more time");
            }
        }
    }

    @Override
    public void showComands(String comands) {
        System.out.println(comands);
    }

    @Override
    public int whichAnimal() {
        while (true) {
            try {
                System.out.println("Insert ID: ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int num = Integer.parseInt(reader.readLine());
                return num;
            } catch (InputMismatchException | IOException e) {
                System.out.println("Try one more time");
            }
        }
    }

    @Override
    public String enterName() {
        String s = "Enter Name:";
        return enter(s);
    }

    @Override
    public String enterComands() {
        String s = "Enter Commands:";
        return enter(s);
    }

    @Override
    public Date enterDate() {
        while (true) {
            try {
                System.out.println("Enter date dd.mm.yyyy");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String result = reader.readLine();
                SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
                return format.parse(result);
            } catch (InputMismatchException | ParseException | IOException e) {
                System.out.println("Try one more time");
            }
        }
    }

    public String enter(String s) {
        while (true) {
            System.out.println(s);
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                return reader.readLine();
            } catch (IOException e) {
                System.out.println("Try one more time");
            }
        }
    }

    @Override
    public void alert(String s) {
        System.out.println(s);
    }
}
