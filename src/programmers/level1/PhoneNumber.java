package programmers.level1;

public class PhoneNumber {
    public static void main(String[] args) {
        String phone_number = "1112221543823404892308504398509438905433213122147777";

        String frontNum = phone_number.substring(0, phone_number.length()-4);
        String backNum = phone_number.substring(phone_number.length()-4, phone_number.length());
        for (int i = 0; i < frontNum.length(); i++) frontNum = frontNum.replace(frontNum.charAt(i), '*');

        System.out.println(frontNum + backNum);


    }
}
