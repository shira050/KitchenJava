package clientserver;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {

    private Socket clientSocket;// ����� ����� ��� �� �����
    // ��� ������� �� ���� ����� ������ ����

    private ObjectOutputStream writer;
    private ObjectInputStream reader;

    public Client() {
        try {
           
            clientSocket = new Socket(Server.IP_ADDRESS, Server.PORT);// ����� ���� ������ ���� ������ ��� ����� ����
            // ��� ���� ��� ���� ������ ��� ��� ����� ��� ���� ����� �����
            writer = new ObjectOutputStream(clientSocket.getOutputStream());// ������� ������ ����� ������ ����� ������
            // �����
            reader = new ObjectInputStream(clientSocket.getInputStream());

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

	// ������� ������ ������ ������ ���� ����
    // ������� ������� ������� ���� �����
    public String sendNumberAndGetString(int num) {
        try {
            // ����� ���� �� ����� ������ ������ �� ����
            writer.writeObject(num);// ����� ������ ����� ����
            String response = (String) reader.readObject();
            return response;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "שגיאה";
    }

}
