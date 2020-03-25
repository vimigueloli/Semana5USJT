import javax.swing.JOptionPane;

public class MediaPositivo{

    public static void main(String [] args){
        int x= 0;
        int y;
        double c= 0;
        do{
         y = Integer.parseInt(JOptionPane.showInputDialog("escreva um numero"));
         x = x + y;
         c++;
        }while(y>=0);
        x = x-y;
        c--;
        c = x/c;
        JOptionPane.showMessageDialog(null,"a media dos numeros é: " + c);
    }
}

