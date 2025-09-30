public class ArgsExample {
    public static void main(String[] args) {
        System.out.println("넘어온 인자 개수: " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
}
