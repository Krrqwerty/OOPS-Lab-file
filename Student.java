
class Student {
    String name;
    int age;

   
    public Student() {
        name = "Ram";
        age = 18;
    }

 
    public Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

  
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
      
        Student student1 = new Student();
        System.out.println("Student 1 Details:");
        student1.displayDetails();

        System.out.println(); 

      
        Student student2 = new Student("Alice", 21);
        System.out.println("Student 2 Details:");
        student2.displayDetails();
    }
}

