package org.example;

import java.util.Scanner;

public class WordMan {
    Scanner s = new Scanner(System.in);
    WordCRUD wordCRUD;

    public WordMan(){
        wordCRUD = new WordCRUD(s);
    }

    public void start(){
        wordCRUD.loadFile();
        while (true) {
            int menu = selectMenu();
            if (menu == 0) {
                System.out.println("프로그램 종료");
                break;
            }
            if (menu == 1) { wordCRUD.listAll(); } //read
            if (menu == 2) { wordCRUD.searchLevel(); } //read by level
            if (menu == 3) { wordCRUD.searchWord(); }//read by word
            if (menu == 4){ wordCRUD.addItem(); } //create
            if (menu == 5){ wordCRUD.updateItem(); } //update
            if (menu == 6){ wordCRUD.deleteItem(); } //delete
            if (menu == 7) { wordCRUD.saveFile(); } //save file
        }
    }
    public int selectMenu(){
        System.out.print("*** 영단어 마스터 ***\n"
                +"********************\n"
                +"1. 모든 단어 보기\n"
                +"2. 수준별 단어 보기\n"
                +"3. 단어 검색\n"
                +"4. 단어 추가\n"
                +"5. 단어 수정\n"
                +"6. 단어 삭제\n"
                +"7. 파일 저장\n"
                +"0. 나가기\n"
                +"********************\n"
                +"=> 원하는 메뉴는? ");

        return s.nextInt();
    }
}
