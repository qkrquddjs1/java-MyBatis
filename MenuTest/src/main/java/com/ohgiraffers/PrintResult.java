package com.ohgiraffers;

import java.util.List;



public class PrintResult {
    public void printmenuList(List<MenuDTO> menuList) {
        System.out.println("====== 메뉴 목록 =====");
        for(MenuDTO menu : menuList){
            System.out.println(menu);
        }
    }

    public void printMenu(MenuDTO menu) {
        System.out.println("===== 조회 된 메뉴 =======");
        System.out.println(menu);
    }

    public void printErrorMessage(String errorCode) {
        System.out.println("==== Error ====");
        String errorMessage = "";
        switch (errorCode) {
            case " selextList " :
                errorMessage = "메뉴 목록 조회에 실패 했습니다. ";
        }
    }
}
