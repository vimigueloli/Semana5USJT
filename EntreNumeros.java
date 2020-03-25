import javax.swing.JOptionPane;
public class EntreNumeros{
    public static void main(String [] args){
        int x= 0;
        int counter= 0;
        do{
         if(x>=100 && x<=200){
            counter++;
         }
         x = Integer.parseInt(JOptionPane.showInputDialog("escreva um numero")); 
        }while(x!=0);
        JOptionPane.showMessageDialog(null,"A quantidade de numeros digitados entre 100 e 200 é: " + counter);
    }
}

