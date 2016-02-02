
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaClass {
    public static void main(String args[]) throws IOException{
        JavaClass javaClass = new JavaClass();
        String yourName = "";
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Please Enter the name:");
        yourName = br.readLine();
        javaClass.setName(yourName);
        System.out.println("Congrats "+javaClass.getName());
    }
    private String name;
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}
