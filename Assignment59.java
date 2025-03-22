package Javaassignments;


//WAP on Access specifiers outside package for Class
public class Assignment59 {
	
	private void displayPrivate() {
        System.out.println("Private Method Called");
    }

    void displayDefault() {
        System.out.println("Default Method Called");
    }

    protected void displayProtected() {
        System.out.println("Protected Method Called");
    }

    public static void displayPublic() {
        System.out.println("Public Method Called");
    }
	public static void main(String[] args) {
		

	}

}
