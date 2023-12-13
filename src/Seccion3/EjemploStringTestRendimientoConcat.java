package Seccion3;

public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicial = System.currentTimeMillis();

        for(int i = 0; i < 5000; i++){
//            c = c.concat(a).concat(b).concat("\n"); // 500 => 2ms
//            c += a + b +"\n"; // 500 => 57ms
            sb.append(a).append(b).append("\n"); /// 500 => 2ms
        }

        System.gc();

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicial);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
        System.exit(0);
    }
}
