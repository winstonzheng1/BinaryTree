
public class StudentInfo {
	
	//Attributes
	
	private int studentNumber;
	private String firstName;
	private String lastName;
	private StudentInfo left;
	private StudentInfo right;
	
	//Constructors
	public StudentInfo (int sN, String fN, String lN) {
		studentNumber = sN;
		firstName = fN;
		lastName = lN;
		left = null;
		right = null;
	}
	
	//Getter and setter mthods
	public String getFirstName () {
		return (firstName);
	}
	public StudentInfo getLeft () {
		return (left);
	}
	public StudentInfo getRight () {
		return (right);
	}
	public StudentInfo setLeft () {
		left = newLeft;
	}
	public StudentInfo setRight() {
		right = newRight;
	}
}