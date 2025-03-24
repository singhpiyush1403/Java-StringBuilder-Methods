public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Programming");
        System.out.println(sb);

        sb.insert(5, "is ");
        System.out.println(sb); 

        sb.replace(5, 7, "was");
        System.out.println(sb); 

        sb.delete(5, 9);
        System.out.println(sb); 

        sb.reverse();
        System.out.println(sb);
    }
}