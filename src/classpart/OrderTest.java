package classpart;

public class OrderTest {

	public static void main(String[] args) {
		Order person1 = new Order();
		person1.orderNum = 201803120001L;
		person1.orderId = "abc123";
		person1.orderDate = "2018�� 3�� 12��";
		person1.orderName = "ȫ���";
		person1.orderProductNum = "PD0345-12";
		person1.orderAddress = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ : " + person1.orderNum);
		System.out.println("�ֹ��� ���̵� : " + person1.orderId);
		System.out.println("�ֹ� ��¥ : " + person1.orderDate);
		System.out.println("�ֹ��� �̸� : " + person1.orderName);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + person1.orderProductNum);
		System.out.println("��� �ּ� : " + person1.orderAddress);

	}

}
