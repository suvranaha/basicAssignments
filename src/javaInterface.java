
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface InterfaceClass{
    public void sayHello(String sentance);
}
public class javaInterface implements InterfaceClass {
    @Override
    public void sayHello(String s){
        
        System.out.println(s);
    }
    public static void main(String[] args) throws IOException{
        javaInterface sh = new javaInterface();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Please Enter the sentence:");
        String sentance = br.readLine();
        sh.sayHello(sentance);
    }
}
