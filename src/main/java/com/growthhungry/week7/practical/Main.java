package com.growthhungry.week7.practical;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

//                      Creating a file
       /* File myFile = new File("newFile.txt");
       try {
            if (myObj.createNewFile()){
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("Such file already exists!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        */

//                  Buffered Reader/Writer
        try(
                BufferedReader reader = new BufferedReader(new FileReader("tasks.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("newFile.txt"));
                ){
            String line;
            while ((line = reader.readLine()) != null){
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File copied successfully");
        } catch (IOException e){
            e.printStackTrace();
        }

//        Writing a file
        /*try (FileWriter writer = new FileWriter(myFile)){
            writer.write("Welcome to my file!");
        } catch (IOException e) {
            e.printStackTrace();
        }
         */

//                            Reading from a file
       /* Scanner myReader = new Scanner("newFile.txt");
        while (myReader.hasNextLine()){
            String data =  myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();
        */
        /*try (FileReader reader = new FileReader(myFile)){
            int character;
            while ((character = reader.read()) != -1){
                System.out.println((char) character);
            }
        } catch (IOException e){
                e.printStackTrace();
          }
         */


//                          Deleting a file
       /* if (myObj.delete()){
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file!");
        }
        */
    }
}
