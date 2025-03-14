## Lv4. 객체 지향 설계를 적용해 음식 메뉴와 주문 내역을 클래스 기반으로 관리하기
- Menu 클래스 생성(필드: 카테고리 이름)
- List<MenuItem> 은 Kiosk 클래스가 관리하기에 적절하지 않으므로 Menu 클래스가 관리하도록 변경
- 메뉴 카테고리 이름을 반환하는 메서드가 구현

### <br>구조 예시
```public static void main(String[] args) {
// Menu 객체 생성하면서 카테고리 이름 설정
// Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입

		// Kiosk 객체 생성
		// Kiosk 내 시작하는 함수 호출
}

public class Kiosk {

		start() {
			// 스캐너 선언
			// 반복문 시작
			
			// List와 Menu 클래스 활용하여 상위 카테고리 메뉴 출력
			
			// 숫자 입력 받기
			
			// 입력 받은 숫자가 올바르다면 인덱스로 활용하여 List에 접근하기
				// List<Menu>에 인덱스로 접근하면 Menu만 추출할 수 있겠죠?
			
			// Menu가 가진 List<MenuItem>을 반복문을 활용하여 햄버거 메뉴 출력
			
			// 숫자 입력 받기
			// 입력 받은 숫자가 올바르다면 인덱스로 활용해서 Menu가 가지고 있는 List<MenuItem>에 접근하기
				// menu.getMenuItems().get(i); 같은 형식으로 하나씩 들어가서 얻어와야 합니다.
		}

}

public class Menu {

		// 카테고리 이름 필드 추가
		// MenuItem 클래스를 List로 관리
		
		// List에 포함된 MenuItem을 순차적으로 보여주는 함수
		// List를 리턴하는 함수
		
		// 구조에 맞게 함수를 선언해놓고 가져다 사용하세요.
}

public class MenuItem {
// 이름, 가격, 설명 필드 선언하여 관리

		// 구조에 맞게 함수를 선언해놓고 가져다 사용하세요.
}
```
### <br>터미널 예시
```
[ MAIN MENU ]
1. Burgers
2. Drinks
3. Desserts
0. 종료      | 종료
   1 <- // 1을 입력

[ BURGERS MENU ]
1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거
0. 뒤로가기
   2 <- // 2를 입력
   선택한 메뉴: SmokeShack | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거

[ MAIN MENU ]
1. Burgers
2. Drinks
3. Desserts
0. 종료      | 종료
   0 <- // 0을 입력
   프로그램을 종료합니다.
```
## Lv5. 캡슐화 적용하기
- MenuItem, Menu 그리고 Kiosk 클래스의 필드에 직접 접근하지 못하도록 설정
- Getter와 Setter 메서드를 사용해 데이터를 관리
