package MyTests;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.*;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Json_and_ArrayList {
    private static ArrayList<TestUser> theList;
    private static final File theFile = new File("TestUsers.json");
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Json_and_ArrayList software = new Json_and_ArrayList();
        software.start();
    }

    public void start() {
        boolean running = true;
        while (running) {
            if (!sc.hasNextInt()) {
                sc.nextLine();
            }

            System.out.println("Create and/or print content");
            switch (sc.nextInt()) {
                case 1:
                    if (theFile.exists()) {//read from the file, print content
                        printFileReadContent();
                    } else {//Writes to file;
                        writeToFile();
                    }
                    break;
                case 2:
                    running = false;


            }
        }


    }

    private void printFileReadContent() {
        try {
            FileReader fileReader = new FileReader(theFile);
            Type type = new TypeToken<ArrayList<TestUser>>() {
            }.getType();
            Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new TypeAdapter<LocalDate>() {
                @Override
                public void write(JsonWriter jsonWriter, LocalDate localDate) throws IOException {
                    jsonWriter.value(localDate.toString());
                }

                @Override
                public LocalDate read(JsonReader jsonReader) throws IOException {
                    return LocalDate.parse(jsonReader.nextString());
                }

            }).create();
            theList = gson.fromJson(fileReader, type);
            fileReader.close();
            for (TestUser tU : theList) {
                System.out.println(tU.getName() + " Was born in " + tU.getBirthday());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error in crating FileReader object.");
        } catch (IOException e) {
            System.err.println("Error in closing the file.");
        }
    }

    private void writeToFile() {


        try {
            FileWriter fileWriter = new FileWriter(theFile);
            Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new TypeAdapter<LocalDate>() {
                @Override
                public void write(JsonWriter jsonWriter, LocalDate localDate) throws IOException {
                    jsonWriter.value(localDate.toString());
                }

                @Override
                public LocalDate read(JsonReader jsonReader) throws IOException {
                    return LocalDate.parse(jsonReader.nextString());
                }

            }).create();

            // Load existing data from the JSON file
            if (theFile.exists()) {
                try (FileReader fileReader = new FileReader(theFile)) {
                    Type listType = new TypeToken<List<TestUser>>() {
                    }.getType();
                    theList = gson.fromJson(fileReader, listType);

                    // Initialize to empty list if file is empty or invalid
                    if (theList == null) {
                        theList = new ArrayList<>();
                    }
                } catch (IOException e) {
                    System.err.println("Error reading the file.");
                    return;
                }
            } else {
                // Initialize a new list if the file doesn't exist
                theList = new ArrayList<>();
            }
            theList.add(new TestUser("L", LocalDate.of(2024, 4, 4)));//cant find the reson as to why i cant add and make it save the file
            //theList.addAll(TestUserHandler.getInstance().addToExistingList(20));

            try {
                gson.toJson(theList, fileWriter);
                System.out.println("Saved Json_File.");
                fileWriter.close();

            } catch (IOException e) {
                System.err.println("Error in writing the file.");
            }
        } catch (IOException e) {
            System.out.println("FileRead Object Error!!");
        }
    }





    class TestUser {
        private String name;
        private LocalDate birthday;

        public TestUser(String name, LocalDate birthday) {
            this.name = name;
            this.birthday = birthday;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public LocalDate getBirthday() {
            return birthday;
        }

        public void setBirthday(LocalDate birthday) {
            this.birthday = birthday;
        }
    }
}









































