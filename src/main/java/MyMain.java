public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        int t = 100000;
        int e = 0;
        for (int r = 0; r<t; r++){
            boolean dub = false;
            for (int r2=0;r2<6;r2++){
                if (((int)(Math.random()*6)+1)==1)
                    dub = true;
            }
            if (dub){
                e++;
            }
        }
        return (double)e/1000;
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int t = 100000;
        int e = 0;
        for (int r = 0; r<t; r++){
            int sum=0;
            for (int r2=0;r2<12;r2++){
                if ((int)(Math.random()*6)+1==1)
                    sum++;
            }
            if (sum>=2){
                e++;
            }
        }
        return (double)e/1000;
    
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int t = 100000;
        int e = 0;
        for (int r = 0; r<t; r++){
            int sum=0;
            for (int r2=0;r2<18;r2++){
                if ((int)(Math.random()*6)+1==1){
                    sum++;
                }
                    
            }
            if (sum>=3){
                e++;
            }
        }
        return (double)e/1000;
    }


    public static void main(String[] args) {
        System.out.println(probabilityOneSix());
        System.out.println(probabilityTwoSixes());
        System.out.println(probabilityThreeSixes());
    }
}
