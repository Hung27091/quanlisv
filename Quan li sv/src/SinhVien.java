import java.util.Scanner;

public class SinhVien {
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPoint() {
        return point;
    }
    public void setPoint(double point) {
        this.point = point;
    }
    private double point; //point = điểm
    protected void inputSV() {
        System.out.print("mời nhập vào tên SV:");
        name = new Scanner(System.in).nextLine();
        System.out.print("mời nhập vào tuổi SV: ");
        age = new Scanner(System.in).nextInt();
        System.out.print("mời nhập vào điểm SV: ");
        point = new Scanner(System.in).nextDouble();
        System.out.println("\t");
    }
    protected void outputSV() {
        System.out.println("sinh viên: " + name);
        System.out.println(age + " tuổi");
        System.out.println("được " + point + " điểm ");
        System.out.println("\t");
    }






}