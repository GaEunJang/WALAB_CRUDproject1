package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class DataManager {
    private static ArrayList<ClothingData> dataList = new ArrayList<>();
    private static int nextId=1;
    public static Scanner in = new Scanner(System.in);

    public static void createData(){
        System.out.println();
        System.out.print("종류를 입력하세요. (아우터, 상의, 하의, 기타) : ");
        String type=in.nextLine();
        System.out.print("이름을 입력하세요. : ");
        String name=in.nextLine();
        System.out.print("가격을 입력하세요. : ");
        String priceStr = in.nextLine();
        int price = Integer.parseInt(priceStr);
        System.out.print("설명을 입력하세요. : ");
        String description=in.nextLine();

        ClothingData newData = new ClothingData(nextId, type, name, price, description);
        dataList.add(newData);
        nextId++;

        System.out.println("데이터가 성공적으로 생성되었습니다.\n");
    }

//    public static void readData(){
//        if(dataList.isEmpty()){
//            System.out.println("데이터가 없습니다.\n");
//        }
//        else{
//            System.out.println("---현재 데이터 목록---");
//            for(ClothingData data : dataList ){
//                System.out.println(data);
//            }
//        }
//        System.out.println();
//    }
    public static void readData() {
        if (dataList.isEmpty()) {
            System.out.println("데이터가 없습니다.\n");
        } else {
            System.out.println("                  *   현재 데이터 목록   *                  ");
           // System.out.println("----------------------------------------------------------");
            System.out.println("==========================================================");
            System.out.printf("%-6s %-10s %-10s %-10s %-21s\n", "번호", "이름", "종류", "가격", "설명");
            System.out.println("==========================================================");
            for (ClothingData data : dataList) {
                System.out.println(data);
            }
            System.out.println("----------------------------------------------------------");
            System.out.println();
        }
    }

    public static void updateData(){
        readData();
        System.out.print("수정할 데이터의 번호를 입력하세요. :");
        int updateId = in.nextInt();
        in.nextLine();

        for(ClothingData data : dataList){
            if(data.getId() == updateId){
                System.out.print("새로운 종류를 입력하세요. (아우터, 상의, 하의, 기타) : ");
                String newType = in.nextLine();
                System.out.print("새로운 이름을 입력하세요. : ");
                String newName = in.nextLine();
                System.out.print("새로운 가격을 입력하세요. : ");
                int newPrice = in.nextInt();
                in.nextLine();
                System.out.print("새로운 설명을 입력하세요. : ");
                String newDescription = in.nextLine();

                data.setType(newType);
                data.setName(newName);
                data.setPrice(newPrice);
                data.setDescription(newDescription);

                System.out.println("데이터가 성공적으로 업데이트되었습니다.\n");
            }
            else{
                System.out.println("번호 " + updateId + "에 해당하는 데이터를 찾을 수 없습니다.\n");
            }
        }
    }

    public static void deleteData(){
        readData();
        System.out.println("삭제할 데이터의 번호를 입력하세요. : ");
        int deleteId=in.nextInt();
        in.nextLine();

        for(ClothingData data : dataList){
            if(data.getId()==deleteId){
                dataList.remove(data);
                System.out.println("데이터가 성공적으로 삭제되었습니다.\n");
            }
            System.out.println("번호 " + deleteId + "에 해당하는 데이터를 찾을 수 없습니다.\n");
        }
    }

    public static void searchType() {
        if (dataList.isEmpty()) {
            System.out.println("데이터가 없습니다.\n");
            return;
        }

        System.out.print("검색할 종류를 입력하세요 : ");
        String searchType = in.nextLine();

        boolean found = false;
        for (ClothingData data : dataList) {
            if (data.getType().equalsIgnoreCase(searchType)) {
                if (!found) {
                    System.out.println("                  *   검색 결과   *                  ");
                    System.out.println("==========================================================");
                    System.out.printf("%-6s %-10s %-10s %-10s %-21s\n", "번호", "이름", "종류", "가격", "설명");
                    System.out.println("==========================================================");
                    found = true;
                }
                System.out.println(data);
            }
        }
        System.out.println();

        if (!found) {
            System.out.println("종류가 " + searchType + "인 데이터를 찾을 수 없습니다.\n");
        }
    }

    public static void sortData() {
        if(dataList.isEmpty()){
            System.out.println("데이터가 없습니다.\n");
            return;
        }

        System.out.print("정렬 기준을 선택해주세요. (1: 이름, 2: 가격) : ");
        int sortChoice = in.nextInt();
        in.nextLine();

        if(sortChoice == 1) {
            dataList.sort(Comparator.comparing(ClothingData::getName));
        } else if(sortChoice == 2) {
            dataList.sort(Comparator.comparingInt(ClothingData::getPrice));
        } else {
            System.out.println("잘못된 선택입니다.");
            return;
        }

        System.out.println("정렬된 데이터 목록:");
        readData();
    }
}
