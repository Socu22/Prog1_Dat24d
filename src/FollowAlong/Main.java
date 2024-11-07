package FollowAlong;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Location l = new Location(222, 2342);
        PetRock rock = new PetRock("Rocky", 2.3, l);

        // Work with Gson Library
        Gson gson = new Gson();

        // Convert to JSON and print it
        String myJson = gson.toJson(rock);
        System.out.println(myJson);

        // Write JSON to a file
        try (FileWriter writer = new FileWriter("src\\FollowAlong\\rock.json")) {
            gson.toJson(rock, writer);
            writer.close();
            System.out.println("JSON written to rock.json successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // read From file ;:

        try {
            FileReader reader = new FileReader("src\\FollowAlong\\rock.json");
            PetRock rocky = gson.fromJson(reader,PetRock.class);
            System.out.println(rocky);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
