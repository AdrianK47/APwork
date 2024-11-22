public class PasswordGenerator{
	private int amount;
    private String prefix;
    private static int count = 0;
    
    public PasswordGenerator(int a, String p){
    	amount = a;
        prefix = p;
    }
    public PasswordGenerator(int a){
    	amount = a;
        prefix = "A";
    }
    public int pwCount(){
        return count;
    }
    public String pwGen(){
    	String password = prefix + ".";
       	for(int i = 0; i < amount + 1; i++){
        	password += (int)(Math.random() * 9);
        }
        count++;
        return password;
    }
    public static void main(String[] args){
        PasswordGenerator password1 = new PasswordGenerator(3,"ak");
        PasswordGenerator password2 = new PasswordGenerator(3);
        System.out.println(password1.pwGen());
        System.out.println(password2.pwGen());
    }
}