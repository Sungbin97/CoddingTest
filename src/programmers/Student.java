package programmers;

import java.util.Scanner;

public class Student {
    private String name;
    private int number;
    private String department;
    private String phone;
    public Student(String name, int number, String department, String phone){
        this.name = name;
        this.number = number;
        this.department = department;
        this.phone = phone;
    }
    public Student(){};
    Scanner sc = new Scanner(System.in);
    Student [] studentArr;
    String[] menu = {"원하시는 메뉴를 선택하세요.", "1: 학생등록", "2: 전체출력", "3: 학생조회", "4: 정보수정", "5: 프로그램 종료"};
    public void re(int cnt){
        System.out.println("다른 메뉴를 선택하시겠습니까? (Y / N)");
        String answer = sc.next();
        if (answer.equals("Y")){
            for (String m : menu) System.out.println(m);
            int selectNum = sc.nextInt();
            program(selectNum, cnt);
        } else if (answer.equals("N")) {
            close(cnt);
        }
    }
    public int program(int num, int cnt){
        if (num == 1){
            studentArr = addStudent(cnt);
            System.out.println("studentArr: " + studentArr[0].name);
        }
        else if (num == 2) {
            if (studentArr == null){
                System.out.println("등록된 학생이 없습니다.");
            }else showAll(studentArr, cnt);
        }
        else if (num == 3) readOne(cnt);
        else if (num == 4) modify(cnt);
        else if (num == 5) close(cnt);

        return num;
    }

    public Student[] addStudent(int cnt){
        System.out.println("1번 학생등록 실행");
        studentArr = new Student[cnt];

        for (int i = 0; i < cnt; i++) {
            System.out.println(i + " / " + cnt);
            System.out.println("이름을 입력하세요");
            String name = sc.next();
            System.out.println("학번을 입력하세요");
            int number = sc.nextInt();
            System.out.println("학과를 입력하세요");
            String department = sc.next();
            System.out.println("전화번호를 입력하세요");
            String phone = sc.next();
            studentArr[i] = new Student(name, number, department, phone);
            System.out.println("studentArr[i] : " + studentArr[i].name);
        }
        for (Student s : studentArr) System.out.println("저장된 학생: " + s.name);
        System.out.println("학생등록을 완료하였습니다.");
        re(cnt);
        return studentArr;
    }
    public void showAll(Student[] students, int cnt){
        System.out.println("2번 전체출력 실행");
        if(students[0] == null) System.out.println("등록된 학생이 없습니다.");
        else for (Student s : students) System.out.println("이름: " + s.name + " 학번: " + s.number + " 학과: " + s.department + " 전화번호: " + s.phone);
        re(cnt);
    }
    public void readOne(int cnt){
        System.out.println("조회할 학생의 학번을 입력하세요.");
        int searchNumber = sc.nextInt();
        System.out.println("입력한 학번: " + searchNumber);
        for (int i = 0; i < studentArr.length; i++) {
            if (studentArr[i].number == searchNumber) {
                System.out.println("이름: " + studentArr[i].name + " 학번: " + studentArr[i].number + " 학과: " + studentArr[i].department + " 전화번호: " + studentArr[i].phone);
            }
        }
        re(cnt);
    }
    public void modify(int cnt){
        re(cnt);
    }
    public void close(int cnt){
        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student menu = new Student();

        System.out.println("학생 수를 정해주세요.");
        int cnt = sc.nextInt();
        Student [] students = new Student[cnt];
        for (String m : menu.menu) System.out.println(m);
        int selectNum = sc.nextInt();
         menu.program(selectNum, cnt);
    }
}
