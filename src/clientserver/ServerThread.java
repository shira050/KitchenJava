package clientserver;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.concurrent.ExecutionException;
import kitchenmenneger.Data;
import kitchenmenneger.Kitchen;

//����� ������ ����� ������� �� ���� �� ���� �����
public class ServerThread extends Thread {

    private static Data data;
    private Socket clientSocket;//����� ������ ���� �� ���� �����

    public ServerThread(Socket clientSocket, Kitchen k) {
       
        this.clientSocket = clientSocket;
        data = new Data(k);
    }

    @Override
    public void run() {
        ObjectInputStream reader=null ;
        ObjectOutputStream writer=null;
        try {
             reader = new ObjectInputStream(clientSocket.getInputStream());//����� ������� ����� ����� ����� ������ ������
             writer = new ObjectOutputStream(clientSocket.getOutputStream());

            int num = (int) reader.readObject();//���� ������ ���� �� ������ ��� ���� ���� ������

            while (num != -1) {
                data.CreatARecipe(num);
                writer.writeObject("המתכון הסתיים בהצלחה");
                num = (int) reader.readObject();//���� ������ ���� �� ������ ��� ���� ���� ������

            }
        } 
        catch (Exception e) {
           
        }
      try{
      
           if(reader!=null)
            reader.close();    
      }
      catch(Exception e){
      }
       try{
      
           if(writer!=null)
            writer.close();    
      }
      catch(Exception e){
      }
        try{
      
           if(clientSocket!=null)
            clientSocket.close();    
      }
      catch(Exception e){
      }
    }

}
