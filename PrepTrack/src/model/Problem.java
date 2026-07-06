package model;

public class Problem {

    private String title;
    private String topic;
    private String difficulty;
    private boolean solved;
    private String notes;

    public Problem(String title, String topic, String difficulty, boolean solved, String notes) {
        this.title = title;
        this.topic = topic;
        this.difficulty = difficulty;
        this.solved = solved;
        this.notes = notes;
    }

    public String getTitle() {
        return title;
    }

    public String getTopic() {
        return topic;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public boolean isSolved() {
        return solved;
    }

    public String getNotes() {
        return notes;
    }

    @Override
    public String toString() {
        return title + " | " + topic + " | " + difficulty + " | " +
                (solved ? "Solved" : "Not Solved");
    }
}