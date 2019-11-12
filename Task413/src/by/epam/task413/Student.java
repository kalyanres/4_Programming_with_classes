package by.epam.task413;

public class Student {
    private String Name;
    private int groupNumber;
    private int[] progress;

    public Student(String name, int group, int[] prg) {
        Name = name;
        groupNumber = group;
        progress = new int[5];
        for (int i = 0; i < 5; i++) {
            progress[i] = prg[i];
        }
    }

    public String getName() {
        return Name;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int[] getProgress() {
        return progress;
    }


}
