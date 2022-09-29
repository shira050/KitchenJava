package clientserver;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import kitchenmenneger.Kitchen;
//import kitchenmenneger.KitchenMenneger;

public class Server {

    public static final String IP_ADDRESS = "localhost";
    public static final int PORT = 1000;

    private ServerSocket serverSocket;
    private Kitchen kitchen;

    public Server(Kitchen k) {
        kitchen = k;
        try {
            serverSocket = new ServerSocket(PORT);//����� ����� ��� �� ��� �� ����� ����� �������
            //��� ����� ������
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void runServer() {
        while (true)//���� ����� ������ �� ����
        {
            try {
                Socket clientSocket = serverSocket.accept();//���� ������ ����� ��� ���� ���� 
                //����� ��������� ����� �� ������ ��������
                ServerThread thread = new ServerThread(clientSocket, kitchen);//����� ����� ��� ����� �����
                thread.start();

            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public Server() {

    }

    public static void main(String[] args) {
        Kitchen jframe = new Kitchen();
        jframe.setVisible(true);
        Server s = new Server(jframe);
        s.runServer();
    }

}
