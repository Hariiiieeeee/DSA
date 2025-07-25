class StringvsStringBuilder{
    public static void main(String[] args){
        int limit = 100000;
        long start = System.currentTimeMillis();

        String str = "";
        for(int i=0; i<limit; i++){
            str += i;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("String time: " + (endTime - start));

        start = System.currentTimeMillis();

        StringBuilder strB = new StringBuilder();
        for(int i=0; i<limit; i++){
            strB.append(i);
        }

        endTime = System.currentTimeMillis();

        System.out.println("StringBuilder time: " + (endTime - start));
    }
}