package by.epam.task413;

public class StudentView {

  private Student student;

  public StudentView(Student student) {
    this.student = student;
  }

  public void showBestStudent() {
    StudentLogic bestStudent = new StudentLogic(student);
    if (bestStudent.showBest())
      System.out.println(student.getName() + " from group " + student.getGroupNumber());
  }
}
