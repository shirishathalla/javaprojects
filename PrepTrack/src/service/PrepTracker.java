package service;

import model.Problem;
import java.util.ArrayList;

public class PrepTracker {

    private ArrayList<Problem> problems;

    public PrepTracker() {
        problems = new ArrayList<>();
    }

    // Add a problem
    public void addProblem(Problem problem) {
        problems.add(problem);
    }

    // Get all problems
    public ArrayList<Problem> getProblems() {
        return problems;
    }

    // Search by title
    public ArrayList<Problem> searchProblems(String keyword) {

        ArrayList<Problem> result = new ArrayList<>();

        for (Problem p : problems) {
            if (p.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(p);
            }
        }

        return result;
    }

    // Count solved problems
    public int getSolvedCount() {

        int count = 0;

        for (Problem p : problems) {
            if (p.isSolved()) {
                count++;
            }
        }

        return count;
    }

    // Total problems
    public int getTotalProblems() {
        return problems.size();
    }
}