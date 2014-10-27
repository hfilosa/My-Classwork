import java.util.*;

public class arrayStuff {
    public int[] randArray100(){
	int[] ans = new int[100];
	Random rand = new Random();
	for (int i=0;i<100;i++){
	    ans[i]=75+rand.nextInt(76);
	}
	return ans;
    }

    public int find(int value){
	for (int i=0;i<this.length;i++){
	    if (this[i]==value){
		return i;
	}
	return -1;
    }

    public static void main(String[] args) {
	arrayStuff run = new arrayStuff();
	System.out.println(run.randArray100());
    }
}
