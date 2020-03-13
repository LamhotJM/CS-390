package objectsclass.lab2;

class Test8 {
    public static void main(String[] args) {
        Test8 obj = new Test8();
        obj.start();
    }
    void start() {
        String stra = "do";
            String strb = method(stra);
        System.out.print(":"+ ""+stra + strb);
    }
    String method(String stra) {
        stra = stra + ":good";
        System.out.print(stra);
        return "goodx";
    }
}
