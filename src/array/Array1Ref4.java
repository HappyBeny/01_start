package array;

public class Array1Ref4 {

    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50}; //배열 생성과 초기화
        /*
        배열생성과 초기화 따로
ㅇ        int[] students;
        students = new int[]{90, 80, 70, 60, 50};
         */

        //변수 값 사용
        for (int i = 0; i < students.length; i++){
            System.out.println("학생 " + (i + 1) + "점수 : " + students[i]);
        }

    }
}
