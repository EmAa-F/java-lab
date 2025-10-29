class Student {
    int id;
    String n;

    // Added constructor to initialize both fields
    public Student(int id, String n) {
        this.id = id;
        this.n = n;
    }
}
class exp1{
    public static void main(String[]args){
        Student s1=new Student(101,"John");
          System.out.println("ID:"+s1.id+"\nName:"+s1.n);
        Student s2=new Student(32,"Emaad");
          System.out.println("ID:"+s2.id+"\nName:"+s2.n);
    }
}