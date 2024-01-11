import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int fatorial = 0;

        for(int i = 1; i <= a; i++){
            if(i == 1){
                fatorial = a-1;
            }else if(i < a){
                fatorial = fatorial * (a-i);
            }else if(i == a){
                fatorial = fatorial*a;
            }
        }

        System.out.println(fatorial);
    }
}
