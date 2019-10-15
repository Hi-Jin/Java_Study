package Test;

class Node3 {
   int data;
   Node3 next;

   public Node3(int data) {
      this.data = data;
   }

   public Node3 copy(Node3 list) {
      Node3 list2 = new Node3(list.data);
      Node3 k = list2;
      for (int i = 0; i < 7; i++) {
         list = list.next;
         k.next = new Node3(list.data);
         k = k.next;

      }
      k = list2;
      return k;
   }
}

public class CopyTest {
   public static void main(String[] args) {
      Node3 song = new Node3(22);
      Node3 list = new Node3(22);
      Node3 p = list;
      for (int i = 1; i < 8; i++) {
         p.next = new Node3(11 * (i + 2)); // 22 33 44 55 66 77 88 99
         p = p.next;
      }

      System.out.print("기존 list:");
      p = list;
      for (; p != null; p = p.next) {
         System.out.print(p.data + " ");
      }
      System.out.println();
      System.out.println("list1을 list2에 복사");
      Node3 list2 = song.copy(list);

      System.out.print("수정된list:");
      p = list;
      p.data = 2;
      for (; p != null; p = p.next) {
         System.out.print(p.data + " ");
      }
      p = list2;
      System.out.println();
      System.out.print("복사된 list2: ");

      for (; p != null; p = p.next) {
         System.out.print(p.data + " ");
      }
   }
}