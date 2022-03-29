package classpart;

public class OrderTest {

	public static void main(String[] args) {
		Order person1 = new Order();
		person1.orderNum = 201803120001L;
		person1.orderId = "abc123";
		person1.orderDate = "2018년 3월 12일";
		person1.orderName = "홍길순";
		person1.orderProductNum = "PD0345-12";
		person1.orderAddress = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호 : " + person1.orderNum);
		System.out.println("주문자 아이디 : " + person1.orderId);
		System.out.println("주문 날짜 : " + person1.orderDate);
		System.out.println("주문자 이름 : " + person1.orderName);
		System.out.println("주문 상품 번호 : " + person1.orderProductNum);
		System.out.println("배송 주소 : " + person1.orderAddress);

	}

}
