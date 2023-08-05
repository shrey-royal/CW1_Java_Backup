public class Student_Ex implements Student {
    private int rollNo;
    private String name;
    private short backlogs;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return this.rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public short getBacklogs() {
        return this.backlogs;
    }

    public void setBacklogs(short backlogs) {
        this.backlogs = backlogs;
    }

    public static void main(String[] args) {
        Student s = new Student_Ex();
        s.setRollNo(1);
        s.setName("Jenisha");
        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Name: " + s.getName());
        
        Student_Ex s1 = new Student_Ex();
        s1.setRollNo(2);
        s1.setName("Sujal");
        s1.setBacklogs((short) 2);

        System.out.println("Roll No: " + s1.getRollNo());
        System.out.println("Name: " + s1.getName());
        System.out.println("Backlogs: " + s1.getBacklogs());

        Student_Ex s2 = new Student_Ex();
        s2.setRollNo(420);
        s2.setName("Vedant");
        s2.setBacklogs((short) 9);

        System.out.println("Roll No: " + s2.getRollNo());
        System.out.println("Name: " + s2.getName());
        System.out.println("Backlogs: " + s2.getBacklogs());

    }
}
