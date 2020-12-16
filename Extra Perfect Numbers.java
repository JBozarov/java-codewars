
Given a positive integer N , Return the extra perfect numbers in range from 1 to N .

    public static int[] extraPerfect(int number) {
        List<Integer> results = new ArrayList<>();
        for (int i = 1; i<=number; i++) {
            String temp = Integer.toBinaryString(i);
            if (temp.charAt(0) == temp.charAt(temp.length()-1)) {
                results.add(i);
            }
        }
    
        int[] res = new int[results.size()];
        for (int i = 0; i<results.size(); i++) {
            res[i] = results.get(i);
        }
        return res;
    }
