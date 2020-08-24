class Student {
    int id;
    String name;
    String Level;
}

class ClassObject1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Nitesh Sapkota";
        s1.Level = "Bachelor";
        System.out.println("Student ID : " + s1.id + "\nStudent name : " + s1.name + "\nStudent Level : " + s1.Level);
    }
}