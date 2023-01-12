package programmers;

import java.util.Scanner;

public class Student {
    private String name;
    private int number;
    private String major;
    private String phone;
    public Student(String name, int number, String major, String phone){
        this.name = name;
        this.number = number;
        this.major = major;
        this.phone = phone;
    }
    public Student(){};
    Scanner sc = new Scanner(System.in);
    Student [] studentArr;
    String[] menuArr = {"원하시는 메뉴를 선택하세요.", "1: 학생등록", "2: 전체출력", "3: 학생조회", "4: 정보수정", "5: 프로그램 종료"};
    public void re(int cnt){ // 다시 메뉴를 선택하는 메서드
        System.out.println("다른 메뉴를 선택하시겠습니까? (Y / N)");
        String answer = sc.next();
        if (answer.equals("Y")){
            for (String m : menuArr) System.out.println(m);
            int selectNum = sc.nextInt();
            program(selectNum, cnt);
        } else if (answer.equals("N")) {
            close();
        } else {
            System.out.println("다시 입력해주세요.");
            re(cnt);
        }
    }
    public int program(int num, int cnt){ // num: 사용자가 선택한 메뉴
        if (num == 1){
            studentArr = addStudent(cnt);
        }
        else if (num == 2) {
            if (studentArr == null){
                System.out.println("등록된 학생이 없습니다.");
                re(cnt); // 등록된 학생이 없을 경우 다시 메뉴 선택으로 이동
            }
            else showAll(studentArr, cnt);
        }
        else if (num == 3) readOne(cnt);
        else if (num == 4) modify(cnt);
        else if (num == 5) close();

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
        }
        System.out.println("학생등록을 완료하였습니다.");
        re(cnt);
        return studentArr;
    }
    public void showAll(Student[] students, int cnt){
        System.out.println("2번 전체출력 실행");
        if(students[0] == null) System.out.println("등록된 학생이 없습니다.");
        else for (Student s : students) System.out.println("이름: " + s.name + " 학번: " + s.number + " 학과: " + s.major + " 전화번호: " + s.phone);
        re(cnt);
    }
    public void readOne(int cnt){
        System.out.println("3번 학생조회 실행");
        System.out.println("조회할 학생의 학번을 입력하세요.");
        int findOne = sc.nextInt(); // 수정할 학생의 학번
        System.out.println("입력한 학번: " + findOne);
        for (int i = 0; i < studentArr.length; i++) {
            if (studentArr[i].number == findOne) {
                System.out.println("이름: " + studentArr[i].name + " 학번: " + studentArr[i].number + " 학과: " + studentArr[i].major + " 전화번호: " + studentArr[i].phone);
            }
        }
        re(cnt);
    }
    public void modify(int cnt){ // 학번 입력 -> 학과, 전화번호 수정
        System.out.println("4번 정보수정 실행");
        System.out.println("수정할 학생의 학번을 입력하세요.");
        int findOne = sc.nextInt(); // 수정할 학생의 학번
        for (int i = 0; i < studentArr.length; i++) {
            if (studentArr[i].number == findOne) {
                System.out.println("수정할 학과를 입력하세요.");
                String modDepartment = sc.next();
                System.out.println("수정할 전화번호를 입력하세요.");
                String modPhone = sc.next();

                System.out.println("변경 전");
                System.out.println("학번: " + findOne + " 학과: " + studentArr[i].major + " 전화번호: " + studentArr[i].phone);

                studentArr[i].major = modDepartment; // 입력받은 학과로 변경
                studentArr[i].phone = modPhone; // 입력받은 전화번호로 변경
                System.out.println("변경 후");
                System.out.println("학번: " + findOne + " 학과: " + studentArr[i].major + " 전화번호: " + studentArr[i].phone);
                System.out.println("변경이 완료되었습니다.");
            }
        }
        re(cnt);
    }
    public void close(){
        System.out.println("5번 프로그램 종료");
        System.out.println("프로그램을 종료합니다.");
        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student(); // Student 클래스에 접근하기 위한 객체 생성

        System.out.println("학생 수를 정해주세요.");
        int cnt = sc.nextInt();
        for (String m : student.menuArr) System.out.println(m);
        int selectNum = sc.nextInt();
        student.program(selectNum, cnt); // 임의로 정한 학생 수(cnt)와 메뉴 중 선택한 번호(selectNum)를
                                         // Student 클래스에 program 메서드에 인자로 전달
    }
}
