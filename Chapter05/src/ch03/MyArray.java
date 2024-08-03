package ch03;

public class MyArray {

    public static final int ERROR_NUM = -999999999;
    public int ARRAY_SIZE;
    int[] intArr; // int Array
    int count; // 갯수

    public MyArray() {
        count = 0;
        ARRAY_SIZE = 0;
        intArr = new int[ARRAY_SIZE];
    }

    public MyArray(int size) {
        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[size];
    }

    public void addElement(int num) {
        if (count >= ARRAY_SIZE) {
            System.out.println("Not Enough Memory!");
        }
        intArr[count++] = num;
    }

    public void insertElement(int position, int num) {
        // 배열의 맨 마지막 요소부터 한 칸씩 밀어야 한다.
        int i;

        if (position < 0 || position > count) {
            return;
        }

        if (count >= ARRAY_SIZE) {
            return;
        }

        for (i = count - 1; i >= position; i--) {
            intArr[i + 1] = intArr[i];
        }

        intArr[position] = num;
        count++;

    }

    public int removeElement(int position) {
        int res = ERROR_NUM;

        if (isEmpty()) {
            System.out.println("빈 비열입니다.");
            return res;
        }

        if (position < 0 || position > count - 1) {
            System.out.println("출력할 수 있는 배열이 없습니다.");
            return res;
        }

        res = intArr[position];
        for (int i = position; i < count - 1; i++) {
            intArr[i] = intArr[i + 1];
        }
        count--;

        return res;
    }

    public int getSize() {
        return count;
    }

    public boolean isEmpty() {
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getElement(int position) {
        if (position < 0 || position > count - 1) {
            System.out.println("검색위치오류: 현재 리스트의 갯수는 " + count + "개 입니다.");
            return ERROR_NUM;
        }
        return intArr[position];
    }

    public void printAll() {
        if (count == 0) {
            System.out.println("출력할 내용이 없습니다.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(intArr[i]);
        }
    }

    public void removeAll() {
        for (int i = 0; i < count; i++) {
            intArr[i] = 0;
        }
        count = 0;
    }
}