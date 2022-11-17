package Lab1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vui lòng nhập thông tin người dùng ");
        ArrayList<Member> members = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Nhập thông tin người dùng thứ " + i);
            Member member = new Member();
            member.Input();
            members.add(member);
        }


        for (Member i : members) {
            System.out.println(i);
        }
    }
}
