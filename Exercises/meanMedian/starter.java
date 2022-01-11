class starter {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6, 9, 10};
        System.out.println(getMedian(x));
    }

    public static int getMode(int[] a) {
        int high = -1;
        int freq = 1;
        for(int x = 0; x < a.length; x++) {
            int c = 0;
            for(int y = x; y < a.length; y++) {
                if (a[y] == a[x]) {
                    c++;
                }
            }
            if (c > freq) {
                high = a[x];
                freq = c;
            }
        }
    
        return high;
    }

    public static int getMedian(int[] a) {
        int split = a.length / 2;
        if (a.length % 2 == 0) {
            return (a[split] + a[split - 1]) / 2;
        } 
        else {
            return (a[split]);
        }
    
    }
}