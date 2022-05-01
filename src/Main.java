public class Main {
    public static void main(String[] args) throws Exception {
        SkipList<Integer> sl =new SkipList<>();

        for(int i=1; i<=10000;i++)
            sl.inserta(i);
        
        System.out.println(sl.toString());
    }
}
