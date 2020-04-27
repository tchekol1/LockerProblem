public class LockerProblem {
    public static void main(String[] args) {
        boolean []locker= new boolean[100];
        for (int i = 0; i <locker.length ; i++) {
            locker[i]=false;
        }
        for (int i = 1; i <= locker.length; i++) {
            for (int j = (i-1); j < locker.length; j+=i) {
                 if(locker[j]==true){
                    locker[j]=false;}
else if(locker[j]==false)
    locker[j]=true;

            }
        }
        for (int i = 0; i <100 ; i++) {
            if (locker[i] == true) {

                System.out.println("The locker that is open "+ (i+1));
            }
        }



    }
}
