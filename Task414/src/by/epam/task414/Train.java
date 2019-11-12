package by.epam.task414;

public class Train {
    public String destName;
    public int numberOfTrain;
    public String timeArrive;

    // конструктор
    public Train(String destination, int number, String time) {
        destName = destination;
        numberOfTrain = number;
        timeArrive = time;
    }

    public String getDestName() {
        return destName;
    }

    public void setDestName(String destName) {
        this.destName = destName;
    }

    public int getNumberOfTrain() {
        return numberOfTrain;
    }

    public void setNumberOfTrain(int numberOfTrain) {
        this.numberOfTrain = numberOfTrain;
    }

    public String getTimeArrive() {
        return timeArrive;
    }

    public void setTimeArrive(String timeArrive) {
        this.timeArrive = timeArrive;
    }

    @Override
    public String toString() {
        return "Train {" +
                " destination = '" + destName + '\'' +
                ", number of train = " + numberOfTrain +
                ", time arrive = '" + timeArrive +
                '}';
    }
}
