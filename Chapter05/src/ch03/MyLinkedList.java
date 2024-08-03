package ch03;

public class MyLinkedList {

    int count;
    private MyListNode head;

    public MyLinkedList() {
        head = null;
        count = 0;
    }

    public MyListNode addElement(String data) {
        // 맨 앞에 추가되는 경우 - head를 가지고 세팅한다.
        MyListNode newNode;

        // 첫 노드일 경우
        if (head == null) {
            newNode = new MyListNode(data);
            head = newNode;
        } else {
            newNode = new MyListNode(data);
            MyListNode temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        count++;

        return newNode;
    }

    public MyListNode insertElement(int position, String data) {
        int i;
        MyListNode tempNode = head;
        MyListNode preNode = null;
        MyListNode newNode = new MyListNode(data);

        if (position < 0 || position > count) {
            System.out.println("검색위치오류: 현재 리스트의 갯수는 " + count + "개 입니다.");
            return null;
        }

        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            for (i = 0; i < position; i++) {
                preNode = tempNode;
                tempNode = tempNode.next;
            }
            newNode.next = preNode.next;
            preNode.next = newNode;
        }
        count++;

        return newNode;
    }

    public MyListNode removeElement(int position) {
        int i;
        MyListNode tempNode = head;
        MyListNode preNode = null;

        if (position == 0) {
            head = tempNode.next;
        } else {
            for (i = 0; i < position; i++) {
                preNode = tempNode;
                tempNode = tempNode.next;
            }
            preNode.next = tempNode.next;
        }
        count--;

        return tempNode;
    }

    public String getElement(int position) {
        int i;
        MyListNode tempNode = head;

        if (position >= count) {
            System.out.println("검색위치오류: 현재 리스트의 갯수는 " + count + "개 입니다.");
            return new String("ERROR");
        }

        if (position == 0) {
            // 맨 앞인 경우
            return head.getData();
        }

        for (i = 0; i < position; i++) {
            tempNode = tempNode.next;
        }

        return tempNode.getData();
    }

    public MyListNode getNode(int position) {
        int i;
        MyListNode tempNode = head;

        if (position >= count) {
            System.out.println("검색위치오류: 현재 리스트의 갯수는 " + count + "개 입니다.");
            return null;
        }

        if (position == 0) {
            return head;
        }

        for (i = 0; i < position; i++) {
            tempNode = tempNode.next;
        }

        return tempNode;
    }

    public int getSize() {
        return count;
    }

    public void removeAll() {
        head = null;
        count = 0;
    }

    public void printAll() {
        if (count == 0) {
            System.out.println("출력할 내용이 없습니다.");
            return;
        }
        MyListNode temp = head;

        while (temp != null) {
            System.out.println(temp.getData());

            temp = temp.next;

            if (temp != null) {
                System.out.println("-->");
            }
        }
        System.out.println("");
    }

}


