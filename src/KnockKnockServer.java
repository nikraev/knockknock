package 

import java.io.IOException;
import java.io.*;
import java.net.*;

public class KnockKnockServer {

	public static void main(String[] args) {
		int portNumber = 40000;
		
		try
		{
		//Создание сокета и ожидание подключения пользователя
		ServerSocket serverSocket = new ServerSocket(portNumber);
		Socket clientSocket = serverSocket.accept();
		
		//Сохранение входящего потока
		FileInputStream inStream = clientSocket.getInputStream();
		
		
		clientSocket.getOutputStream();
		serverSocket.close();
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
