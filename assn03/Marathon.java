class Marathon {
    public static void main (String[] arguments) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }
        int minTime = times[0];
        int minIndex = 0;

        for ( int i=1 ; i <times.length; i++){
            if (times[i] < minTime){
                minTime =times[i];
                minIndex = i;
            }
        }
        System.out.println("\n冠军是：");
        System.out.println("姓名: " + names[minIndex] + ", 成绩: " + minTime);
    }
} 