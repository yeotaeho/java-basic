public class Calculator {
//덧셈 메소드
    public static int addTwoIntegersFromInput() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int first;
        int second;
        System.out.print("첫 번째 정수 입력: ");
        while (!scanner.hasNextInt()) {
            System.out.print("정수를 입력하세요: ");
            scanner.next();
        }
        first = scanner.nextInt();

        System.out.print("두 번째 정수 입력: ");
        while (!scanner.hasNextInt()) {
            System.out.print("정수를 입력하세요: ");
            scanner.next();
        }
        second = scanner.nextInt();

        int sum = first + second;
        System.out.println("합계: " + sum);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("계산기 어플");
        
        addTwoIntegersFromInput();
    }
}