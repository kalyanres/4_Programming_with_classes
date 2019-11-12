package by.epam.task413;

public class StudentLogic {
  private Student stud;

  public StudentLogic(Student stud) {
    this.stud = stud;
  }

  public boolean showBest() {
    for (int i = 0; i < 5; i++) {
      if (stud.getProgress()[i] < 9)
        return false;
    }
    return true;
  }
}
