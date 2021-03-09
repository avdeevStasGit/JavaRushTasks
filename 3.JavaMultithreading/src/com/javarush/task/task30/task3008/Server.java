package com.javarush.task.task30.task3008;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        ConsoleHelper.writeMessage("Введите порт сервера:");
        int port = ConsoleHelper.readInt();
        
        try(ServerSocket serverSocket = new ServerSocket(port))  {
            ConsoleHelper.writeMessage("Чат сервер запущен");
            while (true) {
                // Ожидаем входящее соединение и запускаем отдельный поток при  его  принятии
                Socket socket = serverSocket.accept();
                new Handler(socket).start();
            }
        } catch (Exception e) {
            ConsoleHelper.writeMessage("Произошла ошибка при запуске или работе сервера");
        }
    }
    
    private static class Handler extends Thread {
        private Socket socket;
        
        public Handler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            
        }
    }
}
