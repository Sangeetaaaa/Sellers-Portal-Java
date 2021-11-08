import java.util.*;

class Cloth {
    // private int leftCloth;
    private int soldCloth;
    private int totalMensCloth;
    private int totalWomensCloth;
    
    Cloth () {
        System.out.println("Sytem is empty");
        System.out.println("Enter 1 to add Total Sold Cloth Data");
        System.out.println("Enter 2 to view avaiable data on the sytem");
        System.out.println("Enter 3 to do nothing (logout from the sytem)");
    }
    
    // void setLeftCloth(int leftCloth) {
    //     this.leftCloth = leftCloth;
    //     System.out.println("Updated the SYstem. " + this.leftCloth + " cloths are left now.");
    // }
    
    void setSoldCloth(int soldCloth) {
        this.soldCloth = soldCloth;
        System.out.println("Updated the SYstem. " + this.soldCloth + " cloths are sold now.");
    }
    
    int getSoldCloth() {
        return soldCloth;
    }
}








public class Main
{
	public static void main(String[] args) {
		Cloth cloth = new Cloth();
		Scanner sc = new Scanner(System.in);
		boolean login = true;
		
		while (login) {
		    	int input = sc.nextInt();
		    
			if (input == 1) {
			    System.out.println("Enter sold cloths:- ");
			    int sold = sc.nextInt();
			    cloth.setSoldCloth(sold);
			} 
    		
			if (input == 2 ) {
			    System.out.println("Total Sold Cloth:- " + cloth.getSoldCloth());
			}
    		
			if (input == 3 ) {
			    System.out.println("Bye Bye. See You again");
			    login = false;
			}
		}
	}
}
