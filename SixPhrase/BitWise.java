class BitWise {
    public static void main(String[] args){
        int a=5;
        int b=3;
        System.out.println("a" + a +"(binary:"+Integer.toBinaryString(a)+")");
        System.out.println("b" + b +"(binary:"+Integer.toBinaryString(b)+")");
        System.out.println();
        System.out.println("a&b="+(a&b)+"(AND)");
        System.out.println("a|b="+(a|b)+"(OR)");                
        System.out.println("a&b="+(a^b)+"(XOR)");
        System.out.println("~a="+(~a)+"(NOT)");
        System.out.println("a<<1="+(a<<1)+"(LEFT SHIFT )");
        System.out.println("a>>1="+(a>>1)+"(RIGHT SHIFT)");
    }
}