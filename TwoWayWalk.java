class TwoWayWalk {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        
        for (int step = 0; step < n; step++) {
            
            if (words[(startIndex + step) % n].equals(target)) {
                return step;
            }
            
            if (words[(startIndex - step + n) % n].equals(target)) {
                return step;
            }
        }
        
        return -1; 
    }
    public static void main(String[] args) {
        TwoWayWalk tw=new TwoWayWalk();
        String[] arr={"manuel","rajesh","john","manuel"};
        int count=tw.closestTarget(arr,"manuel", 0);
        System.err.println("steps"+count);
    }
}