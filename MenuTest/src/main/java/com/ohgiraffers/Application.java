package com.ohgiraffers;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MenuController menuController = new MenuController();

        do {
            System.out.println("==== 메뉴 관리 프로그램 ====");
            System.out.println("1. 메뉴 전체 조회 ");
            System.out.println("2. 메뉴 코드로 메뉴 조회 ");
            System.out.println("3. 신규 메뉴 추가 ");
            System.out.println("4. 메뉴 수정 ");
            System.out.println("5. 메뉴 삭제 ");
            System.out.print("메뉴 관리 번호 입력 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 :
                    menuController.selectAllMenu(); break;
                case 2 :
                    menuController.selectMenuCode(); break;
                case 3 :
                    menuController.newMenu(); break;
                case 4 :
                    menuController.updateMenu(); break;
                case 5 :
                    menuController.deleteMenu(); break;
                default:
                    System.out.println("번호를 잘못 누르셧습니다. ");
            }

        } while (true);
    }

}
