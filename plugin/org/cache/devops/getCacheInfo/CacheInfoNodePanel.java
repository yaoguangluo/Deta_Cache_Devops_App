package org.cache.devops.getCacheInfo;

import org.LYG.GUI.OSGI.objectPanel;
import org.cache.devops.utils.SocketRequestHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class CacheInfoNodePanel extends objectPanel {
    private static final long serialVersionUID = 1L;

    public CacheInfoNodePanel(final CacheInfoNodeRun thisrun) {
        setLayout(null);
        jsp = new ScrollPane();
        add(jsp);
        jp = new Panel();
        jp.setLayout(null);
        jp.setBackground(Color.white);

        //add new connection
        JLabel label = new JLabel("?????????");
        label.setBounds(2, 2, 80, 30);
        JTextField ipport = new JTextField("xxx.xxx.xxx.xxx:xxxxx", 18);
        ipport.setBounds(2 + 85, 2, 200, 30);

        JLabel labelName = new JLabel("????????");
        labelName.setBounds(2, 2 + 35, 80, 30);
        JTextField jTextFieldName = new JTextField("???????????", 18);
        jTextFieldName.setBounds(2 + 85, 2 + 35, 200, 30);

        JLabel labelPswd = new JLabel("???????");
        labelPswd.setBounds(2, 2 + 35 + 35, 80, 30);
        JTextField jTextFieldPswd = new JTextField("???????????", 18);
        jTextFieldPswd.setBounds(2 + 85, 2 + 35 + 35, 200, 30);
        //
        JButton jbutton = new JButton("???");
        jbutton.setBounds(2, 2 + 35 + 35 + 35, 80, 30);
        jbutton.addActionListener(new ActionListener() {

            //发送socket请求到Deta_Cache服务器
            public void actionPerformed(ActionEvent arg0) {
                try {
                    String textOfLabelName = labelName.getText();
                    String textOflabelPswd = labelPswd.getText();
                    String textOfIpport = ipport.getText();
                    Socket socket = new Socket(textOfIpport.split(":")[0], Integer.valueOf(textOfIpport.split(":")[1]));
                    PrintWriter os = new PrintWriter(socket.getOutputStream());
                    os.flush();
                    InputStream is = socket.getInputStream();
                    byte[] bytes = new byte[1024];
                    while ((is.read(bytes, 0, 1024)) != -1) {
                        //System.out.println("1"+new String(bytes));
                    }

                    try {
                        new SocketRequestHandler().sendGet("/get");

                        System.out.println("configued");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                } catch (Exception e) {

                }
            }
        });
        jp.add(labelName);
        jp.add(jTextFieldName);
        jp.add(labelPswd);
        jp.add(jTextFieldPswd);


        jp.add(label);
        jp.add(ipport);
        jp.add(jbutton);

        jsp.add(jp);
        close = false;
        this.setClosable(true);
    }

    public void config() {

            System.out.println("configued");

    }
}
