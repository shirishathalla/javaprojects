package storage;

import model.Problem;
import java.io.*;
import java.util.ArrayList;

public class FileManager {

    private static final String FILE_NAME = "problems.txt";

    // Save problems
    public static void saveProblems(ArrayList<Problem> problems) {

        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {

            for (Problem p : problems) {
                writer.println(
                        p.getTitle() + "," +
                        p.getTopic() + "," +
                        p.getDifficulty() + "," +
                        p.isSolved() + "," +
                        p.getNotes()
                );
            }

        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }

    // Load problems
    public static ArrayList<Problem> loadProblems() {

        ArrayList<Problem> problems = new ArrayList<>();

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return problems;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                if (data.length == 5) {

                    Problem problem = new Problem(
                            data[0],
                            data[1],
                            data[2],
                            Boolean.parseBoolean(data[3]),
                            data[4]
                    );

                    problems.add(problem);
                }
            }

        } catch (IOException e) {
            System.out.println("Error loading file.");
        }

        return problems;
    }
}