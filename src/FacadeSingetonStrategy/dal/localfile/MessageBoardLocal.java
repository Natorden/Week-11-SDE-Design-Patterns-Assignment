package FacadeSingetonStrategy.dal.localfile;

import FacadeSingetonStrategy.be.Message;
import FacadeSingetonStrategy.dal.IDataAccessLayer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MessageBoardLocal implements IDataAccessLayer {

    public static final String LocalFilePath ="src/FacadeSingetonStrategy/dal/localfile/LocalTextFile.txt";


    @Override
    public List<Message> getAllMessages() {

        List<Message> array = new ArrayList<>();
        File file = new File(LocalFilePath);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) { array.add(new Message(line)); }
        }catch(Exception e){
            e.printStackTrace();
        }
        return array;

    }

    @Override
    public void createAMessage(Message message) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(LocalFilePath, true);
            fileWriter.write(String.valueOf("\n"+message));
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileWriter != null) {
                    fileWriter.flush();
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
