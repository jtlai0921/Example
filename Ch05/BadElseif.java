import java.util.*; // ����J��ƥ[�W���{��

public class BadElseif {

  public static void main(String[] argv) {

    System.out.print("�п�J�ثe�ҳѪo�q (���G����)�G");

    Scanner sc = new Scanner(System.in); // ����J��ƥ[�W���{��
    int liter = sc.nextInt();  // �N��J����ন���

    if (liter >= 10) { // ���� 1
      // �ԭz 1
      System.out.println("�o�q�R��, �Цw�ߤW��");
    }
    else if (liter < 10) { // ���� 2
      // �ԭz 2
      System.out.println("�o�q�|��, �����z�`�N�o���C");
    }
    else if (liter < 2) { // ���� 3    
      // �ԭz 3
      System.out.println("�o�q�w�g����, �ӥh�[�o�F�I");
    }

    System.out.println("���z�樮�r�֡C");
  }
}