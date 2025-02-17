package Scanner.Ex;

import java.util.Scanner;

public class ScannerWhileEx4_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalPrice = 0;

        while (true) {
            System.out.println("1 : 상품 입력, 2 : 결제, 3 : 프로그램 종료");
            int option = input.nextInt();

            if (option == 1) {
                while (true) {
                    input.nextLine(); // 이거 왜쓰는거임? 없으면 줄 이어져나옴
                    System.out.print("상품명을 입력하세요(c을 입력하면 이전 단계로 돌아갑니다.) : ");
                    String name = input.nextLine();

                    if (name.equals("c")){
                        break;
                    }

                    System.out.print("상품의 가격을 입력하세요 : ");
                    int price = input.nextInt();

                    System.out.print("구매 수량을 입력하세요 : ");
                    int quantity = input.nextInt();

                    totalPrice += price * quantity;

                    System.out.println("상품명 : " + name + ", 가격 : " + price + ", 수량 : " + quantity + ", 합계 : " + price * quantity);
                    System.out.println();
                }

            } else if (option == 2) {
                System.out.println("총 비용 : " + totalPrice);
                System.out.println();
                totalPrice = 0;
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
