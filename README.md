# BP_singleton
초급 프로젝트 싱글톤 과제를 위한 레포

Singleton.java코드는 싱글톤 구현코드이고,
Test.java는 확인용 실행코드입니다.

인스턴스는 Singleton.java 파일에 있는 Singleton 클래스 내부의 private static Singleton instance;에 보관됩니다.
인스턴스를 반복 요청 시 새 객체가 만들어 지지 않는 이유는 생성자를 private로 외부에서 호출할 수 없게 만들었고 getInstance 메서드로 생성자를 대신하는 데 instance가 없을 때에만 새로 만들고 기존 instance가 있다면 그 instance를 반환하게 만들어 새 객체가 만들어 지지 않습니다.
Test.java파일에서 두 개의 singleton 변수를 비교했을 때 s1 == s2의 결과가 true이며 identityHashCode가 동일하기에 두 변수는 하나의 인스턴스를 공유합니다. 또한 s1의 값을 변경했을 때 s2의 값이 변경되는 것도 두 변수가 하나의 인스턴스를 가리키는 것이라 할 수 있습니다.
<img width="785" height="175" alt="실행화면" src="https://github.com/user-attachments/assets/078a6dc5-244a-4b0e-ae1d-a2e2678f61c0" />
