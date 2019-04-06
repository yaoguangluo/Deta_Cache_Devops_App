package org.cache.devops.getCacheInfo;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import org.LYG.GUI.OSGI.*;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URLEncoder;
import java.awt.Color;
@SuppressWarnings("deprecation")
public class CacheInfoNodePanel extends ObjectPanel{
	private static final long serialVersionUID = 1L;
	public CacheInfoNodePanel(final CacheInfoNodeRun thisrun){
		setLayout(null);
		jsp = new ScrollPane();
		add(jsp);
		jp=new Panel();
		jp.setLayout(null);
		jp.setBackground(Color.white);

		//add new connection
		JLabel label= new JLabel("测试链接：");
		label.setBounds(2, 2, 80, 30);
		JTextField ipport= new JTextField("xxx.xxx.xxx.xxx:xxxxx", 18);
		ipport.setBounds(2+85, 2, 200, 30);

		JLabel labelName= new JLabel("登录名称：");
		labelName.setBounds(2, 2+35, 80, 30);
		JTextField jTextFieldName= new JTextField("输入用户名称", 18);
		jTextFieldName.setBounds(2+85, 2+35, 200, 30);

		JLabel labelPswd= new JLabel("登录密码：");
		labelPswd.setBounds(2, 2+35+35, 80, 30);
		JTextField jTextFieldPswd= new JTextField("输入用户密码", 18);
		jTextFieldPswd.setBounds(2+85, 2+35+35, 200, 30);
		//
		JButton jbutton = new JButton("确定");
		jbutton.setBounds(2, 2 + 35 + 35 + 35, 80, 30);
		jbutton.addActionListener(new ActionListener(){
			@SuppressWarnings("resource")
			public void actionPerformed(ActionEvent arg0) {
				try {
					System.out.println("1");      
					String textOfLabelName = jTextFieldName.getText();
					String textOflabelPswd = jTextFieldPswd.getText();
					String textOfIpport = ipport.getText();
					Socket socket = new Socket(textOfIpport.split(":")[0],Integer.valueOf(textOfIpport.split(":")[1]));
					PrintWriter os = new PrintWriter(socket.getOutputStream());
					os.println("/devopsCache?email=" + URLEncoder.encode(textOfLabelName) + "&password="+URLEncoder.encode(textOflabelPswd));
					//添加输入值
					os.flush();
					InputStream is = socket.getInputStream();
					byte[] bytes=new byte[1024];
					while((is.read(bytes, 0, 1024)) != -1) {
						System.out.println("1" + new String(bytes)); 
						//得到输出值
					}			
				}catch(Exception e) {
					e.printStackTrace();
				}
			}});
		jp.add(labelName);
		jp.add(jTextFieldName);
		jp.add(labelPswd);
		jp.add(jTextFieldPswd);

		jp.add(label);
		jp.add(ipport);
		jp.add(jbutton);

		jsp.add(jp);
		close=false;
		this.setClosable(true);
	}
	public void config(){    
		System.out.println("configued");      
	}
}
