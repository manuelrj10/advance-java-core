class ANumberAfteraDoubleReversal {
    public boolean isSameAfterReversals(int num) {
        if (num == 0) return true;

        int temp = num;
        int rev1 = 0;
        while (temp > 0) {
            rev1 = (rev1 * 10) + (temp % 10);
            temp /= 10;
        }

        int rev2 = 0;
        temp = rev1; 
        while (temp > 0) {
            rev2 = (rev2 * 10) + (temp % 10);
            temp /= 10;
        }

        return rev2 == num;
    }
    public static void main(String[] args) {
        ANumberAfteraDoubleReversal dr=new ANumberAfteraDoubleReversal();
        boolean ans=dr.isSameAfterReversals(121);
        System.out.println(ans);
    }
}