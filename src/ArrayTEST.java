public class ArrayTEST {
    public static void main(String[] args) {
        final int MEMBERS = 30; // 변경이나 수정 금지

        /*배열을 선언하는 방법
        * 1. 데이터 타입을 적는다.
        * 2. 데이터 타입 뒤에 '[]'인 대괄호를 배치한다.
        * 3. 변수명을 적어주듯이 배열의 이름을 적어준다.
        * (이것도 역시 구별이 가능하게 적어주는 것이 좋다)
        * 4. 마지막으로 ';'를 붙여서 마무리한다.
        * Java에서는 stack과 heap만 알면 된다.
        * stack은 지역변수가 배치된다.
        * heap은 new로 할당된 애들이 배치된다.
        *
        * 배열을 heap에 할당하는 방법
        * 1. 우선 배열을 선언한다.
        * 2. new를 쓴다.
        * 3. 배치될 배열의 데이터 타입을 적는다.
        * 4. 이후 '[]' 대괄호 안쪽에 몇 개를 할당할지 개수를 적는다.
        *
        * new int[MEMBERS] ===> new int[30]
          저는 Heap에 30개의 int 형 공간을 배치하겠습니다.
         */
        int[] scores = new int[MEMBERS];

        for(int i=0;i<30;i++){
            scores[i]=(i+1)*3;
            System.out.println("res = " + scores[i]);
        }
    }
}
