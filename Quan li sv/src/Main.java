//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Main q = new Main();

    ArrayList < SinhVien > arrSV = new ArrayList < > ();

    public static void main(String[] args) {
        boolean loop = true;
        while (loop) {
            System.out.println("1.NHAP DANH SACH SINH VIEN");
            System.out.println("2.HIEN THI THONG TIN SINH VIEN");
            System.out.println("3.SAP XEP DANH SACH SINH VIEN");
            System.out.println("4.TIM KIEM SINH VIEN");
            System.out.println("5.THOAT");
            int input = new Scanner(System.in).nextInt();
            switch (input) {
                case 1:
                    System.out.print(" so sinh vien co trong danh sach: ");
                    int inputList = new Scanner(System.in).nextInt();
                    q.inputListSV(inputList);
                    break;
                case 2:
                    q.outputList(q.arrSV);
                    break;
                case 3:
                    q.sortSV(q.arrSV);
                    q.outputList(q.arrSV);
                    break;
                case 4:
                    System.out.println("nhap ten sinh vien can tim");
                    String inputName = new Scanner(System.in).nextLine();
                    q.searchSV(q.arrSV, inputName);
                    break;
                case 5:
                    loop = false;
                    System.out.println("da thoat");
                    break;

            }

        }
    }

    public void sortSV(ArrayList < SinhVien > arrSV) {
        for (int i = 0; i < arrSV.size(); i++) {
            for (int j = i + 1; j < arrSV.size(); j++) {
                if (arrSV.get(i).getPoint() > arrSV.get(j).getPoint()) {
                    SinhVien temp = arrSV.get(i);
                    arrSV.set(i, arrSV.get(j));
                    arrSV.set(j, temp);

                }
            }

        }
        System.out.println(arrSV);
    }
    public void outputList(ArrayList < SinhVien > arrSV) {
        for (int i = 0; i < arrSV.size(); i++) {
            arrSV.get(i).outputSV();
        }

    }
    public void searchSV(ArrayList < SinhVien > arrSV, String name) {
        boolean check = false;
        for (int i = 0; i < arrSV.size(); i++)
            if (arrSV.get(i).getName().lastIndexOf(name) >= 0) {
                arrSV.get(i).outputSV();
                check = true;
                break;
            }
        if (!check) {
            System.out.println("kh tim thay sinh vien");
        }
    }
    public void inputListSV(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("thong tin sinh vien thu " + (i + 1));
            SinhVien sv = new SinhVien();
            sv.inputSV();
            arrSV.add(sv);
        }
    }
}